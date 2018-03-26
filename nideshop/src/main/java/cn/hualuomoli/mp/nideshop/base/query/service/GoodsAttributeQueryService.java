package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.GoodsAttribute;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsAttributeQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsAttributeQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.GoodsAttributeQueryService")
@Transactional(readOnly = true)
public class GoodsAttributeQueryService {

  @Autowired
  private GoodsAttributeQueryMapper goodsAttributeQueryMapper;

  /** 查询列表 */
  public List<GoodsAttribute> findList(GoodsAttributeQuery goodsAttributeQuery) {
    return goodsAttributeQueryMapper.findList(goodsAttributeQuery);
  }

  /** 查询列表排序 */
  public List<GoodsAttribute> findList(GoodsAttributeQuery goodsAttributeQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return goodsAttributeQueryMapper.findList(goodsAttributeQuery);
  }

  /** 查询分页 */
  public Page findPage(GoodsAttributeQuery goodsAttributeQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<GoodsAttribute> list = goodsAttributeQueryMapper.findList(goodsAttributeQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(GoodsAttributeQuery goodsAttributeQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<GoodsAttribute> list = goodsAttributeQueryMapper.findList(goodsAttributeQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
