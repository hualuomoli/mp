package cn.hualuomoli.mp.nideshop.config.base.ds;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.RefreshConfiguration;
import org.mybatis.spring.RefreshSqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

import com.github.hualuomoli.framework.plugin.mybatis.dialect.db.MySQLDialect;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;

import cn.hualuomoli.mp.nideshop.util.ProjectConfig;

/**
 * Mybatis配置
 */
@Configuration(value = "cn.hualuomoli.mp.config.base.ds.MybatisConfig")
@Import({ DataSourceConfig.class })
public class MybatisConfig {

  static {
    System.out.println("初始化sqlSessionFactory");
  }

  @Resource(name = "dataSource")
  DataSource dataSource;

  @Bean(name = "sqlSessionFactory")
  public SqlSessionFactoryBean loadSqlSessionFactoryBean() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {

    ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());

    // mybatis异步刷新
    RefreshSqlSessionFactoryBean sqlSessionFactoryBean = new RefreshSqlSessionFactoryBean();
    sqlSessionFactoryBean.setStartup(ProjectConfig.getBoolean("mybatis.refresh"));
    sqlSessionFactoryBean.setWaitSeconds(ProjectConfig.getInteger("mybatis.refresh.waitSeconds"));
    sqlSessionFactoryBean.setConfiguration(RefreshConfiguration.getInstance());

    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mappers/**/*Mapper.xml"));

    // 分页插件
    PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
    // 设置属性
    Properties properties = new Properties();
    paginationInterceptor.setProperties(properties);
    // 设置方言
    paginationInterceptor.setDialect(new MySQLDialect());
    // 添加插件
    sqlSessionFactoryBean.setPlugins(new Interceptor[] { paginationInterceptor });

    return sqlSessionFactoryBean;
  }

}
