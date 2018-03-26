package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.GoodsSpecification;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsSpecificationQuery;

// 商品对应规格表值表
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsSpecificationQueryMapper")
public interface GoodsSpecificationQueryMapper {

  /** 查询列表 */
  List<GoodsSpecification> findList(GoodsSpecificationQuery goodsSpecificationQuery);

}
