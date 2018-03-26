package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Brand {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.String list_pic_url;
  /**  */
  private java.lang.String simple_desc;
  /**  */
  private java.lang.String pic_url;
  /**  */
  private java.lang.Integer sort_order;
  /**  */
  private java.lang.Integer is_show;
  /**  */
  private java.lang.Double floor_price;
  /**  */
  private java.lang.String app_list_pic_url;
  /**  */
  private java.lang.Integer is_new;
  /**  */
  private java.lang.String new_pic_url;
  /**  */
  private java.lang.Integer new_sort_order;

  public Brand() {
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

  public java.lang.String getList_pic_url() {
    return this.list_pic_url;
  }

  public void setList_pic_url(java.lang.String list_pic_url) {
    this.list_pic_url = list_pic_url;
  }

  public java.lang.String getSimple_desc() {
    return this.simple_desc;
  }

  public void setSimple_desc(java.lang.String simple_desc) {
    this.simple_desc = simple_desc;
  }

  public java.lang.String getPic_url() {
    return this.pic_url;
  }

  public void setPic_url(java.lang.String pic_url) {
    this.pic_url = pic_url;
  }

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  public java.lang.Integer getIs_show() {
    return this.is_show;
  }

  public void setIs_show(java.lang.Integer is_show) {
    this.is_show = is_show;
  }

  public java.lang.Double getFloor_price() {
    return this.floor_price;
  }

  public void setFloor_price(java.lang.Double floor_price) {
    this.floor_price = floor_price;
  }

  public java.lang.String getApp_list_pic_url() {
    return this.app_list_pic_url;
  }

  public void setApp_list_pic_url(java.lang.String app_list_pic_url) {
    this.app_list_pic_url = app_list_pic_url;
  }

  public java.lang.Integer getIs_new() {
    return this.is_new;
  }

  public void setIs_new(java.lang.Integer is_new) {
    this.is_new = is_new;
  }

  public java.lang.String getNew_pic_url() {
    return this.new_pic_url;
  }

  public void setNew_pic_url(java.lang.String new_pic_url) {
    this.new_pic_url = new_pic_url;
  }

  public java.lang.Integer getNew_sort_order() {
    return this.new_sort_order;
  }

  public void setNew_sort_order(java.lang.Integer new_sort_order) {
    this.new_sort_order = new_sort_order;
  }

  @Override
  public String toString() {
    return "Brand [" //
        + "id=" + id //
        + ", name=" + name //
        + ", list_pic_url=" + list_pic_url //
        + ", simple_desc=" + simple_desc //
        + ", pic_url=" + pic_url //
        + ", sort_order=" + sort_order //
        + ", is_show=" + is_show //
        + ", floor_price=" + floor_price //
        + ", app_list_pic_url=" + app_list_pic_url //
        + ", is_new=" + is_new //
        + ", new_pic_url=" + new_pic_url //
        + ", new_sort_order=" + new_sort_order //
        + "]";
  }

}