package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.OrderGoods;
import cn.hualuomoli.mp.nideshop.base.query.entity.OrderGoodsQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.OrderGoodsQueryMapper")
public interface OrderGoodsQueryMapper {

  /** 查询列表 */
  List<OrderGoods> findList(OrderGoodsQuery orderGoodsQuery);

}
