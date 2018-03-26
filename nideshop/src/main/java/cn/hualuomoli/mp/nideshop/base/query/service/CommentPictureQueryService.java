package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.CommentPicture;
import cn.hualuomoli.mp.nideshop.base.query.entity.CommentPictureQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.CommentPictureQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.CommentPictureQueryService")
@Transactional(readOnly = true)
public class CommentPictureQueryService {

  @Autowired
  private CommentPictureQueryMapper commentPictureQueryMapper;

  /** 查询列表 */
  public List<CommentPicture> findList(CommentPictureQuery commentPictureQuery) {
    return commentPictureQueryMapper.findList(commentPictureQuery);
  }

  /** 查询列表排序 */
  public List<CommentPicture> findList(CommentPictureQuery commentPictureQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return commentPictureQueryMapper.findList(commentPictureQuery);
  }

  /** 查询分页 */
  public Page findPage(CommentPictureQuery commentPictureQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<CommentPicture> list = commentPictureQueryMapper.findList(commentPictureQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(CommentPictureQuery commentPictureQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<CommentPicture> list = commentPictureQueryMapper.findList(commentPictureQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
