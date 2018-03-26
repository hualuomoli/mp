package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Coupon;

// 
public class CouponQuery extends Coupon {

  /**  */
  private java.lang.String nameLeftLike;
  private java.lang.String nameRightLike;
  private java.lang.String nameLike;
  private java.lang.String nameNotEquals;
  private java.lang.String[] nameIns;
  private java.lang.String[] nameNotIns;
  /**  */
  private java.lang.Double type_moneyGreaterThan;
  private java.lang.Double type_moneyGreaterEqual;
  private java.lang.Double type_moneyLessEqual;
  private java.lang.Double type_moneyLessThan;
  private java.lang.Double type_moneyNotEquals;
  private java.lang.Double[] type_moneyIns;
  private java.lang.Double[] type_moneyNotIns;
  /**  */
  private java.lang.Integer send_typeGreaterThan;
  private java.lang.Integer send_typeGreaterEqual;
  private java.lang.Integer send_typeLessEqual;
  private java.lang.Integer send_typeLessThan;
  private java.lang.Integer send_typeNotEquals;
  private java.lang.Integer[] send_typeIns;
  private java.lang.Integer[] send_typeNotIns;
  /**  */
  private java.lang.Double min_amountGreaterThan;
  private java.lang.Double min_amountGreaterEqual;
  private java.lang.Double min_amountLessEqual;
  private java.lang.Double min_amountLessThan;
  private java.lang.Double min_amountNotEquals;
  private java.lang.Double[] min_amountIns;
  private java.lang.Double[] min_amountNotIns;
  /**  */
  private java.lang.Double max_amountGreaterThan;
  private java.lang.Double max_amountGreaterEqual;
  private java.lang.Double max_amountLessEqual;
  private java.lang.Double max_amountLessThan;
  private java.lang.Double max_amountNotEquals;
  private java.lang.Double[] max_amountIns;
  private java.lang.Double[] max_amountNotIns;
  /**  */
  private java.lang.Integer send_start_dateGreaterThan;
  private java.lang.Integer send_start_dateGreaterEqual;
  private java.lang.Integer send_start_dateLessEqual;
  private java.lang.Integer send_start_dateLessThan;
  private java.lang.Integer send_start_dateNotEquals;
  private java.lang.Integer[] send_start_dateIns;
  private java.lang.Integer[] send_start_dateNotIns;
  /**  */
  private java.lang.Integer send_end_dateGreaterThan;
  private java.lang.Integer send_end_dateGreaterEqual;
  private java.lang.Integer send_end_dateLessEqual;
  private java.lang.Integer send_end_dateLessThan;
  private java.lang.Integer send_end_dateNotEquals;
  private java.lang.Integer[] send_end_dateIns;
  private java.lang.Integer[] send_end_dateNotIns;
  /**  */
  private java.lang.Integer use_start_dateGreaterThan;
  private java.lang.Integer use_start_dateGreaterEqual;
  private java.lang.Integer use_start_dateLessEqual;
  private java.lang.Integer use_start_dateLessThan;
  private java.lang.Integer use_start_dateNotEquals;
  private java.lang.Integer[] use_start_dateIns;
  private java.lang.Integer[] use_start_dateNotIns;
  /**  */
  private java.lang.Integer use_end_dateGreaterThan;
  private java.lang.Integer use_end_dateGreaterEqual;
  private java.lang.Integer use_end_dateLessEqual;
  private java.lang.Integer use_end_dateLessThan;
  private java.lang.Integer use_end_dateNotEquals;
  private java.lang.Integer[] use_end_dateIns;
  private java.lang.Integer[] use_end_dateNotIns;
  /**  */
  private java.lang.Double min_goods_amountGreaterThan;
  private java.lang.Double min_goods_amountGreaterEqual;
  private java.lang.Double min_goods_amountLessEqual;
  private java.lang.Double min_goods_amountLessThan;
  private java.lang.Double min_goods_amountNotEquals;
  private java.lang.Double[] min_goods_amountIns;
  private java.lang.Double[] min_goods_amountNotIns;

  public CouponQuery() {
  }

  // getter and setter

  public java.lang.String getNameLeftLike() {
    return nameLeftLike;
  }

  public void setNameLeftLike(java.lang.String nameLeftLike) {
    this.nameLeftLike = nameLeftLike;
  }

  public java.lang.String getNameRightLike() {
    return nameRightLike;
  }

  public void setNameRightLike(java.lang.String nameRightLike) {
    this.nameRightLike = nameRightLike;
  }

  public java.lang.String getNameLike() {
    return nameLike;
  }

  public void setNameLike(java.lang.String nameLike) {
    this.nameLike = nameLike;
  }

  public java.lang.String getNameNotEquals() {
    return nameNotEquals;
  }

  public void setNameNotEquals(java.lang.String nameNotEquals) {
    this.nameNotEquals = nameNotEquals;
  }

  public java.lang.String[] getNameIns() {
    return nameIns;
  }

  public void setNameIns(java.lang.String[] nameIns) {
    this.nameIns = nameIns;
  }

  public java.lang.String[] getNameNotIns() {
    return nameNotIns;
  }

  public void setNameNotIns(java.lang.String[] nameNotIns) {
    this.nameNotIns = nameNotIns;
  }

  public java.lang.Double getType_moneyGreaterThan() {
    return type_moneyGreaterThan;
  }

  public void settype_moneyGreaterThan(java.lang.Double type_moneyGreaterThan) {
    this.type_moneyGreaterThan = type_moneyGreaterThan;
  }

  public java.lang.Double getType_moneyGreaterEqual() {
    return type_moneyGreaterEqual;
  }

  public void setType_moneyGreaterEqual(java.lang.Double type_moneyGreaterEqual) {
    this.type_moneyGreaterEqual = type_moneyGreaterEqual;
  }

  public java.lang.Double getType_moneyLessEqual() {
    return type_moneyLessEqual;
  }

  public void setType_moneyLessEqual(java.lang.Double type_moneyLessEqual) {
    this.type_moneyLessEqual = type_moneyLessEqual;
  }

  public java.lang.Double getType_moneyLessThan() {
    return type_moneyLessThan;
  }

  public void setType_moneyLessThan(java.lang.Double type_moneyLessThan) {
    this.type_moneyLessThan = type_moneyLessThan;
  }

  public java.lang.Double getType_moneyNotEquals() {
    return type_moneyNotEquals;
  }

  public void setType_moneyNotEquals(java.lang.Double type_moneyNotEquals) {
    this.type_moneyNotEquals = type_moneyNotEquals;
  }

  public java.lang.Double[] getType_moneyIns() {
    return type_moneyIns;
  }

  public void setType_moneyIns(java.lang.Double[] type_moneyIns) {
    this.type_moneyIns = type_moneyIns;
  }

  public java.lang.Double[] getType_moneyNotIns() {
    return type_moneyNotIns;
  }

  public void setType_moneyNotIns(java.lang.Double[] type_moneyNotIns) {
    this.type_moneyNotIns = type_moneyNotIns;
  }

  public java.lang.Integer getSend_typeGreaterThan() {
    return send_typeGreaterThan;
  }

  public void setsend_typeGreaterThan(java.lang.Integer send_typeGreaterThan) {
    this.send_typeGreaterThan = send_typeGreaterThan;
  }

  public java.lang.Integer getSend_typeGreaterEqual() {
    return send_typeGreaterEqual;
  }

  public void setSend_typeGreaterEqual(java.lang.Integer send_typeGreaterEqual) {
    this.send_typeGreaterEqual = send_typeGreaterEqual;
  }

  public java.lang.Integer getSend_typeLessEqual() {
    return send_typeLessEqual;
  }

  public void setSend_typeLessEqual(java.lang.Integer send_typeLessEqual) {
    this.send_typeLessEqual = send_typeLessEqual;
  }

  public java.lang.Integer getSend_typeLessThan() {
    return send_typeLessThan;
  }

  public void setSend_typeLessThan(java.lang.Integer send_typeLessThan) {
    this.send_typeLessThan = send_typeLessThan;
  }

  public java.lang.Integer getSend_typeNotEquals() {
    return send_typeNotEquals;
  }

  public void setSend_typeNotEquals(java.lang.Integer send_typeNotEquals) {
    this.send_typeNotEquals = send_typeNotEquals;
  }

  public java.lang.Integer[] getSend_typeIns() {
    return send_typeIns;
  }

  public void setSend_typeIns(java.lang.Integer[] send_typeIns) {
    this.send_typeIns = send_typeIns;
  }

  public java.lang.Integer[] getSend_typeNotIns() {
    return send_typeNotIns;
  }

  public void setSend_typeNotIns(java.lang.Integer[] send_typeNotIns) {
    this.send_typeNotIns = send_typeNotIns;
  }

  public java.lang.Double getMin_amountGreaterThan() {
    return min_amountGreaterThan;
  }

  public void setmin_amountGreaterThan(java.lang.Double min_amountGreaterThan) {
    this.min_amountGreaterThan = min_amountGreaterThan;
  }

  public java.lang.Double getMin_amountGreaterEqual() {
    return min_amountGreaterEqual;
  }

  public void setMin_amountGreaterEqual(java.lang.Double min_amountGreaterEqual) {
    this.min_amountGreaterEqual = min_amountGreaterEqual;
  }

  public java.lang.Double getMin_amountLessEqual() {
    return min_amountLessEqual;
  }

  public void setMin_amountLessEqual(java.lang.Double min_amountLessEqual) {
    this.min_amountLessEqual = min_amountLessEqual;
  }

  public java.lang.Double getMin_amountLessThan() {
    return min_amountLessThan;
  }

  public void setMin_amountLessThan(java.lang.Double min_amountLessThan) {
    this.min_amountLessThan = min_amountLessThan;
  }

  public java.lang.Double getMin_amountNotEquals() {
    return min_amountNotEquals;
  }

  public void setMin_amountNotEquals(java.lang.Double min_amountNotEquals) {
    this.min_amountNotEquals = min_amountNotEquals;
  }

  public java.lang.Double[] getMin_amountIns() {
    return min_amountIns;
  }

  public void setMin_amountIns(java.lang.Double[] min_amountIns) {
    this.min_amountIns = min_amountIns;
  }

  public java.lang.Double[] getMin_amountNotIns() {
    return min_amountNotIns;
  }

  public void setMin_amountNotIns(java.lang.Double[] min_amountNotIns) {
    this.min_amountNotIns = min_amountNotIns;
  }

  public java.lang.Double getMax_amountGreaterThan() {
    return max_amountGreaterThan;
  }

  public void setmax_amountGreaterThan(java.lang.Double max_amountGreaterThan) {
    this.max_amountGreaterThan = max_amountGreaterThan;
  }

  public java.lang.Double getMax_amountGreaterEqual() {
    return max_amountGreaterEqual;
  }

  public void setMax_amountGreaterEqual(java.lang.Double max_amountGreaterEqual) {
    this.max_amountGreaterEqual = max_amountGreaterEqual;
  }

  public java.lang.Double getMax_amountLessEqual() {
    return max_amountLessEqual;
  }

  public void setMax_amountLessEqual(java.lang.Double max_amountLessEqual) {
    this.max_amountLessEqual = max_amountLessEqual;
  }

  public java.lang.Double getMax_amountLessThan() {
    return max_amountLessThan;
  }

  public void setMax_amountLessThan(java.lang.Double max_amountLessThan) {
    this.max_amountLessThan = max_amountLessThan;
  }

  public java.lang.Double getMax_amountNotEquals() {
    return max_amountNotEquals;
  }

  public void setMax_amountNotEquals(java.lang.Double max_amountNotEquals) {
    this.max_amountNotEquals = max_amountNotEquals;
  }

  public java.lang.Double[] getMax_amountIns() {
    return max_amountIns;
  }

  public void setMax_amountIns(java.lang.Double[] max_amountIns) {
    this.max_amountIns = max_amountIns;
  }

  public java.lang.Double[] getMax_amountNotIns() {
    return max_amountNotIns;
  }

  public void setMax_amountNotIns(java.lang.Double[] max_amountNotIns) {
    this.max_amountNotIns = max_amountNotIns;
  }

  public java.lang.Integer getSend_start_dateGreaterThan() {
    return send_start_dateGreaterThan;
  }

  public void setsend_start_dateGreaterThan(java.lang.Integer send_start_dateGreaterThan) {
    this.send_start_dateGreaterThan = send_start_dateGreaterThan;
  }

  public java.lang.Integer getSend_start_dateGreaterEqual() {
    return send_start_dateGreaterEqual;
  }

  public void setSend_start_dateGreaterEqual(java.lang.Integer send_start_dateGreaterEqual) {
    this.send_start_dateGreaterEqual = send_start_dateGreaterEqual;
  }

  public java.lang.Integer getSend_start_dateLessEqual() {
    return send_start_dateLessEqual;
  }

  public void setSend_start_dateLessEqual(java.lang.Integer send_start_dateLessEqual) {
    this.send_start_dateLessEqual = send_start_dateLessEqual;
  }

  public java.lang.Integer getSend_start_dateLessThan() {
    return send_start_dateLessThan;
  }

  public void setSend_start_dateLessThan(java.lang.Integer send_start_dateLessThan) {
    this.send_start_dateLessThan = send_start_dateLessThan;
  }

  public java.lang.Integer getSend_start_dateNotEquals() {
    return send_start_dateNotEquals;
  }

  public void setSend_start_dateNotEquals(java.lang.Integer send_start_dateNotEquals) {
    this.send_start_dateNotEquals = send_start_dateNotEquals;
  }

  public java.lang.Integer[] getSend_start_dateIns() {
    return send_start_dateIns;
  }

  public void setSend_start_dateIns(java.lang.Integer[] send_start_dateIns) {
    this.send_start_dateIns = send_start_dateIns;
  }

  public java.lang.Integer[] getSend_start_dateNotIns() {
    return send_start_dateNotIns;
  }

  public void setSend_start_dateNotIns(java.lang.Integer[] send_start_dateNotIns) {
    this.send_start_dateNotIns = send_start_dateNotIns;
  }

  public java.lang.Integer getSend_end_dateGreaterThan() {
    return send_end_dateGreaterThan;
  }

  public void setsend_end_dateGreaterThan(java.lang.Integer send_end_dateGreaterThan) {
    this.send_end_dateGreaterThan = send_end_dateGreaterThan;
  }

  public java.lang.Integer getSend_end_dateGreaterEqual() {
    return send_end_dateGreaterEqual;
  }

  public void setSend_end_dateGreaterEqual(java.lang.Integer send_end_dateGreaterEqual) {
    this.send_end_dateGreaterEqual = send_end_dateGreaterEqual;
  }

  public java.lang.Integer getSend_end_dateLessEqual() {
    return send_end_dateLessEqual;
  }

  public void setSend_end_dateLessEqual(java.lang.Integer send_end_dateLessEqual) {
    this.send_end_dateLessEqual = send_end_dateLessEqual;
  }

  public java.lang.Integer getSend_end_dateLessThan() {
    return send_end_dateLessThan;
  }

  public void setSend_end_dateLessThan(java.lang.Integer send_end_dateLessThan) {
    this.send_end_dateLessThan = send_end_dateLessThan;
  }

  public java.lang.Integer getSend_end_dateNotEquals() {
    return send_end_dateNotEquals;
  }

  public void setSend_end_dateNotEquals(java.lang.Integer send_end_dateNotEquals) {
    this.send_end_dateNotEquals = send_end_dateNotEquals;
  }

  public java.lang.Integer[] getSend_end_dateIns() {
    return send_end_dateIns;
  }

  public void setSend_end_dateIns(java.lang.Integer[] send_end_dateIns) {
    this.send_end_dateIns = send_end_dateIns;
  }

  public java.lang.Integer[] getSend_end_dateNotIns() {
    return send_end_dateNotIns;
  }

  public void setSend_end_dateNotIns(java.lang.Integer[] send_end_dateNotIns) {
    this.send_end_dateNotIns = send_end_dateNotIns;
  }

  public java.lang.Integer getUse_start_dateGreaterThan() {
    return use_start_dateGreaterThan;
  }

  public void setuse_start_dateGreaterThan(java.lang.Integer use_start_dateGreaterThan) {
    this.use_start_dateGreaterThan = use_start_dateGreaterThan;
  }

  public java.lang.Integer getUse_start_dateGreaterEqual() {
    return use_start_dateGreaterEqual;
  }

  public void setUse_start_dateGreaterEqual(java.lang.Integer use_start_dateGreaterEqual) {
    this.use_start_dateGreaterEqual = use_start_dateGreaterEqual;
  }

  public java.lang.Integer getUse_start_dateLessEqual() {
    return use_start_dateLessEqual;
  }

  public void setUse_start_dateLessEqual(java.lang.Integer use_start_dateLessEqual) {
    this.use_start_dateLessEqual = use_start_dateLessEqual;
  }

  public java.lang.Integer getUse_start_dateLessThan() {
    return use_start_dateLessThan;
  }

  public void setUse_start_dateLessThan(java.lang.Integer use_start_dateLessThan) {
    this.use_start_dateLessThan = use_start_dateLessThan;
  }

  public java.lang.Integer getUse_start_dateNotEquals() {
    return use_start_dateNotEquals;
  }

  public void setUse_start_dateNotEquals(java.lang.Integer use_start_dateNotEquals) {
    this.use_start_dateNotEquals = use_start_dateNotEquals;
  }

  public java.lang.Integer[] getUse_start_dateIns() {
    return use_start_dateIns;
  }

  public void setUse_start_dateIns(java.lang.Integer[] use_start_dateIns) {
    this.use_start_dateIns = use_start_dateIns;
  }

  public java.lang.Integer[] getUse_start_dateNotIns() {
    return use_start_dateNotIns;
  }

  public void setUse_start_dateNotIns(java.lang.Integer[] use_start_dateNotIns) {
    this.use_start_dateNotIns = use_start_dateNotIns;
  }

  public java.lang.Integer getUse_end_dateGreaterThan() {
    return use_end_dateGreaterThan;
  }

  public void setuse_end_dateGreaterThan(java.lang.Integer use_end_dateGreaterThan) {
    this.use_end_dateGreaterThan = use_end_dateGreaterThan;
  }

  public java.lang.Integer getUse_end_dateGreaterEqual() {
    return use_end_dateGreaterEqual;
  }

  public void setUse_end_dateGreaterEqual(java.lang.Integer use_end_dateGreaterEqual) {
    this.use_end_dateGreaterEqual = use_end_dateGreaterEqual;
  }

  public java.lang.Integer getUse_end_dateLessEqual() {
    return use_end_dateLessEqual;
  }

  public void setUse_end_dateLessEqual(java.lang.Integer use_end_dateLessEqual) {
    this.use_end_dateLessEqual = use_end_dateLessEqual;
  }

  public java.lang.Integer getUse_end_dateLessThan() {
    return use_end_dateLessThan;
  }

  public void setUse_end_dateLessThan(java.lang.Integer use_end_dateLessThan) {
    this.use_end_dateLessThan = use_end_dateLessThan;
  }

  public java.lang.Integer getUse_end_dateNotEquals() {
    return use_end_dateNotEquals;
  }

  public void setUse_end_dateNotEquals(java.lang.Integer use_end_dateNotEquals) {
    this.use_end_dateNotEquals = use_end_dateNotEquals;
  }

  public java.lang.Integer[] getUse_end_dateIns() {
    return use_end_dateIns;
  }

  public void setUse_end_dateIns(java.lang.Integer[] use_end_dateIns) {
    this.use_end_dateIns = use_end_dateIns;
  }

  public java.lang.Integer[] getUse_end_dateNotIns() {
    return use_end_dateNotIns;
  }

  public void setUse_end_dateNotIns(java.lang.Integer[] use_end_dateNotIns) {
    this.use_end_dateNotIns = use_end_dateNotIns;
  }

  public java.lang.Double getMin_goods_amountGreaterThan() {
    return min_goods_amountGreaterThan;
  }

  public void setmin_goods_amountGreaterThan(java.lang.Double min_goods_amountGreaterThan) {
    this.min_goods_amountGreaterThan = min_goods_amountGreaterThan;
  }

  public java.lang.Double getMin_goods_amountGreaterEqual() {
    return min_goods_amountGreaterEqual;
  }

  public void setMin_goods_amountGreaterEqual(java.lang.Double min_goods_amountGreaterEqual) {
    this.min_goods_amountGreaterEqual = min_goods_amountGreaterEqual;
  }

  public java.lang.Double getMin_goods_amountLessEqual() {
    return min_goods_amountLessEqual;
  }

  public void setMin_goods_amountLessEqual(java.lang.Double min_goods_amountLessEqual) {
    this.min_goods_amountLessEqual = min_goods_amountLessEqual;
  }

  public java.lang.Double getMin_goods_amountLessThan() {
    return min_goods_amountLessThan;
  }

  public void setMin_goods_amountLessThan(java.lang.Double min_goods_amountLessThan) {
    this.min_goods_amountLessThan = min_goods_amountLessThan;
  }

  public java.lang.Double getMin_goods_amountNotEquals() {
    return min_goods_amountNotEquals;
  }

  public void setMin_goods_amountNotEquals(java.lang.Double min_goods_amountNotEquals) {
    this.min_goods_amountNotEquals = min_goods_amountNotEquals;
  }

  public java.lang.Double[] getMin_goods_amountIns() {
    return min_goods_amountIns;
  }

  public void setMin_goods_amountIns(java.lang.Double[] min_goods_amountIns) {
    this.min_goods_amountIns = min_goods_amountIns;
  }

  public java.lang.Double[] getMin_goods_amountNotIns() {
    return min_goods_amountNotIns;
  }

  public void setMin_goods_amountNotIns(java.lang.Double[] min_goods_amountNotIns) {
    this.min_goods_amountNotIns = min_goods_amountNotIns;
  }

}
