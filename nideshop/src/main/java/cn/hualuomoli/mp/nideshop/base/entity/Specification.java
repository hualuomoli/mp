package cn.hualuomoli.mp.nideshop.base.entity;

// 规格表
public class Specification {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.Integer sort_order;

  public Specification() {
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

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  @Override
  public String toString() {
    return "Specification [" //
        + "id=" + id //
        + ", name=" + name //
        + ", sort_order=" + sort_order //
        + "]";
  }

}