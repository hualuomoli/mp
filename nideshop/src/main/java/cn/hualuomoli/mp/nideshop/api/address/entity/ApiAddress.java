package cn.hualuomoli.mp.nideshop.api.address.entity;

public class ApiAddress {

  private String province_name;
  private String city_name;
  private String district_name;
  private String full_region;

  public String getProvince_name() {
    return province_name;
  }

  public void setProvince_name(String province_name) {
    this.province_name = province_name;
  }

  public String getCity_name() {
    return city_name;
  }

  public void setCity_name(String city_name) {
    this.city_name = city_name;
  }

  public String getDistrict_name() {
    return district_name;
  }

  public void setDistrict_name(String district_name) {
    this.district_name = district_name;
  }

  public String getFull_region() {
    return full_region;
  }

  public void setFull_region(String full_region) {
    this.full_region = full_region;
  }

  @Override
  public String toString() {
    return "ApiAddress [province_name=" + province_name + ", city_name=" + city_name + ", district_name=" + district_name + ", full_region=" + full_region
        + "]";
  }

}
