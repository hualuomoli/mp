package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.GoodsIssue;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsIssueQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsIssueQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.GoodsIssueQueryService")
@Transactional(readOnly = true)
public class GoodsIssueQueryService {

  @Autowired
  private GoodsIssueQueryMapper goodsIssueQueryMapper;

  /** 查询列表 */
  public List<GoodsIssue> findList(GoodsIssueQuery goodsIssueQuery) {
    return goodsIssueQueryMapper.findList(goodsIssueQuery);
  }

  /** 查询列表排序 */
  public List<GoodsIssue> findList(GoodsIssueQuery goodsIssueQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return goodsIssueQueryMapper.findList(goodsIssueQuery);
  }

  /** 查询分页 */
  public Page findPage(GoodsIssueQuery goodsIssueQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<GoodsIssue> list = goodsIssueQueryMapper.findList(goodsIssueQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(GoodsIssueQuery goodsIssueQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<GoodsIssue> list = goodsIssueQueryMapper.findList(goodsIssueQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
