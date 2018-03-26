package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.GoodsAttribute;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsAttributeQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsAttributeQueryMapper")
public interface GoodsAttributeQueryMapper {

  /** 查询列表 */
  List<GoodsAttribute> findList(GoodsAttributeQuery goodsAttributeQuery);

}
