package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Shipper;
import cn.hualuomoli.mp.nideshop.base.query.entity.ShipperQuery;

// 快递公司
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.ShipperQueryMapper")
public interface ShipperQueryMapper {

  /** 查询列表 */
  List<Shipper> findList(ShipperQuery shipperQuery);

}
