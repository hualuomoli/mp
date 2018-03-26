package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Shipper;

// 快递公司
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.ShipperBaseMapper")
public interface ShipperBaseMapper {

  /** 根据主键id查询 */
  Shipper get(java.lang.Integer id);

  /** 添加 */
  int insert(Shipper shipper);

  /** 批量添加 */
  <T extends Shipper> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(Shipper shipper);

  /** 根据主键修改 */
  int updateById(Shipper shipper);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<Shipper> findList(Shipper shipper);

}
