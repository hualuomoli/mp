package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Cart;
import cn.hualuomoli.mp.nideshop.base.query.entity.CartQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.CartQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.CartQueryService")
@Transactional(readOnly = true)
public class CartQueryService {

  @Autowired
  private CartQueryMapper cartQueryMapper;

  /** 查询列表 */
  public List<Cart> findList(CartQuery cartQuery) {
    return cartQueryMapper.findList(cartQuery);
  }

  /** 查询列表排序 */
  public List<Cart> findList(CartQuery cartQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return cartQueryMapper.findList(cartQuery);
  }

  /** 查询分页 */
  public Page findPage(CartQuery cartQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Cart> list = cartQueryMapper.findList(cartQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(CartQuery cartQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Cart> list = cartQueryMapper.findList(cartQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
