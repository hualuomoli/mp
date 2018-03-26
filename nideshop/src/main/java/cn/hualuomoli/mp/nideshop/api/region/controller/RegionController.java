package cn.hualuomoli.mp.nideshop.api.region.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/region")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.region.controller.RegionController")
public class RegionController {

  // 获取区域列表
  @RequestMapping(value = "/list")
  public void list() {

  }

}
