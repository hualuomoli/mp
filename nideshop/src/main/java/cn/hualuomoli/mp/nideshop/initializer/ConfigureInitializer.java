package cn.hualuomoli.mp.nideshop.initializer;

import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import com.github.hualuomoli.tool.util.EnvUtils;
import com.github.hualuomoli.tool.util.PropertyUtils;

import cn.hualuomoli.mp.nideshop.util.ProjectConfig;

/**
 * 配置
 */
@Order(1)
public class ConfigureInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {

    // 配置运行环境
    EnvUtils.init("environment");

    // 设置log4j
    String log4jFilename = "logs/log4j.properties";
    Properties prop = PropertyUtils.loadFirstReverse(EnvUtils.parse(log4jFilename));
    PropertyConfigurator.configure(prop);

    // 初始化配置文件
    ProjectConfig.init("classpath*:configs/jdbc.properties"//
        , "classpath*:configs/mp.properties"//
        , "classpath*:configs/config.properties");
  }

}
