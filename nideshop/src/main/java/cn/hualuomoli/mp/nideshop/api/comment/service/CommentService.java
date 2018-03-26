package cn.hualuomoli.mp.nideshop.api.comment.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hualuomoli.mp.nideshop.api.comment.entity.ApiComment;
import cn.hualuomoli.mp.nideshop.api.comment.mapper.CommentMapper;

@Service(value = "cn.hualuomoli.mp.nideshop.api.comment.service.CommentService")
@Transactional(readOnly = true)
public class CommentService {

  @Autowired
  private CommentMapper commentMapper;

  public Map<String, Integer> count(Integer type_id, Integer value_id) {
    return commentMapper.count(type_id, value_id);
  }

  public List<ApiComment> list( Integer type_id, Integer value_id, Integer showType) {
    return commentMapper.list(type_id, value_id, showType);
  }

}
