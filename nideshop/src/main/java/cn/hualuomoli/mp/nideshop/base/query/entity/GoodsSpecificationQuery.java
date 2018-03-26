package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.GoodsSpecification;

// 商品对应规格表值表
public class GoodsSpecificationQuery extends GoodsSpecification {

  /**  */
  private java.lang.Integer goods_idGreaterThan;
  private java.lang.Integer goods_idGreaterEqual;
  private java.lang.Integer goods_idLessEqual;
  private java.lang.Integer goods_idLessThan;
  private java.lang.Integer goods_idNotEquals;
  private java.lang.Integer[] goods_idIns;
  private java.lang.Integer[] goods_idNotIns;
  /**  */
  private java.lang.Integer specification_idGreaterThan;
  private java.lang.Integer specification_idGreaterEqual;
  private java.lang.Integer specification_idLessEqual;
  private java.lang.Integer specification_idLessThan;
  private java.lang.Integer specification_idNotEquals;
  private java.lang.Integer[] specification_idIns;
  private java.lang.Integer[] specification_idNotIns;
  /**  */
  private java.lang.String valueLeftLike;
  private java.lang.String valueRightLike;
  private java.lang.String valueLike;
  private java.lang.String valueNotEquals;
  private java.lang.String[] valueIns;
  private java.lang.String[] valueNotIns;
  /**  */
  private java.lang.String pic_urlLeftLike;
  private java.lang.String pic_urlRightLike;
  private java.lang.String pic_urlLike;
  private java.lang.String pic_urlNotEquals;
  private java.lang.String[] pic_urlIns;
  private java.lang.String[] pic_urlNotIns;

  public GoodsSpecificationQuery() {
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

  public java.lang.Integer getSpecification_idGreaterThan() {
    return specification_idGreaterThan;
  }

  public void setspecification_idGreaterThan(java.lang.Integer specification_idGreaterThan) {
    this.specification_idGreaterThan = specification_idGreaterThan;
  }

  public java.lang.Integer getSpecification_idGreaterEqual() {
    return specification_idGreaterEqual;
  }

  public void setSpecification_idGreaterEqual(java.lang.Integer specification_idGreaterEqual) {
    this.specification_idGreaterEqual = specification_idGreaterEqual;
  }

  public java.lang.Integer getSpecification_idLessEqual() {
    return specification_idLessEqual;
  }

  public void setSpecification_idLessEqual(java.lang.Integer specification_idLessEqual) {
    this.specification_idLessEqual = specification_idLessEqual;
  }

  public java.lang.Integer getSpecification_idLessThan() {
    return specification_idLessThan;
  }

  public void setSpecification_idLessThan(java.lang.Integer specification_idLessThan) {
    this.specification_idLessThan = specification_idLessThan;
  }

  public java.lang.Integer getSpecification_idNotEquals() {
    return specification_idNotEquals;
  }

  public void setSpecification_idNotEquals(java.lang.Integer specification_idNotEquals) {
    this.specification_idNotEquals = specification_idNotEquals;
  }

  public java.lang.Integer[] getSpecification_idIns() {
    return specification_idIns;
  }

  public void setSpecification_idIns(java.lang.Integer[] specification_idIns) {
    this.specification_idIns = specification_idIns;
  }

  public java.lang.Integer[] getSpecification_idNotIns() {
    return specification_idNotIns;
  }

  public void setSpecification_idNotIns(java.lang.Integer[] specification_idNotIns) {
    this.specification_idNotIns = specification_idNotIns;
  }

  public java.lang.String getValueLeftLike() {
    return valueLeftLike;
  }

  public void setValueLeftLike(java.lang.String valueLeftLike) {
    this.valueLeftLike = valueLeftLike;
  }

  public java.lang.String getValueRightLike() {
    return valueRightLike;
  }

  public void setValueRightLike(java.lang.String valueRightLike) {
    this.valueRightLike = valueRightLike;
  }

  public java.lang.String getValueLike() {
    return valueLike;
  }

  public void setValueLike(java.lang.String valueLike) {
    this.valueLike = valueLike;
  }

  public java.lang.String getValueNotEquals() {
    return valueNotEquals;
  }

  public void setValueNotEquals(java.lang.String valueNotEquals) {
    this.valueNotEquals = valueNotEquals;
  }

  public java.lang.String[] getValueIns() {
    return valueIns;
  }

  public void setValueIns(java.lang.String[] valueIns) {
    this.valueIns = valueIns;
  }

  public java.lang.String[] getValueNotIns() {
    return valueNotIns;
  }

  public void setValueNotIns(java.lang.String[] valueNotIns) {
    this.valueNotIns = valueNotIns;
  }

  public java.lang.String getPic_urlLeftLike() {
    return pic_urlLeftLike;
  }

  public void setPic_urlLeftLike(java.lang.String pic_urlLeftLike) {
    this.pic_urlLeftLike = pic_urlLeftLike;
  }

  public java.lang.String getPic_urlRightLike() {
    return pic_urlRightLike;
  }

  public void setPic_urlRightLike(java.lang.String pic_urlRightLike) {
    this.pic_urlRightLike = pic_urlRightLike;
  }

  public java.lang.String getPic_urlLike() {
    return pic_urlLike;
  }

  public void setPic_urlLike(java.lang.String pic_urlLike) {
    this.pic_urlLike = pic_urlLike;
  }

  public java.lang.String getPic_urlNotEquals() {
    return pic_urlNotEquals;
  }

  public void setPic_urlNotEquals(java.lang.String pic_urlNotEquals) {
    this.pic_urlNotEquals = pic_urlNotEquals;
  }

  public java.lang.String[] getPic_urlIns() {
    return pic_urlIns;
  }

  public void setPic_urlIns(java.lang.String[] pic_urlIns) {
    this.pic_urlIns = pic_urlIns;
  }

  public java.lang.String[] getPic_urlNotIns() {
    return pic_urlNotIns;
  }

  public void setPic_urlNotIns(java.lang.String[] pic_urlNotIns) {
    this.pic_urlNotIns = pic_urlNotIns;
  }

}
