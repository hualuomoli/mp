package cn.hualuomoli.mp.nideshop.base.entity;

// 商品对应规格表值表
public class GoodsSpecification {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer goods_id;
  /**  */
  private java.lang.Integer specification_id;
  /**  */
  private java.lang.String value;
  /**  */
  private java.lang.String pic_url;

  public GoodsSpecification() {
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

  public java.lang.Integer getSpecification_id() {
    return this.specification_id;
  }

  public void setSpecification_id(java.lang.Integer specification_id) {
    this.specification_id = specification_id;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public java.lang.String getPic_url() {
    return this.pic_url;
  }

  public void setPic_url(java.lang.String pic_url) {
    this.pic_url = pic_url;
  }

  @Override
  public String toString() {
    return "GoodsSpecification [" //
        + "id=" + id //
        + ", goods_id=" + goods_id //
        + ", specification_id=" + specification_id //
        + ", value=" + value //
        + ", pic_url=" + pic_url //
        + "]";
  }

}