package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Coupon {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.Double type_money;
  /**  */
  private java.lang.Integer send_type;
  /**  */
  private java.lang.Double min_amount;
  /**  */
  private java.lang.Double max_amount;
  /**  */
  private java.lang.Integer send_start_date;
  /**  */
  private java.lang.Integer send_end_date;
  /**  */
  private java.lang.Integer use_start_date;
  /**  */
  private java.lang.Integer use_end_date;
  /**  */
  private java.lang.Double min_goods_amount;

  public Coupon() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.Double getType_money() {
    return this.type_money;
  }

  public void setType_money(java.lang.Double type_money) {
    this.type_money = type_money;
  }

  public java.lang.Integer getSend_type() {
    return this.send_type;
  }

  public void setSend_type(java.lang.Integer send_type) {
    this.send_type = send_type;
  }

  public java.lang.Double getMin_amount() {
    return this.min_amount;
  }

  public void setMin_amount(java.lang.Double min_amount) {
    this.min_amount = min_amount;
  }

  public java.lang.Double getMax_amount() {
    return this.max_amount;
  }

  public void setMax_amount(java.lang.Double max_amount) {
    this.max_amount = max_amount;
  }

  public java.lang.Integer getSend_start_date() {
    return this.send_start_date;
  }

  public void setSend_start_date(java.lang.Integer send_start_date) {
    this.send_start_date = send_start_date;
  }

  public java.lang.Integer getSend_end_date() {
    return this.send_end_date;
  }

  public void setSend_end_date(java.lang.Integer send_end_date) {
    this.send_end_date = send_end_date;
  }

  public java.lang.Integer getUse_start_date() {
    return this.use_start_date;
  }

  public void setUse_start_date(java.lang.Integer use_start_date) {
    this.use_start_date = use_start_date;
  }

  public java.lang.Integer getUse_end_date() {
    return this.use_end_date;
  }

  public void setUse_end_date(java.lang.Integer use_end_date) {
    this.use_end_date = use_end_date;
  }

  public java.lang.Double getMin_goods_amount() {
    return this.min_goods_amount;
  }

  public void setMin_goods_amount(java.lang.Double min_goods_amount) {
    this.min_goods_amount = min_goods_amount;
  }

  @Override
  public String toString() {
    return "Coupon [" //
        + "id=" + id //
        + ", name=" + name //
        + ", type_money=" + type_money //
        + ", send_type=" + send_type //
        + ", min_amount=" + min_amount //
        + ", max_amount=" + max_amount //
        + ", send_start_date=" + send_start_date //
        + ", send_end_date=" + send_end_date //
        + ", use_start_date=" + use_start_date //
        + ", use_end_date=" + use_end_date //
        + ", min_goods_amount=" + min_goods_amount //
        + "]";
  }

}