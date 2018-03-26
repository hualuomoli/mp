package cn.hualuomoli.mp.nideshop.api.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 搜索
 */
@RequestMapping(value = "/search")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.search.controller.SearchController")
public class SearchController {

  // 搜索页面数据
  @RequestMapping(value = "/index")
  public void index() {

  }

  // 搜索数据
  @RequestMapping(value = "/result")
  public void result() {

  }

  // 搜索帮助
  @RequestMapping(value = "/helper")
  public void helper() {

  }

  // 清空历史
  @RequestMapping(value = "/clearhistory")
  public void clearhistory() {

  }

}
