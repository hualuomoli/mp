package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class GoodsAttribute {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer goods_id;
  /**  */
  private java.lang.Integer attribute_id;
  /**  */
  private java.lang.String value;

  public GoodsAttribute() {
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

  public java.lang.Integer getAttribute_id() {
    return this.attribute_id;
  }

  public void setAttribute_id(java.lang.Integer attribute_id) {
    this.attribute_id = attribute_id;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "GoodsAttribute [" //
        + "id=" + id //
        + ", goods_id=" + goods_id //
        + ", attribute_id=" + attribute_id //
        + ", value=" + value //
        + "]";
  }

}