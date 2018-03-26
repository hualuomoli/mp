package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class CommentPicture {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer comment_id;
  /**  */
  private java.lang.String pic_url;
  /**  */
  private java.lang.Integer sort_order;

  public CommentPicture() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getComment_id() {
    return this.comment_id;
  }

  public void setComment_id(java.lang.Integer comment_id) {
    this.comment_id = comment_id;
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

  @Override
  public String toString() {
    return "CommentPicture [" //
        + "id=" + id //
        + ", comment_id=" + comment_id //
        + ", pic_url=" + pic_url //
        + ", sort_order=" + sort_order //
        + "]";
  }

}