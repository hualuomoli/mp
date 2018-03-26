package cn.hualuomoli.mp.nideshop.api.cart.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

import cn.hualuomoli.mp.nideshop.api.cart.entity.ApiCart;
import cn.hualuomoli.mp.nideshop.api.cart.entity.ApiCartStatistic;
import cn.hualuomoli.mp.nideshop.api.cart.mapper.CartMapper;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Cart;
import cn.hualuomoli.mp.nideshop.base.entity.Goods;
import cn.hualuomoli.mp.nideshop.base.entity.Product;
import cn.hualuomoli.mp.nideshop.base.service.CartBaseService;
import cn.hualuomoli.mp.nideshop.base.service.GoodsBaseService;
import cn.hualuomoli.mp.nideshop.base.service.ProductBaseService;

@Service(value = "cn.hualuomoli.mp.nideshop.api.cart.service.CartService")
@Transactional(readOnly = true)
public class CartService {

  @Autowired
  private CartMapper cartMapper;

  @Autowired
  private CartBaseService cartBaseService;
  @Autowired
  private GoodsBaseService goodsBaseService;
  @Autowired
  private ProductBaseService productBaseService;

  /**
   * 查询购物车
   * @param user_id 用户编号
   * @return 购物车信息
   */
  public List<ApiCart> find(Integer user_id) {
    return cartMapper.find(user_id);
  }

  /**
   * 购物车统计信息
   * @param user_id 用户编号
   * @return 购物车统计信息
   */
  public ApiCartStatistic statistic(Integer user_id) {
    return cartMapper.statistic(user_id);
  }

  /**
   * 添加到购物车
   * @param goods_id 货物Id
   * @param product_id 商品ID
   * @param number 购买数量
   */
  @Transactional(readOnly = false)
  public void add(Integer goods_id, Integer product_id, Integer number) {

    // 查询货物
    Goods goods = this.findGoods(goods_id);
    // 查询商品
    Product product = this.findProduct(product_id);
    // 减少商品库存
    this.decreaseProduct(product_id, number);
    // 查询购物车
    Cart cart = this.findCartByProductId(product_id);

    if (cart == null) {
      // 没有购物车
      String goods_specifition_name_value = this.findGoodsSpecifitionNames(product.getGoods_specification_ids());

      cart = new Cart();
      cart.setGoods_id(goods_id);
      cart.setProduct_id(product_id);
      cart.setGoods_sn(goods.getGoods_sn());
      cart.setGoods_name(goods.getName());
      cart.setList_pic_url(goods.getList_pic_url());
      cart.setNumber(number);
      cart.setSession_id("1");
      cart.setUser_id(ApiUtils.getCurrentUserId());
      cart.setRetail_price(product.getRetail_price());
      cart.setMarket_price(product.getRetail_price());
      cart.setGoods_specifition_name_value(goods_specifition_name_value);
      cart.setGoods_specifition_ids(product.getGoods_specification_ids());
      cart.setChecked(1);
      cartBaseService.insert(cart);
    } else {
      // 修改购物车数量
      cart.setNumber(cart.getNumber() + number);
      Cart update = new Cart();
      update.setNumber(cart.getNumber() + number);
      cartBaseService.updateById(cart.getId(), update);
    }
    // end
  }

  // 选中或取消选中
  @Transactional(readOnly = false)
  public void checked(String productIds, Integer isChecked) {
    Validate.notBlank(productIds, "未选中商品");
    List<Integer> product_ids = this.splitId(productIds, ",");
    cartMapper.checked(product_ids, isChecked);
  }

  // 删除
  @Transactional(readOnly = false)
  public void delete(String productIds) {
    Validate.notBlank(productIds, "未选中商品");
    List<Integer> product_ids = this.splitId(productIds, ",");
    cartMapper.delete(product_ids);
  }

  /**
   * 购物车增加购物数量
   * @param cart_id 购物车ID
   * @param number 数量
   */
  @Transactional(readOnly = false)
  public void incrementCart(Integer cart_id, Integer number) {
    cartMapper.incrementCart(cart_id, number);
  }

  /**
   * 购物车减少购物数量
   * @param cart_id 购物车ID
   * @param number 数量
   */
  @Transactional(readOnly = false)
  public void decreaseCart(Integer cart_id, Integer number) {
    cartMapper.decreaseCart(cart_id, number);
  }

  /**
   * 购物车减少购物数量
   * @param product_id 商品ID
   * @param number 数量
   */
  @Transactional(readOnly = false)
  public void decreaseProduct(Integer product_id, Integer number) {
    int updated = cartMapper.decreaseProduct(product_id, number);
    Validate.isTrue(updated == 1, "库存不足");
  }

  /**
   * 查询商品规格名称
   * @param goods_specifition_ids 商品规格ID
   * @return 商品规格名称
   */
  private String findGoodsSpecifitionNames(String goods_specifition_ids) {
    if (StringUtils.isBlank(goods_specifition_ids)) {
      return StringUtils.EMPTY;
    }

    List<Integer> ids = this.splitId(goods_specifition_ids, "_");
    List<String> names = cartMapper.findGoodsSpecifitionNames(ids);
    return StringUtils.join(names, ";");
  }

  /**
   * 货物
   * @param goods_id 货物ID
   * @return 获取信息
   */
  private Goods findGoods(Integer goods_id) {
    Goods goods = goodsBaseService.get(goods_id);
    Validate.notNull(goods, "商品已下架");
    Validate.isTrue(goods.getIs_delete() != 1, "商品已下架");
    return goods;
  }

  /**
   * 商品
   * @param product_id 商品ID
   * @return 商品信息
   */
  private Product findProduct(Integer product_id) {
    Product product = productBaseService.get(product_id);
    Validate.notNull(product, "库存不足");
    return product;
  }

  /**
   * 购物车
   * @param cart_id 购物车ID
   * @return 购物车信息
   */
  @SuppressWarnings("unused")
  private Cart findCart(Integer cart_id) {
    return cartBaseService.get(cart_id);
  }

  /**
   * 购物车
   * @param product_id 商品ID
   * @return 购物车信息
   */
  private Cart findCartByProductId(Integer product_id) {
    Cart queryCart = new Cart();
    queryCart.setProduct_id(product_id);
    List<Cart> cartList = cartBaseService.findList(queryCart);
    return cartList == null || cartList.size() == 0 ? null : cartList.get(0);
  }

  /**
   * 分割ID
   * @param ids id信息
   * @param seperator 分割符 
   * @return 分割后的数据
   */
  private List<Integer> splitId(String ids, String seperator) {
    if (StringUtils.isBlank(ids)) {
      return Lists.newArrayList();
    }

    List<Integer> list = Lists.newArrayList();
    String[] array = StringUtils.split(ids, seperator);
    for (String s : array) {
      list.add(Integer.parseInt(s));
    }
    return list;
  }

}
