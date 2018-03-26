package cn.hualuomoli.mp.nideshop.config.base;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import cn.hualuomoli.mp.nideshop.config.base.ds.DataSourceConfig;

/**
 * 事物管理器
 */
@Configuration(value = "cn.hualuomoli.mp.config.base.TransactionManagerConfig")
@Import({ DataSourceConfig.class })
public class TransactionManagerConfig {

  static {
    System.out.println("初始化事物管理器");
  }

  @Resource(name = "dataSource")
  private DataSource dataSource;

  @Bean(name = "transactionManager")
  public DataSourceTransactionManager loadDataSourceTransactionManager() {

    DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
    transactionManager.setDataSource(dataSource);

    return transactionManager;
  }

}
