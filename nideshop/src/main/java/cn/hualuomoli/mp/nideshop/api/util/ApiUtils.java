package cn.hualuomoli.mp.nideshop.api.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.mvc.util.servlet.ServletUtils;
import com.google.common.collect.Maps;

public class ApiUtils {

  private static final Integer DEFAULT_PAGE_NO = 1;
  private static final Integer DEFAULT_PAGE_SIZE = 10;

  /**
   * 获取当前用户
   * @return 当前登录用户编号
   */
  public static final Integer getCurrentUserId() {
    // TODO
    return 0;
  }

  /**
   * 获取请求的页码
   * @return 请求的页码,如果没有指定返回 {@value #DEFAULT_PAGE_NO}
   */
  public static final Integer getRequestPageNo() {
    String page = ServletUtils.getRequest().getParameter("page");
    return page == null ? DEFAULT_PAGE_NO : Integer.parseInt(page);
  }

  /**
   * 获取请求的数据量
   * @return 请求的数据量,如果没有指定返回{@value #DEFAULT_PAGE_SIZE}
   */
  public static final Integer getRequestPageSize() {
    String size = ServletUtils.getRequest().getParameter("size");
    return size == null ? DEFAULT_PAGE_SIZE : Integer.parseInt(size);
  }

  /**
   * 成功
   * @param object 返回的数据
   * @return 返回的json
   */
  public static String success(Object object) {
    Map<String, Object> map = Maps.newHashMap();
    map.put("errno", 0);
    map.put("errmsg", "");
    map.put("data", object);
    String content = JSON.toJSONString(map);

    return content;
  }

  /**
   * 成功
   * @param key data中内容的key
   * @param object 返回的数据
   * @return 返回的json
   */
  public static String success(String key, Object object) {
    Map<String, Object> dataMap = Maps.newHashMap();
    dataMap.put(key, object);

    Map<String, Object> map = Maps.newHashMap();
    map.put("errno", 0);
    map.put("errmsg", "");
    map.put("data", dataMap);
    String content = JSON.toJSONString(map);

    return content;
  }

  /**
   * 成功
   * @param page 分页数据
   * @return 返回的json
   */
  public static String page(Page page) {
    return page(page, "data");
  }

  /**
   * 成功
   * @param page 分页数据
   * @param listName 数据集合名词
   * @return 返回的json
   */
  public static String page(Page page, String listName) {

    // 分页信息
    Map<String, Object> dataMap = Maps.newHashMap();
    dataMap.put("count", page.getCount());
    dataMap.put("pageSize", page.getPageSize());
    dataMap.put("currentPage", page.getPageNumber());
    dataMap.put("totalPages", (int) (page.getCount() + page.getPageSize() - 1) / page.getPageSize());
    dataMap.put(listName, page.getDataList());

    Map<String, Object> map = Maps.newHashMap();
    map.put("errno", 0);
    map.put("errmsg", "");
    map.put("data", dataMap);
    String content = JSON.toJSONString(map);

    return content;
  }

  /**
   * 没有权限
   * @return 返回的json
   */
  public static String noAuth() {
    Map<String, Object> map = Maps.newHashMap();
    map.put("errno", 401);
    map.put("errmsg", "请先登录");
    return JSON.toJSONString(map);
  }

  /**
   * 失败
   * @param e 异常
   * @return 返回的json
   */
  public static String error(Throwable t) {
    Map<String, Object> map = Maps.newHashMap();
    map.put("errno", 1);
    map.put("errmsg", t.getMessage());
    return JSON.toJSONString(map);
  }

  /**
   * 加法
   * @param d1 金额1
   * @param d2 金额2
   * @return 相加后的金额 
   */
  public static Double plus(Double d1, Double d2) {
    return new BigDecimal(Double.toString(d1))//
        .add(new BigDecimal(Double.toString(d2)))//
        .setScale(2, RoundingMode.HALF_UP)//
        .doubleValue();
  }

  /**
   * 乘法
   * @param d 金额
   * @param i 数量
   * @return 总额
   */
  public static Double multiply(Double d, Integer i) {
    return new BigDecimal(Double.toString(d)) //
        .multiply(new BigDecimal(Integer.toString(i))) //
        .setScale(2, RoundingMode.HALF_UP) //
        .doubleValue();
  }

  /**
   * 获取当前时间
   * @return 当前时间
   */
  public static int getTime() {
    return (int) (System.currentTimeMillis() / 1000);
  }

}
