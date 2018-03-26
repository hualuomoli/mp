package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.RelatedGoods;
import cn.hualuomoli.mp.nideshop.base.query.entity.RelatedGoodsQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.RelatedGoodsQueryMapper")
public interface RelatedGoodsQueryMapper {

  /** 查询列表 */
  List<RelatedGoods> findList(RelatedGoodsQuery relatedGoodsQuery);

}
