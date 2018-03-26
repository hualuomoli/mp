package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.OrderExpress;
import cn.hualuomoli.mp.nideshop.base.query.entity.OrderExpressQuery;

// 订单物流信息表，发货时生成
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.OrderExpressQueryMapper")
public interface OrderExpressQueryMapper {

  /** 查询列表 */
  List<OrderExpress> findList(OrderExpressQuery orderExpressQuery);

}
