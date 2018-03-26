package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Product;
import cn.hualuomoli.mp.nideshop.base.query.entity.ProductQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.ProductQueryMapper")
public interface ProductQueryMapper {

  /** 查询列表 */
  List<Product> findList(ProductQuery productQuery);

}
