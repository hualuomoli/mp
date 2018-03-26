package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Topic;
import cn.hualuomoli.mp.nideshop.base.query.entity.TopicQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.TopicQueryMapper")
public interface TopicQueryMapper {

  /** 查询列表 */
  List<Topic> findList(TopicQuery topicQuery);

}
