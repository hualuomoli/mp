package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Category {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.String keywords;
  /**  */
  private java.lang.String front_desc;
  /**  */
  private java.lang.Integer parent_id;
  /**  */
  private java.lang.Integer sort_order;
  /**  */
  private java.lang.Integer show_index;
  /**  */
  private java.lang.Integer is_show;
  /**  */
  private java.lang.String banner_url;
  /**  */
  private java.lang.String icon_url;
  /**  */
  private java.lang.String img_url;
  /**  */
  private java.lang.String wap_banner_url;
  /**  */
  private java.lang.String level;
  /**  */
  private java.lang.Integer type;
  /**  */
  private java.lang.String front_name;

  public Category() {
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

  public java.lang.String getKeywords() {
    return this.keywords;
  }

  public void setKeywords(java.lang.String keywords) {
    this.keywords = keywords;
  }

  public java.lang.String getFront_desc() {
    return this.front_desc;
  }

  public void setFront_desc(java.lang.String front_desc) {
    this.front_desc = front_desc;
  }

  public java.lang.Integer getParent_id() {
    return this.parent_id;
  }

  public void setParent_id(java.lang.Integer parent_id) {
    this.parent_id = parent_id;
  }

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  public java.lang.Integer getShow_index() {
    return this.show_index;
  }

  public void setShow_index(java.lang.Integer show_index) {
    this.show_index = show_index;
  }

  public java.lang.Integer getIs_show() {
    return this.is_show;
  }

  public void setIs_show(java.lang.Integer is_show) {
    this.is_show = is_show;
  }

  public java.lang.String getBanner_url() {
    return this.banner_url;
  }

  public void setBanner_url(java.lang.String banner_url) {
    this.banner_url = banner_url;
  }

  public java.lang.String getIcon_url() {
    return this.icon_url;
  }

  public void setIcon_url(java.lang.String icon_url) {
    this.icon_url = icon_url;
  }

  public java.lang.String getImg_url() {
    return this.img_url;
  }

  public void setImg_url(java.lang.String img_url) {
    this.img_url = img_url;
  }

  public java.lang.String getWap_banner_url() {
    return this.wap_banner_url;
  }

  public void setWap_banner_url(java.lang.String wap_banner_url) {
    this.wap_banner_url = wap_banner_url;
  }

  public java.lang.String getLevel() {
    return this.level;
  }

  public void setLevel(java.lang.String level) {
    this.level = level;
  }

  public java.lang.Integer getType() {
    return this.type;
  }

  public void setType(java.lang.Integer type) {
    this.type = type;
  }

  public java.lang.String getFront_name() {
    return this.front_name;
  }

  public void setFront_name(java.lang.String front_name) {
    this.front_name = front_name;
  }

  @Override
  public String toString() {
    return "Category [" //
        + "id=" + id //
        + ", name=" + name //
        + ", keywords=" + keywords //
        + ", front_desc=" + front_desc //
        + ", parent_id=" + parent_id //
        + ", sort_order=" + sort_order //
        + ", show_index=" + show_index //
        + ", is_show=" + is_show //
        + ", banner_url=" + banner_url //
        + ", icon_url=" + icon_url //
        + ", img_url=" + img_url //
        + ", wap_banner_url=" + wap_banner_url //
        + ", level=" + level //
        + ", type=" + type //
        + ", front_name=" + front_name //
        + "]";
  }

}