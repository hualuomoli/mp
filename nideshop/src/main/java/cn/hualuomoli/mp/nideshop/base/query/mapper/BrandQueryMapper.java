package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Brand;
import cn.hualuomoli.mp.nideshop.base.query.entity.BrandQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.BrandQueryMapper")
public interface BrandQueryMapper {

  /** 查询列表 */
  List<Brand> findList(BrandQuery brandQuery);

}
