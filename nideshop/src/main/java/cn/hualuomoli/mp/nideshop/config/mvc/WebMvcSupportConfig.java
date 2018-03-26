package cn.hualuomoli.mp.nideshop.config.mvc;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import cn.hualuomoli.mp.nideshop.config.mvc.support.JackJsonMapper;
import cn.hualuomoli.mp.nideshop.config.mvc.support.LogInterceptor;

/**
 * 配置请求/响应消息转换
 */
@Configuration(value = "cn.hualuomoli.mp.config.mvc.WebMvcSupportConfig")
public class WebMvcSupportConfig extends WebMvcConfigurationSupport {

  // 跨域
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry//
        .addMapping("/**")//
        .allowedOrigins("*")//
        .allowCredentials(false)//
        .maxAge(3600);
  }

  // 配置消息转换器
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    System.out.println("初始化mvc 消息转换器");

    // 字符串
    converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));

    // json
    MappingJackson2HttpMessageConverter jsonConvert = new MappingJackson2HttpMessageConverter();
    jsonConvert.setObjectMapper(new JackJsonMapper());
    jsonConvert.setPrettyPrint(true);
    converters.add(jsonConvert);
  }

  // 拦截器
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    System.out.println("初始化mvc 拦截器");
    registry.addInterceptor(new LogInterceptor());
  }

  // 静态资源
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    registry.addResourceHandler("/**/*.html").addResourceLocations("/");
    registry.addResourceHandler("/**/*.js").addResourceLocations("/");
    registry.addResourceHandler("/**/*.css").addResourceLocations("/");
  }

}
