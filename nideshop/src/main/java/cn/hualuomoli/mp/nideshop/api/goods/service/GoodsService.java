package cn.hualuomoli.mp.nideshop.api.goods.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;

import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoods;
import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoodsComment;
import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoodsFilterCategory;
import cn.hualuomoli.mp.nideshop.api.goods.mapper.GoodsMapper;
import cn.hualuomoli.mp.nideshop.base.entity.Goods;
import cn.hualuomoli.mp.nideshop.base.mapper.GoodsBaseMapper;

@Service(value = "cn.hualuomoli.mp.nideshop.api.goods.service.GoodsService")
@Transactional(readOnly = true)
public class GoodsService {

  @Autowired
  private GoodsBaseMapper goodsBaseMapper;

  @Autowired
  private GoodsMapper goodsMapper;

  // 查询商品数量
  public Integer count() {
    Goods goods = new Goods();
    goods.setIs_delete(0);
    goods.setIs_on_sale(1);
    PaginationInterceptor.setCountQuery();
    goodsBaseMapper.findList(goods);
    return PaginationInterceptor.getCount();
  }

  public List<ApiGoodsFilterCategory> findCategory(Map<String, Object> map) {
    PaginationInterceptor.setListOrder("sort_order asc");
    return goodsMapper.findCategory(map);
  }

  public Page findGoods(Map<String, Object> map, Integer pageNo, Integer pageSize, String orderBy) {
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    List<ApiGoods> dataList = goodsMapper.findGoods(map);
    Integer count = PaginationInterceptor.getCount();
    return new Page(pageNo, pageSize, count, dataList);
  }

  public List<Map<String, String>> findGoodsAttribute(Integer goods_id) {
    return goodsMapper.findGoodsAttribute(goods_id);
  }

  public Page findGoodsComment(Integer goods_id, Integer pageNo, Integer pageSize) {
    PaginationInterceptor.setPagination(pageNo, pageSize, "c.add_time desc");
    List<ApiGoodsComment> goodsList = goodsMapper.findGoodsComment(goods_id);
    Integer count = PaginationInterceptor.getCount();
    return new Page(pageNo, pageSize, count, goodsList);
  }

  public Page findGoodsSpecification(Integer goods_id) {

  }

}
