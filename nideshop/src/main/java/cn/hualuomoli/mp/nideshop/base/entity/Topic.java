package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Topic {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String title;
  /**  */
  private java.lang.String content;
  /**  */
  private java.lang.String avatar;
  /**  */
  private java.lang.String item_pic_url;
  /**  */
  private java.lang.String subtitle;
  /**  */
  private java.lang.Integer topic_category_id;
  /**  */
  private java.lang.Double price_info;
  /**  */
  private java.lang.String read_count;
  /**  */
  private java.lang.String scene_pic_url;
  /**  */
  private java.lang.Integer topic_template_id;
  /**  */
  private java.lang.Integer topic_tag_id;
  /**  */
  private java.lang.Integer sort_order;
  /**  */
  private java.lang.Integer is_show;

  public Topic() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public java.lang.String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(java.lang.String avatar) {
    this.avatar = avatar;
  }

  public java.lang.String getItem_pic_url() {
    return this.item_pic_url;
  }

  public void setItem_pic_url(java.lang.String item_pic_url) {
    this.item_pic_url = item_pic_url;
  }

  public java.lang.String getSubtitle() {
    return this.subtitle;
  }

  public void setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
  }

  public java.lang.Integer getTopic_category_id() {
    return this.topic_category_id;
  }

  public void setTopic_category_id(java.lang.Integer topic_category_id) {
    this.topic_category_id = topic_category_id;
  }

  public java.lang.Double getPrice_info() {
    return this.price_info;
  }

  public void setPrice_info(java.lang.Double price_info) {
    this.price_info = price_info;
  }

  public java.lang.String getRead_count() {
    return this.read_count;
  }

  public void setRead_count(java.lang.String read_count) {
    this.read_count = read_count;
  }

  public java.lang.String getScene_pic_url() {
    return this.scene_pic_url;
  }

  public void setScene_pic_url(java.lang.String scene_pic_url) {
    this.scene_pic_url = scene_pic_url;
  }

  public java.lang.Integer getTopic_template_id() {
    return this.topic_template_id;
  }

  public void setTopic_template_id(java.lang.Integer topic_template_id) {
    this.topic_template_id = topic_template_id;
  }

  public java.lang.Integer getTopic_tag_id() {
    return this.topic_tag_id;
  }

  public void setTopic_tag_id(java.lang.Integer topic_tag_id) {
    this.topic_tag_id = topic_tag_id;
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

  @Override
  public String toString() {
    return "Topic [" //
        + "id=" + id //
        + ", title=" + title //
        + ", content=" + content //
        + ", avatar=" + avatar //
        + ", item_pic_url=" + item_pic_url //
        + ", subtitle=" + subtitle //
        + ", topic_category_id=" + topic_category_id //
        + ", price_info=" + price_info //
        + ", read_count=" + read_count //
        + ", scene_pic_url=" + scene_pic_url //
        + ", topic_template_id=" + topic_template_id //
        + ", topic_tag_id=" + topic_tag_id //
        + ", sort_order=" + sort_order //
        + ", is_show=" + is_show //
        + "]";
  }

}