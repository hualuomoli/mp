package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.SearchHistory;
import cn.hualuomoli.mp.nideshop.base.query.entity.SearchHistoryQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.SearchHistoryQueryMapper")
public interface SearchHistoryQueryMapper {

  /** 查询列表 */
  List<SearchHistory> findList(SearchHistoryQuery searchHistoryQuery);

}
