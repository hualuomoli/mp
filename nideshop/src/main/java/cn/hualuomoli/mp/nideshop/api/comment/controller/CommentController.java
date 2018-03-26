package cn.hualuomoli.mp.nideshop.api.comment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.hualuomoli.mp.nideshop.api.comment.entity.ApiComment;
import cn.hualuomoli.mp.nideshop.api.comment.service.CommentService;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Comment;
import cn.hualuomoli.mp.nideshop.base.service.CommentBaseService;

/**
 * 评论
 */
@RequestMapping(value = "/comoment")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.comment.controller.CommentController")
public class CommentController {

  @Autowired
  private CommentBaseService commentBaseService;

  @Autowired
  private CommentService commentService;

  // 评论列表
  @RequestMapping(value = "/list")
  public String list(@RequestParam(value = "typeId") Integer type_id//
      , @RequestParam(value = "valueId") Integer value_id//
      , @RequestParam(value = "showType") Integer showType) {

    List<ApiComment> list = commentService.list(type_id, value_id, showType);
    return ApiUtils.success(list);
  }

  // 评论总数
  @RequestMapping(value = "/count")
  public String count(@RequestParam(value = "typeId") Integer type_id//
      , @RequestParam(value = "valueId") Integer value_id) {

    Map<String, Integer> map = commentService.count(type_id, value_id);
    return ApiUtils.success(map);
  }

  // 发表评论
  @RequestMapping(value = "/post")
  public String post(@RequestParam(value = "typeId") Integer type_id//
      , @RequestParam(value = "valueId") Integer value_id//
      , @RequestParam(value = "content") String content) {

    Comment comment = new Comment();
    comment.setType_id(type_id);
    comment.setValue_id(value_id);
    comment.setContent(content);
    comment.setAdd_time(ApiUtils.getTime());
    comment.setUser_id(ApiUtils.getCurrentUserId());
    commentBaseService.insert(comment);
    return ApiUtils.success("评论添加成功");
  }

}
