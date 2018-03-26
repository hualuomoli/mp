package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.OrderGoods;
import cn.hualuomoli.mp.nideshop.base.query.entity.OrderGoodsQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.OrderGoodsQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.OrderGoodsQueryService")
@Transactional(readOnly = true)
public class OrderGoodsQueryService {

  @Autowired
  private OrderGoodsQueryMapper orderGoodsQueryMapper;

  /** 查询列表 */
  public List<OrderGoods> findList(OrderGoodsQuery orderGoodsQuery) {
    return orderGoodsQueryMapper.findList(orderGoodsQuery);
  }

  /** 查询列表排序 */
  public List<OrderGoods> findList(OrderGoodsQuery orderGoodsQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return orderGoodsQueryMapper.findList(orderGoodsQuery);
  }

  /** 查询分页 */
  public Page findPage(OrderGoodsQuery orderGoodsQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<OrderGoods> list = orderGoodsQueryMapper.findList(orderGoodsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(OrderGoodsQuery orderGoodsQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<OrderGoods> list = orderGoodsQueryMapper.findList(orderGoodsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
