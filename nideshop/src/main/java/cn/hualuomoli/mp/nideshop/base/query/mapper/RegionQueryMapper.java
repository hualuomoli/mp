package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Region;
import cn.hualuomoli.mp.nideshop.base.query.entity.RegionQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.RegionQueryMapper")
public interface RegionQueryMapper {

  /** 查询列表 */
  List<Region> findList(RegionQuery regionQuery);

}
