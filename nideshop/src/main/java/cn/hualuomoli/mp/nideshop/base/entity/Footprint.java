package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Footprint {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.Integer goods_id;
  /**  */
  private java.lang.Integer add_time;

  public Footprint() {
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

  public java.lang.Integer getGoods_id() {
    return this.goods_id;
  }

  public void setGoods_id(java.lang.Integer goods_id) {
    this.goods_id = goods_id;
  }

  public java.lang.Integer getAdd_time() {
    return this.add_time;
  }

  public void setAdd_time(java.lang.Integer add_time) {
    this.add_time = add_time;
  }

  @Override
  public String toString() {
    return "Footprint [" //
        + "id=" + id //
        + ", user_id=" + user_id //
        + ", goods_id=" + goods_id //
        + ", add_time=" + add_time //
        + "]";
  }

}