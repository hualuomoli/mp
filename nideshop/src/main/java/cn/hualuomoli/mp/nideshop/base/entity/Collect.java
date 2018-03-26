package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Collect {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.Integer value_id;
  /**  */
  private java.lang.Integer add_time;
  /** 是否是关注 */
  private java.lang.Integer is_attention;
  /**  */
  private java.lang.Integer type_id;

  public Collect() {
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

  public java.lang.Integer getValue_id() {
    return this.value_id;
  }

  public void setValue_id(java.lang.Integer value_id) {
    this.value_id = value_id;
  }

  public java.lang.Integer getAdd_time() {
    return this.add_time;
  }

  public void setAdd_time(java.lang.Integer add_time) {
    this.add_time = add_time;
  }

  public java.lang.Integer getIs_attention() {
    return this.is_attention;
  }

  public void setIs_attention(java.lang.Integer is_attention) {
    this.is_attention = is_attention;
  }

  public java.lang.Integer getType_id() {
    return this.type_id;
  }

  public void setType_id(java.lang.Integer type_id) {
    this.type_id = type_id;
  }

  @Override
  public String toString() {
    return "Collect [" //
        + "id=" + id //
        + ", user_id=" + user_id //
        + ", value_id=" + value_id //
        + ", add_time=" + add_time //
        + ", is_attention=" + is_attention //
        + ", type_id=" + type_id //
        + "]";
  }

}