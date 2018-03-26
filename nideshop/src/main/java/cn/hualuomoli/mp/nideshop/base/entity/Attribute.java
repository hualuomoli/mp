package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class Attribute {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.Integer attribute_category_id;
  /**  */
  private java.lang.String name;
  /**  */
  private java.lang.Integer input_type;
  /**  */
  private java.lang.String values;
  /**  */
  private java.lang.Integer sort_order;

  public Attribute() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getAttribute_category_id() {
    return this.attribute_category_id;
  }

  public void setAttribute_category_id(java.lang.Integer attribute_category_id) {
    this.attribute_category_id = attribute_category_id;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.Integer getInput_type() {
    return this.input_type;
  }

  public void setInput_type(java.lang.Integer input_type) {
    this.input_type = input_type;
  }

  public java.lang.String getValues() {
    return this.values;
  }

  public void setValues(java.lang.String values) {
    this.values = values;
  }

  public java.lang.Integer getSort_order() {
    return this.sort_order;
  }

  public void setSort_order(java.lang.Integer sort_order) {
    this.sort_order = sort_order;
  }

  @Override
  public String toString() {
    return "Attribute [" //
        + "id=" + id //
        + ", attribute_category_id=" + attribute_category_id //
        + ", name=" + name //
        + ", input_type=" + input_type //
        + ", values=" + values //
        + ", sort_order=" + sort_order //
        + "]";
  }

}