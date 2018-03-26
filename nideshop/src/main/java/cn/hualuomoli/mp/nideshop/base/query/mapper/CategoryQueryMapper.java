package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Category;
import cn.hualuomoli.mp.nideshop.base.query.entity.CategoryQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.CategoryQueryMapper")
public interface CategoryQueryMapper {

  /** 查询列表 */
  List<Category> findList(CategoryQuery categoryQuery);

}
