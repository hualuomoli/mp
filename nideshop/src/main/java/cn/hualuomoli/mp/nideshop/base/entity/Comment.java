package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Comment {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer type_id;
  /**  */
  private java.lang.Integer value_id;
  /** 储存为base64编码 */
  private java.lang.String content;
  /**  */
  private java.lang.Integer add_time;
  /**  */
  private java.lang.Integer status;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.String new_content;

  public Comment() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getType_id() {
    return this.type_id;
  }

  public void setType_id(java.lang.Integer type_id) {
    this.type_id = type_id;
  }

  public java.lang.Integer getValue_id() {
    return this.value_id;
  }

  public void setValue_id(java.lang.Integer value_id) {
    this.value_id = value_id;
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public java.lang.Integer getAdd_time() {
    return this.add_time;
  }

  public void setAdd_time(java.lang.Integer add_time) {
    this.add_time = add_time;
  }

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }

  public java.lang.Integer getUser_id() {
    return this.user_id;
  }

  public void setUser_id(java.lang.Integer user_id) {
    this.user_id = user_id;
  }

  public java.lang.String getNew_content() {
    return this.new_content;
  }

  public void setNew_content(java.lang.String new_content) {
    this.new_content = new_content;
  }

  @Override
  public String toString() {
    return "Comment [" //
        + "id=" + id //
        + ", type_id=" + type_id //
        + ", value_id=" + value_id //
        + ", content=" + content //
        + ", add_time=" + add_time //
        + ", status=" + status //
        + ", user_id=" + user_id //
        + ", new_content=" + new_content //
        + "]";
  }

}