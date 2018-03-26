package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.UserLevel;
import cn.hualuomoli.mp.nideshop.base.query.entity.UserLevelQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.UserLevelQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.UserLevelQueryService")
@Transactional(readOnly = true)
public class UserLevelQueryService {

  @Autowired
  private UserLevelQueryMapper userLevelQueryMapper;

  /** 查询列表 */
  public List<UserLevel> findList(UserLevelQuery userLevelQuery) {
    return userLevelQueryMapper.findList(userLevelQuery);
  }

  /** 查询列表排序 */
  public List<UserLevel> findList(UserLevelQuery userLevelQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return userLevelQueryMapper.findList(userLevelQuery);
  }

  /** 查询分页 */
  public Page findPage(UserLevelQuery userLevelQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<UserLevel> list = userLevelQueryMapper.findList(userLevelQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(UserLevelQuery userLevelQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<UserLevel> list = userLevelQueryMapper.findList(userLevelQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
