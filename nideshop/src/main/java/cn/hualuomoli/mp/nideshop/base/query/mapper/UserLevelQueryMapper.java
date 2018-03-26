package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.UserLevel;
import cn.hualuomoli.mp.nideshop.base.query.entity.UserLevelQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.UserLevelQueryMapper")
public interface UserLevelQueryMapper {

  /** 查询列表 */
  List<UserLevel> findList(UserLevelQuery userLevelQuery);

}
