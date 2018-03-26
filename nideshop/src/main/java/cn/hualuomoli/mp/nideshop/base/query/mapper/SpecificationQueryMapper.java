package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Specification;
import cn.hualuomoli.mp.nideshop.base.query.entity.SpecificationQuery;

// 规格表
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.SpecificationQueryMapper")
public interface SpecificationQueryMapper {

  /** 查询列表 */
  List<Specification> findList(SpecificationQuery specificationQuery);

}
