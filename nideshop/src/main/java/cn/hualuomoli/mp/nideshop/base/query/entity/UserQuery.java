package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.User;

// 
public class UserQuery extends User {

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
  private java.lang.Integer genderGreaterThan;
  private java.lang.Integer genderGreaterEqual;
  private java.lang.Integer genderLessEqual;
  private java.lang.Integer genderLessThan;
  private java.lang.Integer genderNotEquals;
  private java.lang.Integer[] genderIns;
  private java.lang.Integer[] genderNotIns;
  /**  */
  private java.lang.Integer birthdayGreaterThan;
  private java.lang.Integer birthdayGreaterEqual;
  private java.lang.Integer birthdayLessEqual;
  private java.lang.Integer birthdayLessThan;
  private java.lang.Integer birthdayNotEquals;
  private java.lang.Integer[] birthdayIns;
  private java.lang.Integer[] birthdayNotIns;
  /**  */
  private java.lang.Integer register_timeGreaterThan;
  private java.lang.Integer register_timeGreaterEqual;
  private java.lang.Integer register_timeLessEqual;
  private java.lang.Integer register_timeLessThan;
  private java.lang.Integer register_timeNotEquals;
  private java.lang.Integer[] register_timeIns;
  private java.lang.Integer[] register_timeNotIns;
  /**  */
  private java.lang.Integer last_login_timeGreaterThan;
  private java.lang.Integer last_login_timeGreaterEqual;
  private java.lang.Integer last_login_timeLessEqual;
  private java.lang.Integer last_login_timeLessThan;
  private java.lang.Integer last_login_timeNotEquals;
  private java.lang.Integer[] last_login_timeIns;
  private java.lang.Integer[] last_login_timeNotIns;
  /**  */
  private java.lang.String last_login_ipLeftLike;
  private java.lang.String last_login_ipRightLike;
  private java.lang.String last_login_ipLike;
  private java.lang.String last_login_ipNotEquals;
  private java.lang.String[] last_login_ipIns;
  private java.lang.String[] last_login_ipNotIns;
  /**  */
  private java.lang.Integer user_level_idGreaterThan;
  private java.lang.Integer user_level_idGreaterEqual;
  private java.lang.Integer user_level_idLessEqual;
  private java.lang.Integer user_level_idLessThan;
  private java.lang.Integer user_level_idNotEquals;
  private java.lang.Integer[] user_level_idIns;
  private java.lang.Integer[] user_level_idNotIns;
  /**  */
  private java.lang.String nicknameLeftLike;
  private java.lang.String nicknameRightLike;
  private java.lang.String nicknameLike;
  private java.lang.String nicknameNotEquals;
  private java.lang.String[] nicknameIns;
  private java.lang.String[] nicknameNotIns;
  /**  */
  private java.lang.String mobileLeftLike;
  private java.lang.String mobileRightLike;
  private java.lang.String mobileLike;
  private java.lang.String mobileNotEquals;
  private java.lang.String[] mobileIns;
  private java.lang.String[] mobileNotIns;
  /**  */
  private java.lang.String register_ipLeftLike;
  private java.lang.String register_ipRightLike;
  private java.lang.String register_ipLike;
  private java.lang.String register_ipNotEquals;
  private java.lang.String[] register_ipIns;
  private java.lang.String[] register_ipNotIns;
  /**  */
  private java.lang.String avatarLeftLike;
  private java.lang.String avatarRightLike;
  private java.lang.String avatarLike;
  private java.lang.String avatarNotEquals;
  private java.lang.String[] avatarIns;
  private java.lang.String[] avatarNotIns;
  /**  */
  private java.lang.String weixin_openidLeftLike;
  private java.lang.String weixin_openidRightLike;
  private java.lang.String weixin_openidLike;
  private java.lang.String weixin_openidNotEquals;
  private java.lang.String[] weixin_openidIns;
  private java.lang.String[] weixin_openidNotIns;

  public UserQuery() {
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

  public java.lang.Integer getGenderGreaterThan() {
    return genderGreaterThan;
  }

  public void setgenderGreaterThan(java.lang.Integer genderGreaterThan) {
    this.genderGreaterThan = genderGreaterThan;
  }

  public java.lang.Integer getGenderGreaterEqual() {
    return genderGreaterEqual;
  }

  public void setGenderGreaterEqual(java.lang.Integer genderGreaterEqual) {
    this.genderGreaterEqual = genderGreaterEqual;
  }

  public java.lang.Integer getGenderLessEqual() {
    return genderLessEqual;
  }

  public void setGenderLessEqual(java.lang.Integer genderLessEqual) {
    this.genderLessEqual = genderLessEqual;
  }

  public java.lang.Integer getGenderLessThan() {
    return genderLessThan;
  }

  public void setGenderLessThan(java.lang.Integer genderLessThan) {
    this.genderLessThan = genderLessThan;
  }

  public java.lang.Integer getGenderNotEquals() {
    return genderNotEquals;
  }

  public void setGenderNotEquals(java.lang.Integer genderNotEquals) {
    this.genderNotEquals = genderNotEquals;
  }

  public java.lang.Integer[] getGenderIns() {
    return genderIns;
  }

  public void setGenderIns(java.lang.Integer[] genderIns) {
    this.genderIns = genderIns;
  }

  public java.lang.Integer[] getGenderNotIns() {
    return genderNotIns;
  }

  public void setGenderNotIns(java.lang.Integer[] genderNotIns) {
    this.genderNotIns = genderNotIns;
  }

  public java.lang.Integer getBirthdayGreaterThan() {
    return birthdayGreaterThan;
  }

  public void setbirthdayGreaterThan(java.lang.Integer birthdayGreaterThan) {
    this.birthdayGreaterThan = birthdayGreaterThan;
  }

  public java.lang.Integer getBirthdayGreaterEqual() {
    return birthdayGreaterEqual;
  }

  public void setBirthdayGreaterEqual(java.lang.Integer birthdayGreaterEqual) {
    this.birthdayGreaterEqual = birthdayGreaterEqual;
  }

  public java.lang.Integer getBirthdayLessEqual() {
    return birthdayLessEqual;
  }

  public void setBirthdayLessEqual(java.lang.Integer birthdayLessEqual) {
    this.birthdayLessEqual = birthdayLessEqual;
  }

  public java.lang.Integer getBirthdayLessThan() {
    return birthdayLessThan;
  }

  public void setBirthdayLessThan(java.lang.Integer birthdayLessThan) {
    this.birthdayLessThan = birthdayLessThan;
  }

  public java.lang.Integer getBirthdayNotEquals() {
    return birthdayNotEquals;
  }

  public void setBirthdayNotEquals(java.lang.Integer birthdayNotEquals) {
    this.birthdayNotEquals = birthdayNotEquals;
  }

  public java.lang.Integer[] getBirthdayIns() {
    return birthdayIns;
  }

  public void setBirthdayIns(java.lang.Integer[] birthdayIns) {
    this.birthdayIns = birthdayIns;
  }

  public java.lang.Integer[] getBirthdayNotIns() {
    return birthdayNotIns;
  }

  public void setBirthdayNotIns(java.lang.Integer[] birthdayNotIns) {
    this.birthdayNotIns = birthdayNotIns;
  }

  public java.lang.Integer getRegister_timeGreaterThan() {
    return register_timeGreaterThan;
  }

  public void setregister_timeGreaterThan(java.lang.Integer register_timeGreaterThan) {
    this.register_timeGreaterThan = register_timeGreaterThan;
  }

  public java.lang.Integer getRegister_timeGreaterEqual() {
    return register_timeGreaterEqual;
  }

  public void setRegister_timeGreaterEqual(java.lang.Integer register_timeGreaterEqual) {
    this.register_timeGreaterEqual = register_timeGreaterEqual;
  }

  public java.lang.Integer getRegister_timeLessEqual() {
    return register_timeLessEqual;
  }

  public void setRegister_timeLessEqual(java.lang.Integer register_timeLessEqual) {
    this.register_timeLessEqual = register_timeLessEqual;
  }

  public java.lang.Integer getRegister_timeLessThan() {
    return register_timeLessThan;
  }

  public void setRegister_timeLessThan(java.lang.Integer register_timeLessThan) {
    this.register_timeLessThan = register_timeLessThan;
  }

  public java.lang.Integer getRegister_timeNotEquals() {
    return register_timeNotEquals;
  }

  public void setRegister_timeNotEquals(java.lang.Integer register_timeNotEquals) {
    this.register_timeNotEquals = register_timeNotEquals;
  }

  public java.lang.Integer[] getRegister_timeIns() {
    return register_timeIns;
  }

  public void setRegister_timeIns(java.lang.Integer[] register_timeIns) {
    this.register_timeIns = register_timeIns;
  }

  public java.lang.Integer[] getRegister_timeNotIns() {
    return register_timeNotIns;
  }

  public void setRegister_timeNotIns(java.lang.Integer[] register_timeNotIns) {
    this.register_timeNotIns = register_timeNotIns;
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

  public java.lang.Integer getUser_level_idGreaterThan() {
    return user_level_idGreaterThan;
  }

  public void setuser_level_idGreaterThan(java.lang.Integer user_level_idGreaterThan) {
    this.user_level_idGreaterThan = user_level_idGreaterThan;
  }

  public java.lang.Integer getUser_level_idGreaterEqual() {
    return user_level_idGreaterEqual;
  }

  public void setUser_level_idGreaterEqual(java.lang.Integer user_level_idGreaterEqual) {
    this.user_level_idGreaterEqual = user_level_idGreaterEqual;
  }

  public java.lang.Integer getUser_level_idLessEqual() {
    return user_level_idLessEqual;
  }

  public void setUser_level_idLessEqual(java.lang.Integer user_level_idLessEqual) {
    this.user_level_idLessEqual = user_level_idLessEqual;
  }

  public java.lang.Integer getUser_level_idLessThan() {
    return user_level_idLessThan;
  }

  public void setUser_level_idLessThan(java.lang.Integer user_level_idLessThan) {
    this.user_level_idLessThan = user_level_idLessThan;
  }

  public java.lang.Integer getUser_level_idNotEquals() {
    return user_level_idNotEquals;
  }

  public void setUser_level_idNotEquals(java.lang.Integer user_level_idNotEquals) {
    this.user_level_idNotEquals = user_level_idNotEquals;
  }

  public java.lang.Integer[] getUser_level_idIns() {
    return user_level_idIns;
  }

  public void setUser_level_idIns(java.lang.Integer[] user_level_idIns) {
    this.user_level_idIns = user_level_idIns;
  }

  public java.lang.Integer[] getUser_level_idNotIns() {
    return user_level_idNotIns;
  }

  public void setUser_level_idNotIns(java.lang.Integer[] user_level_idNotIns) {
    this.user_level_idNotIns = user_level_idNotIns;
  }

  public java.lang.String getNicknameLeftLike() {
    return nicknameLeftLike;
  }

  public void setNicknameLeftLike(java.lang.String nicknameLeftLike) {
    this.nicknameLeftLike = nicknameLeftLike;
  }

  public java.lang.String getNicknameRightLike() {
    return nicknameRightLike;
  }

  public void setNicknameRightLike(java.lang.String nicknameRightLike) {
    this.nicknameRightLike = nicknameRightLike;
  }

  public java.lang.String getNicknameLike() {
    return nicknameLike;
  }

  public void setNicknameLike(java.lang.String nicknameLike) {
    this.nicknameLike = nicknameLike;
  }

  public java.lang.String getNicknameNotEquals() {
    return nicknameNotEquals;
  }

  public void setNicknameNotEquals(java.lang.String nicknameNotEquals) {
    this.nicknameNotEquals = nicknameNotEquals;
  }

  public java.lang.String[] getNicknameIns() {
    return nicknameIns;
  }

  public void setNicknameIns(java.lang.String[] nicknameIns) {
    this.nicknameIns = nicknameIns;
  }

  public java.lang.String[] getNicknameNotIns() {
    return nicknameNotIns;
  }

  public void setNicknameNotIns(java.lang.String[] nicknameNotIns) {
    this.nicknameNotIns = nicknameNotIns;
  }

  public java.lang.String getMobileLeftLike() {
    return mobileLeftLike;
  }

  public void setMobileLeftLike(java.lang.String mobileLeftLike) {
    this.mobileLeftLike = mobileLeftLike;
  }

  public java.lang.String getMobileRightLike() {
    return mobileRightLike;
  }

  public void setMobileRightLike(java.lang.String mobileRightLike) {
    this.mobileRightLike = mobileRightLike;
  }

  public java.lang.String getMobileLike() {
    return mobileLike;
  }

  public void setMobileLike(java.lang.String mobileLike) {
    this.mobileLike = mobileLike;
  }

  public java.lang.String getMobileNotEquals() {
    return mobileNotEquals;
  }

  public void setMobileNotEquals(java.lang.String mobileNotEquals) {
    this.mobileNotEquals = mobileNotEquals;
  }

  public java.lang.String[] getMobileIns() {
    return mobileIns;
  }

  public void setMobileIns(java.lang.String[] mobileIns) {
    this.mobileIns = mobileIns;
  }

  public java.lang.String[] getMobileNotIns() {
    return mobileNotIns;
  }

  public void setMobileNotIns(java.lang.String[] mobileNotIns) {
    this.mobileNotIns = mobileNotIns;
  }

  public java.lang.String getRegister_ipLeftLike() {
    return register_ipLeftLike;
  }

  public void setRegister_ipLeftLike(java.lang.String register_ipLeftLike) {
    this.register_ipLeftLike = register_ipLeftLike;
  }

  public java.lang.String getRegister_ipRightLike() {
    return register_ipRightLike;
  }

  public void setRegister_ipRightLike(java.lang.String register_ipRightLike) {
    this.register_ipRightLike = register_ipRightLike;
  }

  public java.lang.String getRegister_ipLike() {
    return register_ipLike;
  }

  public void setRegister_ipLike(java.lang.String register_ipLike) {
    this.register_ipLike = register_ipLike;
  }

  public java.lang.String getRegister_ipNotEquals() {
    return register_ipNotEquals;
  }

  public void setRegister_ipNotEquals(java.lang.String register_ipNotEquals) {
    this.register_ipNotEquals = register_ipNotEquals;
  }

  public java.lang.String[] getRegister_ipIns() {
    return register_ipIns;
  }

  public void setRegister_ipIns(java.lang.String[] register_ipIns) {
    this.register_ipIns = register_ipIns;
  }

  public java.lang.String[] getRegister_ipNotIns() {
    return register_ipNotIns;
  }

  public void setRegister_ipNotIns(java.lang.String[] register_ipNotIns) {
    this.register_ipNotIns = register_ipNotIns;
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

  public java.lang.String getWeixin_openidLeftLike() {
    return weixin_openidLeftLike;
  }

  public void setWeixin_openidLeftLike(java.lang.String weixin_openidLeftLike) {
    this.weixin_openidLeftLike = weixin_openidLeftLike;
  }

  public java.lang.String getWeixin_openidRightLike() {
    return weixin_openidRightLike;
  }

  public void setWeixin_openidRightLike(java.lang.String weixin_openidRightLike) {
    this.weixin_openidRightLike = weixin_openidRightLike;
  }

  public java.lang.String getWeixin_openidLike() {
    return weixin_openidLike;
  }

  public void setWeixin_openidLike(java.lang.String weixin_openidLike) {
    this.weixin_openidLike = weixin_openidLike;
  }

  public java.lang.String getWeixin_openidNotEquals() {
    return weixin_openidNotEquals;
  }

  public void setWeixin_openidNotEquals(java.lang.String weixin_openidNotEquals) {
    this.weixin_openidNotEquals = weixin_openidNotEquals;
  }

  public java.lang.String[] getWeixin_openidIns() {
    return weixin_openidIns;
  }

  public void setWeixin_openidIns(java.lang.String[] weixin_openidIns) {
    this.weixin_openidIns = weixin_openidIns;
  }

  public java.lang.String[] getWeixin_openidNotIns() {
    return weixin_openidNotIns;
  }

  public void setWeixin_openidNotIns(java.lang.String[] weixin_openidNotIns) {
    this.weixin_openidNotIns = weixin_openidNotIns;
  }

}
