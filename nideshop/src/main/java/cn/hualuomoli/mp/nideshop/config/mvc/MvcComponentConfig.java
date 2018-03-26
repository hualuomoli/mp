package cn.hualuomoli.mp.nideshop.config.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置Controller自动注入
 * {@linkplain BaseComponentConfig}如果controller使用RestController注解,修改base增加RestController的忽略
 */
@Configuration(value = "cn.hualuomoli.mp.config.mvc.MvcComponentConfig")
@ComponentScan(//
    basePackages = { "cn.hualuomoli.mp" }, //
    useDefaultFilters = false, //
    includeFilters = { //
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = { Controller.class }), //
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = { RestController.class }) //
    }//
)
public class MvcComponentConfig {

  static {
    System.out.println("初始化spring mvc component");
  }

}
