package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class UserLevel {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.String description;

  public UserLevel() {
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

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "UserLevel [" //
        + "id=" + id //
        + ", name=" + name //
        + ", description=" + description //
        + "]";
  }

}