package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.CommentPicture;
import cn.hualuomoli.mp.nideshop.base.query.entity.CommentPictureQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.CommentPictureQueryMapper")
public interface CommentPictureQueryMapper {

  /** 查询列表 */
  List<CommentPicture> findList(CommentPictureQuery commentPictureQuery);

}
