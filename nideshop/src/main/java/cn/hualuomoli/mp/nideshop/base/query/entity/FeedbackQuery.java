package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Feedback;

// 
public class FeedbackQuery extends Feedback {

  /**  */
  private java.lang.Integer parent_idGreaterThan;
  private java.lang.Integer parent_idGreaterEqual;
  private java.lang.Integer parent_idLessEqual;
  private java.lang.Integer parent_idLessThan;
  private java.lang.Integer parent_idNotEquals;
  private java.lang.Integer[] parent_idIns;
  private java.lang.Integer[] parent_idNotIns;
  /**  */
  private java.lang.Integer user_idGreaterThan;
  private java.lang.Integer user_idGreaterEqual;
  private java.lang.Integer user_idLessEqual;
  private java.lang.Integer user_idLessThan;
  private java.lang.Integer user_idNotEquals;
  private java.lang.Integer[] user_idIns;
  private java.lang.Integer[] user_idNotIns;
  /**  */
  private java.lang.String user_nameLeftLike;
  private java.lang.String user_nameRightLike;
  private java.lang.String user_nameLike;
  private java.lang.String user_nameNotEquals;
  private java.lang.String[] user_nameIns;
  private java.lang.String[] user_nameNotIns;
  /**  */
  private java.lang.String user_emailLeftLike;
  private java.lang.String user_emailRightLike;
  private java.lang.String user_emailLike;
  private java.lang.String user_emailNotEquals;
  private java.lang.String[] user_emailIns;
  private java.lang.String[] user_emailNotIns;
  /**  */
  private java.lang.String msg_titleLeftLike;
  private java.lang.String msg_titleRightLike;
  private java.lang.String msg_titleLike;
  private java.lang.String msg_titleNotEquals;
  private java.lang.String[] msg_titleIns;
  private java.lang.String[] msg_titleNotIns;
  /**  */
  private java.lang.Integer msg_typeGreaterThan;
  private java.lang.Integer msg_typeGreaterEqual;
  private java.lang.Integer msg_typeLessEqual;
  private java.lang.Integer msg_typeLessThan;
  private java.lang.Integer msg_typeNotEquals;
  private java.lang.Integer[] msg_typeIns;
  private java.lang.Integer[] msg_typeNotIns;
  /**  */
  private java.lang.Integer msg_statusGreaterThan;
  private java.lang.Integer msg_statusGreaterEqual;
  private java.lang.Integer msg_statusLessEqual;
  private java.lang.Integer msg_statusLessThan;
  private java.lang.Integer msg_statusNotEquals;
  private java.lang.Integer[] msg_statusIns;
  private java.lang.Integer[] msg_statusNotIns;
  /**  */
  private java.lang.String msg_contentLeftLike;
  private java.lang.String msg_contentRightLike;
  private java.lang.String msg_contentLike;
  private java.lang.String msg_contentNotEquals;
  private java.lang.String[] msg_contentIns;
  private java.lang.String[] msg_contentNotIns;
  /**  */
  private java.lang.Integer msg_timeGreaterThan;
  private java.lang.Integer msg_timeGreaterEqual;
  private java.lang.Integer msg_timeLessEqual;
  private java.lang.Integer msg_timeLessThan;
  private java.lang.Integer msg_timeNotEquals;
  private java.lang.Integer[] msg_timeIns;
  private java.lang.Integer[] msg_timeNotIns;
  /**  */
  private java.lang.String message_imgLeftLike;
  private java.lang.String message_imgRightLike;
  private java.lang.String message_imgLike;
  private java.lang.String message_imgNotEquals;
  private java.lang.String[] message_imgIns;
  private java.lang.String[] message_imgNotIns;
  /**  */
  private java.lang.Integer order_idGreaterThan;
  private java.lang.Integer order_idGreaterEqual;
  private java.lang.Integer order_idLessEqual;
  private java.lang.Integer order_idLessThan;
  private java.lang.Integer order_idNotEquals;
  private java.lang.Integer[] order_idIns;
  private java.lang.Integer[] order_idNotIns;
  /**  */
  private java.lang.Integer msg_areaGreaterThan;
  private java.lang.Integer msg_areaGreaterEqual;
  private java.lang.Integer msg_areaLessEqual;
  private java.lang.Integer msg_areaLessThan;
  private java.lang.Integer msg_areaNotEquals;
  private java.lang.Integer[] msg_areaIns;
  private java.lang.Integer[] msg_areaNotIns;

  public FeedbackQuery() {
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

  public java.lang.String getUser_nameLeftLike() {
    return user_nameLeftLike;
  }

  public void setUser_nameLeftLike(java.lang.String user_nameLeftLike) {
    this.user_nameLeftLike = user_nameLeftLike;
  }

  public java.lang.String getUser_nameRightLike() {
    return user_nameRightLike;
  }

  public void setUser_nameRightLike(java.lang.String user_nameRightLike) {
    this.user_nameRightLike = user_nameRightLike;
  }

  public java.lang.String getUser_nameLike() {
    return user_nameLike;
  }

  public void setUser_nameLike(java.lang.String user_nameLike) {
    this.user_nameLike = user_nameLike;
  }

  public java.lang.String getUser_nameNotEquals() {
    return user_nameNotEquals;
  }

  public void setUser_nameNotEquals(java.lang.String user_nameNotEquals) {
    this.user_nameNotEquals = user_nameNotEquals;
  }

  public java.lang.String[] getUser_nameIns() {
    return user_nameIns;
  }

  public void setUser_nameIns(java.lang.String[] user_nameIns) {
    this.user_nameIns = user_nameIns;
  }

  public java.lang.String[] getUser_nameNotIns() {
    return user_nameNotIns;
  }

  public void setUser_nameNotIns(java.lang.String[] user_nameNotIns) {
    this.user_nameNotIns = user_nameNotIns;
  }

  public java.lang.String getUser_emailLeftLike() {
    return user_emailLeftLike;
  }

  public void setUser_emailLeftLike(java.lang.String user_emailLeftLike) {
    this.user_emailLeftLike = user_emailLeftLike;
  }

  public java.lang.String getUser_emailRightLike() {
    return user_emailRightLike;
  }

  public void setUser_emailRightLike(java.lang.String user_emailRightLike) {
    this.user_emailRightLike = user_emailRightLike;
  }

  public java.lang.String getUser_emailLike() {
    return user_emailLike;
  }

  public void setUser_emailLike(java.lang.String user_emailLike) {
    this.user_emailLike = user_emailLike;
  }

  public java.lang.String getUser_emailNotEquals() {
    return user_emailNotEquals;
  }

  public void setUser_emailNotEquals(java.lang.String user_emailNotEquals) {
    this.user_emailNotEquals = user_emailNotEquals;
  }

  public java.lang.String[] getUser_emailIns() {
    return user_emailIns;
  }

  public void setUser_emailIns(java.lang.String[] user_emailIns) {
    this.user_emailIns = user_emailIns;
  }

  public java.lang.String[] getUser_emailNotIns() {
    return user_emailNotIns;
  }

  public void setUser_emailNotIns(java.lang.String[] user_emailNotIns) {
    this.user_emailNotIns = user_emailNotIns;
  }

  public java.lang.String getMsg_titleLeftLike() {
    return msg_titleLeftLike;
  }

  public void setMsg_titleLeftLike(java.lang.String msg_titleLeftLike) {
    this.msg_titleLeftLike = msg_titleLeftLike;
  }

  public java.lang.String getMsg_titleRightLike() {
    return msg_titleRightLike;
  }

  public void setMsg_titleRightLike(java.lang.String msg_titleRightLike) {
    this.msg_titleRightLike = msg_titleRightLike;
  }

  public java.lang.String getMsg_titleLike() {
    return msg_titleLike;
  }

  public void setMsg_titleLike(java.lang.String msg_titleLike) {
    this.msg_titleLike = msg_titleLike;
  }

  public java.lang.String getMsg_titleNotEquals() {
    return msg_titleNotEquals;
  }

  public void setMsg_titleNotEquals(java.lang.String msg_titleNotEquals) {
    this.msg_titleNotEquals = msg_titleNotEquals;
  }

  public java.lang.String[] getMsg_titleIns() {
    return msg_titleIns;
  }

  public void setMsg_titleIns(java.lang.String[] msg_titleIns) {
    this.msg_titleIns = msg_titleIns;
  }

  public java.lang.String[] getMsg_titleNotIns() {
    return msg_titleNotIns;
  }

  public void setMsg_titleNotIns(java.lang.String[] msg_titleNotIns) {
    this.msg_titleNotIns = msg_titleNotIns;
  }

  public java.lang.Integer getMsg_typeGreaterThan() {
    return msg_typeGreaterThan;
  }

  public void setmsg_typeGreaterThan(java.lang.Integer msg_typeGreaterThan) {
    this.msg_typeGreaterThan = msg_typeGreaterThan;
  }

  public java.lang.Integer getMsg_typeGreaterEqual() {
    return msg_typeGreaterEqual;
  }

  public void setMsg_typeGreaterEqual(java.lang.Integer msg_typeGreaterEqual) {
    this.msg_typeGreaterEqual = msg_typeGreaterEqual;
  }

  public java.lang.Integer getMsg_typeLessEqual() {
    return msg_typeLessEqual;
  }

  public void setMsg_typeLessEqual(java.lang.Integer msg_typeLessEqual) {
    this.msg_typeLessEqual = msg_typeLessEqual;
  }

  public java.lang.Integer getMsg_typeLessThan() {
    return msg_typeLessThan;
  }

  public void setMsg_typeLessThan(java.lang.Integer msg_typeLessThan) {
    this.msg_typeLessThan = msg_typeLessThan;
  }

  public java.lang.Integer getMsg_typeNotEquals() {
    return msg_typeNotEquals;
  }

  public void setMsg_typeNotEquals(java.lang.Integer msg_typeNotEquals) {
    this.msg_typeNotEquals = msg_typeNotEquals;
  }

  public java.lang.Integer[] getMsg_typeIns() {
    return msg_typeIns;
  }

  public void setMsg_typeIns(java.lang.Integer[] msg_typeIns) {
    this.msg_typeIns = msg_typeIns;
  }

  public java.lang.Integer[] getMsg_typeNotIns() {
    return msg_typeNotIns;
  }

  public void setMsg_typeNotIns(java.lang.Integer[] msg_typeNotIns) {
    this.msg_typeNotIns = msg_typeNotIns;
  }

  public java.lang.Integer getMsg_statusGreaterThan() {
    return msg_statusGreaterThan;
  }

  public void setmsg_statusGreaterThan(java.lang.Integer msg_statusGreaterThan) {
    this.msg_statusGreaterThan = msg_statusGreaterThan;
  }

  public java.lang.Integer getMsg_statusGreaterEqual() {
    return msg_statusGreaterEqual;
  }

  public void setMsg_statusGreaterEqual(java.lang.Integer msg_statusGreaterEqual) {
    this.msg_statusGreaterEqual = msg_statusGreaterEqual;
  }

  public java.lang.Integer getMsg_statusLessEqual() {
    return msg_statusLessEqual;
  }

  public void setMsg_statusLessEqual(java.lang.Integer msg_statusLessEqual) {
    this.msg_statusLessEqual = msg_statusLessEqual;
  }

  public java.lang.Integer getMsg_statusLessThan() {
    return msg_statusLessThan;
  }

  public void setMsg_statusLessThan(java.lang.Integer msg_statusLessThan) {
    this.msg_statusLessThan = msg_statusLessThan;
  }

  public java.lang.Integer getMsg_statusNotEquals() {
    return msg_statusNotEquals;
  }

  public void setMsg_statusNotEquals(java.lang.Integer msg_statusNotEquals) {
    this.msg_statusNotEquals = msg_statusNotEquals;
  }

  public java.lang.Integer[] getMsg_statusIns() {
    return msg_statusIns;
  }

  public void setMsg_statusIns(java.lang.Integer[] msg_statusIns) {
    this.msg_statusIns = msg_statusIns;
  }

  public java.lang.Integer[] getMsg_statusNotIns() {
    return msg_statusNotIns;
  }

  public void setMsg_statusNotIns(java.lang.Integer[] msg_statusNotIns) {
    this.msg_statusNotIns = msg_statusNotIns;
  }

  public java.lang.String getMsg_contentLeftLike() {
    return msg_contentLeftLike;
  }

  public void setMsg_contentLeftLike(java.lang.String msg_contentLeftLike) {
    this.msg_contentLeftLike = msg_contentLeftLike;
  }

  public java.lang.String getMsg_contentRightLike() {
    return msg_contentRightLike;
  }

  public void setMsg_contentRightLike(java.lang.String msg_contentRightLike) {
    this.msg_contentRightLike = msg_contentRightLike;
  }

  public java.lang.String getMsg_contentLike() {
    return msg_contentLike;
  }

  public void setMsg_contentLike(java.lang.String msg_contentLike) {
    this.msg_contentLike = msg_contentLike;
  }

  public java.lang.String getMsg_contentNotEquals() {
    return msg_contentNotEquals;
  }

  public void setMsg_contentNotEquals(java.lang.String msg_contentNotEquals) {
    this.msg_contentNotEquals = msg_contentNotEquals;
  }

  public java.lang.String[] getMsg_contentIns() {
    return msg_contentIns;
  }

  public void setMsg_contentIns(java.lang.String[] msg_contentIns) {
    this.msg_contentIns = msg_contentIns;
  }

  public java.lang.String[] getMsg_contentNotIns() {
    return msg_contentNotIns;
  }

  public void setMsg_contentNotIns(java.lang.String[] msg_contentNotIns) {
    this.msg_contentNotIns = msg_contentNotIns;
  }

  public java.lang.Integer getMsg_timeGreaterThan() {
    return msg_timeGreaterThan;
  }

  public void setmsg_timeGreaterThan(java.lang.Integer msg_timeGreaterThan) {
    this.msg_timeGreaterThan = msg_timeGreaterThan;
  }

  public java.lang.Integer getMsg_timeGreaterEqual() {
    return msg_timeGreaterEqual;
  }

  public void setMsg_timeGreaterEqual(java.lang.Integer msg_timeGreaterEqual) {
    this.msg_timeGreaterEqual = msg_timeGreaterEqual;
  }

  public java.lang.Integer getMsg_timeLessEqual() {
    return msg_timeLessEqual;
  }

  public void setMsg_timeLessEqual(java.lang.Integer msg_timeLessEqual) {
    this.msg_timeLessEqual = msg_timeLessEqual;
  }

  public java.lang.Integer getMsg_timeLessThan() {
    return msg_timeLessThan;
  }

  public void setMsg_timeLessThan(java.lang.Integer msg_timeLessThan) {
    this.msg_timeLessThan = msg_timeLessThan;
  }

  public java.lang.Integer getMsg_timeNotEquals() {
    return msg_timeNotEquals;
  }

  public void setMsg_timeNotEquals(java.lang.Integer msg_timeNotEquals) {
    this.msg_timeNotEquals = msg_timeNotEquals;
  }

  public java.lang.Integer[] getMsg_timeIns() {
    return msg_timeIns;
  }

  public void setMsg_timeIns(java.lang.Integer[] msg_timeIns) {
    this.msg_timeIns = msg_timeIns;
  }

  public java.lang.Integer[] getMsg_timeNotIns() {
    return msg_timeNotIns;
  }

  public void setMsg_timeNotIns(java.lang.Integer[] msg_timeNotIns) {
    this.msg_timeNotIns = msg_timeNotIns;
  }

  public java.lang.String getMessage_imgLeftLike() {
    return message_imgLeftLike;
  }

  public void setMessage_imgLeftLike(java.lang.String message_imgLeftLike) {
    this.message_imgLeftLike = message_imgLeftLike;
  }

  public java.lang.String getMessage_imgRightLike() {
    return message_imgRightLike;
  }

  public void setMessage_imgRightLike(java.lang.String message_imgRightLike) {
    this.message_imgRightLike = message_imgRightLike;
  }

  public java.lang.String getMessage_imgLike() {
    return message_imgLike;
  }

  public void setMessage_imgLike(java.lang.String message_imgLike) {
    this.message_imgLike = message_imgLike;
  }

  public java.lang.String getMessage_imgNotEquals() {
    return message_imgNotEquals;
  }

  public void setMessage_imgNotEquals(java.lang.String message_imgNotEquals) {
    this.message_imgNotEquals = message_imgNotEquals;
  }

  public java.lang.String[] getMessage_imgIns() {
    return message_imgIns;
  }

  public void setMessage_imgIns(java.lang.String[] message_imgIns) {
    this.message_imgIns = message_imgIns;
  }

  public java.lang.String[] getMessage_imgNotIns() {
    return message_imgNotIns;
  }

  public void setMessage_imgNotIns(java.lang.String[] message_imgNotIns) {
    this.message_imgNotIns = message_imgNotIns;
  }

  public java.lang.Integer getOrder_idGreaterThan() {
    return order_idGreaterThan;
  }

  public void setorder_idGreaterThan(java.lang.Integer order_idGreaterThan) {
    this.order_idGreaterThan = order_idGreaterThan;
  }

  public java.lang.Integer getOrder_idGreaterEqual() {
    return order_idGreaterEqual;
  }

  public void setOrder_idGreaterEqual(java.lang.Integer order_idGreaterEqual) {
    this.order_idGreaterEqual = order_idGreaterEqual;
  }

  public java.lang.Integer getOrder_idLessEqual() {
    return order_idLessEqual;
  }

  public void setOrder_idLessEqual(java.lang.Integer order_idLessEqual) {
    this.order_idLessEqual = order_idLessEqual;
  }

  public java.lang.Integer getOrder_idLessThan() {
    return order_idLessThan;
  }

  public void setOrder_idLessThan(java.lang.Integer order_idLessThan) {
    this.order_idLessThan = order_idLessThan;
  }

  public java.lang.Integer getOrder_idNotEquals() {
    return order_idNotEquals;
  }

  public void setOrder_idNotEquals(java.lang.Integer order_idNotEquals) {
    this.order_idNotEquals = order_idNotEquals;
  }

  public java.lang.Integer[] getOrder_idIns() {
    return order_idIns;
  }

  public void setOrder_idIns(java.lang.Integer[] order_idIns) {
    this.order_idIns = order_idIns;
  }

  public java.lang.Integer[] getOrder_idNotIns() {
    return order_idNotIns;
  }

  public void setOrder_idNotIns(java.lang.Integer[] order_idNotIns) {
    this.order_idNotIns = order_idNotIns;
  }

  public java.lang.Integer getMsg_areaGreaterThan() {
    return msg_areaGreaterThan;
  }

  public void setmsg_areaGreaterThan(java.lang.Integer msg_areaGreaterThan) {
    this.msg_areaGreaterThan = msg_areaGreaterThan;
  }

  public java.lang.Integer getMsg_areaGreaterEqual() {
    return msg_areaGreaterEqual;
  }

  public void setMsg_areaGreaterEqual(java.lang.Integer msg_areaGreaterEqual) {
    this.msg_areaGreaterEqual = msg_areaGreaterEqual;
  }

  public java.lang.Integer getMsg_areaLessEqual() {
    return msg_areaLessEqual;
  }

  public void setMsg_areaLessEqual(java.lang.Integer msg_areaLessEqual) {
    this.msg_areaLessEqual = msg_areaLessEqual;
  }

  public java.lang.Integer getMsg_areaLessThan() {
    return msg_areaLessThan;
  }

  public void setMsg_areaLessThan(java.lang.Integer msg_areaLessThan) {
    this.msg_areaLessThan = msg_areaLessThan;
  }

  public java.lang.Integer getMsg_areaNotEquals() {
    return msg_areaNotEquals;
  }

  public void setMsg_areaNotEquals(java.lang.Integer msg_areaNotEquals) {
    this.msg_areaNotEquals = msg_areaNotEquals;
  }

  public java.lang.Integer[] getMsg_areaIns() {
    return msg_areaIns;
  }

  public void setMsg_areaIns(java.lang.Integer[] msg_areaIns) {
    this.msg_areaIns = msg_areaIns;
  }

  public java.lang.Integer[] getMsg_areaNotIns() {
    return msg_areaNotIns;
  }

  public void setMsg_areaNotIns(java.lang.Integer[] msg_areaNotIns) {
    this.msg_areaNotIns = msg_areaNotIns;
  }

}
