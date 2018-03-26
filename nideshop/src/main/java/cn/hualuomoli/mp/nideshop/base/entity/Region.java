package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Region {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer parent_id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.Integer type;
  /**  */
  private java.lang.Integer agency_id;

  public Region() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getParent_id() {
    return this.parent_id;
  }

  public void setParent_id(java.lang.Integer parent_id) {
    this.parent_id = parent_id;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.Integer getType() {
    return this.type;
  }

  public void setType(java.lang.Integer type) {
    this.type = type;
  }

  public java.lang.Integer getAgency_id() {
    return this.agency_id;
  }

  public void setAgency_id(java.lang.Integer agency_id) {
    this.agency_id = agency_id;
  }

  @Override
  public String toString() {
    return "Region [" //
        + "id=" + id //
        + ", parent_id=" + parent_id //
        + ", name=" + name //
        + ", type=" + type //
        + ", agency_id=" + agency_id //
        + "]";
  }

}