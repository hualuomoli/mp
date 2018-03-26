package cn.hualuomoli.mp.nideshop.api.collect.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Collect;

public class ApiCollect extends Collect {

  private String list_pic_url;
  private String goods_brief;
  private Double retail_price;

  public String getList_pic_url() {
    return list_pic_url;
  }

  public void setList_pic_url(String list_pic_url) {
    this.list_pic_url = list_pic_url;
  }

  public String getGoods_brief() {
    return goods_brief;
  }

  public void setGoods_brief(String goods_brief) {
    this.goods_brief = goods_brief;
  }

  public Double getRetail_price() {
    return retail_price;
  }

  public void setRetail_price(Double retail_price) {
    this.retail_price = retail_price;
  }

  @Override
  public String toString() {
    return "ApiCollect [list_pic_url=" + list_pic_url + ", goods_brief=" + goods_brief + ", retail_price=" + retail_price + "]";
  }

}
