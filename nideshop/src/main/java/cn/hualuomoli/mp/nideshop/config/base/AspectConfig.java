package cn.hualuomoli.mp.nideshop.config.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 切面
 */
@Configuration(value = "cn.hualuomoli.mp.config.base.AspectConfig")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectConfig {

  static {
    System.out.println("初始化spring 切面");
  }

}
