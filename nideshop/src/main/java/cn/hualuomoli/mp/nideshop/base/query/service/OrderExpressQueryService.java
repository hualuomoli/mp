package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.OrderExpress;
import cn.hualuomoli.mp.nideshop.base.query.entity.OrderExpressQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.OrderExpressQueryMapper;

// 订单物流信息表，发货时生成
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.OrderExpressQueryService")
@Transactional(readOnly = true)
public class OrderExpressQueryService {

  @Autowired
  private OrderExpressQueryMapper orderExpressQueryMapper;

  /** 查询列表 */
  public List<OrderExpress> findList(OrderExpressQuery orderExpressQuery) {
    return orderExpressQueryMapper.findList(orderExpressQuery);
  }

  /** 查询列表排序 */
  public List<OrderExpress> findList(OrderExpressQuery orderExpressQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return orderExpressQueryMapper.findList(orderExpressQuery);
  }

  /** 查询分页 */
  public Page findPage(OrderExpressQuery orderExpressQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<OrderExpress> list = orderExpressQueryMapper.findList(orderExpressQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(OrderExpressQuery orderExpressQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<OrderExpress> list = orderExpressQueryMapper.findList(orderExpressQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
