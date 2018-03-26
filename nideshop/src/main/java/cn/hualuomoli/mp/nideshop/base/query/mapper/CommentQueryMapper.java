package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Comment;
import cn.hualuomoli.mp.nideshop.base.query.entity.CommentQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.CommentQueryMapper")
public interface CommentQueryMapper {

  /** 查询列表 */
  List<Comment> findList(CommentQuery commentQuery);

}
