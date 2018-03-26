package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Keywords;
import cn.hualuomoli.mp.nideshop.base.query.entity.KeywordsQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.KeywordsQueryMapper;

// 热闹关键词表
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.KeywordsQueryService")
@Transactional(readOnly = true)
public class KeywordsQueryService {

  @Autowired
  private KeywordsQueryMapper keywordsQueryMapper;

  /** 查询列表 */
  public List<Keywords> findList(KeywordsQuery keywordsQuery) {
    return keywordsQueryMapper.findList(keywordsQuery);
  }

  /** 查询列表排序 */
  public List<Keywords> findList(KeywordsQuery keywordsQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return keywordsQueryMapper.findList(keywordsQuery);
  }

  /** 查询分页 */
  public Page findPage(KeywordsQuery keywordsQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Keywords> list = keywordsQueryMapper.findList(keywordsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(KeywordsQuery keywordsQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Keywords> list = keywordsQueryMapper.findList(keywordsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
