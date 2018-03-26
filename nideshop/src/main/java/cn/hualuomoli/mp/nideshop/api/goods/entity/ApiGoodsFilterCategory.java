package cn.hualuomoli.mp.nideshop.api.goods.entity;

// 筛选的分类
public class ApiGoodsFilterCategory {

  private Integer id;
  private String name;
  private boolean checked;

  public ApiGoodsFilterCategory() {
  }

  public ApiGoodsFilterCategory(Integer id, String name, boolean checked) {
    this.id = id;
    this.name = name;
    this.checked = checked;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isChecked() {
    return checked;
  }

  public void setChecked(boolean checked) {
    this.checked = checked;
  }

  @Override
  public String toString() {
    return "ApiGoodsFilterCategory [id=" + id + ", name=" + name + ", checked=" + checked + "]";
  }

}
