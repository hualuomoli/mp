package com.wizhong.ln.creator;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.hualuomoli.creator.reverse.component.parser.Parser.Resolver;
import com.github.hualuomoli.creator.reverse.service.ReversService;
import com.github.hualuomoli.creator.reverse.service.ReversService.EntityParser;
import com.github.hualuomoli.creator.reverse.util.ReverseUtils;

import cn.hualuomoli.mp.ProjectConfig;
import cn.hualuomoli.mp.config.BaseComponentConfig;
import cn.hualuomoli.mp.config.DataSourceConfig;
import cn.hualuomoli.mp.config.MybatisConfig;
import cn.hualuomoli.mp.config.MybatisScannerConfig;

@WebAppConfiguration
@ContextConfiguration(classes = { BaseComponentConfig.class //
    , DataSourceConfig.class //
    , MybatisConfig.class //
    , MybatisScannerConfig.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class CreatorTest {

  private static final Logger logger = LoggerFactory.getLogger(CreatorTest.class);

  private static String outputPath = null;
  private String packageName = "cn.hualuomoli.mp.nideshop.base";

  @Autowired
  private ReversService reversService;

  @BeforeClass
  public static void beforeClass() {
    ProjectConfig.init("configs/creator.properties");
  }

  @Before
  public void before() {
    if (StringUtils.isBlank(outputPath)) {
      outputPath = CreatorTest.class.getResource("/").getPath();
      outputPath = outputPath.substring(0, outputPath.lastIndexOf("/target/"));
      // 输出到base
      outputPath += "/../nideshop";
    }
    logger.info("outputPath={}", outputPath);
  }

  @Test
  public void testCreate() {
    String db = "mp-nideshop";

    Resolver resolver = new MyResolver();

    reversService.create(outputPath, packageName, db, resolver, new EntityParser() {

      @Override
      public String parse(String tableName) {
        String name = tableName.substring("nideshop_".length());
        return name.substring(0, 1).toUpperCase() + ReverseUtils.hump(name.substring(1));
      }
    }, "nideshop_ad" //
        , "nideshop_ad_position" //
        , "nideshop_address" //
        , "nideshop_admin" //
        , "nideshop_attribute" //
        , "nideshop_attribute_category" //
        , "nideshop_brand" //
        , "nideshop_cart" //
        , "nideshop_category" //
        , "nideshop_channel" //
        , "nideshop_collect" //
        , "nideshop_comment" //
        , "nideshop_comment_picture" //
        , "nideshop_coupon" //
        , "nideshop_feedback" //
        , "nideshop_footprint" //
        , "nideshop_goods" //
        , "nideshop_goods_attribute" //
        , "nideshop_goods_gallery" //
        , "nideshop_goods_issue" //
        , "nideshop_goods_specification" //
        , "nideshop_keywords" //
        , "nideshop_order" //
        , "nideshop_order_express" //
        , "nideshop_order_goods" //
        , "nideshop_product" //
        , "nideshop_region" //
        , "nideshop_related_goods" //
        , "nideshop_search_history" //
        , "nideshop_shipper" //
        , "nideshop_specification" //
        , "nideshop_topic" //
        , "nideshop_topic_category" //
        , "nideshop_user" //
        , "nideshop_user_coupon" //
        , "nideshop_user_level");

    logger.info("revers created.");
  }

  private class MyResolver implements Resolver {

    @Override
    public String resolverJavaName(Class<?> javaType, String javaName, String dbName) {
      return dbName;
    }

    @Override
    public Class<?> resolverJavaType(Class<?> javaType, String javaName, String dbName) {
      return javaType;
    }

  }

}
