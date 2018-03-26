package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Admin {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String username;
  /**  */
  private java.lang.String password;
  /**  */
  private java.lang.String password_salt;
  /**  */
  private java.lang.String last_login_ip;
  /**  */
  private java.lang.Integer last_login_time;
  /**  */
  private java.lang.Integer add_time;
  /**  */
  private java.lang.Integer update_time;
  /**  */
  private java.lang.String avatar;
  /**  */
  private java.lang.Integer admin_role_id;

  public Admin() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public void setUsername(java.lang.String username) {
    this.username = username;
  }

  public java.lang.String getPassword() {
    return this.password;
  }

  public void setPassword(java.lang.String password) {
    this.password = password;
  }

  public java.lang.String getPassword_salt() {
    return this.password_salt;
  }

  public void setPassword_salt(java.lang.String password_salt) {
    this.password_salt = password_salt;
  }

  public java.lang.String getLast_login_ip() {
    return this.last_login_ip;
  }

  public void setLast_login_ip(java.lang.String last_login_ip) {
    this.last_login_ip = last_login_ip;
  }

  public java.lang.Integer getLast_login_time() {
    return this.last_login_time;
  }

  public void setLast_login_time(java.lang.Integer last_login_time) {
    this.last_login_time = last_login_time;
  }

  public java.lang.Integer getAdd_time() {
    return this.add_time;
  }

  public void setAdd_time(java.lang.Integer add_time) {
    this.add_time = add_time;
  }

  public java.lang.Integer getUpdate_time() {
    return this.update_time;
  }

  public void setUpdate_time(java.lang.Integer update_time) {
    this.update_time = update_time;
  }

  public java.lang.String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(java.lang.String avatar) {
    this.avatar = avatar;
  }

  public java.lang.Integer getAdmin_role_id() {
    return this.admin_role_id;
  }

  public void setAdmin_role_id(java.lang.Integer admin_role_id) {
    this.admin_role_id = admin_role_id;
  }

  @Override
  public String toString() {
    return "Admin [" //
        + "id=" + id //
        + ", username=" + username //
        + ", password=" + password //
        + ", password_salt=" + password_salt //
        + ", last_login_ip=" + last_login_ip //
        + ", last_login_time=" + last_login_time //
        + ", add_time=" + add_time //
        + ", update_time=" + update_time //
        + ", avatar=" + avatar //
        + ", admin_role_id=" + admin_role_id //
        + "]";
  }

}