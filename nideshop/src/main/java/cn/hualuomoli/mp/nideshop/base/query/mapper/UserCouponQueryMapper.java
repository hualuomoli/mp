package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.UserCoupon;
import cn.hualuomoli.mp.nideshop.base.query.entity.UserCouponQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.UserCouponQueryMapper")
public interface UserCouponQueryMapper {

  /** 查询列表 */
  List<UserCoupon> findList(UserCouponQuery userCouponQuery);

}
