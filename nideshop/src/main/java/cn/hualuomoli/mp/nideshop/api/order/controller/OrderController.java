package cn.hualuomoli.mp.nideshop.api.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单
 */
@RequestMapping(value = "/order")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.order.controller.OrderController")
public class OrderController {

  // 订单列表
  @RequestMapping(value = "/list")
  public void list() {

  }

  // 订单详情
  @RequestMapping(value = "/detail")
  public void detail() {
  }

  // 提交订单
  @RequestMapping(value = "/submit")
  public void submit() {

  }

  // 取消订单
  @RequestMapping(value = "/cancel")
  public void cancel() {
  }

  // 物流详情
  @RequestMapping(value = "/express")
  public void express() {

  }

}
