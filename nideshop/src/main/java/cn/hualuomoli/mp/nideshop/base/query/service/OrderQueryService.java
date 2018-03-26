package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Order;
import cn.hualuomoli.mp.nideshop.base.query.entity.OrderQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.OrderQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.OrderQueryService")
@Transactional(readOnly = true)
public class OrderQueryService {

  @Autowired
  private OrderQueryMapper orderQueryMapper;

  /** 查询列表 */
  public List<Order> findList(OrderQuery orderQuery) {
    return orderQueryMapper.findList(orderQuery);
  }

  /** 查询列表排序 */
  public List<Order> findList(OrderQuery orderQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return orderQueryMapper.findList(orderQuery);
  }

  /** 查询分页 */
  public Page findPage(OrderQuery orderQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Order> list = orderQueryMapper.findList(orderQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(OrderQuery orderQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Order> list = orderQueryMapper.findList(orderQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
