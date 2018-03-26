package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Address;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.AddressBaseMapper")
public interface AddressBaseMapper {

  /** 根据主键id查询 */
  Address get(java.lang.Integer id);

  /** 添加 */
  int insert(Address address);

  /** 批量添加 */
  <T extends Address> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(Address address);

  /** 根据主键修改 */
  int updateById(Address address);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<Address> findList(Address address);

}
