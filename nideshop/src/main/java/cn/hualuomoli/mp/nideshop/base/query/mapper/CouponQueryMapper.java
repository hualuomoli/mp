package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Coupon;
import cn.hualuomoli.mp.nideshop.base.query.entity.CouponQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.CouponQueryMapper")
public interface CouponQueryMapper {

  /** 查询列表 */
  List<Coupon> findList(CouponQuery couponQuery);

}
