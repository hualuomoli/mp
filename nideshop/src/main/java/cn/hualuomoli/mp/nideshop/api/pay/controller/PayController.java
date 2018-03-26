package cn.hualuomoli.mp.nideshop.api.pay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付
 */
@RequestMapping(value = "/pay")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.pay.controller.PayController")
public class PayController {

  // 获取微信统一下单prepay_id
  @RequestMapping(value = "/prepay")
  public void prepay() {

  }

}
