package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Admin;
import cn.hualuomoli.mp.nideshop.base.query.entity.AdminQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.AdminQueryMapper")
public interface AdminQueryMapper {

  /** 查询列表 */
  List<Admin> findList(AdminQuery adminQuery);

}
