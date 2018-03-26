package cn.hualuomoli.mp.nideshop.api.cart.entity;

public class ApiCartStatistic {

  private Integer goodsCount;
  private Double goodsAmount;
  private Integer checkedGoodsCount;
  private Integer checkedGoodsAmount;

  public Integer getGoodsCount() {
    return goodsCount;
  }

  public void setGoodsCount(Integer goodsCount) {
    this.goodsCount = goodsCount;
  }

  public Double getGoodsAmount() {
    return goodsAmount;
  }

  public void setGoodsAmount(Double goodsAmount) {
    this.goodsAmount = goodsAmount;
  }

  public Integer getCheckedGoodsCount() {
    return checkedGoodsCount;
  }

  public void setCheckedGoodsCount(Integer checkedGoodsCount) {
    this.checkedGoodsCount = checkedGoodsCount;
  }

  public Integer getCheckedGoodsAmount() {
    return checkedGoodsAmount;
  }

  public void setCheckedGoodsAmount(Integer checkedGoodsAmount) {
    this.checkedGoodsAmount = checkedGoodsAmount;
  }

  @Override
  public String toString() {
    return "ApiCartStatistic [goodsCount=" + goodsCount + ", goodsAmount=" + goodsAmount + ", checkedGoodsCount=" + checkedGoodsCount + ", checkedGoodsAmount="
        + checkedGoodsAmount + "]";
  }

}
