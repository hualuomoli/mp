package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Goods;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.GoodsQueryService")
@Transactional(readOnly = true)
public class GoodsQueryService {

  @Autowired
  private GoodsQueryMapper goodsQueryMapper;

  /** 查询列表 */
  public List<Goods> findList(GoodsQuery goodsQuery) {
    return goodsQueryMapper.findList(goodsQuery);
  }

  /** 查询列表排序 */
  public List<Goods> findList(GoodsQuery goodsQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return goodsQueryMapper.findList(goodsQuery);
  }

  /** 查询分页 */
  public Page findPage(GoodsQuery goodsQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Goods> list = goodsQueryMapper.findList(goodsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(GoodsQuery goodsQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Goods> list = goodsQueryMapper.findList(goodsQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
