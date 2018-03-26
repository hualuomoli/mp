package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.AttributeCategory;
import cn.hualuomoli.mp.nideshop.base.query.entity.AttributeCategoryQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.AttributeCategoryQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.AttributeCategoryQueryService")
@Transactional(readOnly = true)
public class AttributeCategoryQueryService {

  @Autowired
  private AttributeCategoryQueryMapper attributeCategoryQueryMapper;

  /** 查询列表 */
  public List<AttributeCategory> findList(AttributeCategoryQuery attributeCategoryQuery) {
    return attributeCategoryQueryMapper.findList(attributeCategoryQuery);
  }

  /** 查询列表排序 */
  public List<AttributeCategory> findList(AttributeCategoryQuery attributeCategoryQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return attributeCategoryQueryMapper.findList(attributeCategoryQuery);
  }

  /** 查询分页 */
  public Page findPage(AttributeCategoryQuery attributeCategoryQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<AttributeCategory> list = attributeCategoryQueryMapper.findList(attributeCategoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(AttributeCategoryQuery attributeCategoryQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<AttributeCategory> list = attributeCategoryQueryMapper.findList(attributeCategoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
