package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Coupon;
import cn.hualuomoli.mp.nideshop.base.query.entity.CouponQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.CouponQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.CouponQueryService")
@Transactional(readOnly = true)
public class CouponQueryService {

  @Autowired
  private CouponQueryMapper couponQueryMapper;

  /** 查询列表 */
  public List<Coupon> findList(CouponQuery couponQuery) {
    return couponQueryMapper.findList(couponQuery);
  }

  /** 查询列表排序 */
  public List<Coupon> findList(CouponQuery couponQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return couponQueryMapper.findList(couponQuery);
  }

  /** 查询分页 */
  public Page findPage(CouponQuery couponQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Coupon> list = couponQueryMapper.findList(couponQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(CouponQuery couponQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Coupon> list = couponQueryMapper.findList(couponQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
