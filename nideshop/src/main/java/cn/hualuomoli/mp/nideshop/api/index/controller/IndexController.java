package cn.hualuomoli.mp.nideshop.api.index.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.api.util.Cache;
import cn.hualuomoli.mp.nideshop.base.entity.Ad;
import cn.hualuomoli.mp.nideshop.base.entity.Brand;
import cn.hualuomoli.mp.nideshop.base.entity.Category;
import cn.hualuomoli.mp.nideshop.base.entity.Channel;
import cn.hualuomoli.mp.nideshop.base.entity.Goods;
import cn.hualuomoli.mp.nideshop.base.entity.Topic;
import cn.hualuomoli.mp.nideshop.base.query.entity.CategoryQuery;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsQuery;
import cn.hualuomoli.mp.nideshop.base.query.service.CategoryQueryService;
import cn.hualuomoli.mp.nideshop.base.query.service.GoodsQueryService;
import cn.hualuomoli.mp.nideshop.base.service.AdBaseService;
import cn.hualuomoli.mp.nideshop.base.service.BrandBaseService;
import cn.hualuomoli.mp.nideshop.base.service.CategoryBaseService;
import cn.hualuomoli.mp.nideshop.base.service.ChannelBaseService;
import cn.hualuomoli.mp.nideshop.base.service.GoodsBaseService;
import cn.hualuomoli.mp.nideshop.base.service.TopicBaseService;

/**
 * 首页数据接口
 */
@RequestMapping(value = "/index")
@RestController(value = "IndexController")
public class IndexController {

  @Autowired
  private AdBaseService adBaseService;
  @Autowired
  private ChannelBaseService channelBaseService;
  @Autowired
  private GoodsBaseService goodsBaseService;
  @Autowired
  private GoodsQueryService goodsQueryService;
  @Autowired
  private BrandBaseService brandBaseService;
  @Autowired
  private TopicBaseService topicBaseService;
  @Autowired
  private CategoryBaseService categoryBaseService;
  @Autowired
  private CategoryQueryService categoryQueryService;

  @RequestMapping(value = { "", "/index" })
  @Cache
  public String index() {

    // 广告
    Ad adQuery = new Ad();
    adQuery.setAd_position_id(1);
    List<Ad> banner = adBaseService.findList(adQuery);

    // 频道
    List<Channel> channels = channelBaseService.findList(new Channel(), "sort_order asc");

    // 新品 
    Goods newGoodsQuery = new Goods();
    newGoodsQuery.setIs_new(1);
    List<Goods> newGoodsList = goodsBaseService.findPage(newGoodsQuery, 1, 4).getDataList();

    // 热卖
    Goods hotGoodsQuery = new Goods();
    hotGoodsQuery.setIs_hot(1);
    List<Goods> hotGoodsList = goodsBaseService.findPage(newGoodsQuery, 1, 3).getDataList();

    // 品牌
    Brand brandQuery = new Brand();
    brandQuery.setIs_new(1);
    List<Brand> brandList = brandBaseService.findPage(brandQuery, 1, 4, "new_sort_order asc").getDataList();

    // 专题
    List<Topic> topicList = topicBaseService.findPage(new Topic(), 1, 3).getDataList();

    // 类别
    List<Map<String, Object>> newCategoryList = Lists.newArrayList();
    CategoryQuery categoryQuery = new CategoryQuery();
    categoryQuery.setParent_id(0);
    categoryQuery.setNameNotEquals("推荐");
    List<Category> categoryList = categoryQueryService.findList(categoryQuery);
    for (Category category : categoryList) {
      // 获取二级类别商品
      Category subCategoryQuery = new Category();
      subCategoryQuery.setParent_id(category.getId());
      List<Category> subCategoryList = categoryBaseService.findPage(subCategoryQuery, 1, 100).getDataList();

      GoodsQuery categoryGoodsQuery = new GoodsQuery();
      List<Integer> category_idIns = Lists.newArrayList();
      for (Category subCategory : subCategoryList) {
        category_idIns.add(subCategory.getId());
      }
      categoryGoodsQuery.setCategory_idIns(category_idIns.toArray(new Integer[] {}));
      List<Goods> subCategoryGoods = goodsQueryService.findPage(categoryGoodsQuery, 1, 7).getDataList();
      Map<String, Object> newCategoryMap = Maps.newHashMap();
      newCategoryMap.put("id", category.getId());
      newCategoryMap.put("name", category.getName());
      newCategoryMap.put("goodsList", subCategoryGoods);
      newCategoryList.add(newCategoryMap);
    }

    Map<String, Object> resultMap = Maps.newHashMap();
    resultMap.put("banner", banner);
    resultMap.put("channel", channels);
    resultMap.put("newGoodsList", newGoodsList);
    resultMap.put("hotGoodsList", hotGoodsList);
    resultMap.put("brandList", brandList);
    resultMap.put("topicList", topicList);
    resultMap.put("categoryList", newCategoryList);

    return ApiUtils.success(resultMap);
  }

}
