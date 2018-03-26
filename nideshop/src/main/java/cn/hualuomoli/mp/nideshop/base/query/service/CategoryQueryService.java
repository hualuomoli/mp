package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Category;
import cn.hualuomoli.mp.nideshop.base.query.entity.CategoryQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.CategoryQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.CategoryQueryService")
@Transactional(readOnly = true)
public class CategoryQueryService {

  @Autowired
  private CategoryQueryMapper categoryQueryMapper;

  /** 查询列表 */
  public List<Category> findList(CategoryQuery categoryQuery) {
    return categoryQueryMapper.findList(categoryQuery);
  }

  /** 查询列表排序 */
  public List<Category> findList(CategoryQuery categoryQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return categoryQueryMapper.findList(categoryQuery);
  }

  /** 查询分页 */
  public Page findPage(CategoryQuery categoryQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Category> list = categoryQueryMapper.findList(categoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(CategoryQuery categoryQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Category> list = categoryQueryMapper.findList(categoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
