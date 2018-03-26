package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class User {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String username;
  /**  */
  private java.lang.String password;
  /**  */
  private java.lang.Integer gender;
  /**  */
  private java.lang.Integer birthday;
  /**  */
  private java.lang.Integer register_time;
  /**  */
  private java.lang.Integer last_login_time;
  /**  */
  private java.lang.String last_login_ip;
  /**  */
  private java.lang.Integer user_level_id;
  /**  */
  private java.lang.String nickname;
  /**  */
  private java.lang.String mobile;
  /**  */
  private java.lang.String register_ip;
  /**  */
  private java.lang.String avatar;
  /**  */
  private java.lang.String weixin_openid;

  public User() {
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

  public java.lang.Integer getGender() {
    return this.gender;
  }

  public void setGender(java.lang.Integer gender) {
    this.gender = gender;
  }

  public java.lang.Integer getBirthday() {
    return this.birthday;
  }

  public void setBirthday(java.lang.Integer birthday) {
    this.birthday = birthday;
  }

  public java.lang.Integer getRegister_time() {
    return this.register_time;
  }

  public void setRegister_time(java.lang.Integer register_time) {
    this.register_time = register_time;
  }

  public java.lang.Integer getLast_login_time() {
    return this.last_login_time;
  }

  public void setLast_login_time(java.lang.Integer last_login_time) {
    this.last_login_time = last_login_time;
  }

  public java.lang.String getLast_login_ip() {
    return this.last_login_ip;
  }

  public void setLast_login_ip(java.lang.String last_login_ip) {
    this.last_login_ip = last_login_ip;
  }

  public java.lang.Integer getUser_level_id() {
    return this.user_level_id;
  }

  public void setUser_level_id(java.lang.Integer user_level_id) {
    this.user_level_id = user_level_id;
  }

  public java.lang.String getNickname() {
    return this.nickname;
  }

  public void setNickname(java.lang.String nickname) {
    this.nickname = nickname;
  }

  public java.lang.String getMobile() {
    return this.mobile;
  }

  public void setMobile(java.lang.String mobile) {
    this.mobile = mobile;
  }

  public java.lang.String getRegister_ip() {
    return this.register_ip;
  }

  public void setRegister_ip(java.lang.String register_ip) {
    this.register_ip = register_ip;
  }

  public java.lang.String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(java.lang.String avatar) {
    this.avatar = avatar;
  }

  public java.lang.String getWeixin_openid() {
    return this.weixin_openid;
  }

  public void setWeixin_openid(java.lang.String weixin_openid) {
    this.weixin_openid = weixin_openid;
  }

  @Override
  public String toString() {
    return "User [" //
        + "id=" + id //
        + ", username=" + username //
        + ", password=" + password //
        + ", gender=" + gender //
        + ", birthday=" + birthday //
        + ", register_time=" + register_time //
        + ", last_login_time=" + last_login_time //
        + ", last_login_ip=" + last_login_ip //
        + ", user_level_id=" + user_level_id //
        + ", nickname=" + nickname //
        + ", mobile=" + mobile //
        + ", register_ip=" + register_ip //
        + ", avatar=" + avatar //
        + ", weixin_openid=" + weixin_openid //
        + "]";
  }

}