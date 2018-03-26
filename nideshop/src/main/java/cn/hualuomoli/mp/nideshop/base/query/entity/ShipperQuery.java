package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Shipper;

// 快递公司
public class ShipperQuery extends Shipper {

  /** 快递公司名称 */
  private java.lang.String nameLeftLike;
  private java.lang.String nameRightLike;
  private java.lang.String nameLike;
  private java.lang.String nameNotEquals;
  private java.lang.String[] nameIns;
  private java.lang.String[] nameNotIns;
  /** 快递公司代码 */
  private java.lang.String codeLeftLike;
  private java.lang.String codeRightLike;
  private java.lang.String codeLike;
  private java.lang.String codeNotEquals;
  private java.lang.String[] codeIns;
  private java.lang.String[] codeNotIns;
  /** 排序 */
  private java.lang.Integer sort_orderGreaterThan;
  private java.lang.Integer sort_orderGreaterEqual;
  private java.lang.Integer sort_orderLessEqual;
  private java.lang.Integer sort_orderLessThan;
  private java.lang.Integer sort_orderNotEquals;
  private java.lang.Integer[] sort_orderIns;
  private java.lang.Integer[] sort_orderNotIns;

  public ShipperQuery() {
  }

  // getter and setter

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

  public java.lang.String getCodeLeftLike() {
    return codeLeftLike;
  }

  public void setCodeLeftLike(java.lang.String codeLeftLike) {
    this.codeLeftLike = codeLeftLike;
  }

  public java.lang.String getCodeRightLike() {
    return codeRightLike;
  }

  public void setCodeRightLike(java.lang.String codeRightLike) {
    this.codeRightLike = codeRightLike;
  }

  public java.lang.String getCodeLike() {
    return codeLike;
  }

  public void setCodeLike(java.lang.String codeLike) {
    this.codeLike = codeLike;
  }

  public java.lang.String getCodeNotEquals() {
    return codeNotEquals;
  }

  public void setCodeNotEquals(java.lang.String codeNotEquals) {
    this.codeNotEquals = codeNotEquals;
  }

  public java.lang.String[] getCodeIns() {
    return codeIns;
  }

  public void setCodeIns(java.lang.String[] codeIns) {
    this.codeIns = codeIns;
  }

  public java.lang.String[] getCodeNotIns() {
    return codeNotIns;
  }

  public void setCodeNotIns(java.lang.String[] codeNotIns) {
    this.codeNotIns = codeNotIns;
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

}
