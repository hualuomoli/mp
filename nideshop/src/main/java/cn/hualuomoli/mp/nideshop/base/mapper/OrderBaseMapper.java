package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Order;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.OrderBaseMapper")
public interface OrderBaseMapper {

  /** 根据主键id查询 */
  Order get(java.lang.Integer id);

  /** 添加 */
  int insert(Order order);

  /** 批量添加 */
  <T extends Order> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(Order order);

  /** 根据主键修改 */
  int updateById(Order order);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<Order> findList(Order order);

}
