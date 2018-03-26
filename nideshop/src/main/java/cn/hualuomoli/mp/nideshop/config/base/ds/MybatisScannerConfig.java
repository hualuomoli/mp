package cn.hualuomoli.mp.nideshop.config.base.ds;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * Mybatis扫描配置,需要与mybatis的其他配置分开
 */
@Configuration(value = "cn.hualuomoli.mp.config.base.ds.MybatisScannerConfig")
public class MybatisScannerConfig {

  static {
    System.out.println("初始化mybatis接口mapper");
  }

  @Bean
  public MapperScannerConfigurer loadMapperScannerConfigurer() throws ClassNotFoundException {

    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    mapperScannerConfigurer.setBasePackage("cn.hualuomoli.mp");
    mapperScannerConfigurer.setAnnotationClass(Repository.class);

    return mapperScannerConfigurer;
  }

}
