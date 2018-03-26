package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.TopicCategory;

// 
public class TopicCategoryQuery extends TopicCategory {

  /**  */
  private java.lang.String titleLeftLike;
  private java.lang.String titleRightLike;
  private java.lang.String titleLike;
  private java.lang.String titleNotEquals;
  private java.lang.String[] titleIns;
  private java.lang.String[] titleNotIns;
  /**  */
  private java.lang.String pic_urlLeftLike;
  private java.lang.String pic_urlRightLike;
  private java.lang.String pic_urlLike;
  private java.lang.String pic_urlNotEquals;
  private java.lang.String[] pic_urlIns;
  private java.lang.String[] pic_urlNotIns;

  public TopicCategoryQuery() {
  }

  // getter and setter

  public java.lang.String getTitleLeftLike() {
    return titleLeftLike;
  }

  public void setTitleLeftLike(java.lang.String titleLeftLike) {
    this.titleLeftLike = titleLeftLike;
  }

  public java.lang.String getTitleRightLike() {
    return titleRightLike;
  }

  public void setTitleRightLike(java.lang.String titleRightLike) {
    this.titleRightLike = titleRightLike;
  }

  public java.lang.String getTitleLike() {
    return titleLike;
  }

  public void setTitleLike(java.lang.String titleLike) {
    this.titleLike = titleLike;
  }

  public java.lang.String getTitleNotEquals() {
    return titleNotEquals;
  }

  public void setTitleNotEquals(java.lang.String titleNotEquals) {
    this.titleNotEquals = titleNotEquals;
  }

  public java.lang.String[] getTitleIns() {
    return titleIns;
  }

  public void setTitleIns(java.lang.String[] titleIns) {
    this.titleIns = titleIns;
  }

  public java.lang.String[] getTitleNotIns() {
    return titleNotIns;
  }

  public void setTitleNotIns(java.lang.String[] titleNotIns) {
    this.titleNotIns = titleNotIns;
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
