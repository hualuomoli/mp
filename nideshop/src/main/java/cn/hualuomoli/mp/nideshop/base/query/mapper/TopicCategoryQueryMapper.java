package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.TopicCategory;
import cn.hualuomoli.mp.nideshop.base.query.entity.TopicCategoryQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.TopicCategoryQueryMapper")
public interface TopicCategoryQueryMapper {

  /** 查询列表 */
  List<TopicCategory> findList(TopicCategoryQuery topicCategoryQuery);

}
