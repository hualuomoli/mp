package cn.hualuomoli.mp.nideshop.api.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 权限
 */
@RequestMapping(value = "/auth")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.auth.controller.AuthController")
public class AuthController {

  // 登陆
  @RequestMapping(value = "/login")
  public void login() {

  }

}
