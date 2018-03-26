package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class RelatedGoods {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer goods_id;
  /**  */
  private java.lang.Integer related_goods_id;

  public RelatedGoods() {
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

  public java.lang.Integer getRelated_goods_id() {
    return this.related_goods_id;
  }

  public void setRelated_goods_id(java.lang.Integer related_goods_id) {
    this.related_goods_id = related_goods_id;
  }

  @Override
  public String toString() {
    return "RelatedGoods [" //
        + "id=" + id //
        + ", goods_id=" + goods_id //
        + ", related_goods_id=" + related_goods_id //
        + "]";
  }

}