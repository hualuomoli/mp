package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Footprint;
import cn.hualuomoli.mp.nideshop.base.query.entity.FootprintQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.FootprintQueryMapper")
public interface FootprintQueryMapper {

  /** 查询列表 */
  List<Footprint> findList(FootprintQuery footprintQuery);

}
