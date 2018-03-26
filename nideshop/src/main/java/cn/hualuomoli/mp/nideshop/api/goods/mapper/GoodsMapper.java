package cn.hualuomoli.mp.nideshop.api.goods.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoods;
import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoodsComment;
import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoodsFilterCategory;
import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoodsSpecification;

@Repository(value = "cn.hualuomoli.mp.nideshop.api.goods.mapper.GoodsMapper")
public interface GoodsMapper {

  List<ApiGoodsFilterCategory> findCategory(Map<String, Object> map);

  List<ApiGoods> findGoods(Map<String, Object> map);

  List<Map<String, String>> findGoodsAttribute(@Param(value = "goods_id") Integer goods_id);

  List<ApiGoodsComment> findGoodsComment(@Param(value = "goods_id") Integer goods_id);

  List<ApiGoodsSpecification> findGoodsSpecification(@Param(value = "goods_id") Integer goods_id);

}
