package cn.hualuomoli.mp.nideshop.config.base;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 使用Annotation自动注册Bean
 */
@Configuration(value = "cn.hualuomoli.mp.config.base.BaseComponentConfig")
// 主容器中不扫描@Controller注解，在SpringMvc中只扫描@Controller注解(解决事物失效问题)
@ComponentScan( //
    basePackages = { "cn.hualuomoli.mp" } //
    , excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = { Controller.class }) })
public class BaseComponentConfig {

  static {
    System.out.println("初始化spring 组件");
  }

}
