package cn.hualuomoli.mp.nideshop.api.catalog.entity;

import java.util.List;

import cn.hualuomoli.mp.nideshop.base.entity.Category;

public class ApiCategory extends Category {

  private List<Category> subCategoryList;

  public List<Category> getSubCategoryList() {
    return subCategoryList;
  }

  public void setSubCategoryList(List<Category> subCategoryList) {
    this.subCategoryList = subCategoryList;
  }

}
