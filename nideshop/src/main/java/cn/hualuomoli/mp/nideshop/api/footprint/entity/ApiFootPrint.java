package cn.hualuomoli.mp.nideshop.api.footprint.entity;

public class ApiFootPrint {

  private Integer id;
  private Integer user_id;
  private Integer goods_id;
  private String add_time;
  private String name;
  private String list_pic_url;
  private String goods_brief;
  private Double retail_price;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUser_id() {
    return user_id;
  }

  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public Integer getGoods_id() {
    return goods_id;
  }

  public void setGoods_id(Integer goods_id) {
    this.goods_id = goods_id;
  }

  public String getAdd_time() {
    return add_time;
  }

  public void setAdd_time(String add_time) {
    this.add_time = add_time;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getList_pic_url() {
    return list_pic_url;
  }

  public void setList_pic_url(String list_pic_url) {
    this.list_pic_url = list_pic_url;
  }

  public String getGoods_brief() {
    return goods_brief;
  }

  public void setGoods_brief(String goods_brief) {
    this.goods_brief = goods_brief;
  }

  public Double getRetail_price() {
    return retail_price;
  }

  public void setRetail_price(Double retail_price) {
    this.retail_price = retail_price;
  }

  @Override
  public String toString() {
    return "ApiFootPrint [id=" + id + ", user_id=" + user_id + ", goods_id=" + goods_id + ", add_time=" + add_time + ", name=" + name + ", list_pic_url="
        + list_pic_url + ", goods_brief=" + goods_brief + ", retail_price=" + retail_price + "]";
  }

}
