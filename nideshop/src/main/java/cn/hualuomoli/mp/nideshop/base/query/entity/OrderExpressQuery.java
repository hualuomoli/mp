package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.OrderExpress;

// 订单物流信息表，发货时生成
public class OrderExpressQuery extends OrderExpress {

  /**  */
  private java.lang.Integer order_idGreaterThan;
  private java.lang.Integer order_idGreaterEqual;
  private java.lang.Integer order_idLessEqual;
  private java.lang.Integer order_idLessThan;
  private java.lang.Integer order_idNotEquals;
  private java.lang.Integer[] order_idIns;
  private java.lang.Integer[] order_idNotIns;
  /**  */
  private java.lang.Integer shipper_idGreaterThan;
  private java.lang.Integer shipper_idGreaterEqual;
  private java.lang.Integer shipper_idLessEqual;
  private java.lang.Integer shipper_idLessThan;
  private java.lang.Integer shipper_idNotEquals;
  private java.lang.Integer[] shipper_idIns;
  private java.lang.Integer[] shipper_idNotIns;
  /** 物流公司名称 */
  private java.lang.String shipper_nameLeftLike;
  private java.lang.String shipper_nameRightLike;
  private java.lang.String shipper_nameLike;
  private java.lang.String shipper_nameNotEquals;
  private java.lang.String[] shipper_nameIns;
  private java.lang.String[] shipper_nameNotIns;
  /** 物流公司代码 */
  private java.lang.String shipper_codeLeftLike;
  private java.lang.String shipper_codeRightLike;
  private java.lang.String shipper_codeLike;
  private java.lang.String shipper_codeNotEquals;
  private java.lang.String[] shipper_codeIns;
  private java.lang.String[] shipper_codeNotIns;
  /** 快递单号 */
  private java.lang.String logistic_codeLeftLike;
  private java.lang.String logistic_codeRightLike;
  private java.lang.String logistic_codeLike;
  private java.lang.String logistic_codeNotEquals;
  private java.lang.String[] logistic_codeIns;
  private java.lang.String[] logistic_codeNotIns;
  /** 物流跟踪信息 */
  private java.lang.String tracesLeftLike;
  private java.lang.String tracesRightLike;
  private java.lang.String tracesLike;
  private java.lang.String tracesNotEquals;
  private java.lang.String[] tracesIns;
  private java.lang.String[] tracesNotIns;
  /**  */
  private java.lang.Integer is_finishGreaterThan;
  private java.lang.Integer is_finishGreaterEqual;
  private java.lang.Integer is_finishLessEqual;
  private java.lang.Integer is_finishLessThan;
  private java.lang.Integer is_finishNotEquals;
  private java.lang.Integer[] is_finishIns;
  private java.lang.Integer[] is_finishNotIns;
  /** 总查询次数 */
  private java.lang.Integer request_countGreaterThan;
  private java.lang.Integer request_countGreaterEqual;
  private java.lang.Integer request_countLessEqual;
  private java.lang.Integer request_countLessThan;
  private java.lang.Integer request_countNotEquals;
  private java.lang.Integer[] request_countIns;
  private java.lang.Integer[] request_countNotIns;
  /** 最近一次向第三方查询物流信息时间 */
  private java.lang.Integer request_timeGreaterThan;
  private java.lang.Integer request_timeGreaterEqual;
  private java.lang.Integer request_timeLessEqual;
  private java.lang.Integer request_timeLessThan;
  private java.lang.Integer request_timeNotEquals;
  private java.lang.Integer[] request_timeIns;
  private java.lang.Integer[] request_timeNotIns;
  /** 添加时间 */
  private java.lang.Integer add_timeGreaterThan;
  private java.lang.Integer add_timeGreaterEqual;
  private java.lang.Integer add_timeLessEqual;
  private java.lang.Integer add_timeLessThan;
  private java.lang.Integer add_timeNotEquals;
  private java.lang.Integer[] add_timeIns;
  private java.lang.Integer[] add_timeNotIns;
  /** 更新时间 */
  private java.lang.Integer update_timeGreaterThan;
  private java.lang.Integer update_timeGreaterEqual;
  private java.lang.Integer update_timeLessEqual;
  private java.lang.Integer update_timeLessThan;
  private java.lang.Integer update_timeNotEquals;
  private java.lang.Integer[] update_timeIns;
  private java.lang.Integer[] update_timeNotIns;

  public OrderExpressQuery() {
  }

  // getter and setter

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

  public java.lang.Integer getShipper_idGreaterThan() {
    return shipper_idGreaterThan;
  }

  public void setshipper_idGreaterThan(java.lang.Integer shipper_idGreaterThan) {
    this.shipper_idGreaterThan = shipper_idGreaterThan;
  }

  public java.lang.Integer getShipper_idGreaterEqual() {
    return shipper_idGreaterEqual;
  }

  public void setShipper_idGreaterEqual(java.lang.Integer shipper_idGreaterEqual) {
    this.shipper_idGreaterEqual = shipper_idGreaterEqual;
  }

  public java.lang.Integer getShipper_idLessEqual() {
    return shipper_idLessEqual;
  }

  public void setShipper_idLessEqual(java.lang.Integer shipper_idLessEqual) {
    this.shipper_idLessEqual = shipper_idLessEqual;
  }

  public java.lang.Integer getShipper_idLessThan() {
    return shipper_idLessThan;
  }

  public void setShipper_idLessThan(java.lang.Integer shipper_idLessThan) {
    this.shipper_idLessThan = shipper_idLessThan;
  }

  public java.lang.Integer getShipper_idNotEquals() {
    return shipper_idNotEquals;
  }

  public void setShipper_idNotEquals(java.lang.Integer shipper_idNotEquals) {
    this.shipper_idNotEquals = shipper_idNotEquals;
  }

  public java.lang.Integer[] getShipper_idIns() {
    return shipper_idIns;
  }

  public void setShipper_idIns(java.lang.Integer[] shipper_idIns) {
    this.shipper_idIns = shipper_idIns;
  }

  public java.lang.Integer[] getShipper_idNotIns() {
    return shipper_idNotIns;
  }

  public void setShipper_idNotIns(java.lang.Integer[] shipper_idNotIns) {
    this.shipper_idNotIns = shipper_idNotIns;
  }

  public java.lang.String getShipper_nameLeftLike() {
    return shipper_nameLeftLike;
  }

  public void setShipper_nameLeftLike(java.lang.String shipper_nameLeftLike) {
    this.shipper_nameLeftLike = shipper_nameLeftLike;
  }

  public java.lang.String getShipper_nameRightLike() {
    return shipper_nameRightLike;
  }

  public void setShipper_nameRightLike(java.lang.String shipper_nameRightLike) {
    this.shipper_nameRightLike = shipper_nameRightLike;
  }

  public java.lang.String getShipper_nameLike() {
    return shipper_nameLike;
  }

  public void setShipper_nameLike(java.lang.String shipper_nameLike) {
    this.shipper_nameLike = shipper_nameLike;
  }

  public java.lang.String getShipper_nameNotEquals() {
    return shipper_nameNotEquals;
  }

  public void setShipper_nameNotEquals(java.lang.String shipper_nameNotEquals) {
    this.shipper_nameNotEquals = shipper_nameNotEquals;
  }

  public java.lang.String[] getShipper_nameIns() {
    return shipper_nameIns;
  }

  public void setShipper_nameIns(java.lang.String[] shipper_nameIns) {
    this.shipper_nameIns = shipper_nameIns;
  }

  public java.lang.String[] getShipper_nameNotIns() {
    return shipper_nameNotIns;
  }

  public void setShipper_nameNotIns(java.lang.String[] shipper_nameNotIns) {
    this.shipper_nameNotIns = shipper_nameNotIns;
  }

  public java.lang.String getShipper_codeLeftLike() {
    return shipper_codeLeftLike;
  }

  public void setShipper_codeLeftLike(java.lang.String shipper_codeLeftLike) {
    this.shipper_codeLeftLike = shipper_codeLeftLike;
  }

  public java.lang.String getShipper_codeRightLike() {
    return shipper_codeRightLike;
  }

  public void setShipper_codeRightLike(java.lang.String shipper_codeRightLike) {
    this.shipper_codeRightLike = shipper_codeRightLike;
  }

  public java.lang.String getShipper_codeLike() {
    return shipper_codeLike;
  }

  public void setShipper_codeLike(java.lang.String shipper_codeLike) {
    this.shipper_codeLike = shipper_codeLike;
  }

  public java.lang.String getShipper_codeNotEquals() {
    return shipper_codeNotEquals;
  }

  public void setShipper_codeNotEquals(java.lang.String shipper_codeNotEquals) {
    this.shipper_codeNotEquals = shipper_codeNotEquals;
  }

  public java.lang.String[] getShipper_codeIns() {
    return shipper_codeIns;
  }

  public void setShipper_codeIns(java.lang.String[] shipper_codeIns) {
    this.shipper_codeIns = shipper_codeIns;
  }

  public java.lang.String[] getShipper_codeNotIns() {
    return shipper_codeNotIns;
  }

  public void setShipper_codeNotIns(java.lang.String[] shipper_codeNotIns) {
    this.shipper_codeNotIns = shipper_codeNotIns;
  }

  public java.lang.String getLogistic_codeLeftLike() {
    return logistic_codeLeftLike;
  }

  public void setLogistic_codeLeftLike(java.lang.String logistic_codeLeftLike) {
    this.logistic_codeLeftLike = logistic_codeLeftLike;
  }

  public java.lang.String getLogistic_codeRightLike() {
    return logistic_codeRightLike;
  }

  public void setLogistic_codeRightLike(java.lang.String logistic_codeRightLike) {
    this.logistic_codeRightLike = logistic_codeRightLike;
  }

  public java.lang.String getLogistic_codeLike() {
    return logistic_codeLike;
  }

  public void setLogistic_codeLike(java.lang.String logistic_codeLike) {
    this.logistic_codeLike = logistic_codeLike;
  }

  public java.lang.String getLogistic_codeNotEquals() {
    return logistic_codeNotEquals;
  }

  public void setLogistic_codeNotEquals(java.lang.String logistic_codeNotEquals) {
    this.logistic_codeNotEquals = logistic_codeNotEquals;
  }

  public java.lang.String[] getLogistic_codeIns() {
    return logistic_codeIns;
  }

  public void setLogistic_codeIns(java.lang.String[] logistic_codeIns) {
    this.logistic_codeIns = logistic_codeIns;
  }

  public java.lang.String[] getLogistic_codeNotIns() {
    return logistic_codeNotIns;
  }

  public void setLogistic_codeNotIns(java.lang.String[] logistic_codeNotIns) {
    this.logistic_codeNotIns = logistic_codeNotIns;
  }

  public java.lang.String getTracesLeftLike() {
    return tracesLeftLike;
  }

  public void setTracesLeftLike(java.lang.String tracesLeftLike) {
    this.tracesLeftLike = tracesLeftLike;
  }

  public java.lang.String getTracesRightLike() {
    return tracesRightLike;
  }

  public void setTracesRightLike(java.lang.String tracesRightLike) {
    this.tracesRightLike = tracesRightLike;
  }

  public java.lang.String getTracesLike() {
    return tracesLike;
  }

  public void setTracesLike(java.lang.String tracesLike) {
    this.tracesLike = tracesLike;
  }

  public java.lang.String getTracesNotEquals() {
    return tracesNotEquals;
  }

  public void setTracesNotEquals(java.lang.String tracesNotEquals) {
    this.tracesNotEquals = tracesNotEquals;
  }

  public java.lang.String[] getTracesIns() {
    return tracesIns;
  }

  public void setTracesIns(java.lang.String[] tracesIns) {
    this.tracesIns = tracesIns;
  }

  public java.lang.String[] getTracesNotIns() {
    return tracesNotIns;
  }

  public void setTracesNotIns(java.lang.String[] tracesNotIns) {
    this.tracesNotIns = tracesNotIns;
  }

  public java.lang.Integer getIs_finishGreaterThan() {
    return is_finishGreaterThan;
  }

  public void setis_finishGreaterThan(java.lang.Integer is_finishGreaterThan) {
    this.is_finishGreaterThan = is_finishGreaterThan;
  }

  public java.lang.Integer getIs_finishGreaterEqual() {
    return is_finishGreaterEqual;
  }

  public void setIs_finishGreaterEqual(java.lang.Integer is_finishGreaterEqual) {
    this.is_finishGreaterEqual = is_finishGreaterEqual;
  }

  public java.lang.Integer getIs_finishLessEqual() {
    return is_finishLessEqual;
  }

  public void setIs_finishLessEqual(java.lang.Integer is_finishLessEqual) {
    this.is_finishLessEqual = is_finishLessEqual;
  }

  public java.lang.Integer getIs_finishLessThan() {
    return is_finishLessThan;
  }

  public void setIs_finishLessThan(java.lang.Integer is_finishLessThan) {
    this.is_finishLessThan = is_finishLessThan;
  }

  public java.lang.Integer getIs_finishNotEquals() {
    return is_finishNotEquals;
  }

  public void setIs_finishNotEquals(java.lang.Integer is_finishNotEquals) {
    this.is_finishNotEquals = is_finishNotEquals;
  }

  public java.lang.Integer[] getIs_finishIns() {
    return is_finishIns;
  }

  public void setIs_finishIns(java.lang.Integer[] is_finishIns) {
    this.is_finishIns = is_finishIns;
  }

  public java.lang.Integer[] getIs_finishNotIns() {
    return is_finishNotIns;
  }

  public void setIs_finishNotIns(java.lang.Integer[] is_finishNotIns) {
    this.is_finishNotIns = is_finishNotIns;
  }

  public java.lang.Integer getRequest_countGreaterThan() {
    return request_countGreaterThan;
  }

  public void setrequest_countGreaterThan(java.lang.Integer request_countGreaterThan) {
    this.request_countGreaterThan = request_countGreaterThan;
  }

  public java.lang.Integer getRequest_countGreaterEqual() {
    return request_countGreaterEqual;
  }

  public void setRequest_countGreaterEqual(java.lang.Integer request_countGreaterEqual) {
    this.request_countGreaterEqual = request_countGreaterEqual;
  }

  public java.lang.Integer getRequest_countLessEqual() {
    return request_countLessEqual;
  }

  public void setRequest_countLessEqual(java.lang.Integer request_countLessEqual) {
    this.request_countLessEqual = request_countLessEqual;
  }

  public java.lang.Integer getRequest_countLessThan() {
    return request_countLessThan;
  }

  public void setRequest_countLessThan(java.lang.Integer request_countLessThan) {
    this.request_countLessThan = request_countLessThan;
  }

  public java.lang.Integer getRequest_countNotEquals() {
    return request_countNotEquals;
  }

  public void setRequest_countNotEquals(java.lang.Integer request_countNotEquals) {
    this.request_countNotEquals = request_countNotEquals;
  }

  public java.lang.Integer[] getRequest_countIns() {
    return request_countIns;
  }

  public void setRequest_countIns(java.lang.Integer[] request_countIns) {
    this.request_countIns = request_countIns;
  }

  public java.lang.Integer[] getRequest_countNotIns() {
    return request_countNotIns;
  }

  public void setRequest_countNotIns(java.lang.Integer[] request_countNotIns) {
    this.request_countNotIns = request_countNotIns;
  }

  public java.lang.Integer getRequest_timeGreaterThan() {
    return request_timeGreaterThan;
  }

  public void setrequest_timeGreaterThan(java.lang.Integer request_timeGreaterThan) {
    this.request_timeGreaterThan = request_timeGreaterThan;
  }

  public java.lang.Integer getRequest_timeGreaterEqual() {
    return request_timeGreaterEqual;
  }

  public void setRequest_timeGreaterEqual(java.lang.Integer request_timeGreaterEqual) {
    this.request_timeGreaterEqual = request_timeGreaterEqual;
  }

  public java.lang.Integer getRequest_timeLessEqual() {
    return request_timeLessEqual;
  }

  public void setRequest_timeLessEqual(java.lang.Integer request_timeLessEqual) {
    this.request_timeLessEqual = request_timeLessEqual;
  }

  public java.lang.Integer getRequest_timeLessThan() {
    return request_timeLessThan;
  }

  public void setRequest_timeLessThan(java.lang.Integer request_timeLessThan) {
    this.request_timeLessThan = request_timeLessThan;
  }

  public java.lang.Integer getRequest_timeNotEquals() {
    return request_timeNotEquals;
  }

  public void setRequest_timeNotEquals(java.lang.Integer request_timeNotEquals) {
    this.request_timeNotEquals = request_timeNotEquals;
  }

  public java.lang.Integer[] getRequest_timeIns() {
    return request_timeIns;
  }

  public void setRequest_timeIns(java.lang.Integer[] request_timeIns) {
    this.request_timeIns = request_timeIns;
  }

  public java.lang.Integer[] getRequest_timeNotIns() {
    return request_timeNotIns;
  }

  public void setRequest_timeNotIns(java.lang.Integer[] request_timeNotIns) {
    this.request_timeNotIns = request_timeNotIns;
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

  public java.lang.Integer getUpdate_timeGreaterThan() {
    return update_timeGreaterThan;
  }

  public void setupdate_timeGreaterThan(java.lang.Integer update_timeGreaterThan) {
    this.update_timeGreaterThan = update_timeGreaterThan;
  }

  public java.lang.Integer getUpdate_timeGreaterEqual() {
    return update_timeGreaterEqual;
  }

  public void setUpdate_timeGreaterEqual(java.lang.Integer update_timeGreaterEqual) {
    this.update_timeGreaterEqual = update_timeGreaterEqual;
  }

  public java.lang.Integer getUpdate_timeLessEqual() {
    return update_timeLessEqual;
  }

  public void setUpdate_timeLessEqual(java.lang.Integer update_timeLessEqual) {
    this.update_timeLessEqual = update_timeLessEqual;
  }

  public java.lang.Integer getUpdate_timeLessThan() {
    return update_timeLessThan;
  }

  public void setUpdate_timeLessThan(java.lang.Integer update_timeLessThan) {
    this.update_timeLessThan = update_timeLessThan;
  }

  public java.lang.Integer getUpdate_timeNotEquals() {
    return update_timeNotEquals;
  }

  public void setUpdate_timeNotEquals(java.lang.Integer update_timeNotEquals) {
    this.update_timeNotEquals = update_timeNotEquals;
  }

  public java.lang.Integer[] getUpdate_timeIns() {
    return update_timeIns;
  }

  public void setUpdate_timeIns(java.lang.Integer[] update_timeIns) {
    this.update_timeIns = update_timeIns;
  }

  public java.lang.Integer[] getUpdate_timeNotIns() {
    return update_timeNotIns;
  }

  public void setUpdate_timeNotIns(java.lang.Integer[] update_timeNotIns) {
    this.update_timeNotIns = update_timeNotIns;
  }

}
