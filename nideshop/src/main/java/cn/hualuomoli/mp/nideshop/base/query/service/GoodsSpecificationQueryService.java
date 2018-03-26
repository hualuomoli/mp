package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.GoodsSpecification;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsSpecificationQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsSpecificationQueryMapper;

// 商品对应规格表值表
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.GoodsSpecificationQueryService")
@Transactional(readOnly = true)
public class GoodsSpecificationQueryService {

  @Autowired
  private GoodsSpecificationQueryMapper goodsSpecificationQueryMapper;

  /** 查询列表 */
  public List<GoodsSpecification> findList(GoodsSpecificationQuery goodsSpecificationQuery) {
    return goodsSpecificationQueryMapper.findList(goodsSpecificationQuery);
  }

  /** 查询列表排序 */
  public List<GoodsSpecification> findList(GoodsSpecificationQuery goodsSpecificationQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return goodsSpecificationQueryMapper.findList(goodsSpecificationQuery);
  }

  /** 查询分页 */
  public Page findPage(GoodsSpecificationQuery goodsSpecificationQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<GoodsSpecification> list = goodsSpecificationQueryMapper.findList(goodsSpecificationQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(GoodsSpecificationQuery goodsSpecificationQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<GoodsSpecification> list = goodsSpecificationQueryMapper.findList(goodsSpecificationQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
