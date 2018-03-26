package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Address {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.Integer user_id;
  /**  */
  private java.lang.Integer country_id;
  /**  */
  private java.lang.Integer province_id;
  /**  */
  private java.lang.Integer city_id;
  /**  */
  private java.lang.Integer district_id;
  /**  */
  private java.lang.String address;
  /**  */
  private java.lang.String mobile;
  /**  */
  private java.lang.Integer is_default;

  public Address() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.Integer getUser_id() {
    return this.user_id;
  }

  public void setUser_id(java.lang.Integer user_id) {
    this.user_id = user_id;
  }

  public java.lang.Integer getCountry_id() {
    return this.country_id;
  }

  public void setCountry_id(java.lang.Integer country_id) {
    this.country_id = country_id;
  }

  public java.lang.Integer getProvince_id() {
    return this.province_id;
  }

  public void setProvince_id(java.lang.Integer province_id) {
    this.province_id = province_id;
  }

  public java.lang.Integer getCity_id() {
    return this.city_id;
  }

  public void setCity_id(java.lang.Integer city_id) {
    this.city_id = city_id;
  }

  public java.lang.Integer getDistrict_id() {
    return this.district_id;
  }

  public void setDistrict_id(java.lang.Integer district_id) {
    this.district_id = district_id;
  }

  public java.lang.String getAddress() {
    return this.address;
  }

  public void setAddress(java.lang.String address) {
    this.address = address;
  }

  public java.lang.String getMobile() {
    return this.mobile;
  }

  public void setMobile(java.lang.String mobile) {
    this.mobile = mobile;
  }

  public java.lang.Integer getIs_default() {
    return this.is_default;
  }

  public void setIs_default(java.lang.Integer is_default) {
    this.is_default = is_default;
  }

  @Override
  public String toString() {
    return "Address [" //
        + "id=" + id //
        + ", name=" + name //
        + ", user_id=" + user_id //
        + ", country_id=" + country_id //
        + ", province_id=" + province_id //
        + ", city_id=" + city_id //
        + ", district_id=" + district_id //
        + ", address=" + address //
        + ", mobile=" + mobile //
        + ", is_default=" + is_default //
        + "]";
  }

}