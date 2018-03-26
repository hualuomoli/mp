package cn.hualuomoli.mp.nideshop.base.entity;

// 热闹关键词表
public class Keywords {

  /**  */
  private java.lang.String keyword;
  /**  */
  private java.lang.Integer is_hot;
  /**  */
  private java.lang.Integer is_default;
  /**  */
  private java.lang.Integer is_show;
  /**  */
  private java.lang.Integer sort_order;
  /** 关键词的跳转链接 */
  private java.lang.String scheme_url;
  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer type;

  public Keywords() {
  }

  // getter and setter

  public java.lang.String getKeyword() {
    return this.keyword;
  }

  public void setKeyword(java.lang.String keyword) {
    this.keyword = keyword;
  }

  public java.lang.Integer getIs_hot() {
    return this.is_hot;
  }

  public void setIs_hot(java.lang.Integer is_hot) {
    this.is_hot = is_hot;
  }

  public java.lang.Integer getIs_default() {
    return this.is_default;
  }

  public void setIs_default(java.lang.Integer is_default) {
    this.is_default = is_default;
  }

  public java.lang.Integer getIs_show() {
    return this.is_show;
  }

  public void setIs_show(java.lang.Integer is_show) {
    this.is_show = is_show;
  }

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  public java.lang.String getScheme_url() {
    return this.scheme_url;
  }

  public void setScheme_url(java.lang.String scheme_url) {
    this.scheme_url = scheme_url;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getType() {
    return this.type;
  }

  public void setType(java.lang.Integer type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Keywords [" //
        + "keyword=" + keyword //
        + ", is_hot=" + is_hot //
        + ", is_default=" + is_default //
        + ", is_show=" + is_show //
        + ", sort_order=" + sort_order //
        + ", scheme_url=" + scheme_url //
        + ", id=" + id //
        + ", type=" + type //
        + "]";
  }

}