package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.AttributeCategory;
import cn.hualuomoli.mp.nideshop.base.query.entity.AttributeCategoryQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.AttributeCategoryQueryMapper")
public interface AttributeCategoryQueryMapper {

  /** 查询列表 */
  List<AttributeCategory> findList(AttributeCategoryQuery attributeCategoryQuery);

}
