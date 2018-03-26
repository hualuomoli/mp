package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Specification;
import cn.hualuomoli.mp.nideshop.base.query.entity.SpecificationQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.SpecificationQueryMapper;

// 规格表
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.SpecificationQueryService")
@Transactional(readOnly = true)
public class SpecificationQueryService {

  @Autowired
  private SpecificationQueryMapper specificationQueryMapper;

  /** 查询列表 */
  public List<Specification> findList(SpecificationQuery specificationQuery) {
    return specificationQueryMapper.findList(specificationQuery);
  }

  /** 查询列表排序 */
  public List<Specification> findList(SpecificationQuery specificationQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return specificationQueryMapper.findList(specificationQuery);
  }

  /** 查询分页 */
  public Page findPage(SpecificationQuery specificationQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Specification> list = specificationQueryMapper.findList(specificationQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(SpecificationQuery specificationQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Specification> list = specificationQueryMapper.findList(specificationQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
