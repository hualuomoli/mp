package cn.hualuomoli.mp.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.ProjectConfig;

/**
 * Mybatis扫描配置,需要与mybatis的其他配置分开
 */
@Configuration(value = "cn.hualuomoli.mp.config.MybatisScannerConfig")
public class MybatisScannerConfig {

  @Bean
  public MapperScannerConfigurer loadMapperScannerConfigurer() throws ClassNotFoundException {

    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    mapperScannerConfigurer.setBasePackage(ProjectConfig.getString("mybatis.package"));
    mapperScannerConfigurer.setAnnotationClass(Repository.class);

    return mapperScannerConfigurer;
  }

}
