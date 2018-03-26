package cn.hualuomoli.mp.nideshop.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import cn.hualuomoli.mp.nideshop.config.base.BaseComponentConfig;
import cn.hualuomoli.mp.nideshop.config.mvc.MvcComponentConfig;
import cn.hualuomoli.mp.nideshop.config.mvc.ViewConfig;
import cn.hualuomoli.mp.nideshop.config.mvc.WebMvcSupportConfig;

/**
 * 初始化servet
 */
@Order(2)
public class BaseInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {

    AnnotationConfigWebApplicationContext rootContext = _getRootContext();

    // 设置Spring监听器
    servletContext.addListener(new ContextLoaderListener(rootContext));

    // 设置转发servlet
    servletContext.addServlet("dispatcher", new DispatcherServlet(rootContext)).addMapping("/");
  }

  // 获取Spring实例
  private AnnotationConfigWebApplicationContext _getRootContext() {
    AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
    rootContext.register( //
        BaseComponentConfig.class //

        , MvcComponentConfig.class //
        , ViewConfig.class //
        , WebMvcSupportConfig.class);
    return rootContext;
  }

}
