package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Goods;

// 
public class GoodsQuery extends Goods {

  /**  */
  private java.lang.Integer category_idGreaterThan;
  private java.lang.Integer category_idGreaterEqual;
  private java.lang.Integer category_idLessEqual;
  private java.lang.Integer category_idLessThan;
  private java.lang.Integer category_idNotEquals;
  private java.lang.Integer[] category_idIns;
  private java.lang.Integer[] category_idNotIns;
  /**  */
  private java.lang.String goods_snLeftLike;
  private java.lang.String goods_snRightLike;
  private java.lang.String goods_snLike;
  private java.lang.String goods_snNotEquals;
  private java.lang.String[] goods_snIns;
  private java.lang.String[] goods_snNotIns;
  /**  */
  private java.lang.String nameLeftLike;
  private java.lang.String nameRightLike;
  private java.lang.String nameLike;
  private java.lang.String nameNotEquals;
  private java.lang.String[] nameIns;
  private java.lang.String[] nameNotIns;
  /**  */
  private java.lang.Integer brand_idGreaterThan;
  private java.lang.Integer brand_idGreaterEqual;
  private java.lang.Integer brand_idLessEqual;
  private java.lang.Integer brand_idLessThan;
  private java.lang.Integer brand_idNotEquals;
  private java.lang.Integer[] brand_idIns;
  private java.lang.Integer[] brand_idNotIns;
  /**  */
  private java.lang.Integer goods_numberGreaterThan;
  private java.lang.Integer goods_numberGreaterEqual;
  private java.lang.Integer goods_numberLessEqual;
  private java.lang.Integer goods_numberLessThan;
  private java.lang.Integer goods_numberNotEquals;
  private java.lang.Integer[] goods_numberIns;
  private java.lang.Integer[] goods_numberNotIns;
  /**  */
  private java.lang.String keywordsLeftLike;
  private java.lang.String keywordsRightLike;
  private java.lang.String keywordsLike;
  private java.lang.String keywordsNotEquals;
  private java.lang.String[] keywordsIns;
  private java.lang.String[] keywordsNotIns;
  /**  */
  private java.lang.String goods_briefLeftLike;
  private java.lang.String goods_briefRightLike;
  private java.lang.String goods_briefLike;
  private java.lang.String goods_briefNotEquals;
  private java.lang.String[] goods_briefIns;
  private java.lang.String[] goods_briefNotIns;
  /**  */
  private java.lang.String goods_descLeftLike;
  private java.lang.String goods_descRightLike;
  private java.lang.String goods_descLike;
  private java.lang.String goods_descNotEquals;
  private java.lang.String[] goods_descIns;
  private java.lang.String[] goods_descNotIns;
  /**  */
  private java.lang.Integer is_on_saleGreaterThan;
  private java.lang.Integer is_on_saleGreaterEqual;
  private java.lang.Integer is_on_saleLessEqual;
  private java.lang.Integer is_on_saleLessThan;
  private java.lang.Integer is_on_saleNotEquals;
  private java.lang.Integer[] is_on_saleIns;
  private java.lang.Integer[] is_on_saleNotIns;
  /**  */
  private java.lang.Integer add_timeGreaterThan;
  private java.lang.Integer add_timeGreaterEqual;
  private java.lang.Integer add_timeLessEqual;
  private java.lang.Integer add_timeLessThan;
  private java.lang.Integer add_timeNotEquals;
  private java.lang.Integer[] add_timeIns;
  private java.lang.Integer[] add_timeNotIns;
  /**  */
  private java.lang.Integer sort_orderGreaterThan;
  private java.lang.Integer sort_orderGreaterEqual;
  private java.lang.Integer sort_orderLessEqual;
  private java.lang.Integer sort_orderLessThan;
  private java.lang.Integer sort_orderNotEquals;
  private java.lang.Integer[] sort_orderIns;
  private java.lang.Integer[] sort_orderNotIns;
  /**  */
  private java.lang.Integer is_deleteGreaterThan;
  private java.lang.Integer is_deleteGreaterEqual;
  private java.lang.Integer is_deleteLessEqual;
  private java.lang.Integer is_deleteLessThan;
  private java.lang.Integer is_deleteNotEquals;
  private java.lang.Integer[] is_deleteIns;
  private java.lang.Integer[] is_deleteNotIns;
  /**  */
  private java.lang.Integer attribute_categoryGreaterThan;
  private java.lang.Integer attribute_categoryGreaterEqual;
  private java.lang.Integer attribute_categoryLessEqual;
  private java.lang.Integer attribute_categoryLessThan;
  private java.lang.Integer attribute_categoryNotEquals;
  private java.lang.Integer[] attribute_categoryIns;
  private java.lang.Integer[] attribute_categoryNotIns;
  /** 专柜价格 */
  private java.lang.Double counter_priceGreaterThan;
  private java.lang.Double counter_priceGreaterEqual;
  private java.lang.Double counter_priceLessEqual;
  private java.lang.Double counter_priceLessThan;
  private java.lang.Double counter_priceNotEquals;
  private java.lang.Double[] counter_priceIns;
  private java.lang.Double[] counter_priceNotIns;
  /** 附加价格 */
  private java.lang.Double extra_priceGreaterThan;
  private java.lang.Double extra_priceGreaterEqual;
  private java.lang.Double extra_priceLessEqual;
  private java.lang.Double extra_priceLessThan;
  private java.lang.Double extra_priceNotEquals;
  private java.lang.Double[] extra_priceIns;
  private java.lang.Double[] extra_priceNotIns;
  /**  */
  private java.lang.Integer is_newGreaterThan;
  private java.lang.Integer is_newGreaterEqual;
  private java.lang.Integer is_newLessEqual;
  private java.lang.Integer is_newLessThan;
  private java.lang.Integer is_newNotEquals;
  private java.lang.Integer[] is_newIns;
  private java.lang.Integer[] is_newNotIns;
  /** 商品单位 */
  private java.lang.String goods_unitLeftLike;
  private java.lang.String goods_unitRightLike;
  private java.lang.String goods_unitLike;
  private java.lang.String goods_unitNotEquals;
  private java.lang.String[] goods_unitIns;
  private java.lang.String[] goods_unitNotIns;
  /** 商品主图 */
  private java.lang.String primary_pic_urlLeftLike;
  private java.lang.String primary_pic_urlRightLike;
  private java.lang.String primary_pic_urlLike;
  private java.lang.String primary_pic_urlNotEquals;
  private java.lang.String[] primary_pic_urlIns;
  private java.lang.String[] primary_pic_urlNotIns;
  /** 商品列表图 */
  private java.lang.String list_pic_urlLeftLike;
  private java.lang.String list_pic_urlRightLike;
  private java.lang.String list_pic_urlLike;
  private java.lang.String list_pic_urlNotEquals;
  private java.lang.String[] list_pic_urlIns;
  private java.lang.String[] list_pic_urlNotIns;
  /** 零售价格 */
  private java.lang.Double retail_priceGreaterThan;
  private java.lang.Double retail_priceGreaterEqual;
  private java.lang.Double retail_priceLessEqual;
  private java.lang.Double retail_priceLessThan;
  private java.lang.Double retail_priceNotEquals;
  private java.lang.Double[] retail_priceIns;
  private java.lang.Double[] retail_priceNotIns;
  /** 销售量 */
  private java.lang.Integer sell_volumeGreaterThan;
  private java.lang.Integer sell_volumeGreaterEqual;
  private java.lang.Integer sell_volumeLessEqual;
  private java.lang.Integer sell_volumeLessThan;
  private java.lang.Integer sell_volumeNotEquals;
  private java.lang.Integer[] sell_volumeIns;
  private java.lang.Integer[] sell_volumeNotIns;
  /** 主sku　product_id */
  private java.lang.Integer primary_product_idGreaterThan;
  private java.lang.Integer primary_product_idGreaterEqual;
  private java.lang.Integer primary_product_idLessEqual;
  private java.lang.Integer primary_product_idLessThan;
  private java.lang.Integer primary_product_idNotEquals;
  private java.lang.Integer[] primary_product_idIns;
  private java.lang.Integer[] primary_product_idNotIns;
  /** 单位价格，单价 */
  private java.lang.Double unit_priceGreaterThan;
  private java.lang.Double unit_priceGreaterEqual;
  private java.lang.Double unit_priceLessEqual;
  private java.lang.Double unit_priceLessThan;
  private java.lang.Double unit_priceNotEquals;
  private java.lang.Double[] unit_priceIns;
  private java.lang.Double[] unit_priceNotIns;
  /**  */
  private java.lang.String promotion_descLeftLike;
  private java.lang.String promotion_descRightLike;
  private java.lang.String promotion_descLike;
  private java.lang.String promotion_descNotEquals;
  private java.lang.String[] promotion_descIns;
  private java.lang.String[] promotion_descNotIns;
  /**  */
  private java.lang.String promotion_tagLeftLike;
  private java.lang.String promotion_tagRightLike;
  private java.lang.String promotion_tagLike;
  private java.lang.String promotion_tagNotEquals;
  private java.lang.String[] promotion_tagIns;
  private java.lang.String[] promotion_tagNotIns;
  /** APP专享价 */
  private java.lang.Double app_exclusive_priceGreaterThan;
  private java.lang.Double app_exclusive_priceGreaterEqual;
  private java.lang.Double app_exclusive_priceLessEqual;
  private java.lang.Double app_exclusive_priceLessThan;
  private java.lang.Double app_exclusive_priceNotEquals;
  private java.lang.Double[] app_exclusive_priceIns;
  private java.lang.Double[] app_exclusive_priceNotIns;
  /** 是否是APP专属 */
  private java.lang.Integer is_app_exclusiveGreaterThan;
  private java.lang.Integer is_app_exclusiveGreaterEqual;
  private java.lang.Integer is_app_exclusiveLessEqual;
  private java.lang.Integer is_app_exclusiveLessThan;
  private java.lang.Integer is_app_exclusiveNotEquals;
  private java.lang.Integer[] is_app_exclusiveIns;
  private java.lang.Integer[] is_app_exclusiveNotIns;
  /**  */
  private java.lang.Integer is_limitedGreaterThan;
  private java.lang.Integer is_limitedGreaterEqual;
  private java.lang.Integer is_limitedLessEqual;
  private java.lang.Integer is_limitedLessThan;
  private java.lang.Integer is_limitedNotEquals;
  private java.lang.Integer[] is_limitedIns;
  private java.lang.Integer[] is_limitedNotIns;
  /**  */
  private java.lang.Integer is_hotGreaterThan;
  private java.lang.Integer is_hotGreaterEqual;
  private java.lang.Integer is_hotLessEqual;
  private java.lang.Integer is_hotLessThan;
  private java.lang.Integer is_hotNotEquals;
  private java.lang.Integer[] is_hotIns;
  private java.lang.Integer[] is_hotNotIns;

  public GoodsQuery() {
  }

  // getter and setter

  public java.lang.Integer getCategory_idGreaterThan() {
    return category_idGreaterThan;
  }

  public void setcategory_idGreaterThan(java.lang.Integer category_idGreaterThan) {
    this.category_idGreaterThan = category_idGreaterThan;
  }

  public java.lang.Integer getCategory_idGreaterEqual() {
    return category_idGreaterEqual;
  }

  public void setCategory_idGreaterEqual(java.lang.Integer category_idGreaterEqual) {
    this.category_idGreaterEqual = category_idGreaterEqual;
  }

  public java.lang.Integer getCategory_idLessEqual() {
    return category_idLessEqual;
  }

  public void setCategory_idLessEqual(java.lang.Integer category_idLessEqual) {
    this.category_idLessEqual = category_idLessEqual;
  }

  public java.lang.Integer getCategory_idLessThan() {
    return category_idLessThan;
  }

  public void setCategory_idLessThan(java.lang.Integer category_idLessThan) {
    this.category_idLessThan = category_idLessThan;
  }

  public java.lang.Integer getCategory_idNotEquals() {
    return category_idNotEquals;
  }

  public void setCategory_idNotEquals(java.lang.Integer category_idNotEquals) {
    this.category_idNotEquals = category_idNotEquals;
  }

  public java.lang.Integer[] getCategory_idIns() {
    return category_idIns;
  }

  public void setCategory_idIns(java.lang.Integer[] category_idIns) {
    this.category_idIns = category_idIns;
  }

  public java.lang.Integer[] getCategory_idNotIns() {
    return category_idNotIns;
  }

  public void setCategory_idNotIns(java.lang.Integer[] category_idNotIns) {
    this.category_idNotIns = category_idNotIns;
  }

  public java.lang.String getGoods_snLeftLike() {
    return goods_snLeftLike;
  }

  public void setGoods_snLeftLike(java.lang.String goods_snLeftLike) {
    this.goods_snLeftLike = goods_snLeftLike;
  }

  public java.lang.String getGoods_snRightLike() {
    return goods_snRightLike;
  }

  public void setGoods_snRightLike(java.lang.String goods_snRightLike) {
    this.goods_snRightLike = goods_snRightLike;
  }

  public java.lang.String getGoods_snLike() {
    return goods_snLike;
  }

  public void setGoods_snLike(java.lang.String goods_snLike) {
    this.goods_snLike = goods_snLike;
  }

  public java.lang.String getGoods_snNotEquals() {
    return goods_snNotEquals;
  }

  public void setGoods_snNotEquals(java.lang.String goods_snNotEquals) {
    this.goods_snNotEquals = goods_snNotEquals;
  }

  public java.lang.String[] getGoods_snIns() {
    return goods_snIns;
  }

  public void setGoods_snIns(java.lang.String[] goods_snIns) {
    this.goods_snIns = goods_snIns;
  }

  public java.lang.String[] getGoods_snNotIns() {
    return goods_snNotIns;
  }

  public void setGoods_snNotIns(java.lang.String[] goods_snNotIns) {
    this.goods_snNotIns = goods_snNotIns;
  }

  public java.lang.String getNameLeftLike() {
    return nameLeftLike;
  }

  public void setNameLeftLike(java.lang.String nameLeftLike) {
    this.nameLeftLike = nameLeftLike;
  }

  public java.lang.String getNameRightLike() {
    return nameRightLike;
  }

  public void setNameRightLike(java.lang.String nameRightLike) {
    this.nameRightLike = nameRightLike;
  }

  public java.lang.String getNameLike() {
    return nameLike;
  }

  public void setNameLike(java.lang.String nameLike) {
    this.nameLike = nameLike;
  }

  public java.lang.String getNameNotEquals() {
    return nameNotEquals;
  }

  public void setNameNotEquals(java.lang.String nameNotEquals) {
    this.nameNotEquals = nameNotEquals;
  }

  public java.lang.String[] getNameIns() {
    return nameIns;
  }

  public void setNameIns(java.lang.String[] nameIns) {
    this.nameIns = nameIns;
  }

  public java.lang.String[] getNameNotIns() {
    return nameNotIns;
  }

  public void setNameNotIns(java.lang.String[] nameNotIns) {
    this.nameNotIns = nameNotIns;
  }

  public java.lang.Integer getBrand_idGreaterThan() {
    return brand_idGreaterThan;
  }

  public void setbrand_idGreaterThan(java.lang.Integer brand_idGreaterThan) {
    this.brand_idGreaterThan = brand_idGreaterThan;
  }

  public java.lang.Integer getBrand_idGreaterEqual() {
    return brand_idGreaterEqual;
  }

  public void setBrand_idGreaterEqual(java.lang.Integer brand_idGreaterEqual) {
    this.brand_idGreaterEqual = brand_idGreaterEqual;
  }

  public java.lang.Integer getBrand_idLessEqual() {
    return brand_idLessEqual;
  }

  public void setBrand_idLessEqual(java.lang.Integer brand_idLessEqual) {
    this.brand_idLessEqual = brand_idLessEqual;
  }

  public java.lang.Integer getBrand_idLessThan() {
    return brand_idLessThan;
  }

  public void setBrand_idLessThan(java.lang.Integer brand_idLessThan) {
    this.brand_idLessThan = brand_idLessThan;
  }

  public java.lang.Integer getBrand_idNotEquals() {
    return brand_idNotEquals;
  }

  public void setBrand_idNotEquals(java.lang.Integer brand_idNotEquals) {
    this.brand_idNotEquals = brand_idNotEquals;
  }

  public java.lang.Integer[] getBrand_idIns() {
    return brand_idIns;
  }

  public void setBrand_idIns(java.lang.Integer[] brand_idIns) {
    this.brand_idIns = brand_idIns;
  }

  public java.lang.Integer[] getBrand_idNotIns() {
    return brand_idNotIns;
  }

  public void setBrand_idNotIns(java.lang.Integer[] brand_idNotIns) {
    this.brand_idNotIns = brand_idNotIns;
  }

  public java.lang.Integer getGoods_numberGreaterThan() {
    return goods_numberGreaterThan;
  }

  public void setgoods_numberGreaterThan(java.lang.Integer goods_numberGreaterThan) {
    this.goods_numberGreaterThan = goods_numberGreaterThan;
  }

  public java.lang.Integer getGoods_numberGreaterEqual() {
    return goods_numberGreaterEqual;
  }

  public void setGoods_numberGreaterEqual(java.lang.Integer goods_numberGreaterEqual) {
    this.goods_numberGreaterEqual = goods_numberGreaterEqual;
  }

  public java.lang.Integer getGoods_numberLessEqual() {
    return goods_numberLessEqual;
  }

  public void setGoods_numberLessEqual(java.lang.Integer goods_numberLessEqual) {
    this.goods_numberLessEqual = goods_numberLessEqual;
  }

  public java.lang.Integer getGoods_numberLessThan() {
    return goods_numberLessThan;
  }

  public void setGoods_numberLessThan(java.lang.Integer goods_numberLessThan) {
    this.goods_numberLessThan = goods_numberLessThan;
  }

  public java.lang.Integer getGoods_numberNotEquals() {
    return goods_numberNotEquals;
  }

  public void setGoods_numberNotEquals(java.lang.Integer goods_numberNotEquals) {
    this.goods_numberNotEquals = goods_numberNotEquals;
  }

  public java.lang.Integer[] getGoods_numberIns() {
    return goods_numberIns;
  }

  public void setGoods_numberIns(java.lang.Integer[] goods_numberIns) {
    this.goods_numberIns = goods_numberIns;
  }

  public java.lang.Integer[] getGoods_numberNotIns() {
    return goods_numberNotIns;
  }

  public void setGoods_numberNotIns(java.lang.Integer[] goods_numberNotIns) {
    this.goods_numberNotIns = goods_numberNotIns;
  }

  public java.lang.String getKeywordsLeftLike() {
    return keywordsLeftLike;
  }

  public void setKeywordsLeftLike(java.lang.String keywordsLeftLike) {
    this.keywordsLeftLike = keywordsLeftLike;
  }

  public java.lang.String getKeywordsRightLike() {
    return keywordsRightLike;
  }

  public void setKeywordsRightLike(java.lang.String keywordsRightLike) {
    this.keywordsRightLike = keywordsRightLike;
  }

  public java.lang.String getKeywordsLike() {
    return keywordsLike;
  }

  public void setKeywordsLike(java.lang.String keywordsLike) {
    this.keywordsLike = keywordsLike;
  }

  public java.lang.String getKeywordsNotEquals() {
    return keywordsNotEquals;
  }

  public void setKeywordsNotEquals(java.lang.String keywordsNotEquals) {
    this.keywordsNotEquals = keywordsNotEquals;
  }

  public java.lang.String[] getKeywordsIns() {
    return keywordsIns;
  }

  public void setKeywordsIns(java.lang.String[] keywordsIns) {
    this.keywordsIns = keywordsIns;
  }

  public java.lang.String[] getKeywordsNotIns() {
    return keywordsNotIns;
  }

  public void setKeywordsNotIns(java.lang.String[] keywordsNotIns) {
    this.keywordsNotIns = keywordsNotIns;
  }

  public java.lang.String getGoods_briefLeftLike() {
    return goods_briefLeftLike;
  }

  public void setGoods_briefLeftLike(java.lang.String goods_briefLeftLike) {
    this.goods_briefLeftLike = goods_briefLeftLike;
  }

  public java.lang.String getGoods_briefRightLike() {
    return goods_briefRightLike;
  }

  public void setGoods_briefRightLike(java.lang.String goods_briefRightLike) {
    this.goods_briefRightLike = goods_briefRightLike;
  }

  public java.lang.String getGoods_briefLike() {
    return goods_briefLike;
  }

  public void setGoods_briefLike(java.lang.String goods_briefLike) {
    this.goods_briefLike = goods_briefLike;
  }

  public java.lang.String getGoods_briefNotEquals() {
    return goods_briefNotEquals;
  }

  public void setGoods_briefNotEquals(java.lang.String goods_briefNotEquals) {
    this.goods_briefNotEquals = goods_briefNotEquals;
  }

  public java.lang.String[] getGoods_briefIns() {
    return goods_briefIns;
  }

  public void setGoods_briefIns(java.lang.String[] goods_briefIns) {
    this.goods_briefIns = goods_briefIns;
  }

  public java.lang.String[] getGoods_briefNotIns() {
    return goods_briefNotIns;
  }

  public void setGoods_briefNotIns(java.lang.String[] goods_briefNotIns) {
    this.goods_briefNotIns = goods_briefNotIns;
  }

  public java.lang.String getGoods_descLeftLike() {
    return goods_descLeftLike;
  }

  public void setGoods_descLeftLike(java.lang.String goods_descLeftLike) {
    this.goods_descLeftLike = goods_descLeftLike;
  }

  public java.lang.String getGoods_descRightLike() {
    return goods_descRightLike;
  }

  public void setGoods_descRightLike(java.lang.String goods_descRightLike) {
    this.goods_descRightLike = goods_descRightLike;
  }

  public java.lang.String getGoods_descLike() {
    return goods_descLike;
  }

  public void setGoods_descLike(java.lang.String goods_descLike) {
    this.goods_descLike = goods_descLike;
  }

  public java.lang.String getGoods_descNotEquals() {
    return goods_descNotEquals;
  }

  public void setGoods_descNotEquals(java.lang.String goods_descNotEquals) {
    this.goods_descNotEquals = goods_descNotEquals;
  }

  public java.lang.String[] getGoods_descIns() {
    return goods_descIns;
  }

  public void setGoods_descIns(java.lang.String[] goods_descIns) {
    this.goods_descIns = goods_descIns;
  }

  public java.lang.String[] getGoods_descNotIns() {
    return goods_descNotIns;
  }

  public void setGoods_descNotIns(java.lang.String[] goods_descNotIns) {
    this.goods_descNotIns = goods_descNotIns;
  }

  public java.lang.Integer getIs_on_saleGreaterThan() {
    return is_on_saleGreaterThan;
  }

  public void setis_on_saleGreaterThan(java.lang.Integer is_on_saleGreaterThan) {
    this.is_on_saleGreaterThan = is_on_saleGreaterThan;
  }

  public java.lang.Integer getIs_on_saleGreaterEqual() {
    return is_on_saleGreaterEqual;
  }

  public void setIs_on_saleGreaterEqual(java.lang.Integer is_on_saleGreaterEqual) {
    this.is_on_saleGreaterEqual = is_on_saleGreaterEqual;
  }

  public java.lang.Integer getIs_on_saleLessEqual() {
    return is_on_saleLessEqual;
  }

  public void setIs_on_saleLessEqual(java.lang.Integer is_on_saleLessEqual) {
    this.is_on_saleLessEqual = is_on_saleLessEqual;
  }

  public java.lang.Integer getIs_on_saleLessThan() {
    return is_on_saleLessThan;
  }

  public void setIs_on_saleLessThan(java.lang.Integer is_on_saleLessThan) {
    this.is_on_saleLessThan = is_on_saleLessThan;
  }

  public java.lang.Integer getIs_on_saleNotEquals() {
    return is_on_saleNotEquals;
  }

  public void setIs_on_saleNotEquals(java.lang.Integer is_on_saleNotEquals) {
    this.is_on_saleNotEquals = is_on_saleNotEquals;
  }

  public java.lang.Integer[] getIs_on_saleIns() {
    return is_on_saleIns;
  }

  public void setIs_on_saleIns(java.lang.Integer[] is_on_saleIns) {
    this.is_on_saleIns = is_on_saleIns;
  }

  public java.lang.Integer[] getIs_on_saleNotIns() {
    return is_on_saleNotIns;
  }

  public void setIs_on_saleNotIns(java.lang.Integer[] is_on_saleNotIns) {
    this.is_on_saleNotIns = is_on_saleNotIns;
  }

  public java.lang.Integer getAdd_timeGreaterThan() {
    return add_timeGreaterThan;
  }

  public void setadd_timeGreaterThan(java.lang.Integer add_timeGreaterThan) {
    this.add_timeGreaterThan = add_timeGreaterThan;
  }

  public java.lang.Integer getAdd_timeGreaterEqual() {
    return add_timeGreaterEqual;
  }

  public void setAdd_timeGreaterEqual(java.lang.Integer add_timeGreaterEqual) {
    this.add_timeGreaterEqual = add_timeGreaterEqual;
  }

  public java.lang.Integer getAdd_timeLessEqual() {
    return add_timeLessEqual;
  }

  public void setAdd_timeLessEqual(java.lang.Integer add_timeLessEqual) {
    this.add_timeLessEqual = add_timeLessEqual;
  }

  public java.lang.Integer getAdd_timeLessThan() {
    return add_timeLessThan;
  }

  public void setAdd_timeLessThan(java.lang.Integer add_timeLessThan) {
    this.add_timeLessThan = add_timeLessThan;
  }

  public java.lang.Integer getAdd_timeNotEquals() {
    return add_timeNotEquals;
  }

  public void setAdd_timeNotEquals(java.lang.Integer add_timeNotEquals) {
    this.add_timeNotEquals = add_timeNotEquals;
  }

  public java.lang.Integer[] getAdd_timeIns() {
    return add_timeIns;
  }

  public void setAdd_timeIns(java.lang.Integer[] add_timeIns) {
    this.add_timeIns = add_timeIns;
  }

  public java.lang.Integer[] getAdd_timeNotIns() {
    return add_timeNotIns;
  }

  public void setAdd_timeNotIns(java.lang.Integer[] add_timeNotIns) {
    this.add_timeNotIns = add_timeNotIns;
  }

  public java.lang.Integer getSort_orderGreaterThan() {
    return sort_orderGreaterThan;
  }

  public void setsort_orderGreaterThan(java.lang.Integer sort_orderGreaterThan) {
    this.sort_orderGreaterThan = sort_orderGreaterThan;
  }

  public java.lang.Integer getSort_orderGreaterEqual() {
    return sort_orderGreaterEqual;
  }

  public void setSort_orderGreaterEqual(java.lang.Integer sort_orderGreaterEqual) {
    this.sort_orderGreaterEqual = sort_orderGreaterEqual;
  }

  public java.lang.Integer getSort_orderLessEqual() {
    return sort_orderLessEqual;
  }

  public void setSort_orderLessEqual(java.lang.Integer sort_orderLessEqual) {
    this.sort_orderLessEqual = sort_orderLessEqual;
  }

  public java.lang.Integer getSort_orderLessThan() {
    return sort_orderLessThan;
  }

  public void setSort_orderLessThan(java.lang.Integer sort_orderLessThan) {
    this.sort_orderLessThan = sort_orderLessThan;
  }

  public java.lang.Integer getSort_orderNotEquals() {
    return sort_orderNotEquals;
  }

  public void setSort_orderNotEquals(java.lang.Integer sort_orderNotEquals) {
    this.sort_orderNotEquals = sort_orderNotEquals;
  }

  public java.lang.Integer[] getSort_orderIns() {
    return sort_orderIns;
  }

  public void setSort_orderIns(java.lang.Integer[] sort_orderIns) {
    this.sort_orderIns = sort_orderIns;
  }

  public java.lang.Integer[] getSort_orderNotIns() {
    return sort_orderNotIns;
  }

  public void setSort_orderNotIns(java.lang.Integer[] sort_orderNotIns) {
    this.sort_orderNotIns = sort_orderNotIns;
  }

  public java.lang.Integer getIs_deleteGreaterThan() {
    return is_deleteGreaterThan;
  }

  public void setis_deleteGreaterThan(java.lang.Integer is_deleteGreaterThan) {
    this.is_deleteGreaterThan = is_deleteGreaterThan;
  }

  public java.lang.Integer getIs_deleteGreaterEqual() {
    return is_deleteGreaterEqual;
  }

  public void setIs_deleteGreaterEqual(java.lang.Integer is_deleteGreaterEqual) {
    this.is_deleteGreaterEqual = is_deleteGreaterEqual;
  }

  public java.lang.Integer getIs_deleteLessEqual() {
    return is_deleteLessEqual;
  }

  public void setIs_deleteLessEqual(java.lang.Integer is_deleteLessEqual) {
    this.is_deleteLessEqual = is_deleteLessEqual;
  }

  public java.lang.Integer getIs_deleteLessThan() {
    return is_deleteLessThan;
  }

  public void setIs_deleteLessThan(java.lang.Integer is_deleteLessThan) {
    this.is_deleteLessThan = is_deleteLessThan;
  }

  public java.lang.Integer getIs_deleteNotEquals() {
    return is_deleteNotEquals;
  }

  public void setIs_deleteNotEquals(java.lang.Integer is_deleteNotEquals) {
    this.is_deleteNotEquals = is_deleteNotEquals;
  }

  public java.lang.Integer[] getIs_deleteIns() {
    return is_deleteIns;
  }

  public void setIs_deleteIns(java.lang.Integer[] is_deleteIns) {
    this.is_deleteIns = is_deleteIns;
  }

  public java.lang.Integer[] getIs_deleteNotIns() {
    return is_deleteNotIns;
  }

  public void setIs_deleteNotIns(java.lang.Integer[] is_deleteNotIns) {
    this.is_deleteNotIns = is_deleteNotIns;
  }

  public java.lang.Integer getAttribute_categoryGreaterThan() {
    return attribute_categoryGreaterThan;
  }

  public void setattribute_categoryGreaterThan(java.lang.Integer attribute_categoryGreaterThan) {
    this.attribute_categoryGreaterThan = attribute_categoryGreaterThan;
  }

  public java.lang.Integer getAttribute_categoryGreaterEqual() {
    return attribute_categoryGreaterEqual;
  }

  public void setAttribute_categoryGreaterEqual(java.lang.Integer attribute_categoryGreaterEqual) {
    this.attribute_categoryGreaterEqual = attribute_categoryGreaterEqual;
  }

  public java.lang.Integer getAttribute_categoryLessEqual() {
    return attribute_categoryLessEqual;
  }

  public void setAttribute_categoryLessEqual(java.lang.Integer attribute_categoryLessEqual) {
    this.attribute_categoryLessEqual = attribute_categoryLessEqual;
  }

  public java.lang.Integer getAttribute_categoryLessThan() {
    return attribute_categoryLessThan;
  }

  public void setAttribute_categoryLessThan(java.lang.Integer attribute_categoryLessThan) {
    this.attribute_categoryLessThan = attribute_categoryLessThan;
  }

  public java.lang.Integer getAttribute_categoryNotEquals() {
    return attribute_categoryNotEquals;
  }

  public void setAttribute_categoryNotEquals(java.lang.Integer attribute_categoryNotEquals) {
    this.attribute_categoryNotEquals = attribute_categoryNotEquals;
  }

  public java.lang.Integer[] getAttribute_categoryIns() {
    return attribute_categoryIns;
  }

  public void setAttribute_categoryIns(java.lang.Integer[] attribute_categoryIns) {
    this.attribute_categoryIns = attribute_categoryIns;
  }

  public java.lang.Integer[] getAttribute_categoryNotIns() {
    return attribute_categoryNotIns;
  }

  public void setAttribute_categoryNotIns(java.lang.Integer[] attribute_categoryNotIns) {
    this.attribute_categoryNotIns = attribute_categoryNotIns;
  }

  public java.lang.Double getCounter_priceGreaterThan() {
    return counter_priceGreaterThan;
  }

  public void setcounter_priceGreaterThan(java.lang.Double counter_priceGreaterThan) {
    this.counter_priceGreaterThan = counter_priceGreaterThan;
  }

  public java.lang.Double getCounter_priceGreaterEqual() {
    return counter_priceGreaterEqual;
  }

  public void setCounter_priceGreaterEqual(java.lang.Double counter_priceGreaterEqual) {
    this.counter_priceGreaterEqual = counter_priceGreaterEqual;
  }

  public java.lang.Double getCounter_priceLessEqual() {
    return counter_priceLessEqual;
  }

  public void setCounter_priceLessEqual(java.lang.Double counter_priceLessEqual) {
    this.counter_priceLessEqual = counter_priceLessEqual;
  }

  public java.lang.Double getCounter_priceLessThan() {
    return counter_priceLessThan;
  }

  public void setCounter_priceLessThan(java.lang.Double counter_priceLessThan) {
    this.counter_priceLessThan = counter_priceLessThan;
  }

  public java.lang.Double getCounter_priceNotEquals() {
    return counter_priceNotEquals;
  }

  public void setCounter_priceNotEquals(java.lang.Double counter_priceNotEquals) {
    this.counter_priceNotEquals = counter_priceNotEquals;
  }

  public java.lang.Double[] getCounter_priceIns() {
    return counter_priceIns;
  }

  public void setCounter_priceIns(java.lang.Double[] counter_priceIns) {
    this.counter_priceIns = counter_priceIns;
  }

  public java.lang.Double[] getCounter_priceNotIns() {
    return counter_priceNotIns;
  }

  public void setCounter_priceNotIns(java.lang.Double[] counter_priceNotIns) {
    this.counter_priceNotIns = counter_priceNotIns;
  }

  public java.lang.Double getExtra_priceGreaterThan() {
    return extra_priceGreaterThan;
  }

  public void setextra_priceGreaterThan(java.lang.Double extra_priceGreaterThan) {
    this.extra_priceGreaterThan = extra_priceGreaterThan;
  }

  public java.lang.Double getExtra_priceGreaterEqual() {
    return extra_priceGreaterEqual;
  }

  public void setExtra_priceGreaterEqual(java.lang.Double extra_priceGreaterEqual) {
    this.extra_priceGreaterEqual = extra_priceGreaterEqual;
  }

  public java.lang.Double getExtra_priceLessEqual() {
    return extra_priceLessEqual;
  }

  public void setExtra_priceLessEqual(java.lang.Double extra_priceLessEqual) {
    this.extra_priceLessEqual = extra_priceLessEqual;
  }

  public java.lang.Double getExtra_priceLessThan() {
    return extra_priceLessThan;
  }

  public void setExtra_priceLessThan(java.lang.Double extra_priceLessThan) {
    this.extra_priceLessThan = extra_priceLessThan;
  }

  public java.lang.Double getExtra_priceNotEquals() {
    return extra_priceNotEquals;
  }

  public void setExtra_priceNotEquals(java.lang.Double extra_priceNotEquals) {
    this.extra_priceNotEquals = extra_priceNotEquals;
  }

  public java.lang.Double[] getExtra_priceIns() {
    return extra_priceIns;
  }

  public void setExtra_priceIns(java.lang.Double[] extra_priceIns) {
    this.extra_priceIns = extra_priceIns;
  }

  public java.lang.Double[] getExtra_priceNotIns() {
    return extra_priceNotIns;
  }

  public void setExtra_priceNotIns(java.lang.Double[] extra_priceNotIns) {
    this.extra_priceNotIns = extra_priceNotIns;
  }

  public java.lang.Integer getIs_newGreaterThan() {
    return is_newGreaterThan;
  }

  public void setis_newGreaterThan(java.lang.Integer is_newGreaterThan) {
    this.is_newGreaterThan = is_newGreaterThan;
  }

  public java.lang.Integer getIs_newGreaterEqual() {
    return is_newGreaterEqual;
  }

  public void setIs_newGreaterEqual(java.lang.Integer is_newGreaterEqual) {
    this.is_newGreaterEqual = is_newGreaterEqual;
  }

  public java.lang.Integer getIs_newLessEqual() {
    return is_newLessEqual;
  }

  public void setIs_newLessEqual(java.lang.Integer is_newLessEqual) {
    this.is_newLessEqual = is_newLessEqual;
  }

  public java.lang.Integer getIs_newLessThan() {
    return is_newLessThan;
  }

  public void setIs_newLessThan(java.lang.Integer is_newLessThan) {
    this.is_newLessThan = is_newLessThan;
  }

  public java.lang.Integer getIs_newNotEquals() {
    return is_newNotEquals;
  }

  public void setIs_newNotEquals(java.lang.Integer is_newNotEquals) {
    this.is_newNotEquals = is_newNotEquals;
  }

  public java.lang.Integer[] getIs_newIns() {
    return is_newIns;
  }

  public void setIs_newIns(java.lang.Integer[] is_newIns) {
    this.is_newIns = is_newIns;
  }

  public java.lang.Integer[] getIs_newNotIns() {
    return is_newNotIns;
  }

  public void setIs_newNotIns(java.lang.Integer[] is_newNotIns) {
    this.is_newNotIns = is_newNotIns;
  }

  public java.lang.String getGoods_unitLeftLike() {
    return goods_unitLeftLike;
  }

  public void setGoods_unitLeftLike(java.lang.String goods_unitLeftLike) {
    this.goods_unitLeftLike = goods_unitLeftLike;
  }

  public java.lang.String getGoods_unitRightLike() {
    return goods_unitRightLike;
  }

  public void setGoods_unitRightLike(java.lang.String goods_unitRightLike) {
    this.goods_unitRightLike = goods_unitRightLike;
  }

  public java.lang.String getGoods_unitLike() {
    return goods_unitLike;
  }

  public void setGoods_unitLike(java.lang.String goods_unitLike) {
    this.goods_unitLike = goods_unitLike;
  }

  public java.lang.String getGoods_unitNotEquals() {
    return goods_unitNotEquals;
  }

  public void setGoods_unitNotEquals(java.lang.String goods_unitNotEquals) {
    this.goods_unitNotEquals = goods_unitNotEquals;
  }

  public java.lang.String[] getGoods_unitIns() {
    return goods_unitIns;
  }

  public void setGoods_unitIns(java.lang.String[] goods_unitIns) {
    this.goods_unitIns = goods_unitIns;
  }

  public java.lang.String[] getGoods_unitNotIns() {
    return goods_unitNotIns;
  }

  public void setGoods_unitNotIns(java.lang.String[] goods_unitNotIns) {
    this.goods_unitNotIns = goods_unitNotIns;
  }

  public java.lang.String getPrimary_pic_urlLeftLike() {
    return primary_pic_urlLeftLike;
  }

  public void setPrimary_pic_urlLeftLike(java.lang.String primary_pic_urlLeftLike) {
    this.primary_pic_urlLeftLike = primary_pic_urlLeftLike;
  }

  public java.lang.String getPrimary_pic_urlRightLike() {
    return primary_pic_urlRightLike;
  }

  public void setPrimary_pic_urlRightLike(java.lang.String primary_pic_urlRightLike) {
    this.primary_pic_urlRightLike = primary_pic_urlRightLike;
  }

  public java.lang.String getPrimary_pic_urlLike() {
    return primary_pic_urlLike;
  }

  public void setPrimary_pic_urlLike(java.lang.String primary_pic_urlLike) {
    this.primary_pic_urlLike = primary_pic_urlLike;
  }

  public java.lang.String getPrimary_pic_urlNotEquals() {
    return primary_pic_urlNotEquals;
  }

  public void setPrimary_pic_urlNotEquals(java.lang.String primary_pic_urlNotEquals) {
    this.primary_pic_urlNotEquals = primary_pic_urlNotEquals;
  }

  public java.lang.String[] getPrimary_pic_urlIns() {
    return primary_pic_urlIns;
  }

  public void setPrimary_pic_urlIns(java.lang.String[] primary_pic_urlIns) {
    this.primary_pic_urlIns = primary_pic_urlIns;
  }

  public java.lang.String[] getPrimary_pic_urlNotIns() {
    return primary_pic_urlNotIns;
  }

  public void setPrimary_pic_urlNotIns(java.lang.String[] primary_pic_urlNotIns) {
    this.primary_pic_urlNotIns = primary_pic_urlNotIns;
  }

  public java.lang.String getList_pic_urlLeftLike() {
    return list_pic_urlLeftLike;
  }

  public void setList_pic_urlLeftLike(java.lang.String list_pic_urlLeftLike) {
    this.list_pic_urlLeftLike = list_pic_urlLeftLike;
  }

  public java.lang.String getList_pic_urlRightLike() {
    return list_pic_urlRightLike;
  }

  public void setList_pic_urlRightLike(java.lang.String list_pic_urlRightLike) {
    this.list_pic_urlRightLike = list_pic_urlRightLike;
  }

  public java.lang.String getList_pic_urlLike() {
    return list_pic_urlLike;
  }

  public void setList_pic_urlLike(java.lang.String list_pic_urlLike) {
    this.list_pic_urlLike = list_pic_urlLike;
  }

  public java.lang.String getList_pic_urlNotEquals() {
    return list_pic_urlNotEquals;
  }

  public void setList_pic_urlNotEquals(java.lang.String list_pic_urlNotEquals) {
    this.list_pic_urlNotEquals = list_pic_urlNotEquals;
  }

  public java.lang.String[] getList_pic_urlIns() {
    return list_pic_urlIns;
  }

  public void setList_pic_urlIns(java.lang.String[] list_pic_urlIns) {
    this.list_pic_urlIns = list_pic_urlIns;
  }

  public java.lang.String[] getList_pic_urlNotIns() {
    return list_pic_urlNotIns;
  }

  public void setList_pic_urlNotIns(java.lang.String[] list_pic_urlNotIns) {
    this.list_pic_urlNotIns = list_pic_urlNotIns;
  }

  public java.lang.Double getRetail_priceGreaterThan() {
    return retail_priceGreaterThan;
  }

  public void setretail_priceGreaterThan(java.lang.Double retail_priceGreaterThan) {
    this.retail_priceGreaterThan = retail_priceGreaterThan;
  }

  public java.lang.Double getRetail_priceGreaterEqual() {
    return retail_priceGreaterEqual;
  }

  public void setRetail_priceGreaterEqual(java.lang.Double retail_priceGreaterEqual) {
    this.retail_priceGreaterEqual = retail_priceGreaterEqual;
  }

  public java.lang.Double getRetail_priceLessEqual() {
    return retail_priceLessEqual;
  }

  public void setRetail_priceLessEqual(java.lang.Double retail_priceLessEqual) {
    this.retail_priceLessEqual = retail_priceLessEqual;
  }

  public java.lang.Double getRetail_priceLessThan() {
    return retail_priceLessThan;
  }

  public void setRetail_priceLessThan(java.lang.Double retail_priceLessThan) {
    this.retail_priceLessThan = retail_priceLessThan;
  }

  public java.lang.Double getRetail_priceNotEquals() {
    return retail_priceNotEquals;
  }

  public void setRetail_priceNotEquals(java.lang.Double retail_priceNotEquals) {
    this.retail_priceNotEquals = retail_priceNotEquals;
  }

  public java.lang.Double[] getRetail_priceIns() {
    return retail_priceIns;
  }

  public void setRetail_priceIns(java.lang.Double[] retail_priceIns) {
    this.retail_priceIns = retail_priceIns;
  }

  public java.lang.Double[] getRetail_priceNotIns() {
    return retail_priceNotIns;
  }

  public void setRetail_priceNotIns(java.lang.Double[] retail_priceNotIns) {
    this.retail_priceNotIns = retail_priceNotIns;
  }

  public java.lang.Integer getSell_volumeGreaterThan() {
    return sell_volumeGreaterThan;
  }

  public void setsell_volumeGreaterThan(java.lang.Integer sell_volumeGreaterThan) {
    this.sell_volumeGreaterThan = sell_volumeGreaterThan;
  }

  public java.lang.Integer getSell_volumeGreaterEqual() {
    return sell_volumeGreaterEqual;
  }

  public void setSell_volumeGreaterEqual(java.lang.Integer sell_volumeGreaterEqual) {
    this.sell_volumeGreaterEqual = sell_volumeGreaterEqual;
  }

  public java.lang.Integer getSell_volumeLessEqual() {
    return sell_volumeLessEqual;
  }

  public void setSell_volumeLessEqual(java.lang.Integer sell_volumeLessEqual) {
    this.sell_volumeLessEqual = sell_volumeLessEqual;
  }

  public java.lang.Integer getSell_volumeLessThan() {
    return sell_volumeLessThan;
  }

  public void setSell_volumeLessThan(java.lang.Integer sell_volumeLessThan) {
    this.sell_volumeLessThan = sell_volumeLessThan;
  }

  public java.lang.Integer getSell_volumeNotEquals() {
    return sell_volumeNotEquals;
  }

  public void setSell_volumeNotEquals(java.lang.Integer sell_volumeNotEquals) {
    this.sell_volumeNotEquals = sell_volumeNotEquals;
  }

  public java.lang.Integer[] getSell_volumeIns() {
    return sell_volumeIns;
  }

  public void setSell_volumeIns(java.lang.Integer[] sell_volumeIns) {
    this.sell_volumeIns = sell_volumeIns;
  }

  public java.lang.Integer[] getSell_volumeNotIns() {
    return sell_volumeNotIns;
  }

  public void setSell_volumeNotIns(java.lang.Integer[] sell_volumeNotIns) {
    this.sell_volumeNotIns = sell_volumeNotIns;
  }

  public java.lang.Integer getPrimary_product_idGreaterThan() {
    return primary_product_idGreaterThan;
  }

  public void setprimary_product_idGreaterThan(java.lang.Integer primary_product_idGreaterThan) {
    this.primary_product_idGreaterThan = primary_product_idGreaterThan;
  }

  public java.lang.Integer getPrimary_product_idGreaterEqual() {
    return primary_product_idGreaterEqual;
  }

  public void setPrimary_product_idGreaterEqual(java.lang.Integer primary_product_idGreaterEqual) {
    this.primary_product_idGreaterEqual = primary_product_idGreaterEqual;
  }

  public java.lang.Integer getPrimary_product_idLessEqual() {
    return primary_product_idLessEqual;
  }

  public void setPrimary_product_idLessEqual(java.lang.Integer primary_product_idLessEqual) {
    this.primary_product_idLessEqual = primary_product_idLessEqual;
  }

  public java.lang.Integer getPrimary_product_idLessThan() {
    return primary_product_idLessThan;
  }

  public void setPrimary_product_idLessThan(java.lang.Integer primary_product_idLessThan) {
    this.primary_product_idLessThan = primary_product_idLessThan;
  }

  public java.lang.Integer getPrimary_product_idNotEquals() {
    return primary_product_idNotEquals;
  }

  public void setPrimary_product_idNotEquals(java.lang.Integer primary_product_idNotEquals) {
    this.primary_product_idNotEquals = primary_product_idNotEquals;
  }

  public java.lang.Integer[] getPrimary_product_idIns() {
    return primary_product_idIns;
  }

  public void setPrimary_product_idIns(java.lang.Integer[] primary_product_idIns) {
    this.primary_product_idIns = primary_product_idIns;
  }

  public java.lang.Integer[] getPrimary_product_idNotIns() {
    return primary_product_idNotIns;
  }

  public void setPrimary_product_idNotIns(java.lang.Integer[] primary_product_idNotIns) {
    this.primary_product_idNotIns = primary_product_idNotIns;
  }

  public java.lang.Double getUnit_priceGreaterThan() {
    return unit_priceGreaterThan;
  }

  public void setunit_priceGreaterThan(java.lang.Double unit_priceGreaterThan) {
    this.unit_priceGreaterThan = unit_priceGreaterThan;
  }

  public java.lang.Double getUnit_priceGreaterEqual() {
    return unit_priceGreaterEqual;
  }

  public void setUnit_priceGreaterEqual(java.lang.Double unit_priceGreaterEqual) {
    this.unit_priceGreaterEqual = unit_priceGreaterEqual;
  }

  public java.lang.Double getUnit_priceLessEqual() {
    return unit_priceLessEqual;
  }

  public void setUnit_priceLessEqual(java.lang.Double unit_priceLessEqual) {
    this.unit_priceLessEqual = unit_priceLessEqual;
  }

  public java.lang.Double getUnit_priceLessThan() {
    return unit_priceLessThan;
  }

  public void setUnit_priceLessThan(java.lang.Double unit_priceLessThan) {
    this.unit_priceLessThan = unit_priceLessThan;
  }

  public java.lang.Double getUnit_priceNotEquals() {
    return unit_priceNotEquals;
  }

  public void setUnit_priceNotEquals(java.lang.Double unit_priceNotEquals) {
    this.unit_priceNotEquals = unit_priceNotEquals;
  }

  public java.lang.Double[] getUnit_priceIns() {
    return unit_priceIns;
  }

  public void setUnit_priceIns(java.lang.Double[] unit_priceIns) {
    this.unit_priceIns = unit_priceIns;
  }

  public java.lang.Double[] getUnit_priceNotIns() {
    return unit_priceNotIns;
  }

  public void setUnit_priceNotIns(java.lang.Double[] unit_priceNotIns) {
    this.unit_priceNotIns = unit_priceNotIns;
  }

  public java.lang.String getPromotion_descLeftLike() {
    return promotion_descLeftLike;
  }

  public void setPromotion_descLeftLike(java.lang.String promotion_descLeftLike) {
    this.promotion_descLeftLike = promotion_descLeftLike;
  }

  public java.lang.String getPromotion_descRightLike() {
    return promotion_descRightLike;
  }

  public void setPromotion_descRightLike(java.lang.String promotion_descRightLike) {
    this.promotion_descRightLike = promotion_descRightLike;
  }

  public java.lang.String getPromotion_descLike() {
    return promotion_descLike;
  }

  public void setPromotion_descLike(java.lang.String promotion_descLike) {
    this.promotion_descLike = promotion_descLike;
  }

  public java.lang.String getPromotion_descNotEquals() {
    return promotion_descNotEquals;
  }

  public void setPromotion_descNotEquals(java.lang.String promotion_descNotEquals) {
    this.promotion_descNotEquals = promotion_descNotEquals;
  }

  public java.lang.String[] getPromotion_descIns() {
    return promotion_descIns;
  }

  public void setPromotion_descIns(java.lang.String[] promotion_descIns) {
    this.promotion_descIns = promotion_descIns;
  }

  public java.lang.String[] getPromotion_descNotIns() {
    return promotion_descNotIns;
  }

  public void setPromotion_descNotIns(java.lang.String[] promotion_descNotIns) {
    this.promotion_descNotIns = promotion_descNotIns;
  }

  public java.lang.String getPromotion_tagLeftLike() {
    return promotion_tagLeftLike;
  }

  public void setPromotion_tagLeftLike(java.lang.String promotion_tagLeftLike) {
    this.promotion_tagLeftLike = promotion_tagLeftLike;
  }

  public java.lang.String getPromotion_tagRightLike() {
    return promotion_tagRightLike;
  }

  public void setPromotion_tagRightLike(java.lang.String promotion_tagRightLike) {
    this.promotion_tagRightLike = promotion_tagRightLike;
  }

  public java.lang.String getPromotion_tagLike() {
    return promotion_tagLike;
  }

  public void setPromotion_tagLike(java.lang.String promotion_tagLike) {
    this.promotion_tagLike = promotion_tagLike;
  }

  public java.lang.String getPromotion_tagNotEquals() {
    return promotion_tagNotEquals;
  }

  public void setPromotion_tagNotEquals(java.lang.String promotion_tagNotEquals) {
    this.promotion_tagNotEquals = promotion_tagNotEquals;
  }

  public java.lang.String[] getPromotion_tagIns() {
    return promotion_tagIns;
  }

  public void setPromotion_tagIns(java.lang.String[] promotion_tagIns) {
    this.promotion_tagIns = promotion_tagIns;
  }

  public java.lang.String[] getPromotion_tagNotIns() {
    return promotion_tagNotIns;
  }

  public void setPromotion_tagNotIns(java.lang.String[] promotion_tagNotIns) {
    this.promotion_tagNotIns = promotion_tagNotIns;
  }

  public java.lang.Double getApp_exclusive_priceGreaterThan() {
    return app_exclusive_priceGreaterThan;
  }

  public void setapp_exclusive_priceGreaterThan(java.lang.Double app_exclusive_priceGreaterThan) {
    this.app_exclusive_priceGreaterThan = app_exclusive_priceGreaterThan;
  }

  public java.lang.Double getApp_exclusive_priceGreaterEqual() {
    return app_exclusive_priceGreaterEqual;
  }

  public void setApp_exclusive_priceGreaterEqual(java.lang.Double app_exclusive_priceGreaterEqual) {
    this.app_exclusive_priceGreaterEqual = app_exclusive_priceGreaterEqual;
  }

  public java.lang.Double getApp_exclusive_priceLessEqual() {
    return app_exclusive_priceLessEqual;
  }

  public void setApp_exclusive_priceLessEqual(java.lang.Double app_exclusive_priceLessEqual) {
    this.app_exclusive_priceLessEqual = app_exclusive_priceLessEqual;
  }

  public java.lang.Double getApp_exclusive_priceLessThan() {
    return app_exclusive_priceLessThan;
  }

  public void setApp_exclusive_priceLessThan(java.lang.Double app_exclusive_priceLessThan) {
    this.app_exclusive_priceLessThan = app_exclusive_priceLessThan;
  }

  public java.lang.Double getApp_exclusive_priceNotEquals() {
    return app_exclusive_priceNotEquals;
  }

  public void setApp_exclusive_priceNotEquals(java.lang.Double app_exclusive_priceNotEquals) {
    this.app_exclusive_priceNotEquals = app_exclusive_priceNotEquals;
  }

  public java.lang.Double[] getApp_exclusive_priceIns() {
    return app_exclusive_priceIns;
  }

  public void setApp_exclusive_priceIns(java.lang.Double[] app_exclusive_priceIns) {
    this.app_exclusive_priceIns = app_exclusive_priceIns;
  }

  public java.lang.Double[] getApp_exclusive_priceNotIns() {
    return app_exclusive_priceNotIns;
  }

  public void setApp_exclusive_priceNotIns(java.lang.Double[] app_exclusive_priceNotIns) {
    this.app_exclusive_priceNotIns = app_exclusive_priceNotIns;
  }

  public java.lang.Integer getIs_app_exclusiveGreaterThan() {
    return is_app_exclusiveGreaterThan;
  }

  public void setis_app_exclusiveGreaterThan(java.lang.Integer is_app_exclusiveGreaterThan) {
    this.is_app_exclusiveGreaterThan = is_app_exclusiveGreaterThan;
  }

  public java.lang.Integer getIs_app_exclusiveGreaterEqual() {
    return is_app_exclusiveGreaterEqual;
  }

  public void setIs_app_exclusiveGreaterEqual(java.lang.Integer is_app_exclusiveGreaterEqual) {
    this.is_app_exclusiveGreaterEqual = is_app_exclusiveGreaterEqual;
  }

  public java.lang.Integer getIs_app_exclusiveLessEqual() {
    return is_app_exclusiveLessEqual;
  }

  public void setIs_app_exclusiveLessEqual(java.lang.Integer is_app_exclusiveLessEqual) {
    this.is_app_exclusiveLessEqual = is_app_exclusiveLessEqual;
  }

  public java.lang.Integer getIs_app_exclusiveLessThan() {
    return is_app_exclusiveLessThan;
  }

  public void setIs_app_exclusiveLessThan(java.lang.Integer is_app_exclusiveLessThan) {
    this.is_app_exclusiveLessThan = is_app_exclusiveLessThan;
  }

  public java.lang.Integer getIs_app_exclusiveNotEquals() {
    return is_app_exclusiveNotEquals;
  }

  public void setIs_app_exclusiveNotEquals(java.lang.Integer is_app_exclusiveNotEquals) {
    this.is_app_exclusiveNotEquals = is_app_exclusiveNotEquals;
  }

  public java.lang.Integer[] getIs_app_exclusiveIns() {
    return is_app_exclusiveIns;
  }

  public void setIs_app_exclusiveIns(java.lang.Integer[] is_app_exclusiveIns) {
    this.is_app_exclusiveIns = is_app_exclusiveIns;
  }

  public java.lang.Integer[] getIs_app_exclusiveNotIns() {
    return is_app_exclusiveNotIns;
  }

  public void setIs_app_exclusiveNotIns(java.lang.Integer[] is_app_exclusiveNotIns) {
    this.is_app_exclusiveNotIns = is_app_exclusiveNotIns;
  }

  public java.lang.Integer getIs_limitedGreaterThan() {
    return is_limitedGreaterThan;
  }

  public void setis_limitedGreaterThan(java.lang.Integer is_limitedGreaterThan) {
    this.is_limitedGreaterThan = is_limitedGreaterThan;
  }

  public java.lang.Integer getIs_limitedGreaterEqual() {
    return is_limitedGreaterEqual;
  }

  public void setIs_limitedGreaterEqual(java.lang.Integer is_limitedGreaterEqual) {
    this.is_limitedGreaterEqual = is_limitedGreaterEqual;
  }

  public java.lang.Integer getIs_limitedLessEqual() {
    return is_limitedLessEqual;
  }

  public void setIs_limitedLessEqual(java.lang.Integer is_limitedLessEqual) {
    this.is_limitedLessEqual = is_limitedLessEqual;
  }

  public java.lang.Integer getIs_limitedLessThan() {
    return is_limitedLessThan;
  }

  public void setIs_limitedLessThan(java.lang.Integer is_limitedLessThan) {
    this.is_limitedLessThan = is_limitedLessThan;
  }

  public java.lang.Integer getIs_limitedNotEquals() {
    return is_limitedNotEquals;
  }

  public void setIs_limitedNotEquals(java.lang.Integer is_limitedNotEquals) {
    this.is_limitedNotEquals = is_limitedNotEquals;
  }

  public java.lang.Integer[] getIs_limitedIns() {
    return is_limitedIns;
  }

  public void setIs_limitedIns(java.lang.Integer[] is_limitedIns) {
    this.is_limitedIns = is_limitedIns;
  }

  public java.lang.Integer[] getIs_limitedNotIns() {
    return is_limitedNotIns;
  }

  public void setIs_limitedNotIns(java.lang.Integer[] is_limitedNotIns) {
    this.is_limitedNotIns = is_limitedNotIns;
  }

  public java.lang.Integer getIs_hotGreaterThan() {
    return is_hotGreaterThan;
  }

  public void setis_hotGreaterThan(java.lang.Integer is_hotGreaterThan) {
    this.is_hotGreaterThan = is_hotGreaterThan;
  }

  public java.lang.Integer getIs_hotGreaterEqual() {
    return is_hotGreaterEqual;
  }

  public void setIs_hotGreaterEqual(java.lang.Integer is_hotGreaterEqual) {
    this.is_hotGreaterEqual = is_hotGreaterEqual;
  }

  public java.lang.Integer getIs_hotLessEqual() {
    return is_hotLessEqual;
  }

  public void setIs_hotLessEqual(java.lang.Integer is_hotLessEqual) {
    this.is_hotLessEqual = is_hotLessEqual;
  }

  public java.lang.Integer getIs_hotLessThan() {
    return is_hotLessThan;
  }

  public void setIs_hotLessThan(java.lang.Integer is_hotLessThan) {
    this.is_hotLessThan = is_hotLessThan;
  }

  public java.lang.Integer getIs_hotNotEquals() {
    return is_hotNotEquals;
  }

  public void setIs_hotNotEquals(java.lang.Integer is_hotNotEquals) {
    this.is_hotNotEquals = is_hotNotEquals;
  }

  public java.lang.Integer[] getIs_hotIns() {
    return is_hotIns;
  }

  public void setIs_hotIns(java.lang.Integer[] is_hotIns) {
    this.is_hotIns = is_hotIns;
  }

  public java.lang.Integer[] getIs_hotNotIns() {
    return is_hotNotIns;
  }

  public void setIs_hotNotIns(java.lang.Integer[] is_hotNotIns) {
    this.is_hotNotIns = is_hotNotIns;
  }

}
