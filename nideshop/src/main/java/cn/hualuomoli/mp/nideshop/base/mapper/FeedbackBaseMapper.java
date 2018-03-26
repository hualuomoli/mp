package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Feedback;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.FeedbackBaseMapper")
public interface FeedbackBaseMapper {

  /** 根据主键msg_id查询 */
  Feedback get(java.lang.Integer msg_id);

  /** 添加 */
  int insert(Feedback feedback);

  /** 批量添加 */
  <T extends Feedback> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(Feedback feedback);

  /** 根据主键修改 */
  int updateByMsg_id(Feedback feedback);

  /** 根据主键删除 */
  int delete(java.lang.Integer msg_id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "msg_ids") java.lang.Integer[] msg_id);

  /** 查询列表 */
  List<Feedback> findList(Feedback feedback);

}
