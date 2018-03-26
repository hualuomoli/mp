package cn.hualuomoli.mp.nideshop.config.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置MVC切面
 */
@Configuration(value = "cn.hualuomoli.mp.config.mvc.MvcAspectConfig")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MvcAspectConfig {

  static {
    System.out.println("初始化mvc aspect");
  }

}
