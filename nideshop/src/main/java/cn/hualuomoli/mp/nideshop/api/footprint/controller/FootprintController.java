package cn.hualuomoli.mp.nideshop.api.footprint.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hualuomoli.framework.entity.Page;
import com.google.common.collect.Lists;

import cn.hualuomoli.mp.nideshop.api.footprint.entity.ApiFootPrint;
import cn.hualuomoli.mp.nideshop.api.footprint.service.FootPrintService;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;

/**
 * 足迹
 */
@RequestMapping(value = "/footprint")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.footprint.controller.FootprintController")
public class FootprintController {

  @Autowired
  private FootPrintService footPrintService;

  // 足迹列表
  @RequestMapping(value = "/list")
  public String list() throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    Page page = footPrintService.page(1, 10000);
    List<ApiFootPrint> list = page.getDataList();

    Date today = sdf.parse(sdf.format(new Date()));
    String today_str = sdf.format(today);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(today);
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    String yesterday_str = sdf.format(calendar.getTime());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    String before_yesterday_str = sdf.format(calendar.getTime());

    // 格式化日期
    for (ApiFootPrint apiFootPrint : list) {
      String add_time = apiFootPrint.getAdd_time();
      Date date = new Date(Long.parseLong(add_time) * 1000);
      add_time = new SimpleDateFormat("yyyy-MM-dd").format(date);
      if (StringUtils.equals(add_time, today_str)) {
        add_time = "今天";
        continue;
      }
      if (StringUtils.equals(add_time, yesterday_str)) {
        add_time = "昨天";
        continue;
      }
      if (StringUtils.equals(add_time, before_yesterday_str)) {
        add_time = "前天";
        continue;
      }
    }

    List<List<ApiFootPrint>> lists = Lists.newArrayList();
    String currentAddTime = null;
    List<ApiFootPrint> innerList = null;
    for (ApiFootPrint apiFootPrint : list) {

      if (StringUtils.equals(currentAddTime, apiFootPrint.getAdd_time())) {
        // 一样
        innerList.add(apiFootPrint);
      } else {
        // 不一样
        // 把上一个添加到集合
        if (innerList != null) {
          lists.add(innerList);
        }
        // 创建当前新集合
        innerList = Lists.newArrayList();
        innerList.add(apiFootPrint);
      }
    }
    page.setDataList(lists);
    return ApiUtils.page(page);
  }

  // 删除足迹
  @RequestMapping(value = "/delete")
  public void delete() {

  }

}
