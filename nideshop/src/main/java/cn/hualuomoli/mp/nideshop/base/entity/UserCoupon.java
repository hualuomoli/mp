package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class UserCoupon {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer coupon_id;
  /**  */
  private java.lang.String coupon_number;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.Integer used_time;
  /**  */
  private java.lang.Integer order_id;

  public UserCoupon() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getCoupon_id() {
    return this.coupon_id;
  }

  public void setCoupon_id(java.lang.Integer coupon_id) {
    this.coupon_id = coupon_id;
  }

  public java.lang.String getCoupon_number() {
    return this.coupon_number;
  }

  public void setCoupon_number(java.lang.String coupon_number) {
    this.coupon_number = coupon_number;
  }

  public java.lang.Integer getUser_id() {
    return this.user_id;
  }

  public void setUser_id(java.lang.Integer user_id) {
    this.user_id = user_id;
  }

  public java.lang.Integer getUsed_time() {
    return this.used_time;
  }

  public void setUsed_time(java.lang.Integer used_time) {
    this.used_time = used_time;
  }

  public java.lang.Integer getOrder_id() {
    return this.order_id;
  }

  public void setOrder_id(java.lang.Integer order_id) {
    this.order_id = order_id;
  }

  @Override
  public String toString() {
    return "UserCoupon [" //
        + "id=" + id //
        + ", coupon_id=" + coupon_id //
        + ", coupon_number=" + coupon_number //
        + ", user_id=" + user_id //
        + ", used_time=" + used_time //
        + ", order_id=" + order_id //
        + "]";
  }

}