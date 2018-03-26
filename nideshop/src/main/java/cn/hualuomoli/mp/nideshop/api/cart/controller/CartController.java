package cn.hualuomoli.mp.nideshop.api.cart.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;

import cn.hualuomoli.mp.nideshop.api.cart.entity.ApiCart;
import cn.hualuomoli.mp.nideshop.api.cart.entity.ApiCartStatistic;
import cn.hualuomoli.mp.nideshop.api.cart.service.CartService;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;

/**
 * 购物车
 */
@RequestMapping(value = "/cart")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.cart.controller.CartController")
public class CartController {

  @Autowired
  private CartService cartService;

  // 获取购物车的数据
  @RequestMapping(value = "/index")
  public String index() {
    return this.getCart();
  }

  // 添加商品到购物车
  @RequestMapping(value = "/add")
  public String add(@RequestParam(value = "goodsId") Integer goods_id//
      , @RequestParam(value = "productId") Integer product_id//
      , @RequestParam(value = "number") Integer number) {

    cartService.add(goods_id, product_id, number);
    return this.getCart();
  }

  // 更新购物车的商品
  @RequestMapping(value = "/update")
  public String update(@RequestParam(value = "goodsId") Integer goods_id//
      , @RequestParam(value = "productId") Integer product_id//
      , @RequestParam(value = "number") Integer number //
      , @RequestParam(value = "id") Integer cart_id) {
    return this.getCart();
  }

  // 删除购物车的商品
  @RequestMapping(value = "/delete")
  public String delete(@RequestParam(value = "productIds") String productIds) {
    cartService.delete(productIds);
    return this.getCart();
  }

  // 选择或取消选择商品
  @RequestMapping(value = "/checked")
  public String checked(@RequestParam(value = "productIds") String productIds//
      , @RequestParam(value = "isChecked") Integer isChecked) {
    cartService.checked(productIds, isChecked);
    return this.getCart();
  }

  // 获取购物车商品件数
  @RequestMapping(value = "/goodscount")
  public String goodscount() {
    ApiCartStatistic cartTotal = cartService.statistic(ApiUtils.getCurrentUserId());
    Map<String, Object> map = Maps.newHashMap();
    map.put("cartTotal", cartTotal);
    return ApiUtils.success(map);
  }

  // 下单前信息确认
  @RequestMapping(value = "/checkout")
  public void checkout() {

  }

  // 获取购物车
  private String getCart() {
    List<ApiCart> cartList = cartService.find(ApiUtils.getCurrentUserId());
    ApiCartStatistic cartTotal = cartService.statistic(ApiUtils.getCurrentUserId());

    Map<String, Object> map = Maps.newHashMap();
    map.put("cartList", cartList);
    map.put("cartTotal", cartTotal);

    return ApiUtils.success(map);
  }

}
