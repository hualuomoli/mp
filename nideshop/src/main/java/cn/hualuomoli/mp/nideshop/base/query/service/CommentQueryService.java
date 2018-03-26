package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Comment;
import cn.hualuomoli.mp.nideshop.base.query.entity.CommentQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.CommentQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.CommentQueryService")
@Transactional(readOnly = true)
public class CommentQueryService {

  @Autowired
  private CommentQueryMapper commentQueryMapper;

  /** 查询列表 */
  public List<Comment> findList(CommentQuery commentQuery) {
    return commentQueryMapper.findList(commentQuery);
  }

  /** 查询列表排序 */
  public List<Comment> findList(CommentQuery commentQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return commentQueryMapper.findList(commentQuery);
  }

  /** 查询分页 */
  public Page findPage(CommentQuery commentQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Comment> list = commentQueryMapper.findList(commentQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(CommentQuery commentQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Comment> list = commentQueryMapper.findList(commentQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
