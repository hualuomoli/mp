package cn.hualuomoli.mp.nideshop.api.catalog.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;

import cn.hualuomoli.mp.nideshop.api.catalog.entity.ApiCategory;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Category;
import cn.hualuomoli.mp.nideshop.base.service.CategoryBaseService;

@RequestMapping(value = "/catalog")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.catalog.controller.CatalogController")
public class CatalogController {

  @Autowired
  private CategoryBaseService categoryBaseService;

  // 全部分类
  @RequestMapping(value = { "", "/index", "/list" })
  public String index(@RequestParam(value = "id", required = false) Integer category_id) {

    Category categoryQuery = new Category();
    categoryQuery.setParent_id(0);
    List<Category> list = categoryBaseService.findPage(categoryQuery, 1, 10).getDataList();

    Map<String, Object> map = Maps.newHashMap();
    map.put("categoryList", list);

    // 当前的子分类
    category_id = category_id == null ? (list == null || list.size() == 0 ? null : list.get(0).getId()) : category_id;
    map.put("currentCategory", this.findApiCategory(category_id));

    return ApiUtils.success(map);
  }

  // 当前分类
  @RequestMapping(value = "/current")
  public String current(@RequestParam(value = "id") Integer category_id) {
    Map<String, Object> map = Maps.newHashMap();
    map.put("currentCategory", this.findApiCategory(category_id));
    return ApiUtils.success(map);
  }

  /**
   * 查询子分类
   * @param category_id 当前分类ID
   * @return 子分类
   */
  private ApiCategory findApiCategory(Integer category_id) {
    if (category_id == null) {
      return new ApiCategory();
    }

    Category category = categoryBaseService.get(category_id);
    Validate.notNull(category, "分类未找到");
    Category subQuery = new Category();
    subQuery.setParent_id(category_id);
    List<Category> subCategoryList = categoryBaseService.findList(subQuery);

    ApiCategory apiCategory = JSON.parseObject(JSON.toJSONString(category), ApiCategory.class);
    apiCategory.setSubCategoryList(subCategoryList);
    return apiCategory;
  }

}
