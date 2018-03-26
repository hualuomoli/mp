package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Keywords;

// 热闹关键词表
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.KeywordsBaseMapper")
public interface KeywordsBaseMapper {

  /** 根据主键id查询 */
  Keywords get(java.lang.Integer id);

  /** 添加 */
  int insert(Keywords keywords);

  /** 批量添加 */
  <T extends Keywords> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(Keywords keywords);

  /** 根据主键修改 */
  int updateById(Keywords keywords);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<Keywords> findList(Keywords keywords);

}
