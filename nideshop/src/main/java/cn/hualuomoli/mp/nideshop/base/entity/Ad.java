package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Ad {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer ad_position_id;
  /**  */
  private java.lang.Integer media_type;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.String link;
  /**  */
  private java.lang.String image_url;
  /**  */
  private java.lang.String content;
  /**  */
  private java.lang.Integer end_time;
  /**  */
  private java.lang.Integer enabled;

  public Ad() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getAd_position_id() {
    return this.ad_position_id;
  }

  public void setAd_position_id(java.lang.Integer ad_position_id) {
    this.ad_position_id = ad_position_id;
  }

  public java.lang.Integer getMedia_type() {
    return this.media_type;
  }

  public void setMedia_type(java.lang.Integer media_type) {
    this.media_type = media_type;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.String getLink() {
    return this.link;
  }

  public void setLink(java.lang.String link) {
    this.link = link;
  }

  public java.lang.String getImage_url() {
    return this.image_url;
  }

  public void setImage_url(java.lang.String image_url) {
    this.image_url = image_url;
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public java.lang.Integer getEnd_time() {
    return this.end_time;
  }

  public void setEnd_time(java.lang.Integer end_time) {
    this.end_time = end_time;
  }

  public java.lang.Integer getEnabled() {
    return this.enabled;
  }

  public void setEnabled(java.lang.Integer enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "Ad [" //
        + "id=" + id //
        + ", ad_position_id=" + ad_position_id //
        + ", media_type=" + media_type //
        + ", name=" + name //
        + ", link=" + link //
        + ", image_url=" + image_url //
        + ", content=" + content //
        + ", end_time=" + end_time //
        + ", enabled=" + enabled //
        + "]";
  }

}