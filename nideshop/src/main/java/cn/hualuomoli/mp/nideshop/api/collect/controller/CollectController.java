package cn.hualuomoli.mp.nideshop.api.collect.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;

import cn.hualuomoli.mp.nideshop.api.collect.entity.ApiCollect;
import cn.hualuomoli.mp.nideshop.api.collect.service.CollectService;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Collect;
import cn.hualuomoli.mp.nideshop.base.service.CollectBaseService;

/**
 * 收藏
 */
@RequestMapping(value = "/collect")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.collect.controller.CollectController")
public class CollectController {

  @Autowired
  private CollectBaseService collectBaseService;

  @Autowired
  private CollectService collectService;

  // 收藏列表
  @RequestMapping(value = "/list")
  public String list(@RequestParam(value = "typeId") Integer type_id) {
    List<ApiCollect> list = collectService.find(type_id);
    return ApiUtils.success(list);
  }

  // 添加或取消收藏
  @RequestMapping(value = "/addordelete")
  public String addordelete(@RequestParam(value = "typeId") Integer type_id //
      , @RequestParam(value = "valueId") Integer value_id) {

    Collect collectQuery = new Collect();
    collectQuery.setType_id(type_id);
    collectQuery.setValue_id(value_id);
    collectQuery.setUser_id(ApiUtils.getCurrentUserId());
    List<Collect> list = collectBaseService.findList(collectQuery);

    String handleType = null;

    if (list == null || list.size() == 0) {
      // 添加收藏
      handleType = "add";
      Collect collect = new Collect();
      collect.setType_id(type_id);
      collect.setValue_id(value_id);
      collect.setUser_id(ApiUtils.getCurrentUserId());
      collect.setAdd_time((int) (System.currentTimeMillis() / 1000));
      collectBaseService.insert(collect);
    } else {
      // 取消收藏
      handleType = "delete";
      collectBaseService.delete(list.get(0).getId());
    }

    Map<String, Object> map = Maps.newHashMap();
    map.put("type", handleType);
    return ApiUtils.success(map);
  }

}
