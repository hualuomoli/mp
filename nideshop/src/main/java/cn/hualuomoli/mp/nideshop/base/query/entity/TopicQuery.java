package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Topic;

// 
public class TopicQuery extends Topic {

  /**  */
  private java.lang.Integer idGreaterThan;
  private java.lang.Integer idGreaterEqual;
  private java.lang.Integer idLessEqual;
  private java.lang.Integer idLessThan;
  private java.lang.Integer idNotEquals;
  private java.lang.Integer[] idIns;
  private java.lang.Integer[] idNotIns;
  /**  */
  private java.lang.String titleLeftLike;
  private java.lang.String titleRightLike;
  private java.lang.String titleLike;
  private java.lang.String titleNotEquals;
  private java.lang.String[] titleIns;
  private java.lang.String[] titleNotIns;
  /**  */
  private java.lang.String contentLeftLike;
  private java.lang.String contentRightLike;
  private java.lang.String contentLike;
  private java.lang.String contentNotEquals;
  private java.lang.String[] contentIns;
  private java.lang.String[] contentNotIns;
  /**  */
  private java.lang.String avatarLeftLike;
  private java.lang.String avatarRightLike;
  private java.lang.String avatarLike;
  private java.lang.String avatarNotEquals;
  private java.lang.String[] avatarIns;
  private java.lang.String[] avatarNotIns;
  /**  */
  private java.lang.String item_pic_urlLeftLike;
  private java.lang.String item_pic_urlRightLike;
  private java.lang.String item_pic_urlLike;
  private java.lang.String item_pic_urlNotEquals;
  private java.lang.String[] item_pic_urlIns;
  private java.lang.String[] item_pic_urlNotIns;
  /**  */
  private java.lang.String subtitleLeftLike;
  private java.lang.String subtitleRightLike;
  private java.lang.String subtitleLike;
  private java.lang.String subtitleNotEquals;
  private java.lang.String[] subtitleIns;
  private java.lang.String[] subtitleNotIns;
  /**  */
  private java.lang.Integer topic_category_idGreaterThan;
  private java.lang.Integer topic_category_idGreaterEqual;
  private java.lang.Integer topic_category_idLessEqual;
  private java.lang.Integer topic_category_idLessThan;
  private java.lang.Integer topic_category_idNotEquals;
  private java.lang.Integer[] topic_category_idIns;
  private java.lang.Integer[] topic_category_idNotIns;
  /**  */
  private java.lang.Double price_infoGreaterThan;
  private java.lang.Double price_infoGreaterEqual;
  private java.lang.Double price_infoLessEqual;
  private java.lang.Double price_infoLessThan;
  private java.lang.Double price_infoNotEquals;
  private java.lang.Double[] price_infoIns;
  private java.lang.Double[] price_infoNotIns;
  /**  */
  private java.lang.String read_countLeftLike;
  private java.lang.String read_countRightLike;
  private java.lang.String read_countLike;
  private java.lang.String read_countNotEquals;
  private java.lang.String[] read_countIns;
  private java.lang.String[] read_countNotIns;
  /**  */
  private java.lang.String scene_pic_urlLeftLike;
  private java.lang.String scene_pic_urlRightLike;
  private java.lang.String scene_pic_urlLike;
  private java.lang.String scene_pic_urlNotEquals;
  private java.lang.String[] scene_pic_urlIns;
  private java.lang.String[] scene_pic_urlNotIns;
  /**  */
  private java.lang.Integer topic_template_idGreaterThan;
  private java.lang.Integer topic_template_idGreaterEqual;
  private java.lang.Integer topic_template_idLessEqual;
  private java.lang.Integer topic_template_idLessThan;
  private java.lang.Integer topic_template_idNotEquals;
  private java.lang.Integer[] topic_template_idIns;
  private java.lang.Integer[] topic_template_idNotIns;
  /**  */
  private java.lang.Integer topic_tag_idGreaterThan;
  private java.lang.Integer topic_tag_idGreaterEqual;
  private java.lang.Integer topic_tag_idLessEqual;
  private java.lang.Integer topic_tag_idLessThan;
  private java.lang.Integer topic_tag_idNotEquals;
  private java.lang.Integer[] topic_tag_idIns;
  private java.lang.Integer[] topic_tag_idNotIns;
  /**  */
  private java.lang.Integer sort_orderGreaterThan;
  private java.lang.Integer sort_orderGreaterEqual;
  private java.lang.Integer sort_orderLessEqual;
  private java.lang.Integer sort_orderLessThan;
  private java.lang.Integer sort_orderNotEquals;
  private java.lang.Integer[] sort_orderIns;
  private java.lang.Integer[] sort_orderNotIns;
  /**  */
  private java.lang.Integer is_showGreaterThan;
  private java.lang.Integer is_showGreaterEqual;
  private java.lang.Integer is_showLessEqual;
  private java.lang.Integer is_showLessThan;
  private java.lang.Integer is_showNotEquals;
  private java.lang.Integer[] is_showIns;
  private java.lang.Integer[] is_showNotIns;

  public TopicQuery() {
  }

  // getter and setter

  public java.lang.Integer getIdGreaterThan() {
    return idGreaterThan;
  }

  public void setidGreaterThan(java.lang.Integer idGreaterThan) {
    this.idGreaterThan = idGreaterThan;
  }

  public java.lang.Integer getIdGreaterEqual() {
    return idGreaterEqual;
  }

  public void setIdGreaterEqual(java.lang.Integer idGreaterEqual) {
    this.idGreaterEqual = idGreaterEqual;
  }

  public java.lang.Integer getIdLessEqual() {
    return idLessEqual;
  }

  public void setIdLessEqual(java.lang.Integer idLessEqual) {
    this.idLessEqual = idLessEqual;
  }

  public java.lang.Integer getIdLessThan() {
    return idLessThan;
  }

  public void setIdLessThan(java.lang.Integer idLessThan) {
    this.idLessThan = idLessThan;
  }

  public java.lang.Integer getIdNotEquals() {
    return idNotEquals;
  }

  public void setIdNotEquals(java.lang.Integer idNotEquals) {
    this.idNotEquals = idNotEquals;
  }

  public java.lang.Integer[] getIdIns() {
    return idIns;
  }

  public void setIdIns(java.lang.Integer[] idIns) {
    this.idIns = idIns;
  }

  public java.lang.Integer[] getIdNotIns() {
    return idNotIns;
  }

  public void setIdNotIns(java.lang.Integer[] idNotIns) {
    this.idNotIns = idNotIns;
  }

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

  public java.lang.String getAvatarLeftLike() {
    return avatarLeftLike;
  }

  public void setAvatarLeftLike(java.lang.String avatarLeftLike) {
    this.avatarLeftLike = avatarLeftLike;
  }

  public java.lang.String getAvatarRightLike() {
    return avatarRightLike;
  }

  public void setAvatarRightLike(java.lang.String avatarRightLike) {
    this.avatarRightLike = avatarRightLike;
  }

  public java.lang.String getAvatarLike() {
    return avatarLike;
  }

  public void setAvatarLike(java.lang.String avatarLike) {
    this.avatarLike = avatarLike;
  }

  public java.lang.String getAvatarNotEquals() {
    return avatarNotEquals;
  }

  public void setAvatarNotEquals(java.lang.String avatarNotEquals) {
    this.avatarNotEquals = avatarNotEquals;
  }

  public java.lang.String[] getAvatarIns() {
    return avatarIns;
  }

  public void setAvatarIns(java.lang.String[] avatarIns) {
    this.avatarIns = avatarIns;
  }

  public java.lang.String[] getAvatarNotIns() {
    return avatarNotIns;
  }

  public void setAvatarNotIns(java.lang.String[] avatarNotIns) {
    this.avatarNotIns = avatarNotIns;
  }

  public java.lang.String getItem_pic_urlLeftLike() {
    return item_pic_urlLeftLike;
  }

  public void setItem_pic_urlLeftLike(java.lang.String item_pic_urlLeftLike) {
    this.item_pic_urlLeftLike = item_pic_urlLeftLike;
  }

  public java.lang.String getItem_pic_urlRightLike() {
    return item_pic_urlRightLike;
  }

  public void setItem_pic_urlRightLike(java.lang.String item_pic_urlRightLike) {
    this.item_pic_urlRightLike = item_pic_urlRightLike;
  }

  public java.lang.String getItem_pic_urlLike() {
    return item_pic_urlLike;
  }

  public void setItem_pic_urlLike(java.lang.String item_pic_urlLike) {
    this.item_pic_urlLike = item_pic_urlLike;
  }

  public java.lang.String getItem_pic_urlNotEquals() {
    return item_pic_urlNotEquals;
  }

  public void setItem_pic_urlNotEquals(java.lang.String item_pic_urlNotEquals) {
    this.item_pic_urlNotEquals = item_pic_urlNotEquals;
  }

  public java.lang.String[] getItem_pic_urlIns() {
    return item_pic_urlIns;
  }

  public void setItem_pic_urlIns(java.lang.String[] item_pic_urlIns) {
    this.item_pic_urlIns = item_pic_urlIns;
  }

  public java.lang.String[] getItem_pic_urlNotIns() {
    return item_pic_urlNotIns;
  }

  public void setItem_pic_urlNotIns(java.lang.String[] item_pic_urlNotIns) {
    this.item_pic_urlNotIns = item_pic_urlNotIns;
  }

  public java.lang.String getSubtitleLeftLike() {
    return subtitleLeftLike;
  }

  public void setSubtitleLeftLike(java.lang.String subtitleLeftLike) {
    this.subtitleLeftLike = subtitleLeftLike;
  }

  public java.lang.String getSubtitleRightLike() {
    return subtitleRightLike;
  }

  public void setSubtitleRightLike(java.lang.String subtitleRightLike) {
    this.subtitleRightLike = subtitleRightLike;
  }

  public java.lang.String getSubtitleLike() {
    return subtitleLike;
  }

  public void setSubtitleLike(java.lang.String subtitleLike) {
    this.subtitleLike = subtitleLike;
  }

  public java.lang.String getSubtitleNotEquals() {
    return subtitleNotEquals;
  }

  public void setSubtitleNotEquals(java.lang.String subtitleNotEquals) {
    this.subtitleNotEquals = subtitleNotEquals;
  }

  public java.lang.String[] getSubtitleIns() {
    return subtitleIns;
  }

  public void setSubtitleIns(java.lang.String[] subtitleIns) {
    this.subtitleIns = subtitleIns;
  }

  public java.lang.String[] getSubtitleNotIns() {
    return subtitleNotIns;
  }

  public void setSubtitleNotIns(java.lang.String[] subtitleNotIns) {
    this.subtitleNotIns = subtitleNotIns;
  }

  public java.lang.Integer getTopic_category_idGreaterThan() {
    return topic_category_idGreaterThan;
  }

  public void settopic_category_idGreaterThan(java.lang.Integer topic_category_idGreaterThan) {
    this.topic_category_idGreaterThan = topic_category_idGreaterThan;
  }

  public java.lang.Integer getTopic_category_idGreaterEqual() {
    return topic_category_idGreaterEqual;
  }

  public void setTopic_category_idGreaterEqual(java.lang.Integer topic_category_idGreaterEqual) {
    this.topic_category_idGreaterEqual = topic_category_idGreaterEqual;
  }

  public java.lang.Integer getTopic_category_idLessEqual() {
    return topic_category_idLessEqual;
  }

  public void setTopic_category_idLessEqual(java.lang.Integer topic_category_idLessEqual) {
    this.topic_category_idLessEqual = topic_category_idLessEqual;
  }

  public java.lang.Integer getTopic_category_idLessThan() {
    return topic_category_idLessThan;
  }

  public void setTopic_category_idLessThan(java.lang.Integer topic_category_idLessThan) {
    this.topic_category_idLessThan = topic_category_idLessThan;
  }

  public java.lang.Integer getTopic_category_idNotEquals() {
    return topic_category_idNotEquals;
  }

  public void setTopic_category_idNotEquals(java.lang.Integer topic_category_idNotEquals) {
    this.topic_category_idNotEquals = topic_category_idNotEquals;
  }

  public java.lang.Integer[] getTopic_category_idIns() {
    return topic_category_idIns;
  }

  public void setTopic_category_idIns(java.lang.Integer[] topic_category_idIns) {
    this.topic_category_idIns = topic_category_idIns;
  }

  public java.lang.Integer[] getTopic_category_idNotIns() {
    return topic_category_idNotIns;
  }

  public void setTopic_category_idNotIns(java.lang.Integer[] topic_category_idNotIns) {
    this.topic_category_idNotIns = topic_category_idNotIns;
  }

  public java.lang.Double getPrice_infoGreaterThan() {
    return price_infoGreaterThan;
  }

  public void setprice_infoGreaterThan(java.lang.Double price_infoGreaterThan) {
    this.price_infoGreaterThan = price_infoGreaterThan;
  }

  public java.lang.Double getPrice_infoGreaterEqual() {
    return price_infoGreaterEqual;
  }

  public void setPrice_infoGreaterEqual(java.lang.Double price_infoGreaterEqual) {
    this.price_infoGreaterEqual = price_infoGreaterEqual;
  }

  public java.lang.Double getPrice_infoLessEqual() {
    return price_infoLessEqual;
  }

  public void setPrice_infoLessEqual(java.lang.Double price_infoLessEqual) {
    this.price_infoLessEqual = price_infoLessEqual;
  }

  public java.lang.Double getPrice_infoLessThan() {
    return price_infoLessThan;
  }

  public void setPrice_infoLessThan(java.lang.Double price_infoLessThan) {
    this.price_infoLessThan = price_infoLessThan;
  }

  public java.lang.Double getPrice_infoNotEquals() {
    return price_infoNotEquals;
  }

  public void setPrice_infoNotEquals(java.lang.Double price_infoNotEquals) {
    this.price_infoNotEquals = price_infoNotEquals;
  }

  public java.lang.Double[] getPrice_infoIns() {
    return price_infoIns;
  }

  public void setPrice_infoIns(java.lang.Double[] price_infoIns) {
    this.price_infoIns = price_infoIns;
  }

  public java.lang.Double[] getPrice_infoNotIns() {
    return price_infoNotIns;
  }

  public void setPrice_infoNotIns(java.lang.Double[] price_infoNotIns) {
    this.price_infoNotIns = price_infoNotIns;
  }

  public java.lang.String getRead_countLeftLike() {
    return read_countLeftLike;
  }

  public void setRead_countLeftLike(java.lang.String read_countLeftLike) {
    this.read_countLeftLike = read_countLeftLike;
  }

  public java.lang.String getRead_countRightLike() {
    return read_countRightLike;
  }

  public void setRead_countRightLike(java.lang.String read_countRightLike) {
    this.read_countRightLike = read_countRightLike;
  }

  public java.lang.String getRead_countLike() {
    return read_countLike;
  }

  public void setRead_countLike(java.lang.String read_countLike) {
    this.read_countLike = read_countLike;
  }

  public java.lang.String getRead_countNotEquals() {
    return read_countNotEquals;
  }

  public void setRead_countNotEquals(java.lang.String read_countNotEquals) {
    this.read_countNotEquals = read_countNotEquals;
  }

  public java.lang.String[] getRead_countIns() {
    return read_countIns;
  }

  public void setRead_countIns(java.lang.String[] read_countIns) {
    this.read_countIns = read_countIns;
  }

  public java.lang.String[] getRead_countNotIns() {
    return read_countNotIns;
  }

  public void setRead_countNotIns(java.lang.String[] read_countNotIns) {
    this.read_countNotIns = read_countNotIns;
  }

  public java.lang.String getScene_pic_urlLeftLike() {
    return scene_pic_urlLeftLike;
  }

  public void setScene_pic_urlLeftLike(java.lang.String scene_pic_urlLeftLike) {
    this.scene_pic_urlLeftLike = scene_pic_urlLeftLike;
  }

  public java.lang.String getScene_pic_urlRightLike() {
    return scene_pic_urlRightLike;
  }

  public void setScene_pic_urlRightLike(java.lang.String scene_pic_urlRightLike) {
    this.scene_pic_urlRightLike = scene_pic_urlRightLike;
  }

  public java.lang.String getScene_pic_urlLike() {
    return scene_pic_urlLike;
  }

  public void setScene_pic_urlLike(java.lang.String scene_pic_urlLike) {
    this.scene_pic_urlLike = scene_pic_urlLike;
  }

  public java.lang.String getScene_pic_urlNotEquals() {
    return scene_pic_urlNotEquals;
  }

  public void setScene_pic_urlNotEquals(java.lang.String scene_pic_urlNotEquals) {
    this.scene_pic_urlNotEquals = scene_pic_urlNotEquals;
  }

  public java.lang.String[] getScene_pic_urlIns() {
    return scene_pic_urlIns;
  }

  public void setScene_pic_urlIns(java.lang.String[] scene_pic_urlIns) {
    this.scene_pic_urlIns = scene_pic_urlIns;
  }

  public java.lang.String[] getScene_pic_urlNotIns() {
    return scene_pic_urlNotIns;
  }

  public void setScene_pic_urlNotIns(java.lang.String[] scene_pic_urlNotIns) {
    this.scene_pic_urlNotIns = scene_pic_urlNotIns;
  }

  public java.lang.Integer getTopic_template_idGreaterThan() {
    return topic_template_idGreaterThan;
  }

  public void settopic_template_idGreaterThan(java.lang.Integer topic_template_idGreaterThan) {
    this.topic_template_idGreaterThan = topic_template_idGreaterThan;
  }

  public java.lang.Integer getTopic_template_idGreaterEqual() {
    return topic_template_idGreaterEqual;
  }

  public void setTopic_template_idGreaterEqual(java.lang.Integer topic_template_idGreaterEqual) {
    this.topic_template_idGreaterEqual = topic_template_idGreaterEqual;
  }

  public java.lang.Integer getTopic_template_idLessEqual() {
    return topic_template_idLessEqual;
  }

  public void setTopic_template_idLessEqual(java.lang.Integer topic_template_idLessEqual) {
    this.topic_template_idLessEqual = topic_template_idLessEqual;
  }

  public java.lang.Integer getTopic_template_idLessThan() {
    return topic_template_idLessThan;
  }

  public void setTopic_template_idLessThan(java.lang.Integer topic_template_idLessThan) {
    this.topic_template_idLessThan = topic_template_idLessThan;
  }

  public java.lang.Integer getTopic_template_idNotEquals() {
    return topic_template_idNotEquals;
  }

  public void setTopic_template_idNotEquals(java.lang.Integer topic_template_idNotEquals) {
    this.topic_template_idNotEquals = topic_template_idNotEquals;
  }

  public java.lang.Integer[] getTopic_template_idIns() {
    return topic_template_idIns;
  }

  public void setTopic_template_idIns(java.lang.Integer[] topic_template_idIns) {
    this.topic_template_idIns = topic_template_idIns;
  }

  public java.lang.Integer[] getTopic_template_idNotIns() {
    return topic_template_idNotIns;
  }

  public void setTopic_template_idNotIns(java.lang.Integer[] topic_template_idNotIns) {
    this.topic_template_idNotIns = topic_template_idNotIns;
  }

  public java.lang.Integer getTopic_tag_idGreaterThan() {
    return topic_tag_idGreaterThan;
  }

  public void settopic_tag_idGreaterThan(java.lang.Integer topic_tag_idGreaterThan) {
    this.topic_tag_idGreaterThan = topic_tag_idGreaterThan;
  }

  public java.lang.Integer getTopic_tag_idGreaterEqual() {
    return topic_tag_idGreaterEqual;
  }

  public void setTopic_tag_idGreaterEqual(java.lang.Integer topic_tag_idGreaterEqual) {
    this.topic_tag_idGreaterEqual = topic_tag_idGreaterEqual;
  }

  public java.lang.Integer getTopic_tag_idLessEqual() {
    return topic_tag_idLessEqual;
  }

  public void setTopic_tag_idLessEqual(java.lang.Integer topic_tag_idLessEqual) {
    this.topic_tag_idLessEqual = topic_tag_idLessEqual;
  }

  public java.lang.Integer getTopic_tag_idLessThan() {
    return topic_tag_idLessThan;
  }

  public void setTopic_tag_idLessThan(java.lang.Integer topic_tag_idLessThan) {
    this.topic_tag_idLessThan = topic_tag_idLessThan;
  }

  public java.lang.Integer getTopic_tag_idNotEquals() {
    return topic_tag_idNotEquals;
  }

  public void setTopic_tag_idNotEquals(java.lang.Integer topic_tag_idNotEquals) {
    this.topic_tag_idNotEquals = topic_tag_idNotEquals;
  }

  public java.lang.Integer[] getTopic_tag_idIns() {
    return topic_tag_idIns;
  }

  public void setTopic_tag_idIns(java.lang.Integer[] topic_tag_idIns) {
    this.topic_tag_idIns = topic_tag_idIns;
  }

  public java.lang.Integer[] getTopic_tag_idNotIns() {
    return topic_tag_idNotIns;
  }

  public void setTopic_tag_idNotIns(java.lang.Integer[] topic_tag_idNotIns) {
    this.topic_tag_idNotIns = topic_tag_idNotIns;
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

  public java.lang.Integer getIs_showGreaterThan() {
    return is_showGreaterThan;
  }

  public void setis_showGreaterThan(java.lang.Integer is_showGreaterThan) {
    this.is_showGreaterThan = is_showGreaterThan;
  }

  public java.lang.Integer getIs_showGreaterEqual() {
    return is_showGreaterEqual;
  }

  public void setIs_showGreaterEqual(java.lang.Integer is_showGreaterEqual) {
    this.is_showGreaterEqual = is_showGreaterEqual;
  }

  public java.lang.Integer getIs_showLessEqual() {
    return is_showLessEqual;
  }

  public void setIs_showLessEqual(java.lang.Integer is_showLessEqual) {
    this.is_showLessEqual = is_showLessEqual;
  }

  public java.lang.Integer getIs_showLessThan() {
    return is_showLessThan;
  }

  public void setIs_showLessThan(java.lang.Integer is_showLessThan) {
    this.is_showLessThan = is_showLessThan;
  }

  public java.lang.Integer getIs_showNotEquals() {
    return is_showNotEquals;
  }

  public void setIs_showNotEquals(java.lang.Integer is_showNotEquals) {
    this.is_showNotEquals = is_showNotEquals;
  }

  public java.lang.Integer[] getIs_showIns() {
    return is_showIns;
  }

  public void setIs_showIns(java.lang.Integer[] is_showIns) {
    this.is_showIns = is_showIns;
  }

  public java.lang.Integer[] getIs_showNotIns() {
    return is_showNotIns;
  }

  public void setIs_showNotIns(java.lang.Integer[] is_showNotIns) {
    this.is_showNotIns = is_showNotIns;
  }

}
