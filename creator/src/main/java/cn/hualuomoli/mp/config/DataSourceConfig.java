package cn.hualuomoli.mp.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

import cn.hualuomoli.mp.ProjectConfig;

/**
 * 数据库
 */
@Configuration(value = "cn.hualuomoli.mp.config.DataSourceConfig")
public class DataSourceConfig {

  @Bean(name = "dataSource", initMethod = "init", destroyMethod = "close")
  public DataSource dataSource() {

    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName(ProjectConfig.getString("jdbc.driverClassName"));
    dataSource.setUrl(ProjectConfig.getString("jdbc.url"));
    dataSource.setUsername(ProjectConfig.getString("jdbc.username"));
    dataSource.setPassword(ProjectConfig.getString("jdbc.password"));

    return dataSource;
  }

}
