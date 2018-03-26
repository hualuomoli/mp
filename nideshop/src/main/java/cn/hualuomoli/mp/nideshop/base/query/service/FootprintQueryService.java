package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Footprint;
import cn.hualuomoli.mp.nideshop.base.query.entity.FootprintQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.FootprintQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.FootprintQueryService")
@Transactional(readOnly = true)
public class FootprintQueryService {

  @Autowired
  private FootprintQueryMapper footprintQueryMapper;

  /** 查询列表 */
  public List<Footprint> findList(FootprintQuery footprintQuery) {
    return footprintQueryMapper.findList(footprintQuery);
  }

  /** 查询列表排序 */
  public List<Footprint> findList(FootprintQuery footprintQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return footprintQueryMapper.findList(footprintQuery);
  }

  /** 查询分页 */
  public Page findPage(FootprintQuery footprintQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Footprint> list = footprintQueryMapper.findList(footprintQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(FootprintQuery footprintQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Footprint> list = footprintQueryMapper.findList(footprintQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
