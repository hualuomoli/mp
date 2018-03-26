package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Ad;

// 
public class AdQuery extends Ad {

  /**  */
  private java.lang.Integer ad_position_idGreaterThan;
  private java.lang.Integer ad_position_idGreaterEqual;
  private java.lang.Integer ad_position_idLessEqual;
  private java.lang.Integer ad_position_idLessThan;
  private java.lang.Integer ad_position_idNotEquals;
  private java.lang.Integer[] ad_position_idIns;
  private java.lang.Integer[] ad_position_idNotIns;
  /**  */
  private java.lang.Integer media_typeGreaterThan;
  private java.lang.Integer media_typeGreaterEqual;
  private java.lang.Integer media_typeLessEqual;
  private java.lang.Integer media_typeLessThan;
  private java.lang.Integer media_typeNotEquals;
  private java.lang.Integer[] media_typeIns;
  private java.lang.Integer[] media_typeNotIns;
  /**  */
  private java.lang.String nameLeftLike;
  private java.lang.String nameRightLike;
  private java.lang.String nameLike;
  private java.lang.String nameNotEquals;
  private java.lang.String[] nameIns;
  private java.lang.String[] nameNotIns;
  /**  */
  private java.lang.String linkLeftLike;
  private java.lang.String linkRightLike;
  private java.lang.String linkLike;
  private java.lang.String linkNotEquals;
  private java.lang.String[] linkIns;
  private java.lang.String[] linkNotIns;
  /**  */
  private java.lang.String image_urlLeftLike;
  private java.lang.String image_urlRightLike;
  private java.lang.String image_urlLike;
  private java.lang.String image_urlNotEquals;
  private java.lang.String[] image_urlIns;
  private java.lang.String[] image_urlNotIns;
  /**  */
  private java.lang.String contentLeftLike;
  private java.lang.String contentRightLike;
  private java.lang.String contentLike;
  private java.lang.String contentNotEquals;
  private java.lang.String[] contentIns;
  private java.lang.String[] contentNotIns;
  /**  */
  private java.lang.Integer end_timeGreaterThan;
  private java.lang.Integer end_timeGreaterEqual;
  private java.lang.Integer end_timeLessEqual;
  private java.lang.Integer end_timeLessThan;
  private java.lang.Integer end_timeNotEquals;
  private java.lang.Integer[] end_timeIns;
  private java.lang.Integer[] end_timeNotIns;
  /**  */
  private java.lang.Integer enabledGreaterThan;
  private java.lang.Integer enabledGreaterEqual;
  private java.lang.Integer enabledLessEqual;
  private java.lang.Integer enabledLessThan;
  private java.lang.Integer enabledNotEquals;
  private java.lang.Integer[] enabledIns;
  private java.lang.Integer[] enabledNotIns;

  public AdQuery() {
  }

  // getter and setter

  public java.lang.Integer getAd_position_idGreaterThan() {
    return ad_position_idGreaterThan;
  }

  public void setad_position_idGreaterThan(java.lang.Integer ad_position_idGreaterThan) {
    this.ad_position_idGreaterThan = ad_position_idGreaterThan;
  }

  public java.lang.Integer getAd_position_idGreaterEqual() {
    return ad_position_idGreaterEqual;
  }

  public void setAd_position_idGreaterEqual(java.lang.Integer ad_position_idGreaterEqual) {
    this.ad_position_idGreaterEqual = ad_position_idGreaterEqual;
  }

  public java.lang.Integer getAd_position_idLessEqual() {
    return ad_position_idLessEqual;
  }

  public void setAd_position_idLessEqual(java.lang.Integer ad_position_idLessEqual) {
    this.ad_position_idLessEqual = ad_position_idLessEqual;
  }

  public java.lang.Integer getAd_position_idLessThan() {
    return ad_position_idLessThan;
  }

  public void setAd_position_idLessThan(java.lang.Integer ad_position_idLessThan) {
    this.ad_position_idLessThan = ad_position_idLessThan;
  }

  public java.lang.Integer getAd_position_idNotEquals() {
    return ad_position_idNotEquals;
  }

  public void setAd_position_idNotEquals(java.lang.Integer ad_position_idNotEquals) {
    this.ad_position_idNotEquals = ad_position_idNotEquals;
  }

  public java.lang.Integer[] getAd_position_idIns() {
    return ad_position_idIns;
  }

  public void setAd_position_idIns(java.lang.Integer[] ad_position_idIns) {
    this.ad_position_idIns = ad_position_idIns;
  }

  public java.lang.Integer[] getAd_position_idNotIns() {
    return ad_position_idNotIns;
  }

  public void setAd_position_idNotIns(java.lang.Integer[] ad_position_idNotIns) {
    this.ad_position_idNotIns = ad_position_idNotIns;
  }

  public java.lang.Integer getMedia_typeGreaterThan() {
    return media_typeGreaterThan;
  }

  public void setmedia_typeGreaterThan(java.lang.Integer media_typeGreaterThan) {
    this.media_typeGreaterThan = media_typeGreaterThan;
  }

  public java.lang.Integer getMedia_typeGreaterEqual() {
    return media_typeGreaterEqual;
  }

  public void setMedia_typeGreaterEqual(java.lang.Integer media_typeGreaterEqual) {
    this.media_typeGreaterEqual = media_typeGreaterEqual;
  }

  public java.lang.Integer getMedia_typeLessEqual() {
    return media_typeLessEqual;
  }

  public void setMedia_typeLessEqual(java.lang.Integer media_typeLessEqual) {
    this.media_typeLessEqual = media_typeLessEqual;
  }

  public java.lang.Integer getMedia_typeLessThan() {
    return media_typeLessThan;
  }

  public void setMedia_typeLessThan(java.lang.Integer media_typeLessThan) {
    this.media_typeLessThan = media_typeLessThan;
  }

  public java.lang.Integer getMedia_typeNotEquals() {
    return media_typeNotEquals;
  }

  public void setMedia_typeNotEquals(java.lang.Integer media_typeNotEquals) {
    this.media_typeNotEquals = media_typeNotEquals;
  }

  public java.lang.Integer[] getMedia_typeIns() {
    return media_typeIns;
  }

  public void setMedia_typeIns(java.lang.Integer[] media_typeIns) {
    this.media_typeIns = media_typeIns;
  }

  public java.lang.Integer[] getMedia_typeNotIns() {
    return media_typeNotIns;
  }

  public void setMedia_typeNotIns(java.lang.Integer[] media_typeNotIns) {
    this.media_typeNotIns = media_typeNotIns;
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

  public java.lang.String getLinkLeftLike() {
    return linkLeftLike;
  }

  public void setLinkLeftLike(java.lang.String linkLeftLike) {
    this.linkLeftLike = linkLeftLike;
  }

  public java.lang.String getLinkRightLike() {
    return linkRightLike;
  }

  public void setLinkRightLike(java.lang.String linkRightLike) {
    this.linkRightLike = linkRightLike;
  }

  public java.lang.String getLinkLike() {
    return linkLike;
  }

  public void setLinkLike(java.lang.String linkLike) {
    this.linkLike = linkLike;
  }

  public java.lang.String getLinkNotEquals() {
    return linkNotEquals;
  }

  public void setLinkNotEquals(java.lang.String linkNotEquals) {
    this.linkNotEquals = linkNotEquals;
  }

  public java.lang.String[] getLinkIns() {
    return linkIns;
  }

  public void setLinkIns(java.lang.String[] linkIns) {
    this.linkIns = linkIns;
  }

  public java.lang.String[] getLinkNotIns() {
    return linkNotIns;
  }

  public void setLinkNotIns(java.lang.String[] linkNotIns) {
    this.linkNotIns = linkNotIns;
  }

  public java.lang.String getImage_urlLeftLike() {
    return image_urlLeftLike;
  }

  public void setImage_urlLeftLike(java.lang.String image_urlLeftLike) {
    this.image_urlLeftLike = image_urlLeftLike;
  }

  public java.lang.String getImage_urlRightLike() {
    return image_urlRightLike;
  }

  public void setImage_urlRightLike(java.lang.String image_urlRightLike) {
    this.image_urlRightLike = image_urlRightLike;
  }

  public java.lang.String getImage_urlLike() {
    return image_urlLike;
  }

  public void setImage_urlLike(java.lang.String image_urlLike) {
    this.image_urlLike = image_urlLike;
  }

  public java.lang.String getImage_urlNotEquals() {
    return image_urlNotEquals;
  }

  public void setImage_urlNotEquals(java.lang.String image_urlNotEquals) {
    this.image_urlNotEquals = image_urlNotEquals;
  }

  public java.lang.String[] getImage_urlIns() {
    return image_urlIns;
  }

  public void setImage_urlIns(java.lang.String[] image_urlIns) {
    this.image_urlIns = image_urlIns;
  }

  public java.lang.String[] getImage_urlNotIns() {
    return image_urlNotIns;
  }

  public void setImage_urlNotIns(java.lang.String[] image_urlNotIns) {
    this.image_urlNotIns = image_urlNotIns;
  }

  public java.lang.String getContentLeftLike() {
    return contentLeftLike;
  }

  public void setContentLeftLike(java.lang.String contentLeftLike) {
    this.contentLeftLike = contentLeftLike;
  }

  public java.lang.String getContentRightLike() {
    return contentRightLike;
  }

  public void setContentRightLike(java.lang.String contentRightLike) {
    this.contentRightLike = contentRightLike;
  }

  public java.lang.String getContentLike() {
    return contentLike;
  }

  public void setContentLike(java.lang.String contentLike) {
    this.contentLike = contentLike;
  }

  public java.lang.String getContentNotEquals() {
    return contentNotEquals;
  }

  public void setContentNotEquals(java.lang.String contentNotEquals) {
    this.contentNotEquals = contentNotEquals;
  }

  public java.lang.String[] getContentIns() {
    return contentIns;
  }

  public void setContentIns(java.lang.String[] contentIns) {
    this.contentIns = contentIns;
  }

  public java.lang.String[] getContentNotIns() {
    return contentNotIns;
  }

  public void setContentNotIns(java.lang.String[] contentNotIns) {
    this.contentNotIns = contentNotIns;
  }

  public java.lang.Integer getEnd_timeGreaterThan() {
    return end_timeGreaterThan;
  }

  public void setend_timeGreaterThan(java.lang.Integer end_timeGreaterThan) {
    this.end_timeGreaterThan = end_timeGreaterThan;
  }

  public java.lang.Integer getEnd_timeGreaterEqual() {
    return end_timeGreaterEqual;
  }

  public void setEnd_timeGreaterEqual(java.lang.Integer end_timeGreaterEqual) {
    this.end_timeGreaterEqual = end_timeGreaterEqual;
  }

  public java.lang.Integer getEnd_timeLessEqual() {
    return end_timeLessEqual;
  }

  public void setEnd_timeLessEqual(java.lang.Integer end_timeLessEqual) {
    this.end_timeLessEqual = end_timeLessEqual;
  }

  public java.lang.Integer getEnd_timeLessThan() {
    return end_timeLessThan;
  }

  public void setEnd_timeLessThan(java.lang.Integer end_timeLessThan) {
    this.end_timeLessThan = end_timeLessThan;
  }

  public java.lang.Integer getEnd_timeNotEquals() {
    return end_timeNotEquals;
  }

  public void setEnd_timeNotEquals(java.lang.Integer end_timeNotEquals) {
    this.end_timeNotEquals = end_timeNotEquals;
  }

  public java.lang.Integer[] getEnd_timeIns() {
    return end_timeIns;
  }

  public void setEnd_timeIns(java.lang.Integer[] end_timeIns) {
    this.end_timeIns = end_timeIns;
  }

  public java.lang.Integer[] getEnd_timeNotIns() {
    return end_timeNotIns;
  }

  public void setEnd_timeNotIns(java.lang.Integer[] end_timeNotIns) {
    this.end_timeNotIns = end_timeNotIns;
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
