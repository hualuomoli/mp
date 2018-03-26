package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Brand;
import cn.hualuomoli.mp.nideshop.base.query.entity.BrandQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.BrandQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.BrandQueryService")
@Transactional(readOnly = true)
public class BrandQueryService {

  @Autowired
  private BrandQueryMapper brandQueryMapper;

  /** 查询列表 */
  public List<Brand> findList(BrandQuery brandQuery) {
    return brandQueryMapper.findList(brandQuery);
  }

  /** 查询列表排序 */
  public List<Brand> findList(BrandQuery brandQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return brandQueryMapper.findList(brandQuery);
  }

  /** 查询分页 */
  public Page findPage(BrandQuery brandQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Brand> list = brandQueryMapper.findList(brandQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(BrandQuery brandQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Brand> list = brandQueryMapper.findList(brandQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
