package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Collect;
import cn.hualuomoli.mp.nideshop.base.query.entity.CollectQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.CollectQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.CollectQueryService")
@Transactional(readOnly = true)
public class CollectQueryService {

  @Autowired
  private CollectQueryMapper collectQueryMapper;

  /** 查询列表 */
  public List<Collect> findList(CollectQuery collectQuery) {
    return collectQueryMapper.findList(collectQuery);
  }

  /** 查询列表排序 */
  public List<Collect> findList(CollectQuery collectQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return collectQueryMapper.findList(collectQuery);
  }

  /** 查询分页 */
  public Page findPage(CollectQuery collectQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Collect> list = collectQueryMapper.findList(collectQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(CollectQuery collectQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Collect> list = collectQueryMapper.findList(collectQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
