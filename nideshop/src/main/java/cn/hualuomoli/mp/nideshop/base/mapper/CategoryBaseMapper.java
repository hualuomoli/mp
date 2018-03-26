package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Category;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.CategoryBaseMapper")
public interface CategoryBaseMapper {

  /** 根据主键id查询 */
  Category get(java.lang.Integer id);

  /** 添加 */
  int insert(Category category);

  /** 批量添加 */
  <T extends Category> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(Category category);

  /** 根据主键修改 */
  int updateById(Category category);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<Category> findList(Category category);

}
