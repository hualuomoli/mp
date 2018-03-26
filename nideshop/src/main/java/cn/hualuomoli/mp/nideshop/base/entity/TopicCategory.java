package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class TopicCategory {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String title;
  /**  */
  private java.lang.String pic_url;

  public TopicCategory() {
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

  public java.lang.String getPic_url() {
    return this.pic_url;
  }

  public void setPic_url(java.lang.String pic_url) {
    this.pic_url = pic_url;
  }

  @Override
  public String toString() {
    return "TopicCategory [" //
        + "id=" + id //
        + ", title=" + title //
        + ", pic_url=" + pic_url //
        + "]";
  }

}