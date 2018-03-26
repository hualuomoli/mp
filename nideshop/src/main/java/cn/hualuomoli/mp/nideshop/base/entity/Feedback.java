package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Feedback {

  /**  */
  private java.lang.Integer msg_id;
  /**  */
  private java.lang.Integer parent_id;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.String user_name;
  /**  */
  private java.lang.String user_email;
  /**  */
  private java.lang.String msg_title;
  /**  */
  private java.lang.Integer msg_type;
  /**  */
  private java.lang.Integer msg_status;
  /**  */
  private java.lang.String msg_content;
  /**  */
  private java.lang.Integer msg_time;
  /**  */
  private java.lang.String message_img;
  /**  */
  private java.lang.Integer order_id;
  /**  */
  private java.lang.Integer msg_area;

  public Feedback() {
  }

  // getter and setter

  public java.lang.Integer getMsg_id() {
    return this.msg_id;
  }

  public void setMsg_id(java.lang.Integer msg_id) {
    this.msg_id = msg_id;
  }

  public java.lang.Integer getParent_id() {
    return this.parent_id;
  }

  public void setParent_id(java.lang.Integer parent_id) {
    this.parent_id = parent_id;
  }

  public java.lang.Integer getUser_id() {
    return this.user_id;
  }

  public void setUser_id(java.lang.Integer user_id) {
    this.user_id = user_id;
  }

  public java.lang.String getUser_name() {
    return this.user_name;
  }

  public void setUser_name(java.lang.String user_name) {
    this.user_name = user_name;
  }

  public java.lang.String getUser_email() {
    return this.user_email;
  }

  public void setUser_email(java.lang.String user_email) {
    this.user_email = user_email;
  }

  public java.lang.String getMsg_title() {
    return this.msg_title;
  }

  public void setMsg_title(java.lang.String msg_title) {
    this.msg_title = msg_title;
  }

  public java.lang.Integer getMsg_type() {
    return this.msg_type;
  }

  public void setMsg_type(java.lang.Integer msg_type) {
    this.msg_type = msg_type;
  }

  public java.lang.Integer getMsg_status() {
    return this.msg_status;
  }

  public void setMsg_status(java.lang.Integer msg_status) {
    this.msg_status = msg_status;
  }

  public java.lang.String getMsg_content() {
    return this.msg_content;
  }

  public void setMsg_content(java.lang.String msg_content) {
    this.msg_content = msg_content;
  }

  public java.lang.Integer getMsg_time() {
    return this.msg_time;
  }

  public void setMsg_time(java.lang.Integer msg_time) {
    this.msg_time = msg_time;
  }

  public java.lang.String getMessage_img() {
    return this.message_img;
  }

  public void setMessage_img(java.lang.String message_img) {
    this.message_img = message_img;
  }

  public java.lang.Integer getOrder_id() {
    return this.order_id;
  }

  public void setOrder_id(java.lang.Integer order_id) {
    this.order_id = order_id;
  }

  public java.lang.Integer getMsg_area() {
    return this.msg_area;
  }

  public void setMsg_area(java.lang.Integer msg_area) {
    this.msg_area = msg_area;
  }

  @Override
  public String toString() {
    return "Feedback [" //
        + "msg_id=" + msg_id //
        + ", parent_id=" + parent_id //
        + ", user_id=" + user_id //
        + ", user_name=" + user_name //
        + ", user_email=" + user_email //
        + ", msg_title=" + msg_title //
        + ", msg_type=" + msg_type //
        + ", msg_status=" + msg_status //
        + ", msg_content=" + msg_content //
        + ", msg_time=" + msg_time //
        + ", message_img=" + message_img //
        + ", order_id=" + order_id //
        + ", msg_area=" + msg_area //
        + "]";
  }

}