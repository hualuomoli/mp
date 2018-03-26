package cn.hualuomoli.mp.nideshop.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.github.hualuomoli.tool.util.EnvUtils;
import com.github.hualuomoli.tool.util.PropertyUtils;
import com.google.common.collect.Lists;

/**
 * 项目配置
 */
public class ProjectConfig {

  private static Properties prop = new Properties();

  /**
   * 初始化,需要初始化后才可使用
   * @param resources 资源
   */
  public synchronized static void init(String... resources) {
    Properties p = PropertyUtils.loadCover(EnvUtils.parse(resources));
    if (p == null) {
      System.out.println("没有配置任何资源,请确认后重试");
      return;
    }
    // 打印输出
    Set<Object> set = p.keySet();
    List<String> lists = Lists.newArrayList();
    for (Object obj : set) {
      String key = String.valueOf(obj);
      lists.add(key);
    }

    // 排序
    Collections.sort(lists, new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    for (String key : lists) {
      String value = p.getProperty(key);
      System.out.println(key + " = " + value);
    }

    ProjectConfig.prop = p;
  }

  /**
   * 获取字符串
   * @param key Key
   * @return 值
   */
  public static final String getString(String key) {
    return getString(key, null);
  }

  /**
   * 获取字符串
   * @param key Key
   * @param defaultValue 默认值
   * @return 值
   */
  public static final String getString(String key, String defaultValue) {
    String value = prop.getProperty(key);
    return value == null ? defaultValue : value;
  }

  /**
   * 获取整数
   * @param key Key
   * @return 值
   */
  public static final Integer getInteger(String key) {
    return getInteger(key, null);
  }

  /**
   * 获取整数
   * @param key Key
   * @param defaultValue 默认值
   * @return 值
   */
  public static final Integer getInteger(String key, Integer defaultValue) {
    String value = getString(key);
    return value == null ? defaultValue : new Integer(value);
  }

  /**
   * 获取Double
   * @param key Key
   * @return 值
   */
  public static final Double getDouble(String key) {
    return getDouble(key, null);
  }

  /**
   * 获取Double
   * @param key Key
   * @param defaultValue 默认值
   * @return 值
   */
  public static final Double getDouble(String key, Double defaultValue) {
    String value = getString(key);
    return value == null ? defaultValue : new Double(value);
  }

  /**
   * 获取Boolean值
   * @param key Key
   * @return 值
   */
  public static final Boolean getBoolean(String key) {
    String value = getString(key);
    return value == null ? false : isTrue(value);
  }

  /**
   * 是否是true
   * @param value 值
   * @return 是否为真
   */
  public static final Boolean isTrue(String value) {
    return "y".equalsIgnoreCase(value) //
        || "yes".equalsIgnoreCase(value) //
        || "o".equalsIgnoreCase(value) //
        || "ok".equalsIgnoreCase(value) //
        || "t".equalsIgnoreCase(value) //
        || "true".equalsIgnoreCase(value) //
        || "1".equalsIgnoreCase(value) //
        || "success".equalsIgnoreCase(value) //
    ;
  }

}
