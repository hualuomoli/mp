package cn.hualuomoli.mp.nideshop.config.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 配置视图
 */
@Configuration(value = "cn.hualuomoli.mp.config.mvc.ViewConfig")
public class ViewConfig {

  static {
    System.out.println("初始化视图处理器");
  }

  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
  }

}
