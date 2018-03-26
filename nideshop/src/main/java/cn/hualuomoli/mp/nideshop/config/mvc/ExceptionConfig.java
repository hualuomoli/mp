package cn.hualuomoli.mp.nideshop.config.mvc;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.HandlerExceptionResolver;

/**
 * 配置异常处理
 * {@linkplain HandlerExceptionResolver#resolveException(javax.servlet.http.HttpServletRequest, HttpServletResponse, Object, Exception)}
 */
@Configuration(value = "cn.hualuomoli.mp.config.mvc.ExceptionConfig")
@ControllerAdvice
public class ExceptionConfig {

  static {
    System.out.println("初始化mvc 错误处理");
  }

}
