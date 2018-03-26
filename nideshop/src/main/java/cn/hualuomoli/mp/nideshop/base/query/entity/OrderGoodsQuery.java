package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.OrderGoods;

// 
public class OrderGoodsQuery extends OrderGoods {

  /**  */
  private java.lang.Integer order_idGreaterThan;
  private java.lang.Integer order_idGreaterEqual;
  private java.lang.Integer order_idLessEqual;
  private java.lang.Integer order_idLessThan;
  private java.lang.Integer order_idNotEquals;
  private java.lang.Integer[] order_idIns;
  private java.lang.Integer[] order_idNotIns;
  /**  */
  private java.lang.Integer goods_idGreaterThan;
  private java.lang.Integer goods_idGreaterEqual;
  private java.lang.Integer goods_idLessEqual;
  private java.lang.Integer goods_idLessThan;
  private java.lang.Integer goods_idNotEquals;
  private java.lang.Integer[] goods_idIns;
  private java.lang.Integer[] goods_idNotIns;
  /**  */
  private java.lang.String goods_nameLeftLike;
  private java.lang.String goods_nameRightLike;
  private java.lang.String goods_nameLike;
  private java.lang.String goods_nameNotEquals;
  private java.lang.String[] goods_nameIns;
  private java.lang.String[] goods_nameNotIns;
  /**  */
  private java.lang.String goods_snLeftLike;
  private java.lang.String goods_snRightLike;
  private java.lang.String goods_snLike;
  private java.lang.String goods_snNotEquals;
  private java.lang.String[] goods_snIns;
  private java.lang.String[] goods_snNotIns;
  /**  */
  private java.lang.Integer product_idGreaterThan;
  private java.lang.Integer product_idGreaterEqual;
  private java.lang.Integer product_idLessEqual;
  private java.lang.Integer product_idLessThan;
  private java.lang.Integer product_idNotEquals;
  private java.lang.Integer[] product_idIns;
  private java.lang.Integer[] product_idNotIns;
  /**  */
  private java.lang.Integer numberGreaterThan;
  private java.lang.Integer numberGreaterEqual;
  private java.lang.Integer numberLessEqual;
  private java.lang.Integer numberLessThan;
  private java.lang.Integer numberNotEquals;
  private java.lang.Integer[] numberIns;
  private java.lang.Integer[] numberNotIns;
  /**  */
  private java.lang.Double market_priceGreaterThan;
  private java.lang.Double market_priceGreaterEqual;
  private java.lang.Double market_priceLessEqual;
  private java.lang.Double market_priceLessThan;
  private java.lang.Double market_priceNotEquals;
  private java.lang.Double[] market_priceIns;
  private java.lang.Double[] market_priceNotIns;
  /**  */
  private java.lang.Double retail_priceGreaterThan;
  private java.lang.Double retail_priceGreaterEqual;
  private java.lang.Double retail_priceLessEqual;
  private java.lang.Double retail_priceLessThan;
  private java.lang.Double retail_priceNotEquals;
  private java.lang.Double[] retail_priceIns;
  private java.lang.Double[] retail_priceNotIns;
  /**  */
  private java.lang.String goods_specifition_name_valueLeftLike;
  private java.lang.String goods_specifition_name_valueRightLike;
  private java.lang.String goods_specifition_name_valueLike;
  private java.lang.String goods_specifition_name_valueNotEquals;
  private java.lang.String[] goods_specifition_name_valueIns;
  private java.lang.String[] goods_specifition_name_valueNotIns;
  /**  */
  private java.lang.Integer is_realGreaterThan;
  private java.lang.Integer is_realGreaterEqual;
  private java.lang.Integer is_realLessEqual;
  private java.lang.Integer is_realLessThan;
  private java.lang.Integer is_realNotEquals;
  private java.lang.Integer[] is_realIns;
  private java.lang.Integer[] is_realNotIns;
  /**  */
  private java.lang.String goods_specifition_idsLeftLike;
  private java.lang.String goods_specifition_idsRightLike;
  private java.lang.String goods_specifition_idsLike;
  private java.lang.String goods_specifition_idsNotEquals;
  private java.lang.String[] goods_specifition_idsIns;
  private java.lang.String[] goods_specifition_idsNotIns;
  /**  */
  private java.lang.String list_pic_urlLeftLike;
  private java.lang.String list_pic_urlRightLike;
  private java.lang.String list_pic_urlLike;
  private java.lang.String list_pic_urlNotEquals;
  private java.lang.String[] list_pic_urlIns;
  private java.lang.String[] list_pic_urlNotIns;

  public OrderGoodsQuery() {
  }

  // getter and setter

  public java.lang.Integer getOrder_idGreaterThan() {
    return order_idGreaterThan;
  }

  public void setorder_idGreaterThan(java.lang.Integer order_idGreaterThan) {
    this.order_idGreaterThan = order_idGreaterThan;
  }

  public java.lang.Integer getOrder_idGreaterEqual() {
    return order_idGreaterEqual;
  }

  public void setOrder_idGreaterEqual(java.lang.Integer order_idGreaterEqual) {
    this.order_idGreaterEqual = order_idGreaterEqual;
  }

  public java.lang.Integer getOrder_idLessEqual() {
    return order_idLessEqual;
  }

  public void setOrder_idLessEqual(java.lang.Integer order_idLessEqual) {
    this.order_idLessEqual = order_idLessEqual;
  }

  public java.lang.Integer getOrder_idLessThan() {
    return order_idLessThan;
  }

  public void setOrder_idLessThan(java.lang.Integer order_idLessThan) {
    this.order_idLessThan = order_idLessThan;
  }

  public java.lang.Integer getOrder_idNotEquals() {
    return order_idNotEquals;
  }

  public void setOrder_idNotEquals(java.lang.Integer order_idNotEquals) {
    this.order_idNotEquals = order_idNotEquals;
  }

  public java.lang.Integer[] getOrder_idIns() {
    return order_idIns;
  }

  public void setOrder_idIns(java.lang.Integer[] order_idIns) {
    this.order_idIns = order_idIns;
  }

  public java.lang.Integer[] getOrder_idNotIns() {
    return order_idNotIns;
  }

  public void setOrder_idNotIns(java.lang.Integer[] order_idNotIns) {
    this.order_idNotIns = order_idNotIns;
  }

  public java.lang.Integer getGoods_idGreaterThan() {
    return goods_idGreaterThan;
  }

  public void setgoods_idGreaterThan(java.lang.Integer goods_idGreaterThan) {
    this.goods_idGreaterThan = goods_idGreaterThan;
  }

  public java.lang.Integer getGoods_idGreaterEqual() {
    return goods_idGreaterEqual;
  }

  public void setGoods_idGreaterEqual(java.lang.Integer goods_idGreaterEqual) {
    this.goods_idGreaterEqual = goods_idGreaterEqual;
  }

  public java.lang.Integer getGoods_idLessEqual() {
    return goods_idLessEqual;
  }

  public void setGoods_idLessEqual(java.lang.Integer goods_idLessEqual) {
    this.goods_idLessEqual = goods_idLessEqual;
  }

  public java.lang.Integer getGoods_idLessThan() {
    return goods_idLessThan;
  }

  public void setGoods_idLessThan(java.lang.Integer goods_idLessThan) {
    this.goods_idLessThan = goods_idLessThan;
  }

  public java.lang.Integer getGoods_idNotEquals() {
    return goods_idNotEquals;
  }

  public void setGoods_idNotEquals(java.lang.Integer goods_idNotEquals) {
    this.goods_idNotEquals = goods_idNotEquals;
  }

  public java.lang.Integer[] getGoods_idIns() {
    return goods_idIns;
  }

  public void setGoods_idIns(java.lang.Integer[] goods_idIns) {
    this.goods_idIns = goods_idIns;
  }

  public java.lang.Integer[] getGoods_idNotIns() {
    return goods_idNotIns;
  }

  public void setGoods_idNotIns(java.lang.Integer[] goods_idNotIns) {
    this.goods_idNotIns = goods_idNotIns;
  }

  public java.lang.String getGoods_nameLeftLike() {
    return goods_nameLeftLike;
  }

  public void setGoods_nameLeftLike(java.lang.String goods_nameLeftLike) {
    this.goods_nameLeftLike = goods_nameLeftLike;
  }

  public java.lang.String getGoods_nameRightLike() {
    return goods_nameRightLike;
  }

  public void setGoods_nameRightLike(java.lang.String goods_nameRightLike) {
    this.goods_nameRightLike = goods_nameRightLike;
  }

  public java.lang.String getGoods_nameLike() {
    return goods_nameLike;
  }

  public void setGoods_nameLike(java.lang.String goods_nameLike) {
    this.goods_nameLike = goods_nameLike;
  }

  public java.lang.String getGoods_nameNotEquals() {
    return goods_nameNotEquals;
  }

  public void setGoods_nameNotEquals(java.lang.String goods_nameNotEquals) {
    this.goods_nameNotEquals = goods_nameNotEquals;
  }

  public java.lang.String[] getGoods_nameIns() {
    return goods_nameIns;
  }

  public void setGoods_nameIns(java.lang.String[] goods_nameIns) {
    this.goods_nameIns = goods_nameIns;
  }

  public java.lang.String[] getGoods_nameNotIns() {
    return goods_nameNotIns;
  }

  public void setGoods_nameNotIns(java.lang.String[] goods_nameNotIns) {
    this.goods_nameNotIns = goods_nameNotIns;
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

  public java.lang.Integer getProduct_idGreaterThan() {
    return product_idGreaterThan;
  }

  public void setproduct_idGreaterThan(java.lang.Integer product_idGreaterThan) {
    this.product_idGreaterThan = product_idGreaterThan;
  }

  public java.lang.Integer getProduct_idGreaterEqual() {
    return product_idGreaterEqual;
  }

  public void setProduct_idGreaterEqual(java.lang.Integer product_idGreaterEqual) {
    this.product_idGreaterEqual = product_idGreaterEqual;
  }

  public java.lang.Integer getProduct_idLessEqual() {
    return product_idLessEqual;
  }

  public void setProduct_idLessEqual(java.lang.Integer product_idLessEqual) {
    this.product_idLessEqual = product_idLessEqual;
  }

  public java.lang.Integer getProduct_idLessThan() {
    return product_idLessThan;
  }

  public void setProduct_idLessThan(java.lang.Integer product_idLessThan) {
    this.product_idLessThan = product_idLessThan;
  }

  public java.lang.Integer getProduct_idNotEquals() {
    return product_idNotEquals;
  }

  public void setProduct_idNotEquals(java.lang.Integer product_idNotEquals) {
    this.product_idNotEquals = product_idNotEquals;
  }

  public java.lang.Integer[] getProduct_idIns() {
    return product_idIns;
  }

  public void setProduct_idIns(java.lang.Integer[] product_idIns) {
    this.product_idIns = product_idIns;
  }

  public java.lang.Integer[] getProduct_idNotIns() {
    return product_idNotIns;
  }

  public void setProduct_idNotIns(java.lang.Integer[] product_idNotIns) {
    this.product_idNotIns = product_idNotIns;
  }

  public java.lang.Integer getNumberGreaterThan() {
    return numberGreaterThan;
  }

  public void setnumberGreaterThan(java.lang.Integer numberGreaterThan) {
    this.numberGreaterThan = numberGreaterThan;
  }

  public java.lang.Integer getNumberGreaterEqual() {
    return numberGreaterEqual;
  }

  public void setNumberGreaterEqual(java.lang.Integer numberGreaterEqual) {
    this.numberGreaterEqual = numberGreaterEqual;
  }

  public java.lang.Integer getNumberLessEqual() {
    return numberLessEqual;
  }

  public void setNumberLessEqual(java.lang.Integer numberLessEqual) {
    this.numberLessEqual = numberLessEqual;
  }

  public java.lang.Integer getNumberLessThan() {
    return numberLessThan;
  }

  public void setNumberLessThan(java.lang.Integer numberLessThan) {
    this.numberLessThan = numberLessThan;
  }

  public java.lang.Integer getNumberNotEquals() {
    return numberNotEquals;
  }

  public void setNumberNotEquals(java.lang.Integer numberNotEquals) {
    this.numberNotEquals = numberNotEquals;
  }

  public java.lang.Integer[] getNumberIns() {
    return numberIns;
  }

  public void setNumberIns(java.lang.Integer[] numberIns) {
    this.numberIns = numberIns;
  }

  public java.lang.Integer[] getNumberNotIns() {
    return numberNotIns;
  }

  public void setNumberNotIns(java.lang.Integer[] numberNotIns) {
    this.numberNotIns = numberNotIns;
  }

  public java.lang.Double getMarket_priceGreaterThan() {
    return market_priceGreaterThan;
  }

  public void setmarket_priceGreaterThan(java.lang.Double market_priceGreaterThan) {
    this.market_priceGreaterThan = market_priceGreaterThan;
  }

  public java.lang.Double getMarket_priceGreaterEqual() {
    return market_priceGreaterEqual;
  }

  public void setMarket_priceGreaterEqual(java.lang.Double market_priceGreaterEqual) {
    this.market_priceGreaterEqual = market_priceGreaterEqual;
  }

  public java.lang.Double getMarket_priceLessEqual() {
    return market_priceLessEqual;
  }

  public void setMarket_priceLessEqual(java.lang.Double market_priceLessEqual) {
    this.market_priceLessEqual = market_priceLessEqual;
  }

  public java.lang.Double getMarket_priceLessThan() {
    return market_priceLessThan;
  }

  public void setMarket_priceLessThan(java.lang.Double market_priceLessThan) {
    this.market_priceLessThan = market_priceLessThan;
  }

  public java.lang.Double getMarket_priceNotEquals() {
    return market_priceNotEquals;
  }

  public void setMarket_priceNotEquals(java.lang.Double market_priceNotEquals) {
    this.market_priceNotEquals = market_priceNotEquals;
  }

  public java.lang.Double[] getMarket_priceIns() {
    return market_priceIns;
  }

  public void setMarket_priceIns(java.lang.Double[] market_priceIns) {
    this.market_priceIns = market_priceIns;
  }

  public java.lang.Double[] getMarket_priceNotIns() {
    return market_priceNotIns;
  }

  public void setMarket_priceNotIns(java.lang.Double[] market_priceNotIns) {
    this.market_priceNotIns = market_priceNotIns;
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

  public java.lang.String getGoods_specifition_name_valueLeftLike() {
    return goods_specifition_name_valueLeftLike;
  }

  public void setGoods_specifition_name_valueLeftLike(java.lang.String goods_specifition_name_valueLeftLike) {
    this.goods_specifition_name_valueLeftLike = goods_specifition_name_valueLeftLike;
  }

  public java.lang.String getGoods_specifition_name_valueRightLike() {
    return goods_specifition_name_valueRightLike;
  }

  public void setGoods_specifition_name_valueRightLike(java.lang.String goods_specifition_name_valueRightLike) {
    this.goods_specifition_name_valueRightLike = goods_specifition_name_valueRightLike;
  }

  public java.lang.String getGoods_specifition_name_valueLike() {
    return goods_specifition_name_valueLike;
  }

  public void setGoods_specifition_name_valueLike(java.lang.String goods_specifition_name_valueLike) {
    this.goods_specifition_name_valueLike = goods_specifition_name_valueLike;
  }

  public java.lang.String getGoods_specifition_name_valueNotEquals() {
    return goods_specifition_name_valueNotEquals;
  }

  public void setGoods_specifition_name_valueNotEquals(java.lang.String goods_specifition_name_valueNotEquals) {
    this.goods_specifition_name_valueNotEquals = goods_specifition_name_valueNotEquals;
  }

  public java.lang.String[] getGoods_specifition_name_valueIns() {
    return goods_specifition_name_valueIns;
  }

  public void setGoods_specifition_name_valueIns(java.lang.String[] goods_specifition_name_valueIns) {
    this.goods_specifition_name_valueIns = goods_specifition_name_valueIns;
  }

  public java.lang.String[] getGoods_specifition_name_valueNotIns() {
    return goods_specifition_name_valueNotIns;
  }

  public void setGoods_specifition_name_valueNotIns(java.lang.String[] goods_specifition_name_valueNotIns) {
    this.goods_specifition_name_valueNotIns = goods_specifition_name_valueNotIns;
  }

  public java.lang.Integer getIs_realGreaterThan() {
    return is_realGreaterThan;
  }

  public void setis_realGreaterThan(java.lang.Integer is_realGreaterThan) {
    this.is_realGreaterThan = is_realGreaterThan;
  }

  public java.lang.Integer getIs_realGreaterEqual() {
    return is_realGreaterEqual;
  }

  public void setIs_realGreaterEqual(java.lang.Integer is_realGreaterEqual) {
    this.is_realGreaterEqual = is_realGreaterEqual;
  }

  public java.lang.Integer getIs_realLessEqual() {
    return is_realLessEqual;
  }

  public void setIs_realLessEqual(java.lang.Integer is_realLessEqual) {
    this.is_realLessEqual = is_realLessEqual;
  }

  public java.lang.Integer getIs_realLessThan() {
    return is_realLessThan;
  }

  public void setIs_realLessThan(java.lang.Integer is_realLessThan) {
    this.is_realLessThan = is_realLessThan;
  }

  public java.lang.Integer getIs_realNotEquals() {
    return is_realNotEquals;
  }

  public void setIs_realNotEquals(java.lang.Integer is_realNotEquals) {
    this.is_realNotEquals = is_realNotEquals;
  }

  public java.lang.Integer[] getIs_realIns() {
    return is_realIns;
  }

  public void setIs_realIns(java.lang.Integer[] is_realIns) {
    this.is_realIns = is_realIns;
  }

  public java.lang.Integer[] getIs_realNotIns() {
    return is_realNotIns;
  }

  public void setIs_realNotIns(java.lang.Integer[] is_realNotIns) {
    this.is_realNotIns = is_realNotIns;
  }

  public java.lang.String getGoods_specifition_idsLeftLike() {
    return goods_specifition_idsLeftLike;
  }

  public void setGoods_specifition_idsLeftLike(java.lang.String goods_specifition_idsLeftLike) {
    this.goods_specifition_idsLeftLike = goods_specifition_idsLeftLike;
  }

  public java.lang.String getGoods_specifition_idsRightLike() {
    return goods_specifition_idsRightLike;
  }

  public void setGoods_specifition_idsRightLike(java.lang.String goods_specifition_idsRightLike) {
    this.goods_specifition_idsRightLike = goods_specifition_idsRightLike;
  }

  public java.lang.String getGoods_specifition_idsLike() {
    return goods_specifition_idsLike;
  }

  public void setGoods_specifition_idsLike(java.lang.String goods_specifition_idsLike) {
    this.goods_specifition_idsLike = goods_specifition_idsLike;
  }

  public java.lang.String getGoods_specifition_idsNotEquals() {
    return goods_specifition_idsNotEquals;
  }

  public void setGoods_specifition_idsNotEquals(java.lang.String goods_specifition_idsNotEquals) {
    this.goods_specifition_idsNotEquals = goods_specifition_idsNotEquals;
  }

  public java.lang.String[] getGoods_specifition_idsIns() {
    return goods_specifition_idsIns;
  }

  public void setGoods_specifition_idsIns(java.lang.String[] goods_specifition_idsIns) {
    this.goods_specifition_idsIns = goods_specifition_idsIns;
  }

  public java.lang.String[] getGoods_specifition_idsNotIns() {
    return goods_specifition_idsNotIns;
  }

  public void setGoods_specifition_idsNotIns(java.lang.String[] goods_specifition_idsNotIns) {
    this.goods_specifition_idsNotIns = goods_specifition_idsNotIns;
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

}
