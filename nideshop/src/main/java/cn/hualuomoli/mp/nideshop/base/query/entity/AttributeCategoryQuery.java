package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.AttributeCategory;

// 
public class AttributeCategoryQuery extends AttributeCategory {

  /**  */
  private java.lang.String nameLeftLike;
  private java.lang.String nameRightLike;
  private java.lang.String nameLike;
  private java.lang.String nameNotEquals;
  private java.lang.String[] nameIns;
  private java.lang.String[] nameNotIns;
  /**  */
  private java.lang.Integer enabledGreaterThan;
  private java.lang.Integer enabledGreaterEqual;
  private java.lang.Integer enabledLessEqual;
  private java.lang.Integer enabledLessThan;
  private java.lang.Integer enabledNotEquals;
  private java.lang.Integer[] enabledIns;
  private java.lang.Integer[] enabledNotIns;

  public AttributeCategoryQuery() {
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

  public java.lang.Integer getEnabledGreaterThan() {
    return enabledGreaterThan;
  }

  public void setenabledGreaterThan(java.lang.Integer enabledGreaterThan) {
    this.enabledGreaterThan = enabledGreaterThan;
  }

  public java.lang.Integer getEnabledGreaterEqual() {
    return enabledGreaterEqual;
  }

  public void setEnabledGreaterEqual(java.lang.Integer enabledGreaterEqual) {
    this.enabledGreaterEqual = enabledGreaterEqual;
  }

  public java.lang.Integer getEnabledLessEqual() {
    return enabledLessEqual;
  }

  public void setEnabledLessEqual(java.lang.Integer enabledLessEqual) {
    this.enabledLessEqual = enabledLessEqual;
  }

  public java.lang.Integer getEnabledLessThan() {
    return enabledLessThan;
  }

  public void setEnabledLessThan(java.lang.Integer enabledLessThan) {
    this.enabledLessThan = enabledLessThan;
  }

  public java.lang.Integer getEnabledNotEquals() {
    return enabledNotEquals;
  }

  public void setEnabledNotEquals(java.lang.Integer enabledNotEquals) {
    this.enabledNotEquals = enabledNotEquals;
  }

  public java.lang.Integer[] getEnabledIns() {
    return enabledIns;
  }

  public void setEnabledIns(java.lang.Integer[] enabledIns) {
    this.enabledIns = enabledIns;
  }

  public java.lang.Integer[] getEnabledNotIns() {
    return enabledNotIns;
  }

  public void setEnabledNotIns(java.lang.Integer[] enabledNotIns) {
    this.enabledNotIns = enabledNotIns;
  }

}
