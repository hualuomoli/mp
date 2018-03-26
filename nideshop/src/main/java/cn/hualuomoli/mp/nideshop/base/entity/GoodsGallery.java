package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class GoodsGallery {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer goods_id;
  /**  */
  private java.lang.String img_url;
  /**  */
  private java.lang.String img_desc;
  /**  */
  private java.lang.Integer sort_order;

  public GoodsGallery() {
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

  public java.lang.String getImg_url() {
    return this.img_url;
  }

  public void setImg_url(java.lang.String img_url) {
    this.img_url = img_url;
  }

  public java.lang.String getImg_desc() {
    return this.img_desc;
  }

  public void setImg_desc(java.lang.String img_desc) {
    this.img_desc = img_desc;
  }

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  @Override
  public String toString() {
    return "GoodsGallery [" //
        + "id=" + id //
        + ", goods_id=" + goods_id //
        + ", img_url=" + img_url //
        + ", img_desc=" + img_desc //
        + ", sort_order=" + sort_order //
        + "]";
  }

}