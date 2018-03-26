package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.GoodsGallery;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsGalleryQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsGalleryQueryMapper")
public interface GoodsGalleryQueryMapper {

  /** 查询列表 */
  List<GoodsGallery> findList(GoodsGalleryQuery goodsGalleryQuery);

}
