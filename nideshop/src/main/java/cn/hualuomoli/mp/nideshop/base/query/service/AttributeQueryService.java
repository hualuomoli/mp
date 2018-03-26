package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Attribute;
import cn.hualuomoli.mp.nideshop.base.query.entity.AttributeQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.AttributeQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.AttributeQueryService")
@Transactional(readOnly = true)
public class AttributeQueryService {

  @Autowired
  private AttributeQueryMapper attributeQueryMapper;

  /** 查询列表 */
  public List<Attribute> findList(AttributeQuery attributeQuery) {
    return attributeQueryMapper.findList(attributeQuery);
  }

  /** 查询列表排序 */
  public List<Attribute> findList(AttributeQuery attributeQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return attributeQueryMapper.findList(attributeQuery);
  }

  /** 查询分页 */
  public Page findPage(AttributeQuery attributeQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Attribute> list = attributeQueryMapper.findList(attributeQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(AttributeQuery attributeQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Attribute> list = attributeQueryMapper.findList(attributeQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
