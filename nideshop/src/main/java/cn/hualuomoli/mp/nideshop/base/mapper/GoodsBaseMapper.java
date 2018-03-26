package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Goods;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.GoodsBaseMapper")
public interface GoodsBaseMapper {

  /** 根据主键id查询 */
  Goods get(java.lang.Integer id);

  /** 添加 */
  int insert(Goods goods);

  /** 批量添加 */
  <T extends Goods> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(Goods goods);

  /** 根据主键修改 */
  int updateById(Goods goods);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<Goods> findList(Goods goods);

}
