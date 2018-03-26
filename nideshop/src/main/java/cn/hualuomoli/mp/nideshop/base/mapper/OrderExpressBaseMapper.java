package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.OrderExpress;

// 订单物流信息表，发货时生成
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.OrderExpressBaseMapper")
public interface OrderExpressBaseMapper {

  /** 根据主键id查询 */
  OrderExpress get(java.lang.Integer id);

  /** 添加 */
  int insert(OrderExpress orderExpress);

  /** 批量添加 */
  <T extends OrderExpress> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(OrderExpress orderExpress);

  /** 根据主键修改 */
  int updateById(OrderExpress orderExpress);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<OrderExpress> findList(OrderExpress orderExpress);

}
