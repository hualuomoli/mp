package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Cart {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.String session_id;
  /**  */
  private java.lang.Integer goods_id;
  /**  */
  private java.lang.String goods_sn;
  /**  */
  private java.lang.Integer product_id;
  /**  */
  private java.lang.String goods_name;
  /**  */
  private java.lang.Double market_price;
  /**  */
  private java.lang.Double retail_price;
  /**  */
  private java.lang.Integer number;
  /** 规格属性组成的字符串，用来显示用 */
  private java.lang.String goods_specifition_name_value;
  /** product表对应的goods_specifition_ids */
  private java.lang.String goods_specifition_ids;
  /**  */
  private java.lang.Integer checked;
  /**  */
  private java.lang.String list_pic_url;

  public Cart() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getUser_id() {
    return this.user_id;
  }

  public void setUser_id(java.lang.Integer user_id) {
    this.user_id = user_id;
  }

  public java.lang.String getSession_id() {
    return this.session_id;
  }

  public void setSession_id(java.lang.String session_id) {
    this.session_id = session_id;
  }

  public java.lang.Integer getGoods_id() {
    return this.goods_id;
  }

  public void setGoods_id(java.lang.Integer goods_id) {
    this.goods_id = goods_id;
  }

  public java.lang.String getGoods_sn() {
    return this.goods_sn;
  }

  public void setGoods_sn(java.lang.String goods_sn) {
    this.goods_sn = goods_sn;
  }

  public java.lang.Integer getProduct_id() {
    return this.product_id;
  }

  public void setProduct_id(java.lang.Integer product_id) {
    this.product_id = product_id;
  }

  public java.lang.String getGoods_name() {
    return this.goods_name;
  }

  public void setGoods_name(java.lang.String goods_name) {
    this.goods_name = goods_name;
  }

  public java.lang.Double getMarket_price() {
    return this.market_price;
  }

  public void setMarket_price(java.lang.Double market_price) {
    this.market_price = market_price;
  }

  public java.lang.Double getRetail_price() {
    return this.retail_price;
  }

  public void setRetail_price(java.lang.Double retail_price) {
    this.retail_price = retail_price;
  }

  public java.lang.Integer getNumber() {
    return this.number;
  }

  public void setNumber(java.lang.Integer number) {
    this.number = number;
  }

  public java.lang.String getGoods_specifition_name_value() {
    return this.goods_specifition_name_value;
  }

  public void setGoods_specifition_name_value(java.lang.String goods_specifition_name_value) {
    this.goods_specifition_name_value = goods_specifition_name_value;
  }

  public java.lang.String getGoods_specifition_ids() {
    return this.goods_specifition_ids;
  }

  public void setGoods_specifition_ids(java.lang.String goods_specifition_ids) {
    this.goods_specifition_ids = goods_specifition_ids;
  }

  public java.lang.Integer getChecked() {
    return this.checked;
  }

  public void setChecked(java.lang.Integer checked) {
    this.checked = checked;
  }

  public java.lang.String getList_pic_url() {
    return this.list_pic_url;
  }

  public void setList_pic_url(java.lang.String list_pic_url) {
    this.list_pic_url = list_pic_url;
  }

  @Override
  public String toString() {
    return "Cart [" //
        + "id=" + id //
        + ", user_id=" + user_id //
        + ", session_id=" + session_id //
        + ", goods_id=" + goods_id //
        + ", goods_sn=" + goods_sn //
        + ", product_id=" + product_id //
        + ", goods_name=" + goods_name //
        + ", market_price=" + market_price //
        + ", retail_price=" + retail_price //
        + ", number=" + number //
        + ", goods_specifition_name_value=" + goods_specifition_name_value //
        + ", goods_specifition_ids=" + goods_specifition_ids //
        + ", checked=" + checked //
        + ", list_pic_url=" + list_pic_url //
        + "]";
  }

}