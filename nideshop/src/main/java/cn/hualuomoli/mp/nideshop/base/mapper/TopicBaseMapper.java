package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Topic;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.TopicBaseMapper")
public interface TopicBaseMapper {

  /** 添加 */
  int insert(Topic topic);

  /** 批量添加 */
  <T extends Topic> int batchInsert(@Param(value = "list") List<T> list);

  /** 查询列表 */
  List<Topic> findList(Topic topic);

}
