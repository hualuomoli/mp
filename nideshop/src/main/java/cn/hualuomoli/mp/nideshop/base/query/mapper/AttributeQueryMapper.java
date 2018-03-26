package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Attribute;
import cn.hualuomoli.mp.nideshop.base.query.entity.AttributeQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.AttributeQueryMapper")
public interface AttributeQueryMapper {

  /** 查询列表 */
  List<Attribute> findList(AttributeQuery attributeQuery);

}
