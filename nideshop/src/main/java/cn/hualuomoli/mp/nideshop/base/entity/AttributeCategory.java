package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class AttributeCategory {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.Integer enabled;

  public AttributeCategory() {
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

  public java.lang.Integer getEnabled() {
    return this.enabled;
  }

  public void setEnabled(java.lang.Integer enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "AttributeCategory [" //
        + "id=" + id //
        + ", name=" + name //
        + ", enabled=" + enabled //
        + "]";
  }

}