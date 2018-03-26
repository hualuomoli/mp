package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Product;

// 
public class ProductQuery extends Product {

  /**  */
  private java.lang.Integer goods_idGreaterThan;
  private java.lang.Integer goods_idGreaterEqual;
  private java.lang.Integer goods_idLessEqual;
  private java.lang.Integer goods_idLessThan;
  private java.lang.Integer goods_idNotEquals;
  private java.lang.Integer[] goods_idIns;
  private java.lang.Integer[] goods_idNotIns;
  /**  */
  private java.lang.String goods_specification_idsLeftLike;
  private java.lang.String goods_specification_idsRightLike;
  private java.lang.String goods_specification_idsLike;
  private java.lang.String goods_specification_idsNotEquals;
  private java.lang.String[] goods_specification_idsIns;
  private java.lang.String[] goods_specification_idsNotIns;
  /**  */
  private java.lang.String goods_snLeftLike;
  private java.lang.String goods_snRightLike;
  private java.lang.String goods_snLike;
  private java.lang.String goods_snNotEquals;
  private java.lang.String[] goods_snIns;
  private java.lang.String[] goods_snNotIns;
  /**  */
  private java.lang.Integer goods_numberGreaterThan;
  private java.lang.Integer goods_numberGreaterEqual;
  private java.lang.Integer goods_numberLessEqual;
  private java.lang.Integer goods_numberLessThan;
  private java.lang.Integer goods_numberNotEquals;
  private java.lang.Integer[] goods_numberIns;
  private java.lang.Integer[] goods_numberNotIns;
  /**  */
  private java.lang.Double retail_priceGreaterThan;
  private java.lang.Double retail_priceGreaterEqual;
  private java.lang.Double retail_priceLessEqual;
  private java.lang.Double retail_priceLessThan;
  private java.lang.Double retail_priceNotEquals;
  private java.lang.Double[] retail_priceIns;
  private java.lang.Double[] retail_priceNotIns;

  public ProductQuery() {
  }

  // getter and setter

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

  public java.lang.String getGoods_specification_idsLeftLike() {
    return goods_specification_idsLeftLike;
  }

  public void setGoods_specification_idsLeftLike(java.lang.String goods_specification_idsLeftLike) {
    this.goods_specification_idsLeftLike = goods_specification_idsLeftLike;
  }

  public java.lang.String getGoods_specification_idsRightLike() {
    return goods_specification_idsRightLike;
  }

  public void setGoods_specification_idsRightLike(java.lang.String goods_specification_idsRightLike) {
    this.goods_specification_idsRightLike = goods_specification_idsRightLike;
  }

  public java.lang.String getGoods_specification_idsLike() {
    return goods_specification_idsLike;
  }

  public void setGoods_specification_idsLike(java.lang.String goods_specification_idsLike) {
    this.goods_specification_idsLike = goods_specification_idsLike;
  }

  public java.lang.String getGoods_specification_idsNotEquals() {
    return goods_specification_idsNotEquals;
  }

  public void setGoods_specification_idsNotEquals(java.lang.String goods_specification_idsNotEquals) {
    this.goods_specification_idsNotEquals = goods_specification_idsNotEquals;
  }

  public java.lang.String[] getGoods_specification_idsIns() {
    return goods_specification_idsIns;
  }

  public void setGoods_specification_idsIns(java.lang.String[] goods_specification_idsIns) {
    this.goods_specification_idsIns = goods_specification_idsIns;
  }

  public java.lang.String[] getGoods_specification_idsNotIns() {
    return goods_specification_idsNotIns;
  }

  public void setGoods_specification_idsNotIns(java.lang.String[] goods_specification_idsNotIns) {
    this.goods_specification_idsNotIns = goods_specification_idsNotIns;
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

}
