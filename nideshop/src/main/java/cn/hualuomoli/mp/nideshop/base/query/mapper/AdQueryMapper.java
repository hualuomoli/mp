package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Ad;
import cn.hualuomoli.mp.nideshop.base.query.entity.AdQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.AdQueryMapper")
public interface AdQueryMapper {

  /** 查询列表 */
  List<Ad> findList(AdQuery adQuery);

}
