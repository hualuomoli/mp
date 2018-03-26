package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Order;
import cn.hualuomoli.mp.nideshop.base.query.entity.OrderQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.OrderQueryMapper")
public interface OrderQueryMapper {

  /** 查询列表 */
  List<Order> findList(OrderQuery orderQuery);

}
