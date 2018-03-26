package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Region;
import cn.hualuomoli.mp.nideshop.base.query.entity.RegionQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.RegionQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.RegionQueryService")
@Transactional(readOnly = true)
public class RegionQueryService {

  @Autowired
  private RegionQueryMapper regionQueryMapper;

  /** 查询列表 */
  public List<Region> findList(RegionQuery regionQuery) {
    return regionQueryMapper.findList(regionQuery);
  }

  /** 查询列表排序 */
  public List<Region> findList(RegionQuery regionQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return regionQueryMapper.findList(regionQuery);
  }

  /** 查询分页 */
  public Page findPage(RegionQuery regionQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Region> list = regionQueryMapper.findList(regionQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(RegionQuery regionQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Region> list = regionQueryMapper.findList(regionQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
