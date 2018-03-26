package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.GoodsAttribute;

// 
public class GoodsAttributeQuery extends GoodsAttribute {

  /**  */
  private java.lang.Integer goods_idGreaterThan;
  private java.lang.Integer goods_idGreaterEqual;
  private java.lang.Integer goods_idLessEqual;
  private java.lang.Integer goods_idLessThan;
  private java.lang.Integer goods_idNotEquals;
  private java.lang.Integer[] goods_idIns;
  private java.lang.Integer[] goods_idNotIns;
  /**  */
  private java.lang.Integer attribute_idGreaterThan;
  private java.lang.Integer attribute_idGreaterEqual;
  private java.lang.Integer attribute_idLessEqual;
  private java.lang.Integer attribute_idLessThan;
  private java.lang.Integer attribute_idNotEquals;
  private java.lang.Integer[] attribute_idIns;
  private java.lang.Integer[] attribute_idNotIns;
  /**  */
  private java.lang.String valueLeftLike;
  private java.lang.String valueRightLike;
  private java.lang.String valueLike;
  private java.lang.String valueNotEquals;
  private java.lang.String[] valueIns;
  private java.lang.String[] valueNotIns;

  public GoodsAttributeQuery() {
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

  public java.lang.Integer getAttribute_idGreaterThan() {
    return attribute_idGreaterThan;
  }

  public void setattribute_idGreaterThan(java.lang.Integer attribute_idGreaterThan) {
    this.attribute_idGreaterThan = attribute_idGreaterThan;
  }

  public java.lang.Integer getAttribute_idGreaterEqual() {
    return attribute_idGreaterEqual;
  }

  public void setAttribute_idGreaterEqual(java.lang.Integer attribute_idGreaterEqual) {
    this.attribute_idGreaterEqual = attribute_idGreaterEqual;
  }

  public java.lang.Integer getAttribute_idLessEqual() {
    return attribute_idLessEqual;
  }

  public void setAttribute_idLessEqual(java.lang.Integer attribute_idLessEqual) {
    this.attribute_idLessEqual = attribute_idLessEqual;
  }

  public java.lang.Integer getAttribute_idLessThan() {
    return attribute_idLessThan;
  }

  public void setAttribute_idLessThan(java.lang.Integer attribute_idLessThan) {
    this.attribute_idLessThan = attribute_idLessThan;
  }

  public java.lang.Integer getAttribute_idNotEquals() {
    return attribute_idNotEquals;
  }

  public void setAttribute_idNotEquals(java.lang.Integer attribute_idNotEquals) {
    this.attribute_idNotEquals = attribute_idNotEquals;
  }

  public java.lang.Integer[] getAttribute_idIns() {
    return attribute_idIns;
  }

  public void setAttribute_idIns(java.lang.Integer[] attribute_idIns) {
    this.attribute_idIns = attribute_idIns;
  }

  public java.lang.Integer[] getAttribute_idNotIns() {
    return attribute_idNotIns;
  }

  public void setAttribute_idNotIns(java.lang.Integer[] attribute_idNotIns) {
    this.attribute_idNotIns = attribute_idNotIns;
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

}
