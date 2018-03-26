package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.SearchHistory;
import cn.hualuomoli.mp.nideshop.base.query.entity.SearchHistoryQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.SearchHistoryQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.SearchHistoryQueryService")
@Transactional(readOnly = true)
public class SearchHistoryQueryService {

  @Autowired
  private SearchHistoryQueryMapper searchHistoryQueryMapper;

  /** 查询列表 */
  public List<SearchHistory> findList(SearchHistoryQuery searchHistoryQuery) {
    return searchHistoryQueryMapper.findList(searchHistoryQuery);
  }

  /** 查询列表排序 */
  public List<SearchHistory> findList(SearchHistoryQuery searchHistoryQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return searchHistoryQueryMapper.findList(searchHistoryQuery);
  }

  /** 查询分页 */
  public Page findPage(SearchHistoryQuery searchHistoryQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<SearchHistory> list = searchHistoryQueryMapper.findList(searchHistoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(SearchHistoryQuery searchHistoryQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<SearchHistory> list = searchHistoryQueryMapper.findList(searchHistoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
