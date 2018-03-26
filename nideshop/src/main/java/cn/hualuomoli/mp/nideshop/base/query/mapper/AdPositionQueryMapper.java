package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.AdPosition;
import cn.hualuomoli.mp.nideshop.base.query.entity.AdPositionQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.AdPositionQueryMapper")
public interface AdPositionQueryMapper {

  /** 查询列表 */
  List<AdPosition> findList(AdPositionQuery adPositionQuery);

}
