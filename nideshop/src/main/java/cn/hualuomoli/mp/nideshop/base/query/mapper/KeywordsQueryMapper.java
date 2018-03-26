package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Keywords;
import cn.hualuomoli.mp.nideshop.base.query.entity.KeywordsQuery;

// 热闹关键词表
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.KeywordsQueryMapper")
public interface KeywordsQueryMapper {

  /** 查询列表 */
  List<Keywords> findList(KeywordsQuery keywordsQuery);

}
