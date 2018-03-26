package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Channel {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.String url;
  /**  */
  private java.lang.String icon_url;
  /**  */
  private java.lang.Integer sort_order;

  public Channel() {
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

  public java.lang.String getUrl() {
    return this.url;
  }

  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  public java.lang.String getIcon_url() {
    return this.icon_url;
  }

  public void setIcon_url(java.lang.String icon_url) {
    this.icon_url = icon_url;
  }

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  @Override
  public String toString() {
    return "Channel [" //
        + "id=" + id //
        + ", name=" + name //
        + ", url=" + url //
        + ", icon_url=" + icon_url //
        + ", sort_order=" + sort_order //
        + "]";
  }

}