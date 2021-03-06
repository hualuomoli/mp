package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.GoodsGallery;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsGalleryQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsGalleryQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.GoodsGalleryQueryService")
@Transactional(readOnly = true)
public class GoodsGalleryQueryService {

  @Autowired
  private GoodsGalleryQueryMapper goodsGalleryQueryMapper;

  /** 查询列表 */
  public List<GoodsGallery> findList(GoodsGalleryQuery goodsGalleryQuery) {
    return goodsGalleryQueryMapper.findList(goodsGalleryQuery);
  }

  /** 查询列表排序 */
  public List<GoodsGallery> findList(GoodsGalleryQuery goodsGalleryQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return goodsGalleryQueryMapper.findList(goodsGalleryQuery);
  }

  /** 查询分页 */
  public Page findPage(GoodsGalleryQuery goodsGalleryQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<GoodsGallery> list = goodsGalleryQueryMapper.findList(goodsGalleryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(GoodsGalleryQuery goodsGalleryQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<GoodsGallery> list = goodsGalleryQueryMapper.findList(goodsGalleryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
