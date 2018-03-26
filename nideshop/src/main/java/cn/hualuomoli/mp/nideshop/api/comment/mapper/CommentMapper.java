package cn.hualuomoli.mp.nideshop.api.comment.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.api.comment.entity.ApiComment;

@Repository(value = "cn.hualuomoli.mp.nideshop.api.comment.mapper.CommentMapper")
public interface CommentMapper {

  Map<String, Integer> count(@Param(value = "type_id") Integer type_id, @Param(value = "value_id") Integer value_id);

  List<ApiComment> list(@Param(value = "type_id") Integer type_id, @Param(value = "value_id") Integer value_id, @Param(value = "showType") Integer showType);

}
