package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.RelatedGoods;
import cn.hualuomoli.mp.nideshop.base.query.entity.RelatedGoodsQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.RelatedGoodsQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.RelatedGoodsQueryService")
@Transactional(readOnly = true)
public class RelatedGoodsQueryService {

  @Autowired
  private RelatedGoodsQueryMapper relatedGoodsQueryMapper;

  /** 查询列表 */
  public List<RelatedGoods> findList(RelatedGoodsQuery relatedGoodsQuery) {
    return relatedGoodsQueryMapper.findList(relatedGoodsQuery);
  }

  /** 查询列表排序 */
  public List<RelatedGoods> findList(RelatedGoodsQuery relatedGoodsQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return relatedGoodsQueryMapper.findList(relatedGoodsQuery);
  }

  /** 查询分页 */
  public Page findPage(RelatedGoodsQuery relatedGoodsQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<RelatedGoods> list = relatedGoodsQueryMapper.findList(relatedGoodsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(RelatedGoodsQuery relatedGoodsQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<RelatedGoods> list = relatedGoodsQueryMapper.findList(relatedGoodsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
