package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class AdPosition {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.Integer width;
  /**  */
  private java.lang.Integer height;
  /**  */
  private java.lang.String desc;

  public AdPosition() {
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

  public java.lang.Integer getWidth() {
    return this.width;
  }

  public void setWidth(java.lang.Integer width) {
    this.width = width;
  }

  public java.lang.Integer getHeight() {
    return this.height;
  }

  public void setHeight(java.lang.Integer height) {
    this.height = height;
  }

  public java.lang.String getDesc() {
    return this.desc;
  }

  public void setDesc(java.lang.String desc) {
    this.desc = desc;
  }

  @Override
  public String toString() {
    return "AdPosition [" //
        + "id=" + id //
        + ", name=" + name //
        + ", width=" + width //
        + ", height=" + height //
        + ", desc=" + desc //
        + "]";
  }

}