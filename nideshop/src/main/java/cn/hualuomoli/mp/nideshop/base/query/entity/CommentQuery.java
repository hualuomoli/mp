package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Comment;

// 
public class CommentQuery extends Comment {

  /**  */
  private java.lang.Integer type_idGreaterThan;
  private java.lang.Integer type_idGreaterEqual;
  private java.lang.Integer type_idLessEqual;
  private java.lang.Integer type_idLessThan;
  private java.lang.Integer type_idNotEquals;
  private java.lang.Integer[] type_idIns;
  private java.lang.Integer[] type_idNotIns;
  /**  */
  private java.lang.Integer value_idGreaterThan;
  private java.lang.Integer value_idGreaterEqual;
  private java.lang.Integer value_idLessEqual;
  private java.lang.Integer value_idLessThan;
  private java.lang.Integer value_idNotEquals;
  private java.lang.Integer[] value_idIns;
  private java.lang.Integer[] value_idNotIns;
  /** 储存为base64编码 */
  private java.lang.String contentLeftLike;
  private java.lang.String contentRightLike;
  private java.lang.String contentLike;
  private java.lang.String contentNotEquals;
  private java.lang.String[] contentIns;
  private java.lang.String[] contentNotIns;
  /**  */
  private java.lang.Integer add_timeGreaterThan;
  private java.lang.Integer add_timeGreaterEqual;
  private java.lang.Integer add_timeLessEqual;
  private java.lang.Integer add_timeLessThan;
  private java.lang.Integer add_timeNotEquals;
  private java.lang.Integer[] add_timeIns;
  private java.lang.Integer[] add_timeNotIns;
  /**  */
  private java.lang.Integer statusGreaterThan;
  private java.lang.Integer statusGreaterEqual;
  private java.lang.Integer statusLessEqual;
  private java.lang.Integer statusLessThan;
  private java.lang.Integer statusNotEquals;
  private java.lang.Integer[] statusIns;
  private java.lang.Integer[] statusNotIns;
  /**  */
  private java.lang.Integer user_idGreaterThan;
  private java.lang.Integer user_idGreaterEqual;
  private java.lang.Integer user_idLessEqual;
  private java.lang.Integer user_idLessThan;
  private java.lang.Integer user_idNotEquals;
  private java.lang.Integer[] user_idIns;
  private java.lang.Integer[] user_idNotIns;
  /**  */
  private java.lang.String new_contentLeftLike;
  private java.lang.String new_contentRightLike;
  private java.lang.String new_contentLike;
  private java.lang.String new_contentNotEquals;
  private java.lang.String[] new_contentIns;
  private java.lang.String[] new_contentNotIns;

  public CommentQuery() {
  }

  // getter and setter

  public java.lang.Integer getType_idGreaterThan() {
    return type_idGreaterThan;
  }

  public void settype_idGreaterThan(java.lang.Integer type_idGreaterThan) {
    this.type_idGreaterThan = type_idGreaterThan;
  }

  public java.lang.Integer getType_idGreaterEqual() {
    return type_idGreaterEqual;
  }

  public void setType_idGreaterEqual(java.lang.Integer type_idGreaterEqual) {
    this.type_idGreaterEqual = type_idGreaterEqual;
  }

  public java.lang.Integer getType_idLessEqual() {
    return type_idLessEqual;
  }

  public void setType_idLessEqual(java.lang.Integer type_idLessEqual) {
    this.type_idLessEqual = type_idLessEqual;
  }

  public java.lang.Integer getType_idLessThan() {
    return type_idLessThan;
  }

  public void setType_idLessThan(java.lang.Integer type_idLessThan) {
    this.type_idLessThan = type_idLessThan;
  }

  public java.lang.Integer getType_idNotEquals() {
    return type_idNotEquals;
  }

  public void setType_idNotEquals(java.lang.Integer type_idNotEquals) {
    this.type_idNotEquals = type_idNotEquals;
  }

  public java.lang.Integer[] getType_idIns() {
    return type_idIns;
  }

  public void setType_idIns(java.lang.Integer[] type_idIns) {
    this.type_idIns = type_idIns;
  }

  public java.lang.Integer[] getType_idNotIns() {
    return type_idNotIns;
  }

  public void setType_idNotIns(java.lang.Integer[] type_idNotIns) {
    this.type_idNotIns = type_idNotIns;
  }

  public java.lang.Integer getValue_idGreaterThan() {
    return value_idGreaterThan;
  }

  public void setvalue_idGreaterThan(java.lang.Integer value_idGreaterThan) {
    this.value_idGreaterThan = value_idGreaterThan;
  }

  public java.lang.Integer getValue_idGreaterEqual() {
    return value_idGreaterEqual;
  }

  public void setValue_idGreaterEqual(java.lang.Integer value_idGreaterEqual) {
    this.value_idGreaterEqual = value_idGreaterEqual;
  }

  public java.lang.Integer getValue_idLessEqual() {
    return value_idLessEqual;
  }

  public void setValue_idLessEqual(java.lang.Integer value_idLessEqual) {
    this.value_idLessEqual = value_idLessEqual;
  }

  public java.lang.Integer getValue_idLessThan() {
    return value_idLessThan;
  }

  public void setValue_idLessThan(java.lang.Integer value_idLessThan) {
    this.value_idLessThan = value_idLessThan;
  }

  public java.lang.Integer getValue_idNotEquals() {
    return value_idNotEquals;
  }

  public void setValue_idNotEquals(java.lang.Integer value_idNotEquals) {
    this.value_idNotEquals = value_idNotEquals;
  }

  public java.lang.Integer[] getValue_idIns() {
    return value_idIns;
  }

  public void setValue_idIns(java.lang.Integer[] value_idIns) {
    this.value_idIns = value_idIns;
  }

  public java.lang.Integer[] getValue_idNotIns() {
    return value_idNotIns;
  }

  public void setValue_idNotIns(java.lang.Integer[] value_idNotIns) {
    this.value_idNotIns = value_idNotIns;
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

  public java.lang.Integer getStatusGreaterThan() {
    return statusGreaterThan;
  }

  public void setstatusGreaterThan(java.lang.Integer statusGreaterThan) {
    this.statusGreaterThan = statusGreaterThan;
  }

  public java.lang.Integer getStatusGreaterEqual() {
    return statusGreaterEqual;
  }

  public void setStatusGreaterEqual(java.lang.Integer statusGreaterEqual) {
    this.statusGreaterEqual = statusGreaterEqual;
  }

  public java.lang.Integer getStatusLessEqual() {
    return statusLessEqual;
  }

  public void setStatusLessEqual(java.lang.Integer statusLessEqual) {
    this.statusLessEqual = statusLessEqual;
  }

  public java.lang.Integer getStatusLessThan() {
    return statusLessThan;
  }

  public void setStatusLessThan(java.lang.Integer statusLessThan) {
    this.statusLessThan = statusLessThan;
  }

  public java.lang.Integer getStatusNotEquals() {
    return statusNotEquals;
  }

  public void setStatusNotEquals(java.lang.Integer statusNotEquals) {
    this.statusNotEquals = statusNotEquals;
  }

  public java.lang.Integer[] getStatusIns() {
    return statusIns;
  }

  public void setStatusIns(java.lang.Integer[] statusIns) {
    this.statusIns = statusIns;
  }

  public java.lang.Integer[] getStatusNotIns() {
    return statusNotIns;
  }

  public void setStatusNotIns(java.lang.Integer[] statusNotIns) {
    this.statusNotIns = statusNotIns;
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

  public java.lang.String getNew_contentLeftLike() {
    return new_contentLeftLike;
  }

  public void setNew_contentLeftLike(java.lang.String new_contentLeftLike) {
    this.new_contentLeftLike = new_contentLeftLike;
  }

  public java.lang.String getNew_contentRightLike() {
    return new_contentRightLike;
  }

  public void setNew_contentRightLike(java.lang.String new_contentRightLike) {
    this.new_contentRightLike = new_contentRightLike;
  }

  public java.lang.String getNew_contentLike() {
    return new_contentLike;
  }

  public void setNew_contentLike(java.lang.String new_contentLike) {
    this.new_contentLike = new_contentLike;
  }

  public java.lang.String getNew_contentNotEquals() {
    return new_contentNotEquals;
  }

  public void setNew_contentNotEquals(java.lang.String new_contentNotEquals) {
    this.new_contentNotEquals = new_contentNotEquals;
  }

  public java.lang.String[] getNew_contentIns() {
    return new_contentIns;
  }

  public void setNew_contentIns(java.lang.String[] new_contentIns) {
    this.new_contentIns = new_contentIns;
  }

  public java.lang.String[] getNew_contentNotIns() {
    return new_contentNotIns;
  }

  public void setNew_contentNotIns(java.lang.String[] new_contentNotIns) {
    this.new_contentNotIns = new_contentNotIns;
  }

}
