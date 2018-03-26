package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Admin;
import cn.hualuomoli.mp.nideshop.base.query.entity.AdminQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.AdminQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.AdminQueryService")
@Transactional(readOnly = true)
public class AdminQueryService {

  @Autowired
  private AdminQueryMapper adminQueryMapper;

  /** 查询列表 */
  public List<Admin> findList(AdminQuery adminQuery) {
    return adminQueryMapper.findList(adminQuery);
  }

  /** 查询列表排序 */
  public List<Admin> findList(AdminQuery adminQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return adminQueryMapper.findList(adminQuery);
  }

  /** 查询分页 */
  public Page findPage(AdminQuery adminQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Admin> list = adminQueryMapper.findList(adminQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(AdminQuery adminQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Admin> list = adminQueryMapper.findList(adminQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
