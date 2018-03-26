package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Admin;

// 
public class AdminQuery extends Admin {

  /**  */
  private java.lang.String usernameLeftLike;
  private java.lang.String usernameRightLike;
  private java.lang.String usernameLike;
  private java.lang.String usernameNotEquals;
  private java.lang.String[] usernameIns;
  private java.lang.String[] usernameNotIns;
  /**  */
  private java.lang.String passwordLeftLike;
  private java.lang.String passwordRightLike;
  private java.lang.String passwordLike;
  private java.lang.String passwordNotEquals;
  private java.lang.String[] passwordIns;
  private java.lang.String[] passwordNotIns;
  /**  */
  private java.lang.String password_saltLeftLike;
  private java.lang.String password_saltRightLike;
  private java.lang.String password_saltLike;
  private java.lang.String password_saltNotEquals;
  private java.lang.String[] password_saltIns;
  private java.lang.String[] password_saltNotIns;
  /**  */
  private java.lang.String last_login_ipLeftLike;
  private java.lang.String last_login_ipRightLike;
  private java.lang.String last_login_ipLike;
  private java.lang.String last_login_ipNotEquals;
  private java.lang.String[] last_login_ipIns;
  private java.lang.String[] last_login_ipNotIns;
  /**  */
  private java.lang.Integer last_login_timeGreaterThan;
  private java.lang.Integer last_login_timeGreaterEqual;
  private java.lang.Integer last_login_timeLessEqual;
  private java.lang.Integer last_login_timeLessThan;
  private java.lang.Integer last_login_timeNotEquals;
  private java.lang.Integer[] last_login_timeIns;
  private java.lang.Integer[] last_login_timeNotIns;
  /**  */
  private java.lang.Integer add_timeGreaterThan;
  private java.lang.Integer add_timeGreaterEqual;
  private java.lang.Integer add_timeLessEqual;
  private java.lang.Integer add_timeLessThan;
  private java.lang.Integer add_timeNotEquals;
  private java.lang.Integer[] add_timeIns;
  private java.lang.Integer[] add_timeNotIns;
  /**  */
  private java.lang.Integer update_timeGreaterThan;
  private java.lang.Integer update_timeGreaterEqual;
  private java.lang.Integer update_timeLessEqual;
  private java.lang.Integer update_timeLessThan;
  private java.lang.Integer update_timeNotEquals;
  private java.lang.Integer[] update_timeIns;
  private java.lang.Integer[] update_timeNotIns;
  /**  */
  private java.lang.String avatarLeftLike;
  private java.lang.String avatarRightLike;
  private java.lang.String avatarLike;
  private java.lang.String avatarNotEquals;
  private java.lang.String[] avatarIns;
  private java.lang.String[] avatarNotIns;
  /**  */
  private java.lang.Integer admin_role_idGreaterThan;
  private java.lang.Integer admin_role_idGreaterEqual;
  private java.lang.Integer admin_role_idLessEqual;
  private java.lang.Integer admin_role_idLessThan;
  private java.lang.Integer admin_role_idNotEquals;
  private java.lang.Integer[] admin_role_idIns;
  private java.lang.Integer[] admin_role_idNotIns;

  public AdminQuery() {
  }

  // getter and setter

  public java.lang.String getUsernameLeftLike() {
    return usernameLeftLike;
  }

  public void setUsernameLeftLike(java.lang.String usernameLeftLike) {
    this.usernameLeftLike = usernameLeftLike;
  }

  public java.lang.String getUsernameRightLike() {
    return usernameRightLike;
  }

  public void setUsernameRightLike(java.lang.String usernameRightLike) {
    this.usernameRightLike = usernameRightLike;
  }

  public java.lang.String getUsernameLike() {
    return usernameLike;
  }

  public void setUsernameLike(java.lang.String usernameLike) {
    this.usernameLike = usernameLike;
  }

  public java.lang.String getUsernameNotEquals() {
    return usernameNotEquals;
  }

  public void setUsernameNotEquals(java.lang.String usernameNotEquals) {
    this.usernameNotEquals = usernameNotEquals;
  }

  public java.lang.String[] getUsernameIns() {
    return usernameIns;
  }

  public void setUsernameIns(java.lang.String[] usernameIns) {
    this.usernameIns = usernameIns;
  }

  public java.lang.String[] getUsernameNotIns() {
    return usernameNotIns;
  }

  public void setUsernameNotIns(java.lang.String[] usernameNotIns) {
    this.usernameNotIns = usernameNotIns;
  }

  public java.lang.String getPasswordLeftLike() {
    return passwordLeftLike;
  }

  public void setPasswordLeftLike(java.lang.String passwordLeftLike) {
    this.passwordLeftLike = passwordLeftLike;
  }

  public java.lang.String getPasswordRightLike() {
    return passwordRightLike;
  }

  public void setPasswordRightLike(java.lang.String passwordRightLike) {
    this.passwordRightLike = passwordRightLike;
  }

  public java.lang.String getPasswordLike() {
    return passwordLike;
  }

  public void setPasswordLike(java.lang.String passwordLike) {
    this.passwordLike = passwordLike;
  }

  public java.lang.String getPasswordNotEquals() {
    return passwordNotEquals;
  }

  public void setPasswordNotEquals(java.lang.String passwordNotEquals) {
    this.passwordNotEquals = passwordNotEquals;
  }

  public java.lang.String[] getPasswordIns() {
    return passwordIns;
  }

  public void setPasswordIns(java.lang.String[] passwordIns) {
    this.passwordIns = passwordIns;
  }

  public java.lang.String[] getPasswordNotIns() {
    return passwordNotIns;
  }

  public void setPasswordNotIns(java.lang.String[] passwordNotIns) {
    this.passwordNotIns = passwordNotIns;
  }

  public java.lang.String getPassword_saltLeftLike() {
    return password_saltLeftLike;
  }

  public void setPassword_saltLeftLike(java.lang.String password_saltLeftLike) {
    this.password_saltLeftLike = password_saltLeftLike;
  }

  public java.lang.String getPassword_saltRightLike() {
    return password_saltRightLike;
  }

  public void setPassword_saltRightLike(java.lang.String password_saltRightLike) {
    this.password_saltRightLike = password_saltRightLike;
  }

  public java.lang.String getPassword_saltLike() {
    return password_saltLike;
  }

  public void setPassword_saltLike(java.lang.String password_saltLike) {
    this.password_saltLike = password_saltLike;
  }

  public java.lang.String getPassword_saltNotEquals() {
    return password_saltNotEquals;
  }

  public void setPassword_saltNotEquals(java.lang.String password_saltNotEquals) {
    this.password_saltNotEquals = password_saltNotEquals;
  }

  public java.lang.String[] getPassword_saltIns() {
    return password_saltIns;
  }

  public void setPassword_saltIns(java.lang.String[] password_saltIns) {
    this.password_saltIns = password_saltIns;
  }

  public java.lang.String[] getPassword_saltNotIns() {
    return password_saltNotIns;
  }

  public void setPassword_saltNotIns(java.lang.String[] password_saltNotIns) {
    this.password_saltNotIns = password_saltNotIns;
  }

  public java.lang.String getLast_login_ipLeftLike() {
    return last_login_ipLeftLike;
  }

  public void setLast_login_ipLeftLike(java.lang.String last_login_ipLeftLike) {
    this.last_login_ipLeftLike = last_login_ipLeftLike;
  }

  public java.lang.String getLast_login_ipRightLike() {
    return last_login_ipRightLike;
  }

  public void setLast_login_ipRightLike(java.lang.String last_login_ipRightLike) {
    this.last_login_ipRightLike = last_login_ipRightLike;
  }

  public java.lang.String getLast_login_ipLike() {
    return last_login_ipLike;
  }

  public void setLast_login_ipLike(java.lang.String last_login_ipLike) {
    this.last_login_ipLike = last_login_ipLike;
  }

  public java.lang.String getLast_login_ipNotEquals() {
    return last_login_ipNotEquals;
  }

  public void setLast_login_ipNotEquals(java.lang.String last_login_ipNotEquals) {
    this.last_login_ipNotEquals = last_login_ipNotEquals;
  }

  public java.lang.String[] getLast_login_ipIns() {
    return last_login_ipIns;
  }

  public void setLast_login_ipIns(java.lang.String[] last_login_ipIns) {
    this.last_login_ipIns = last_login_ipIns;
  }

  public java.lang.String[] getLast_login_ipNotIns() {
    return last_login_ipNotIns;
  }

  public void setLast_login_ipNotIns(java.lang.String[] last_login_ipNotIns) {
    this.last_login_ipNotIns = last_login_ipNotIns;
  }

  public java.lang.Integer getLast_login_timeGreaterThan() {
    return last_login_timeGreaterThan;
  }

  public void setlast_login_timeGreaterThan(java.lang.Integer last_login_timeGreaterThan) {
    this.last_login_timeGreaterThan = last_login_timeGreaterThan;
  }

  public java.lang.Integer getLast_login_timeGreaterEqual() {
    return last_login_timeGreaterEqual;
  }

  public void setLast_login_timeGreaterEqual(java.lang.Integer last_login_timeGreaterEqual) {
    this.last_login_timeGreaterEqual = last_login_timeGreaterEqual;
  }

  public java.lang.Integer getLast_login_timeLessEqual() {
    return last_login_timeLessEqual;
  }

  public void setLast_login_timeLessEqual(java.lang.Integer last_login_timeLessEqual) {
    this.last_login_timeLessEqual = last_login_timeLessEqual;
  }

  public java.lang.Integer getLast_login_timeLessThan() {
    return last_login_timeLessThan;
  }

  public void setLast_login_timeLessThan(java.lang.Integer last_login_timeLessThan) {
    this.last_login_timeLessThan = last_login_timeLessThan;
  }

  public java.lang.Integer getLast_login_timeNotEquals() {
    return last_login_timeNotEquals;
  }

  public void setLast_login_timeNotEquals(java.lang.Integer last_login_timeNotEquals) {
    this.last_login_timeNotEquals = last_login_timeNotEquals;
  }

  public java.lang.Integer[] getLast_login_timeIns() {
    return last_login_timeIns;
  }

  public void setLast_login_timeIns(java.lang.Integer[] last_login_timeIns) {
    this.last_login_timeIns = last_login_timeIns;
  }

  public java.lang.Integer[] getLast_login_timeNotIns() {
    return last_login_timeNotIns;
  }

  public void setLast_login_timeNotIns(java.lang.Integer[] last_login_timeNotIns) {
    this.last_login_timeNotIns = last_login_timeNotIns;
  }

  public java.lang.Integer getAdd_timeGreaterThan() {
    return add_timeGreaterThan;
  }

  public void setadd_timeGreaterThan(java.lang.Integer add_timeGreaterThan) {
    this.add_timeGreaterThan = add_timeGreaterThan;
  }

  public java.lang.Integer getAdd_timeGreaterEqual() {
    return add_timeGreaterEqual;
  }

  public void setAdd_timeGreaterEqual(java.lang.Integer add_timeGreaterEqual) {
    this.add_timeGreaterEqual = add_timeGreaterEqual;
  }

  public java.lang.Integer getAdd_timeLessEqual() {
    return add_timeLessEqual;
  }

  public void setAdd_timeLessEqual(java.lang.Integer add_timeLessEqual) {
    this.add_timeLessEqual = add_timeLessEqual;
  }

  public java.lang.Integer getAdd_timeLessThan() {
    return add_timeLessThan;
  }

  public void setAdd_timeLessThan(java.lang.Integer add_timeLessThan) {
    this.add_timeLessThan = add_timeLessThan;
  }

  public java.lang.Integer getAdd_timeNotEquals() {
    return add_timeNotEquals;
  }

  public void setAdd_timeNotEquals(java.lang.Integer add_timeNotEquals) {
    this.add_timeNotEquals = add_timeNotEquals;
  }

  public java.lang.Integer[] getAdd_timeIns() {
    return add_timeIns;
  }

  public void setAdd_timeIns(java.lang.Integer[] add_timeIns) {
    this.add_timeIns = add_timeIns;
  }

  public java.lang.Integer[] getAdd_timeNotIns() {
    return add_timeNotIns;
  }

  public void setAdd_timeNotIns(java.lang.Integer[] add_timeNotIns) {
    this.add_timeNotIns = add_timeNotIns;
  }

  public java.lang.Integer getUpdate_timeGreaterThan() {
    return update_timeGreaterThan;
  }

  public void setupdate_timeGreaterThan(java.lang.Integer update_timeGreaterThan) {
    this.update_timeGreaterThan = update_timeGreaterThan;
  }

  public java.lang.Integer getUpdate_timeGreaterEqual() {
    return update_timeGreaterEqual;
  }

  public void setUpdate_timeGreaterEqual(java.lang.Integer update_timeGreaterEqual) {
    this.update_timeGreaterEqual = update_timeGreaterEqual;
  }

  public java.lang.Integer getUpdate_timeLessEqual() {
    return update_timeLessEqual;
  }

  public void setUpdate_timeLessEqual(java.lang.Integer update_timeLessEqual) {
    this.update_timeLessEqual = update_timeLessEqual;
  }

  public java.lang.Integer getUpdate_timeLessThan() {
    return update_timeLessThan;
  }

  public void setUpdate_timeLessThan(java.lang.Integer update_timeLessThan) {
    this.update_timeLessThan = update_timeLessThan;
  }

  public java.lang.Integer getUpdate_timeNotEquals() {
    return update_timeNotEquals;
  }

  public void setUpdate_timeNotEquals(java.lang.Integer update_timeNotEquals) {
    this.update_timeNotEquals = update_timeNotEquals;
  }

  public java.lang.Integer[] getUpdate_timeIns() {
    return update_timeIns;
  }

  public void setUpdate_timeIns(java.lang.Integer[] update_timeIns) {
    this.update_timeIns = update_timeIns;
  }

  public java.lang.Integer[] getUpdate_timeNotIns() {
    return update_timeNotIns;
  }

  public void setUpdate_timeNotIns(java.lang.Integer[] update_timeNotIns) {
    this.update_timeNotIns = update_timeNotIns;
  }

  public java.lang.String getAvatarLeftLike() {
    return avatarLeftLike;
  }

  public void setAvatarLeftLike(java.lang.String avatarLeftLike) {
    this.avatarLeftLike = avatarLeftLike;
  }

  public java.lang.String getAvatarRightLike() {
    return avatarRightLike;
  }

  public void setAvatarRightLike(java.lang.String avatarRightLike) {
    this.avatarRightLike = avatarRightLike;
  }

  public java.lang.String getAvatarLike() {
    return avatarLike;
  }

  public void setAvatarLike(java.lang.String avatarLike) {
    this.avatarLike = avatarLike;
  }

  public java.lang.String getAvatarNotEquals() {
    return avatarNotEquals;
  }

  public void setAvatarNotEquals(java.lang.String avatarNotEquals) {
    this.avatarNotEquals = avatarNotEquals;
  }

  public java.lang.String[] getAvatarIns() {
    return avatarIns;
  }

  public void setAvatarIns(java.lang.String[] avatarIns) {
    this.avatarIns = avatarIns;
  }

  public java.lang.String[] getAvatarNotIns() {
    return avatarNotIns;
  }

  public void setAvatarNotIns(java.lang.String[] avatarNotIns) {
    this.avatarNotIns = avatarNotIns;
  }

  public java.lang.Integer getAdmin_role_idGreaterThan() {
    return admin_role_idGreaterThan;
  }

  public void setadmin_role_idGreaterThan(java.lang.Integer admin_role_idGreaterThan) {
    this.admin_role_idGreaterThan = admin_role_idGreaterThan;
  }

  public java.lang.Integer getAdmin_role_idGreaterEqual() {
    return admin_role_idGreaterEqual;
  }

  public void setAdmin_role_idGreaterEqual(java.lang.Integer admin_role_idGreaterEqual) {
    this.admin_role_idGreaterEqual = admin_role_idGreaterEqual;
  }

  public java.lang.Integer getAdmin_role_idLessEqual() {
    return admin_role_idLessEqual;
  }

  public void setAdmin_role_idLessEqual(java.lang.Integer admin_role_idLessEqual) {
    this.admin_role_idLessEqual = admin_role_idLessEqual;
  }

  public java.lang.Integer getAdmin_role_idLessThan() {
    return admin_role_idLessThan;
  }

  public void setAdmin_role_idLessThan(java.lang.Integer admin_role_idLessThan) {
    this.admin_role_idLessThan = admin_role_idLessThan;
  }

  public java.lang.Integer getAdmin_role_idNotEquals() {
    return admin_role_idNotEquals;
  }

  public void setAdmin_role_idNotEquals(java.lang.Integer admin_role_idNotEquals) {
    this.admin_role_idNotEquals = admin_role_idNotEquals;
  }

  public java.lang.Integer[] getAdmin_role_idIns() {
    return admin_role_idIns;
  }

  public void setAdmin_role_idIns(java.lang.Integer[] admin_role_idIns) {
    this.admin_role_idIns = admin_role_idIns;
  }

  public java.lang.Integer[] getAdmin_role_idNotIns() {
    return admin_role_idNotIns;
  }

  public void setAdmin_role_idNotIns(java.lang.Integer[] admin_role_idNotIns) {
    this.admin_role_idNotIns = admin_role_idNotIns;
  }

}
