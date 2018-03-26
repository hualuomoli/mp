package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.SearchHistory;

// 
public class SearchHistoryQuery extends SearchHistory {

  /**  */
  private java.lang.String keywordLeftLike;
  private java.lang.String keywordRightLike;
  private java.lang.String keywordLike;
  private java.lang.String keywordNotEquals;
  private java.lang.String[] keywordIns;
  private java.lang.String[] keywordNotIns;
  /** 搜索来源，如PC、小程序、APP等 */
  private java.lang.String fromLeftLike;
  private java.lang.String fromRightLike;
  private java.lang.String fromLike;
  private java.lang.String fromNotEquals;
  private java.lang.String[] fromIns;
  private java.lang.String[] fromNotIns;
  /** 搜索时间 */
  private java.lang.Integer add_timeGreaterThan;
  private java.lang.Integer add_timeGreaterEqual;
  private java.lang.Integer add_timeLessEqual;
  private java.lang.Integer add_timeLessThan;
  private java.lang.Integer add_timeNotEquals;
  private java.lang.Integer[] add_timeIns;
  private java.lang.Integer[] add_timeNotIns;
  /**  */
  private java.lang.Integer user_idGreaterThan;
  private java.lang.Integer user_idGreaterEqual;
  private java.lang.Integer user_idLessEqual;
  private java.lang.Integer user_idLessThan;
  private java.lang.Integer user_idNotEquals;
  private java.lang.Integer[] user_idIns;
  private java.lang.Integer[] user_idNotIns;

  public SearchHistoryQuery() {
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

  public java.lang.String getFromLeftLike() {
    return fromLeftLike;
  }

  public void setFromLeftLike(java.lang.String fromLeftLike) {
    this.fromLeftLike = fromLeftLike;
  }

  public java.lang.String getFromRightLike() {
    return fromRightLike;
  }

  public void setFromRightLike(java.lang.String fromRightLike) {
    this.fromRightLike = fromRightLike;
  }

  public java.lang.String getFromLike() {
    return fromLike;
  }

  public void setFromLike(java.lang.String fromLike) {
    this.fromLike = fromLike;
  }

  public java.lang.String getFromNotEquals() {
    return fromNotEquals;
  }

  public void setFromNotEquals(java.lang.String fromNotEquals) {
    this.fromNotEquals = fromNotEquals;
  }

  public java.lang.String[] getFromIns() {
    return fromIns;
  }

  public void setFromIns(java.lang.String[] fromIns) {
    this.fromIns = fromIns;
  }

  public java.lang.String[] getFromNotIns() {
    return fromNotIns;
  }

  public void setFromNotIns(java.lang.String[] fromNotIns) {
    this.fromNotIns = fromNotIns;
  }

  public java.lang.Integer getAdd_timeGreaterThan() {
    return add_timeGreaterThan;
  }

  public void setadd_timeGreaterThan(java.lang.Integer add_timeGreaterThan) {
    this.add_timeGreaterThan = add_timeGreaterThan;
  }

  public java.lang.Integer getAdd_timeGreaterEqual() {
    return add_timeGreaterEqual;
  }

  public void setAdd_timeGreaterEqual(java.lang.Integer add_timeGreaterEqual) {
    this.add_timeGreaterEqual = add_timeGreaterEqual;
  }

  public java.lang.Integer getAdd_timeLessEqual() {
    return add_timeLessEqual;
  }

  public void setAdd_timeLessEqual(java.lang.Integer add_timeLessEqual) {
    this.add_timeLessEqual = add_timeLessEqual;
  }

  public java.lang.Integer getAdd_timeLessThan() {
    return add_timeLessThan;
  }

  public void setAdd_timeLessThan(java.lang.Integer add_timeLessThan) {
    this.add_timeLessThan = add_timeLessThan;
  }

  public java.lang.Integer getAdd_timeNotEquals() {
    return add_timeNotEquals;
  }

  public void setAdd_timeNotEquals(java.lang.Integer add_timeNotEquals) {
    this.add_timeNotEquals = add_timeNotEquals;
  }

  public java.lang.Integer[] getAdd_timeIns() {
    return add_timeIns;
  }

  public void setAdd_timeIns(java.lang.Integer[] add_timeIns) {
    this.add_timeIns = add_timeIns;
  }

  public java.lang.Integer[] getAdd_timeNotIns() {
    return add_timeNotIns;
  }

  public void setAdd_timeNotIns(java.lang.Integer[] add_timeNotIns) {
    this.add_timeNotIns = add_timeNotIns;
  }

  public java.lang.Integer getUser_idGreaterThan() {
    return user_idGreaterThan;
  }

  public void setuser_idGreaterThan(java.lang.Integer user_idGreaterThan) {
    this.user_idGreaterThan = user_idGreaterThan;
  }

  public java.lang.Integer getUser_idGreaterEqual() {
    return user_idGreaterEqual;
  }

  public void setUser_idGreaterEqual(java.lang.Integer user_idGreaterEqual) {
    this.user_idGreaterEqual = user_idGreaterEqual;
  }

  public java.lang.Integer getUser_idLessEqual() {
    return user_idLessEqual;
  }

  public void setUser_idLessEqual(java.lang.Integer user_idLessEqual) {
    this.user_idLessEqual = user_idLessEqual;
  }

  public java.lang.Integer getUser_idLessThan() {
    return user_idLessThan;
  }

  public void setUser_idLessThan(java.lang.Integer user_idLessThan) {
    this.user_idLessThan = user_idLessThan;
  }

  public java.lang.Integer getUser_idNotEquals() {
    return user_idNotEquals;
  }

  public void setUser_idNotEquals(java.lang.Integer user_idNotEquals) {
    this.user_idNotEquals = user_idNotEquals;
  }

  public java.lang.Integer[] getUser_idIns() {
    return user_idIns;
  }

  public void setUser_idIns(java.lang.Integer[] user_idIns) {
    this.user_idIns = user_idIns;
  }

  public java.lang.Integer[] getUser_idNotIns() {
    return user_idNotIns;
  }

  public void setUser_idNotIns(java.lang.Integer[] user_idNotIns) {
    this.user_idNotIns = user_idNotIns;
  }

}
