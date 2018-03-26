package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Keywords;

// 热闹关键词表
public class KeywordsQuery extends Keywords {

  /**  */
  private java.lang.String keywordLeftLike;
  private java.lang.String keywordRightLike;
  private java.lang.String keywordLike;
  private java.lang.String keywordNotEquals;
  private java.lang.String[] keywordIns;
  private java.lang.String[] keywordNotIns;
  /**  */
  private java.lang.Integer is_hotGreaterThan;
  private java.lang.Integer is_hotGreaterEqual;
  private java.lang.Integer is_hotLessEqual;
  private java.lang.Integer is_hotLessThan;
  private java.lang.Integer is_hotNotEquals;
  private java.lang.Integer[] is_hotIns;
  private java.lang.Integer[] is_hotNotIns;
  /**  */
  private java.lang.Integer is_defaultGreaterThan;
  private java.lang.Integer is_defaultGreaterEqual;
  private java.lang.Integer is_defaultLessEqual;
  private java.lang.Integer is_defaultLessThan;
  private java.lang.Integer is_defaultNotEquals;
  private java.lang.Integer[] is_defaultIns;
  private java.lang.Integer[] is_defaultNotIns;
  /**  */
  private java.lang.Integer is_showGreaterThan;
  private java.lang.Integer is_showGreaterEqual;
  private java.lang.Integer is_showLessEqual;
  private java.lang.Integer is_showLessThan;
  private java.lang.Integer is_showNotEquals;
  private java.lang.Integer[] is_showIns;
  private java.lang.Integer[] is_showNotIns;
  /**  */
  private java.lang.Integer sort_orderGreaterThan;
  private java.lang.Integer sort_orderGreaterEqual;
  private java.lang.Integer sort_orderLessEqual;
  private java.lang.Integer sort_orderLessThan;
  private java.lang.Integer sort_orderNotEquals;
  private java.lang.Integer[] sort_orderIns;
  private java.lang.Integer[] sort_orderNotIns;
  /** 关键词的跳转链接 */
  private java.lang.String scheme_urlLeftLike;
  private java.lang.String scheme_urlRightLike;
  private java.lang.String scheme_urlLike;
  private java.lang.String scheme_urlNotEquals;
  private java.lang.String[] scheme_urlIns;
  private java.lang.String[] scheme_urlNotIns;
  /**  */
  private java.lang.Integer typeGreaterThan;
  private java.lang.Integer typeGreaterEqual;
  private java.lang.Integer typeLessEqual;
  private java.lang.Integer typeLessThan;
  private java.lang.Integer typeNotEquals;
  private java.lang.Integer[] typeIns;
  private java.lang.Integer[] typeNotIns;

  public KeywordsQuery() {
  }

  // getter and setter

  public java.lang.String getKeywordLeftLike() {
    return keywordLeftLike;
  }

  public void setKeywordLeftLike(java.lang.String keywordLeftLike) {
    this.keywordLeftLike = keywordLeftLike;
  }

  public java.lang.String getKeywordRightLike() {
    return keywordRightLike;
  }

  public void setKeywordRightLike(java.lang.String keywordRightLike) {
    this.keywordRightLike = keywordRightLike;
  }

  public java.lang.String getKeywordLike() {
    return keywordLike;
  }

  public void setKeywordLike(java.lang.String keywordLike) {
    this.keywordLike = keywordLike;
  }

  public java.lang.String getKeywordNotEquals() {
    return keywordNotEquals;
  }

  public void setKeywordNotEquals(java.lang.String keywordNotEquals) {
    this.keywordNotEquals = keywordNotEquals;
  }

  public java.lang.String[] getKeywordIns() {
    return keywordIns;
  }

  public void setKeywordIns(java.lang.String[] keywordIns) {
    this.keywordIns = keywordIns;
  }

  public java.lang.String[] getKeywordNotIns() {
    return keywordNotIns;
  }

  public void setKeywordNotIns(java.lang.String[] keywordNotIns) {
    this.keywordNotIns = keywordNotIns;
  }

  public java.lang.Integer getIs_hotGreaterThan() {
    return is_hotGreaterThan;
  }

  public void setis_hotGreaterThan(java.lang.Integer is_hotGreaterThan) {
    this.is_hotGreaterThan = is_hotGreaterThan;
  }

  public java.lang.Integer getIs_hotGreaterEqual() {
    return is_hotGreaterEqual;
  }

  public void setIs_hotGreaterEqual(java.lang.Integer is_hotGreaterEqual) {
    this.is_hotGreaterEqual = is_hotGreaterEqual;
  }

  public java.lang.Integer getIs_hotLessEqual() {
    return is_hotLessEqual;
  }

  public void setIs_hotLessEqual(java.lang.Integer is_hotLessEqual) {
    this.is_hotLessEqual = is_hotLessEqual;
  }

  public java.lang.Integer getIs_hotLessThan() {
    return is_hotLessThan;
  }

  public void setIs_hotLessThan(java.lang.Integer is_hotLessThan) {
    this.is_hotLessThan = is_hotLessThan;
  }

  public java.lang.Integer getIs_hotNotEquals() {
    return is_hotNotEquals;
  }

  public void setIs_hotNotEquals(java.lang.Integer is_hotNotEquals) {
    this.is_hotNotEquals = is_hotNotEquals;
  }

  public java.lang.Integer[] getIs_hotIns() {
    return is_hotIns;
  }

  public void setIs_hotIns(java.lang.Integer[] is_hotIns) {
    this.is_hotIns = is_hotIns;
  }

  public java.lang.Integer[] getIs_hotNotIns() {
    return is_hotNotIns;
  }

  public void setIs_hotNotIns(java.lang.Integer[] is_hotNotIns) {
    this.is_hotNotIns = is_hotNotIns;
  }

  public java.lang.Integer getIs_defaultGreaterThan() {
    return is_defaultGreaterThan;
  }

  public void setis_defaultGreaterThan(java.lang.Integer is_defaultGreaterThan) {
    this.is_defaultGreaterThan = is_defaultGreaterThan;
  }

  public java.lang.Integer getIs_defaultGreaterEqual() {
    return is_defaultGreaterEqual;
  }

  public void setIs_defaultGreaterEqual(java.lang.Integer is_defaultGreaterEqual) {
    this.is_defaultGreaterEqual = is_defaultGreaterEqual;
  }

  public java.lang.Integer getIs_defaultLessEqual() {
    return is_defaultLessEqual;
  }

  public void setIs_defaultLessEqual(java.lang.Integer is_defaultLessEqual) {
    this.is_defaultLessEqual = is_defaultLessEqual;
  }

  public java.lang.Integer getIs_defaultLessThan() {
    return is_defaultLessThan;
  }

  public void setIs_defaultLessThan(java.lang.Integer is_defaultLessThan) {
    this.is_defaultLessThan = is_defaultLessThan;
  }

  public java.lang.Integer getIs_defaultNotEquals() {
    return is_defaultNotEquals;
  }

  public void setIs_defaultNotEquals(java.lang.Integer is_defaultNotEquals) {
    this.is_defaultNotEquals = is_defaultNotEquals;
  }

  public java.lang.Integer[] getIs_defaultIns() {
    return is_defaultIns;
  }

  public void setIs_defaultIns(java.lang.Integer[] is_defaultIns) {
    this.is_defaultIns = is_defaultIns;
  }

  public java.lang.Integer[] getIs_defaultNotIns() {
    return is_defaultNotIns;
  }

  public void setIs_defaultNotIns(java.lang.Integer[] is_defaultNotIns) {
    this.is_defaultNotIns = is_defaultNotIns;
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

  public java.lang.String getScheme_urlLeftLike() {
    return scheme_urlLeftLike;
  }

  public void setScheme_urlLeftLike(java.lang.String scheme_urlLeftLike) {
    this.scheme_urlLeftLike = scheme_urlLeftLike;
  }

  public java.lang.String getScheme_urlRightLike() {
    return scheme_urlRightLike;
  }

  public void setScheme_urlRightLike(java.lang.String scheme_urlRightLike) {
    this.scheme_urlRightLike = scheme_urlRightLike;
  }

  public java.lang.String getScheme_urlLike() {
    return scheme_urlLike;
  }

  public void setScheme_urlLike(java.lang.String scheme_urlLike) {
    this.scheme_urlLike = scheme_urlLike;
  }

  public java.lang.String getScheme_urlNotEquals() {
    return scheme_urlNotEquals;
  }

  public void setScheme_urlNotEquals(java.lang.String scheme_urlNotEquals) {
    this.scheme_urlNotEquals = scheme_urlNotEquals;
  }

  public java.lang.String[] getScheme_urlIns() {
    return scheme_urlIns;
  }

  public void setScheme_urlIns(java.lang.String[] scheme_urlIns) {
    this.scheme_urlIns = scheme_urlIns;
  }

  public java.lang.String[] getScheme_urlNotIns() {
    return scheme_urlNotIns;
  }

  public void setScheme_urlNotIns(java.lang.String[] scheme_urlNotIns) {
    this.scheme_urlNotIns = scheme_urlNotIns;
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

}
