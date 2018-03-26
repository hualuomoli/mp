package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Goods;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsQueryMapper")
public interface GoodsQueryMapper {

  /** 查询列表 */
  List<Goods> findList(GoodsQuery goodsQuery);

}
