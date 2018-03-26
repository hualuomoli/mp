package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Collect;
import cn.hualuomoli.mp.nideshop.base.query.entity.CollectQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.CollectQueryMapper")
public interface CollectQueryMapper {

  /** 查询列表 */
  List<Collect> findList(CollectQuery collectQuery);

}
