package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.UserCoupon;
import cn.hualuomoli.mp.nideshop.base.query.entity.UserCouponQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.UserCouponQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.UserCouponQueryService")
@Transactional(readOnly = true)
public class UserCouponQueryService {

  @Autowired
  private UserCouponQueryMapper userCouponQueryMapper;

  /** 查询列表 */
  public List<UserCoupon> findList(UserCouponQuery userCouponQuery) {
    return userCouponQueryMapper.findList(userCouponQuery);
  }

  /** 查询列表排序 */
  public List<UserCoupon> findList(UserCouponQuery userCouponQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return userCouponQueryMapper.findList(userCouponQuery);
  }

  /** 查询分页 */
  public Page findPage(UserCouponQuery userCouponQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<UserCoupon> list = userCouponQueryMapper.findList(userCouponQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(UserCouponQuery userCouponQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<UserCoupon> list = userCouponQueryMapper.findList(userCouponQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
