package cn.hualuomoli.mp.nideshop.base.entity;

// 订单物流信息表，发货时生成
public class OrderExpress {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer order_id;
  /**  */
  private java.lang.Integer shipper_id;
  /** 物流公司名称 */
  private java.lang.String shipper_name;
  /** 物流公司代码 */
  private java.lang.String shipper_code;
  /** 快递单号 */
  private java.lang.String logistic_code;
  /** 物流跟踪信息 */
  private java.lang.String traces;
  /**  */
  private java.lang.Integer is_finish;
  /** 总查询次数 */
  private java.lang.Integer request_count;
  /** 最近一次向第三方查询物流信息时间 */
  private java.lang.Integer request_time;
  /** 添加时间 */
  private java.lang.Integer add_time;
  /** 更新时间 */
  private java.lang.Integer update_time;

  public OrderExpress() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getOrder_id() {
    return this.order_id;
  }

  public void setOrder_id(java.lang.Integer order_id) {
    this.order_id = order_id;
  }

  public java.lang.Integer getShipper_id() {
    return this.shipper_id;
  }

  public void setShipper_id(java.lang.Integer shipper_id) {
    this.shipper_id = shipper_id;
  }

  public java.lang.String getShipper_name() {
    return this.shipper_name;
  }

  public void setShipper_name(java.lang.String shipper_name) {
    this.shipper_name = shipper_name;
  }

  public java.lang.String getShipper_code() {
    return this.shipper_code;
  }

  public void setShipper_code(java.lang.String shipper_code) {
    this.shipper_code = shipper_code;
  }

  public java.lang.String getLogistic_code() {
    return this.logistic_code;
  }

  public void setLogistic_code(java.lang.String logistic_code) {
    this.logistic_code = logistic_code;
  }

  public java.lang.String getTraces() {
    return this.traces;
  }

  public void setTraces(java.lang.String traces) {
    this.traces = traces;
  }

  public java.lang.Integer getIs_finish() {
    return this.is_finish;
  }

  public void setIs_finish(java.lang.Integer is_finish) {
    this.is_finish = is_finish;
  }

  public java.lang.Integer getRequest_count() {
    return this.request_count;
  }

  public void setRequest_count(java.lang.Integer request_count) {
    this.request_count = request_count;
  }

  public java.lang.Integer getRequest_time() {
    return this.request_time;
  }

  public void setRequest_time(java.lang.Integer request_time) {
    this.request_time = request_time;
  }

  public java.lang.Integer getAdd_time() {
    return this.add_time;
  }

  public void setAdd_time(java.lang.Integer add_time) {
    this.add_time = add_time;
  }

  public java.lang.Integer getUpdate_time() {
    return this.update_time;
  }

  public void setUpdate_time(java.lang.Integer update_time) {
    this.update_time = update_time;
  }

  @Override
  public String toString() {
    return "OrderExpress [" //
        + "id=" + id //
        + ", order_id=" + order_id //
        + ", shipper_id=" + shipper_id //
        + ", shipper_name=" + shipper_name //
        + ", shipper_code=" + shipper_code //
        + ", logistic_code=" + logistic_code //
        + ", traces=" + traces //
        + ", is_finish=" + is_finish //
        + ", request_count=" + request_count //
        + ", request_time=" + request_time //
        + ", add_time=" + add_time //
        + ", update_time=" + update_time //
        + "]";
  }

}