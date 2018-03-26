package cn.hualuomoli.mp.nideshop.api.goods.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.github.hualuomoli.framework.entity.Page;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoodsComment;
import cn.hualuomoli.mp.nideshop.api.goods.entity.ApiGoodsFilterCategory;
import cn.hualuomoli.mp.nideshop.api.goods.service.GoodsService;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Brand;
import cn.hualuomoli.mp.nideshop.base.entity.Category;
import cn.hualuomoli.mp.nideshop.base.entity.Collect;
import cn.hualuomoli.mp.nideshop.base.entity.Footprint;
import cn.hualuomoli.mp.nideshop.base.entity.Goods;
import cn.hualuomoli.mp.nideshop.base.entity.GoodsGallery;
import cn.hualuomoli.mp.nideshop.base.entity.GoodsIssue;
import cn.hualuomoli.mp.nideshop.base.entity.SearchHistory;
import cn.hualuomoli.mp.nideshop.base.service.BrandBaseService;
import cn.hualuomoli.mp.nideshop.base.service.CategoryBaseService;
import cn.hualuomoli.mp.nideshop.base.service.CollectBaseService;
import cn.hualuomoli.mp.nideshop.base.service.CommentBaseService;
import cn.hualuomoli.mp.nideshop.base.service.FootprintBaseService;
import cn.hualuomoli.mp.nideshop.base.service.GoodsAttributeBaseService;
import cn.hualuomoli.mp.nideshop.base.service.GoodsBaseService;
import cn.hualuomoli.mp.nideshop.base.service.GoodsGalleryBaseService;
import cn.hualuomoli.mp.nideshop.base.service.GoodsIssueBaseService;
import cn.hualuomoli.mp.nideshop.base.service.SearchHistoryBaseService;

/**
 * 商品
 */
@RequestMapping(value = "/goods")
@Controller(value = "cn.hualuomoli.mp.nideshop.api.goods.controller.GoodsController")
public class GoodsController {

  private static final Map<String, String> QUERY_COLUMN_MAP = Maps.newHashMap();
  private static final Map<String, String> QUERY_ORDER_MAP = Maps.newHashMap();

  @Autowired
  private GoodsBaseService goodsBaseService;
  @Autowired
  private CategoryBaseService categoryBaseService;
  @Autowired
  private GoodsGalleryBaseService galleryBaseService;
  @Autowired
  private GoodsAttributeBaseService goodsAttributeBaseService;
  @Autowired
  private SearchHistoryBaseService searchHistoryBaseService;
  @Autowired
  private GoodsIssueBaseService goodsIssueBaseService;
  @Autowired
  private BrandBaseService brandBaseService;
  @Autowired
  private CommentBaseService commentBaseService;
  @Autowired
  private FootprintBaseService footprintBaseService;
  @Autowired
  private CollectBaseService collectBaseService;

  @Autowired
  private GoodsService goodsService;

  static {
    QUERY_COLUMN_MAP.put("price", "retail_price");
    QUERY_ORDER_MAP.put("asc", "asc");
    QUERY_ORDER_MAP.put("desc", "desc");
  }

  // 统计商品总数
  @RequestMapping(value = "/count")
  public String count() {
    Integer count = goodsService.count();

    Map<String, Object> map = Maps.newHashMap();
    map.put("goodsCount", count);
    return ApiUtils.success(map);
  }

  // 获得商品列表
  @RequestMapping(value = "/list")
  public String list(@RequestParam(value = "categoryId") Integer category_id //
      , @RequestParam(value = "brandId") Integer brand_id//
      , @RequestParam(value = "keyword") String keyword//
      , @RequestParam(value = "isNew") Integer is_new//
      , @RequestParam(value = "isHot") Integer is_hot //
      , @RequestParam(value = "page") Integer pageNo //
      , @RequestParam(value = "size") Integer pageSize//
      , @RequestParam(value = "sort") String sort //
      , @RequestParam(value = "order") String order) {

    // 添加搜索历史
    SearchHistory history = new SearchHistory();
    history.setKeyword(keyword);
    history.setUser_id(ApiUtils.getCurrentUserId());
    history.setAdd_time(ApiUtils.getTime());
    searchHistoryBaseService.insert(history);

    // 执行查询
    Map<String, Object> queryMap = Maps.newHashMap();
    queryMap.put("is_new", is_new);
    queryMap.put("is_hot", is_hot);
    queryMap.put("keyword", keyword);
    queryMap.put("brand_id", brand_id);

    // 排序
    String orderBy = null;
    sort = QUERY_COLUMN_MAP.get(sort);
    order = QUERY_ORDER_MAP.get(order);
    if (sort == null) {
      orderBy = "id desc";
    } else {
      orderBy = sort + " " + order;
    }

    // 分类
    List<ApiGoodsFilterCategory> categoryList = Lists.newArrayList();
    categoryList.add(new ApiGoodsFilterCategory(0, "全部", false));
    categoryList.addAll(goodsService.findCategory(queryMap));
    for (ApiGoodsFilterCategory apiGoodsFilterCategory : categoryList) {
      if (category_id == null && apiGoodsFilterCategory.getId() == 0) {
        apiGoodsFilterCategory.setChecked(true);
      } else if (category_id != null && apiGoodsFilterCategory.getId() == category_id) {
        apiGoodsFilterCategory.setChecked(true);
      } else {
        apiGoodsFilterCategory.setChecked(false);
      }
    }

    // 商品
    Page goodsPage = goodsService.findGoods(queryMap, pageNo, pageSize, orderBy);

    // 分页信息
    Map<String, Object> dataMap = Maps.newHashMap();
    dataMap.put("count", goodsPage.getCount());
    dataMap.put("pageSize", goodsPage.getPageSize());
    dataMap.put("currentPage", goodsPage.getPageNumber());
    dataMap.put("totalPages", (int) (goodsPage.getCount() + goodsPage.getPageSize() - 1) / goodsPage.getPageSize());
    dataMap.put("data", goodsPage.getDataList());
    dataMap.put("goodsList", goodsPage.getDataList());
    dataMap.put("filterCategory", categoryList);

    Map<String, Object> map = Maps.newHashMap();
    map.put("errno", 0);
    map.put("errmsg", "");
    map.put("data", dataMap);
    String content = JSON.toJSONString(map);

    return content;
  }

  // 获得分类数据
  @RequestMapping(value = "/category")
  public String category(@RequestParam(value = "id") Integer category_id) {
    Category category = categoryBaseService.get(category_id);
    Validate.notNull(category, "未知分类");

    Category parentCategory = categoryBaseService.get(category.getParent_id());
    Validate.notNull(parentCategory, "未知分类");

    Category categoryQuery = new Category();
    categoryQuery.setParent_id(category.getParent_id());
    List<Category> list = categoryBaseService.findList(categoryQuery);
    for (Iterator<Category> it = list.iterator(); it.hasNext();) {
      Category c = it.next();
      if (c.getId() == category_id) {
        it.remove();
        break;
      }
    }

    Map<String, Object> map = Maps.newHashMap();
    map.put("currentCategory", category);
    map.put("parentCategory", parentCategory);
    map.put("brotherCategory", list);
    return ApiUtils.success(map);
  }

  // 获得商品的详情
  @RequestMapping(value = "/detail")
  public void detail(@RequestParam(value = "id") Integer goods_id) {
    // 货物
    Goods goods = goodsBaseService.get(goods_id);
    Validate.notNull(goods, "商品已下架");

    // 添加足迹
    Footprint footprint = new Footprint();
    footprint.setUser_id(ApiUtils.getCurrentUserId());
    footprint.setGoods_id(goods_id);
    footprint.setAdd_time(ApiUtils.getTime());
    footprintBaseService.insert(footprint);

    // 画廊
    GoodsGallery goodsGalleryQuery = new GoodsGallery();
    goodsGalleryQuery.setGoods_id(goods.getId());
    List<GoodsGallery> galleryList = galleryBaseService.findList(goodsGalleryQuery);

    // 货物属性
    List<Map<String, String>> attributes = goodsService.findGoodsAttribute(goods_id);

    // 问题
    List<GoodsIssue> issues = goodsIssueBaseService.findList(new GoodsIssue());

    // 品牌
    Brand brand = brandBaseService.get(goods.getBrand_id());
    Validate.notNull(brand, "未知品牌");

    // 最后一条评论
    Page goodsCommentPage = goodsService.findGoodsComment(goods_id, 1, 1);
    ApiGoodsComment apiGoodsComment = null;
    if (goodsCommentPage.getCount() > 0) {
      apiGoodsComment = (ApiGoodsComment) goodsCommentPage.getDataList().get(0);
    } else {
      apiGoodsComment = new ApiGoodsComment();
    }
    
    // 规格
    

    // 是否收藏
    Collect collectQuery = new Collect();
    collectQuery.setType_id(0);
    collectQuery.setUser_id(ApiUtils.getCurrentUserId());
    collectQuery.setValue_id(goods_id);
    List<Collect> collectList = collectBaseService.findList(collectQuery);

    Map<String, Object> commentMap = Maps.newHashMap();
    commentMap.put("count", goodsCommentPage.getCount());
    commentMap.put("data", apiGoodsComment);

    Map<String, Object> map = Maps.newHashMap();
    map.put("info", goods);
    map.put("gallery", galleryList);
    map.put("attribute", attributes);
    map.put("userHasCollect", collectList != null && collectList.size() > 0 ? 1 : 0);
    map.put("issue", issues);
    map.put("comment", commentMap);
    map.put("brand", brand);

  }

  // 新品
  @RequestMapping(value = "/new")
  public void news() {

  }

  // 热门
  @RequestMapping(value = "/hot")
  public void hot() {

  }

  // 商品详情页的关联商品（大家都在看）
  @RequestMapping(value = "/related")
  public void related() {

  }

}
