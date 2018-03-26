package cn.hualuomoli.mp.nideshop.base.entity;

// 快递公司
public class Shipper {

  /**  */
  private java.lang.Integer id;
  /** 快递公司名称 */
  private java.lang.String name;
  /** 快递公司代码 */
  private java.lang.String code;
  /** 排序 */
  private java.lang.Integer sort_order;

  public Shipper() {
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

  public java.lang.String getCode() {
    return this.code;
  }

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  @Override
  public String toString() {
    return "Shipper [" //
        + "id=" + id //
        + ", name=" + name //
        + ", code=" + code //
        + ", sort_order=" + sort_order //
        + "]";
  }

}