package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.User;
import cn.hualuomoli.mp.nideshop.base.query.entity.UserQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.UserQueryMapper")
public interface UserQueryMapper {

  /** 查询列表 */
  List<User> findList(UserQuery userQuery);

}
