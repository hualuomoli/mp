package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Product {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer goods_id;
  /**  */
  private java.lang.String goods_specification_ids;
  /**  */
  private java.lang.String goods_sn;
  /**  */
  private java.lang.Integer goods_number;
  /**  */
  private java.lang.Double retail_price;

  public Product() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getGoods_id() {
    return this.goods_id;
  }

  public void setGoods_id(java.lang.Integer goods_id) {
    this.goods_id = goods_id;
  }

  public java.lang.String getGoods_specification_ids() {
    return this.goods_specification_ids;
  }

  public void setGoods_specification_ids(java.lang.String goods_specification_ids) {
    this.goods_specification_ids = goods_specification_ids;
  }

  public java.lang.String getGoods_sn() {
    return this.goods_sn;
  }

  public void setGoods_sn(java.lang.String goods_sn) {
    this.goods_sn = goods_sn;
  }

  public java.lang.Integer getGoods_number() {
    return this.goods_number;
  }

  public void setGoods_number(java.lang.Integer goods_number) {
    this.goods_number = goods_number;
  }

  public java.lang.Double getRetail_price() {
    return this.retail_price;
  }

  public void setRetail_price(java.lang.Double retail_price) {
    this.retail_price = retail_price;
  }

  @Override
  public String toString() {
    return "Product [" //
        + "id=" + id //
        + ", goods_id=" + goods_id //
        + ", goods_specification_ids=" + goods_specification_ids //
        + ", goods_sn=" + goods_sn //
        + ", goods_number=" + goods_number //
        + ", retail_price=" + retail_price //
        + "]";
  }

}