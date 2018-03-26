package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Product;
import cn.hualuomoli.mp.nideshop.base.query.entity.ProductQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.ProductQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.ProductQueryService")
@Transactional(readOnly = true)
public class ProductQueryService {

  @Autowired
  private ProductQueryMapper productQueryMapper;

  /** 查询列表 */
  public List<Product> findList(ProductQuery productQuery) {
    return productQueryMapper.findList(productQuery);
  }

  /** 查询列表排序 */
  public List<Product> findList(ProductQuery productQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return productQueryMapper.findList(productQuery);
  }

  /** 查询分页 */
  public Page findPage(ProductQuery productQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Product> list = productQueryMapper.findList(productQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(ProductQuery productQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Product> list = productQueryMapper.findList(productQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
