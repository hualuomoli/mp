package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Region;

// 
public class RegionQuery extends Region {

  /**  */
  private java.lang.Integer parent_idGreaterThan;
  private java.lang.Integer parent_idGreaterEqual;
  private java.lang.Integer parent_idLessEqual;
  private java.lang.Integer parent_idLessThan;
  private java.lang.Integer parent_idNotEquals;
  private java.lang.Integer[] parent_idIns;
  private java.lang.Integer[] parent_idNotIns;
  /**  */
  private java.lang.String nameLeftLike;
  private java.lang.String nameRightLike;
  private java.lang.String nameLike;
  private java.lang.String nameNotEquals;
  private java.lang.String[] nameIns;
  private java.lang.String[] nameNotIns;
  /**  */
  private java.lang.Integer typeGreaterThan;
  private java.lang.Integer typeGreaterEqual;
  private java.lang.Integer typeLessEqual;
  private java.lang.Integer typeLessThan;
  private java.lang.Integer typeNotEquals;
  private java.lang.Integer[] typeIns;
  private java.lang.Integer[] typeNotIns;
  /**  */
  private java.lang.Integer agency_idGreaterThan;
  private java.lang.Integer agency_idGreaterEqual;
  private java.lang.Integer agency_idLessEqual;
  private java.lang.Integer agency_idLessThan;
  private java.lang.Integer agency_idNotEquals;
  private java.lang.Integer[] agency_idIns;
  private java.lang.Integer[] agency_idNotIns;

  public RegionQuery() {
  }

  // getter and setter

  public java.lang.Integer getParent_idGreaterThan() {
    return parent_idGreaterThan;
  }

  public void setparent_idGreaterThan(java.lang.Integer parent_idGreaterThan) {
    this.parent_idGreaterThan = parent_idGreaterThan;
  }

  public java.lang.Integer getParent_idGreaterEqual() {
    return parent_idGreaterEqual;
  }

  public void setParent_idGreaterEqual(java.lang.Integer parent_idGreaterEqual) {
    this.parent_idGreaterEqual = parent_idGreaterEqual;
  }

  public java.lang.Integer getParent_idLessEqual() {
    return parent_idLessEqual;
  }

  public void setParent_idLessEqual(java.lang.Integer parent_idLessEqual) {
    this.parent_idLessEqual = parent_idLessEqual;
  }

  public java.lang.Integer getParent_idLessThan() {
    return parent_idLessThan;
  }

  public void setParent_idLessThan(java.lang.Integer parent_idLessThan) {
    this.parent_idLessThan = parent_idLessThan;
  }

  public java.lang.Integer getParent_idNotEquals() {
    return parent_idNotEquals;
  }

  public void setParent_idNotEquals(java.lang.Integer parent_idNotEquals) {
    this.parent_idNotEquals = parent_idNotEquals;
  }

  public java.lang.Integer[] getParent_idIns() {
    return parent_idIns;
  }

  public void setParent_idIns(java.lang.Integer[] parent_idIns) {
    this.parent_idIns = parent_idIns;
  }

  public java.lang.Integer[] getParent_idNotIns() {
    return parent_idNotIns;
  }

  public void setParent_idNotIns(java.lang.Integer[] parent_idNotIns) {
    this.parent_idNotIns = parent_idNotIns;
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

  public java.lang.Integer getTypeGreaterThan() {
    return typeGreaterThan;
  }

  public void settypeGreaterThan(java.lang.Integer typeGreaterThan) {
    this.typeGreaterThan = typeGreaterThan;
  }

  public java.lang.Integer getTypeGreaterEqual() {
    return typeGreaterEqual;
  }

  public void setTypeGreaterEqual(java.lang.Integer typeGreaterEqual) {
    this.typeGreaterEqual = typeGreaterEqual;
  }

  public java.lang.Integer getTypeLessEqual() {
    return typeLessEqual;
  }

  public void setTypeLessEqual(java.lang.Integer typeLessEqual) {
    this.typeLessEqual = typeLessEqual;
  }

  public java.lang.Integer getTypeLessThan() {
    return typeLessThan;
  }

  public void setTypeLessThan(java.lang.Integer typeLessThan) {
    this.typeLessThan = typeLessThan;
  }

  public java.lang.Integer getTypeNotEquals() {
    return typeNotEquals;
  }

  public void setTypeNotEquals(java.lang.Integer typeNotEquals) {
    this.typeNotEquals = typeNotEquals;
  }

  public java.lang.Integer[] getTypeIns() {
    return typeIns;
  }

  public void setTypeIns(java.lang.Integer[] typeIns) {
    this.typeIns = typeIns;
  }

  public java.lang.Integer[] getTypeNotIns() {
    return typeNotIns;
  }

  public void setTypeNotIns(java.lang.Integer[] typeNotIns) {
    this.typeNotIns = typeNotIns;
  }

  public java.lang.Integer getAgency_idGreaterThan() {
    return agency_idGreaterThan;
  }

  public void setagency_idGreaterThan(java.lang.Integer agency_idGreaterThan) {
    this.agency_idGreaterThan = agency_idGreaterThan;
  }

  public java.lang.Integer getAgency_idGreaterEqual() {
    return agency_idGreaterEqual;
  }

  public void setAgency_idGreaterEqual(java.lang.Integer agency_idGreaterEqual) {
    this.agency_idGreaterEqual = agency_idGreaterEqual;
  }

  public java.lang.Integer getAgency_idLessEqual() {
    return agency_idLessEqual;
  }

  public void setAgency_idLessEqual(java.lang.Integer agency_idLessEqual) {
    this.agency_idLessEqual = agency_idLessEqual;
  }

  public java.lang.Integer getAgency_idLessThan() {
    return agency_idLessThan;
  }

  public void setAgency_idLessThan(java.lang.Integer agency_idLessThan) {
    this.agency_idLessThan = agency_idLessThan;
  }

  public java.lang.Integer getAgency_idNotEquals() {
    return agency_idNotEquals;
  }

  public void setAgency_idNotEquals(java.lang.Integer agency_idNotEquals) {
    this.agency_idNotEquals = agency_idNotEquals;
  }

  public java.lang.Integer[] getAgency_idIns() {
    return agency_idIns;
  }

  public void setAgency_idIns(java.lang.Integer[] agency_idIns) {
    this.agency_idIns = agency_idIns;
  }

  public java.lang.Integer[] getAgency_idNotIns() {
    return agency_idNotIns;
  }

  public void setAgency_idNotIns(java.lang.Integer[] agency_idNotIns) {
    this.agency_idNotIns = agency_idNotIns;
  }

}
