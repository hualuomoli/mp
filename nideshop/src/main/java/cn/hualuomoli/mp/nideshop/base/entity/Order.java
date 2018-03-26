package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Order {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String order_sn;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.Integer order_status;
  /**  */
  private java.lang.Integer shipping_status;
  /**  */
  private java.lang.Integer pay_status;
  /**  */
  private java.lang.String consignee;
  /**  */
  private java.lang.Integer country;
  /**  */
  private java.lang.Integer province;
  /**  */
  private java.lang.Integer city;
  /**  */
  private java.lang.Integer district;
  /**  */
  private java.lang.String address;
  /**  */
  private java.lang.String mobile;
  /**  */
  private java.lang.String postscript;
  /**  */
  private java.lang.Double shipping_fee;
  /**  */
  private java.lang.String pay_name;
  /**  */
  private java.lang.Integer pay_id;
  /** 实际需要支付的金额 */
  private java.lang.Double actual_price;
  /**  */
  private java.lang.Integer integral;
  /**  */
  private java.lang.Double integral_money;
  /** 订单总价 */
  private java.lang.Double order_price;
  /** 商品总价 */
  private java.lang.Double goods_price;
  /**  */
  private java.lang.Integer add_time;
  /**  */
  private java.lang.Integer confirm_time;
  /**  */
  private java.lang.Integer pay_time;
  /** 配送费用 */
  private java.lang.Integer freight_price;
  /** 使用的优惠券id */
  private java.lang.Integer coupon_id;
  /**  */
  private java.lang.Integer parent_id;
  /**  */
  private java.lang.Double coupon_price;
  /**  */
  private java.lang.String callback_status;

  public Order() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getOrder_sn() {
    return this.order_sn;
  }

  public void setOrder_sn(java.lang.String order_sn) {
    this.order_sn = order_sn;
  }

  public java.lang.Integer getUser_id() {
    return this.user_id;
  }

  public void setUser_id(java.lang.Integer user_id) {
    this.user_id = user_id;
  }

  public java.lang.Integer getOrder_status() {
    return this.order_status;
  }

  public void setOrder_status(java.lang.Integer order_status) {
    this.order_status = order_status;
  }

  public java.lang.Integer getShipping_status() {
    return this.shipping_status;
  }

  public void setShipping_status(java.lang.Integer shipping_status) {
    this.shipping_status = shipping_status;
  }

  public java.lang.Integer getPay_status() {
    return this.pay_status;
  }

  public void setPay_status(java.lang.Integer pay_status) {
    this.pay_status = pay_status;
  }

  public java.lang.String getConsignee() {
    return this.consignee;
  }

  public void setConsignee(java.lang.String consignee) {
    this.consignee = consignee;
  }

  public java.lang.Integer getCountry() {
    return this.country;
  }

  public void setCountry(java.lang.Integer country) {
    this.country = country;
  }

  public java.lang.Integer getProvince() {
    return this.province;
  }

  public void setProvince(java.lang.Integer province) {
    this.province = province;
  }

  public java.lang.Integer getCity() {
    return this.city;
  }

  public void setCity(java.lang.Integer city) {
    this.city = city;
  }

  public java.lang.Integer getDistrict() {
    return this.district;
  }

  public void setDistrict(java.lang.Integer district) {
    this.district = district;
  }

  public java.lang.String getAddress() {
    return this.address;
  }

  public void setAddress(java.lang.String address) {
    this.address = address;
  }

  public java.lang.String getMobile() {
    return this.mobile;
  }

  public void setMobile(java.lang.String mobile) {
    this.mobile = mobile;
  }

  public java.lang.String getPostscript() {
    return this.postscript;
  }

  public void setPostscript(java.lang.String postscript) {
    this.postscript = postscript;
  }

  public java.lang.Double getShipping_fee() {
    return this.shipping_fee;
  }

  public void setShipping_fee(java.lang.Double shipping_fee) {
    this.shipping_fee = shipping_fee;
  }

  public java.lang.String getPay_name() {
    return this.pay_name;
  }

  public void setPay_name(java.lang.String pay_name) {
    this.pay_name = pay_name;
  }

  public java.lang.Integer getPay_id() {
    return this.pay_id;
  }

  public void setPay_id(java.lang.Integer pay_id) {
    this.pay_id = pay_id;
  }

  public java.lang.Double getActual_price() {
    return this.actual_price;
  }

  public void setActual_price(java.lang.Double actual_price) {
    this.actual_price = actual_price;
  }

  public java.lang.Integer getIntegral() {
    return this.integral;
  }

  public void setIntegral(java.lang.Integer integral) {
    this.integral = integral;
  }

  public java.lang.Double getIntegral_money() {
    return this.integral_money;
  }

  public void setIntegral_money(java.lang.Double integral_money) {
    this.integral_money = integral_money;
  }

  public java.lang.Double getOrder_price() {
    return this.order_price;
  }

  public void setOrder_price(java.lang.Double order_price) {
    this.order_price = order_price;
  }

  public java.lang.Double getGoods_price() {
    return this.goods_price;
  }

  public void setGoods_price(java.lang.Double goods_price) {
    this.goods_price = goods_price;
  }

  public java.lang.Integer getAdd_time() {
    return this.add_time;
  }

  public void setAdd_time(java.lang.Integer add_time) {
    this.add_time = add_time;
  }

  public java.lang.Integer getConfirm_time() {
    return this.confirm_time;
  }

  public void setConfirm_time(java.lang.Integer confirm_time) {
    this.confirm_time = confirm_time;
  }

  public java.lang.Integer getPay_time() {
    return this.pay_time;
  }

  public void setPay_time(java.lang.Integer pay_time) {
    this.pay_time = pay_time;
  }

  public java.lang.Integer getFreight_price() {
    return this.freight_price;
  }

  public void setFreight_price(java.lang.Integer freight_price) {
    this.freight_price = freight_price;
  }

  public java.lang.Integer getCoupon_id() {
    return this.coupon_id;
  }

  public void setCoupon_id(java.lang.Integer coupon_id) {
    this.coupon_id = coupon_id;
  }

  public java.lang.Integer getParent_id() {
    return this.parent_id;
  }

  public void setParent_id(java.lang.Integer parent_id) {
    this.parent_id = parent_id;
  }

  public java.lang.Double getCoupon_price() {
    return this.coupon_price;
  }

  public void setCoupon_price(java.lang.Double coupon_price) {
    this.coupon_price = coupon_price;
  }

  public java.lang.String getCallback_status() {
    return this.callback_status;
  }

  public void setCallback_status(java.lang.String callback_status) {
    this.callback_status = callback_status;
  }

  @Override
  public String toString() {
    return "Order [" //
        + "id=" + id //
        + ", order_sn=" + order_sn //
        + ", user_id=" + user_id //
        + ", order_status=" + order_status //
        + ", shipping_status=" + shipping_status //
        + ", pay_status=" + pay_status //
        + ", consignee=" + consignee //
        + ", country=" + country //
        + ", province=" + province //
        + ", city=" + city //
        + ", district=" + district //
        + ", address=" + address //
        + ", mobile=" + mobile //
        + ", postscript=" + postscript //
        + ", shipping_fee=" + shipping_fee //
        + ", pay_name=" + pay_name //
        + ", pay_id=" + pay_id //
        + ", actual_price=" + actual_price //
        + ", integral=" + integral //
        + ", integral_money=" + integral_money //
        + ", order_price=" + order_price //
        + ", goods_price=" + goods_price //
        + ", add_time=" + add_time //
        + ", confirm_time=" + confirm_time //
        + ", pay_time=" + pay_time //
        + ", freight_price=" + freight_price //
        + ", coupon_id=" + coupon_id //
        + ", parent_id=" + parent_id //
        + ", coupon_price=" + coupon_price //
        + ", callback_status=" + callback_status //
        + "]";
  }

}