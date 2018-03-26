package cn.hualuomoli.mp.nideshop.api.topic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 专题
@RequestMapping(value = "/topic")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.topic.controller.TopicController")
public class TopicController {

  // 列表
  @RequestMapping(value = "/list")
  public void list() {

  }

  // 详情
  @RequestMapping(value = "/detail")
  public void detail() {

  }

  // 相关
  @RequestMapping(value = "/related")
  public void related() {

  }

}
