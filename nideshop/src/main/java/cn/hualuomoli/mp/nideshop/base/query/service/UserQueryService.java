package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.User;
import cn.hualuomoli.mp.nideshop.base.query.entity.UserQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.UserQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.UserQueryService")
@Transactional(readOnly = true)
public class UserQueryService {

  @Autowired
  private UserQueryMapper userQueryMapper;

  /** 查询列表 */
  public List<User> findList(UserQuery userQuery) {
    return userQueryMapper.findList(userQuery);
  }

  /** 查询列表排序 */
  public List<User> findList(UserQuery userQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return userQueryMapper.findList(userQuery);
  }

  /** 查询分页 */
  public Page findPage(UserQuery userQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<User> list = userQueryMapper.findList(userQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(UserQuery userQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<User> list = userQueryMapper.findList(userQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
