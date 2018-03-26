package cn.hualuomoli.mp.nideshop.base.query.entity;

import cn.hualuomoli.mp.nideshop.base.entity.Order;

// 
public class OrderQuery extends Order {

  /**  */
  private java.lang.String order_snLeftLike;
  private java.lang.String order_snRightLike;
  private java.lang.String order_snLike;
  private java.lang.String order_snNotEquals;
  private java.lang.String[] order_snIns;
  private java.lang.String[] order_snNotIns;
  /**  */
  private java.lang.Integer user_idGreaterThan;
  private java.lang.Integer user_idGreaterEqual;
  private java.lang.Integer user_idLessEqual;
  private java.lang.Integer user_idLessThan;
  private java.lang.Integer user_idNotEquals;
  private java.lang.Integer[] user_idIns;
  private java.lang.Integer[] user_idNotIns;
  /**  */
  private java.lang.Integer order_statusGreaterThan;
  private java.lang.Integer order_statusGreaterEqual;
  private java.lang.Integer order_statusLessEqual;
  private java.lang.Integer order_statusLessThan;
  private java.lang.Integer order_statusNotEquals;
  private java.lang.Integer[] order_statusIns;
  private java.lang.Integer[] order_statusNotIns;
  /**  */
  private java.lang.Integer shipping_statusGreaterThan;
  private java.lang.Integer shipping_statusGreaterEqual;
  private java.lang.Integer shipping_statusLessEqual;
  private java.lang.Integer shipping_statusLessThan;
  private java.lang.Integer shipping_statusNotEquals;
  private java.lang.Integer[] shipping_statusIns;
  private java.lang.Integer[] shipping_statusNotIns;
  /**  */
  private java.lang.Integer pay_statusGreaterThan;
  private java.lang.Integer pay_statusGreaterEqual;
  private java.lang.Integer pay_statusLessEqual;
  private java.lang.Integer pay_statusLessThan;
  private java.lang.Integer pay_statusNotEquals;
  private java.lang.Integer[] pay_statusIns;
  private java.lang.Integer[] pay_statusNotIns;
  /**  */
  private java.lang.String consigneeLeftLike;
  private java.lang.String consigneeRightLike;
  private java.lang.String consigneeLike;
  private java.lang.String consigneeNotEquals;
  private java.lang.String[] consigneeIns;
  private java.lang.String[] consigneeNotIns;
  /**  */
  private java.lang.Integer countryGreaterThan;
  private java.lang.Integer countryGreaterEqual;
  private java.lang.Integer countryLessEqual;
  private java.lang.Integer countryLessThan;
  private java.lang.Integer countryNotEquals;
  private java.lang.Integer[] countryIns;
  private java.lang.Integer[] countryNotIns;
  /**  */
  private java.lang.Integer provinceGreaterThan;
  private java.lang.Integer provinceGreaterEqual;
  private java.lang.Integer provinceLessEqual;
  private java.lang.Integer provinceLessThan;
  private java.lang.Integer provinceNotEquals;
  private java.lang.Integer[] provinceIns;
  private java.lang.Integer[] provinceNotIns;
  /**  */
  private java.lang.Integer cityGreaterThan;
  private java.lang.Integer cityGreaterEqual;
  private java.lang.Integer cityLessEqual;
  private java.lang.Integer cityLessThan;
  private java.lang.Integer cityNotEquals;
  private java.lang.Integer[] cityIns;
  private java.lang.Integer[] cityNotIns;
  /**  */
  private java.lang.Integer districtGreaterThan;
  private java.lang.Integer districtGreaterEqual;
  private java.lang.Integer districtLessEqual;
  private java.lang.Integer districtLessThan;
  private java.lang.Integer districtNotEquals;
  private java.lang.Integer[] districtIns;
  private java.lang.Integer[] districtNotIns;
  /**  */
  private java.lang.String addressLeftLike;
  private java.lang.String addressRightLike;
  private java.lang.String addressLike;
  private java.lang.String addressNotEquals;
  private java.lang.String[] addressIns;
  private java.lang.String[] addressNotIns;
  /**  */
  private java.lang.String mobileLeftLike;
  private java.lang.String mobileRightLike;
  private java.lang.String mobileLike;
  private java.lang.String mobileNotEquals;
  private java.lang.String[] mobileIns;
  private java.lang.String[] mobileNotIns;
  /**  */
  private java.lang.String postscriptLeftLike;
  private java.lang.String postscriptRightLike;
  private java.lang.String postscriptLike;
  private java.lang.String postscriptNotEquals;
  private java.lang.String[] postscriptIns;
  private java.lang.String[] postscriptNotIns;
  /**  */
  private java.lang.Double shipping_feeGreaterThan;
  private java.lang.Double shipping_feeGreaterEqual;
  private java.lang.Double shipping_feeLessEqual;
  private java.lang.Double shipping_feeLessThan;
  private java.lang.Double shipping_feeNotEquals;
  private java.lang.Double[] shipping_feeIns;
  private java.lang.Double[] shipping_feeNotIns;
  /**  */
  private java.lang.String pay_nameLeftLike;
  private java.lang.String pay_nameRightLike;
  private java.lang.String pay_nameLike;
  private java.lang.String pay_nameNotEquals;
  private java.lang.String[] pay_nameIns;
  private java.lang.String[] pay_nameNotIns;
  /**  */
  private java.lang.Integer pay_idGreaterThan;
  private java.lang.Integer pay_idGreaterEqual;
  private java.lang.Integer pay_idLessEqual;
  private java.lang.Integer pay_idLessThan;
  private java.lang.Integer pay_idNotEquals;
  private java.lang.Integer[] pay_idIns;
  private java.lang.Integer[] pay_idNotIns;
  /** 实际需要支付的金额 */
  private java.lang.Double actual_priceGreaterThan;
  private java.lang.Double actual_priceGreaterEqual;
  private java.lang.Double actual_priceLessEqual;
  private java.lang.Double actual_priceLessThan;
  private java.lang.Double actual_priceNotEquals;
  private java.lang.Double[] actual_priceIns;
  private java.lang.Double[] actual_priceNotIns;
  /**  */
  private java.lang.Integer integralGreaterThan;
  private java.lang.Integer integralGreaterEqual;
  private java.lang.Integer integralLessEqual;
  private java.lang.Integer integralLessThan;
  private java.lang.Integer integralNotEquals;
  private java.lang.Integer[] integralIns;
  private java.lang.Integer[] integralNotIns;
  /**  */
  private java.lang.Double integral_moneyGreaterThan;
  private java.lang.Double integral_moneyGreaterEqual;
  private java.lang.Double integral_moneyLessEqual;
  private java.lang.Double integral_moneyLessThan;
  private java.lang.Double integral_moneyNotEquals;
  private java.lang.Double[] integral_moneyIns;
  private java.lang.Double[] integral_moneyNotIns;
  /** 订单总价 */
  private java.lang.Double order_priceGreaterThan;
  private java.lang.Double order_priceGreaterEqual;
  private java.lang.Double order_priceLessEqual;
  private java.lang.Double order_priceLessThan;
  private java.lang.Double order_priceNotEquals;
  private java.lang.Double[] order_priceIns;
  private java.lang.Double[] order_priceNotIns;
  /** 商品总价 */
  private java.lang.Double goods_priceGreaterThan;
  private java.lang.Double goods_priceGreaterEqual;
  private java.lang.Double goods_priceLessEqual;
  private java.lang.Double goods_priceLessThan;
  private java.lang.Double goods_priceNotEquals;
  private java.lang.Double[] goods_priceIns;
  private java.lang.Double[] goods_priceNotIns;
  /**  */
  private java.lang.Integer add_timeGreaterThan;
  private java.lang.Integer add_timeGreaterEqual;
  private java.lang.Integer add_timeLessEqual;
  private java.lang.Integer add_timeLessThan;
  private java.lang.Integer add_timeNotEquals;
  private java.lang.Integer[] add_timeIns;
  private java.lang.Integer[] add_timeNotIns;
  /**  */
  private java.lang.Integer confirm_timeGreaterThan;
  private java.lang.Integer confirm_timeGreaterEqual;
  private java.lang.Integer confirm_timeLessEqual;
  private java.lang.Integer confirm_timeLessThan;
  private java.lang.Integer confirm_timeNotEquals;
  private java.lang.Integer[] confirm_timeIns;
  private java.lang.Integer[] confirm_timeNotIns;
  /**  */
  private java.lang.Integer pay_timeGreaterThan;
  private java.lang.Integer pay_timeGreaterEqual;
  private java.lang.Integer pay_timeLessEqual;
  private java.lang.Integer pay_timeLessThan;
  private java.lang.Integer pay_timeNotEquals;
  private java.lang.Integer[] pay_timeIns;
  private java.lang.Integer[] pay_timeNotIns;
  /** 配送费用 */
  private java.lang.Integer freight_priceGreaterThan;
  private java.lang.Integer freight_priceGreaterEqual;
  private java.lang.Integer freight_priceLessEqual;
  private java.lang.Integer freight_priceLessThan;
  private java.lang.Integer freight_priceNotEquals;
  private java.lang.Integer[] freight_priceIns;
  private java.lang.Integer[] freight_priceNotIns;
  /** 使用的优惠券id */
  private java.lang.Integer coupon_idGreaterThan;
  private java.lang.Integer coupon_idGreaterEqual;
  private java.lang.Integer coupon_idLessEqual;
  private java.lang.Integer coupon_idLessThan;
  private java.lang.Integer coupon_idNotEquals;
  private java.lang.Integer[] coupon_idIns;
  private java.lang.Integer[] coupon_idNotIns;
  /**  */
  private java.lang.Integer parent_idGreaterThan;
  private java.lang.Integer parent_idGreaterEqual;
  private java.lang.Integer parent_idLessEqual;
  private java.lang.Integer parent_idLessThan;
  private java.lang.Integer parent_idNotEquals;
  private java.lang.Integer[] parent_idIns;
  private java.lang.Integer[] parent_idNotIns;
  /**  */
  private java.lang.Double coupon_priceGreaterThan;
  private java.lang.Double coupon_priceGreaterEqual;
  private java.lang.Double coupon_priceLessEqual;
  private java.lang.Double coupon_priceLessThan;
  private java.lang.Double coupon_priceNotEquals;
  private java.lang.Double[] coupon_priceIns;
  private java.lang.Double[] coupon_priceNotIns;
  /**  */
  private java.lang.String callback_statusLeftLike;
  private java.lang.String callback_statusRightLike;
  private java.lang.String callback_statusLike;
  private java.lang.String callback_statusNotEquals;
  private java.lang.String[] callback_statusIns;
  private java.lang.String[] callback_statusNotIns;

  public OrderQuery() {
  }

  // getter and setter

  public java.lang.String getOrder_snLeftLike() {
    return order_snLeftLike;
  }

  public void setOrder_snLeftLike(java.lang.String order_snLeftLike) {
    this.order_snLeftLike = order_snLeftLike;
  }

  public java.lang.String getOrder_snRightLike() {
    return order_snRightLike;
  }

  public void setOrder_snRightLike(java.lang.String order_snRightLike) {
    this.order_snRightLike = order_snRightLike;
  }

  public java.lang.String getOrder_snLike() {
    return order_snLike;
  }

  public void setOrder_snLike(java.lang.String order_snLike) {
    this.order_snLike = order_snLike;
  }

  public java.lang.String getOrder_snNotEquals() {
    return order_snNotEquals;
  }

  public void setOrder_snNotEquals(java.lang.String order_snNotEquals) {
    this.order_snNotEquals = order_snNotEquals;
  }

  public java.lang.String[] getOrder_snIns() {
    return order_snIns;
  }

  public void setOrder_snIns(java.lang.String[] order_snIns) {
    this.order_snIns = order_snIns;
  }

  public java.lang.String[] getOrder_snNotIns() {
    return order_snNotIns;
  }

  public void setOrder_snNotIns(java.lang.String[] order_snNotIns) {
    this.order_snNotIns = order_snNotIns;
  }

  public java.lang.Integer getUser_idGreaterThan() {
    return user_idGreaterThan;
  }

  public void setuser_idGreaterThan(java.lang.Integer user_idGreaterThan) {
    this.user_idGreaterThan = user_idGreaterThan;
  }

  public java.lang.Integer getUser_idGreaterEqual() {
    return user_idGreaterEqual;
  }

  public void setUser_idGreaterEqual(java.lang.Integer user_idGreaterEqual) {
    this.user_idGreaterEqual = user_idGreaterEqual;
  }

  public java.lang.Integer getUser_idLessEqual() {
    return user_idLessEqual;
  }

  public void setUser_idLessEqual(java.lang.Integer user_idLessEqual) {
    this.user_idLessEqual = user_idLessEqual;
  }

  public java.lang.Integer getUser_idLessThan() {
    return user_idLessThan;
  }

  public void setUser_idLessThan(java.lang.Integer user_idLessThan) {
    this.user_idLessThan = user_idLessThan;
  }

  public java.lang.Integer getUser_idNotEquals() {
    return user_idNotEquals;
  }

  public void setUser_idNotEquals(java.lang.Integer user_idNotEquals) {
    this.user_idNotEquals = user_idNotEquals;
  }

  public java.lang.Integer[] getUser_idIns() {
    return user_idIns;
  }

  public void setUser_idIns(java.lang.Integer[] user_idIns) {
    this.user_idIns = user_idIns;
  }

  public java.lang.Integer[] getUser_idNotIns() {
    return user_idNotIns;
  }

  public void setUser_idNotIns(java.lang.Integer[] user_idNotIns) {
    this.user_idNotIns = user_idNotIns;
  }

  public java.lang.Integer getOrder_statusGreaterThan() {
    return order_statusGreaterThan;
  }

  public void setorder_statusGreaterThan(java.lang.Integer order_statusGreaterThan) {
    this.order_statusGreaterThan = order_statusGreaterThan;
  }

  public java.lang.Integer getOrder_statusGreaterEqual() {
    return order_statusGreaterEqual;
  }

  public void setOrder_statusGreaterEqual(java.lang.Integer order_statusGreaterEqual) {
    this.order_statusGreaterEqual = order_statusGreaterEqual;
  }

  public java.lang.Integer getOrder_statusLessEqual() {
    return order_statusLessEqual;
  }

  public void setOrder_statusLessEqual(java.lang.Integer order_statusLessEqual) {
    this.order_statusLessEqual = order_statusLessEqual;
  }

  public java.lang.Integer getOrder_statusLessThan() {
    return order_statusLessThan;
  }

  public void setOrder_statusLessThan(java.lang.Integer order_statusLessThan) {
    this.order_statusLessThan = order_statusLessThan;
  }

  public java.lang.Integer getOrder_statusNotEquals() {
    return order_statusNotEquals;
  }

  public void setOrder_statusNotEquals(java.lang.Integer order_statusNotEquals) {
    this.order_statusNotEquals = order_statusNotEquals;
  }

  public java.lang.Integer[] getOrder_statusIns() {
    return order_statusIns;
  }

  public void setOrder_statusIns(java.lang.Integer[] order_statusIns) {
    this.order_statusIns = order_statusIns;
  }

  public java.lang.Integer[] getOrder_statusNotIns() {
    return order_statusNotIns;
  }

  public void setOrder_statusNotIns(java.lang.Integer[] order_statusNotIns) {
    this.order_statusNotIns = order_statusNotIns;
  }

  public java.lang.Integer getShipping_statusGreaterThan() {
    return shipping_statusGreaterThan;
  }

  public void setshipping_statusGreaterThan(java.lang.Integer shipping_statusGreaterThan) {
    this.shipping_statusGreaterThan = shipping_statusGreaterThan;
  }

  public java.lang.Integer getShipping_statusGreaterEqual() {
    return shipping_statusGreaterEqual;
  }

  public void setShipping_statusGreaterEqual(java.lang.Integer shipping_statusGreaterEqual) {
    this.shipping_statusGreaterEqual = shipping_statusGreaterEqual;
  }

  public java.lang.Integer getShipping_statusLessEqual() {
    return shipping_statusLessEqual;
  }

  public void setShipping_statusLessEqual(java.lang.Integer shipping_statusLessEqual) {
    this.shipping_statusLessEqual = shipping_statusLessEqual;
  }

  public java.lang.Integer getShipping_statusLessThan() {
    return shipping_statusLessThan;
  }

  public void setShipping_statusLessThan(java.lang.Integer shipping_statusLessThan) {
    this.shipping_statusLessThan = shipping_statusLessThan;
  }

  public java.lang.Integer getShipping_statusNotEquals() {
    return shipping_statusNotEquals;
  }

  public void setShipping_statusNotEquals(java.lang.Integer shipping_statusNotEquals) {
    this.shipping_statusNotEquals = shipping_statusNotEquals;
  }

  public java.lang.Integer[] getShipping_statusIns() {
    return shipping_statusIns;
  }

  public void setShipping_statusIns(java.lang.Integer[] shipping_statusIns) {
    this.shipping_statusIns = shipping_statusIns;
  }

  public java.lang.Integer[] getShipping_statusNotIns() {
    return shipping_statusNotIns;
  }

  public void setShipping_statusNotIns(java.lang.Integer[] shipping_statusNotIns) {
    this.shipping_statusNotIns = shipping_statusNotIns;
  }

  public java.lang.Integer getPay_statusGreaterThan() {
    return pay_statusGreaterThan;
  }

  public void setpay_statusGreaterThan(java.lang.Integer pay_statusGreaterThan) {
    this.pay_statusGreaterThan = pay_statusGreaterThan;
  }

  public java.lang.Integer getPay_statusGreaterEqual() {
    return pay_statusGreaterEqual;
  }

  public void setPay_statusGreaterEqual(java.lang.Integer pay_statusGreaterEqual) {
    this.pay_statusGreaterEqual = pay_statusGreaterEqual;
  }

  public java.lang.Integer getPay_statusLessEqual() {
    return pay_statusLessEqual;
  }

  public void setPay_statusLessEqual(java.lang.Integer pay_statusLessEqual) {
    this.pay_statusLessEqual = pay_statusLessEqual;
  }

  public java.lang.Integer getPay_statusLessThan() {
    return pay_statusLessThan;
  }

  public void setPay_statusLessThan(java.lang.Integer pay_statusLessThan) {
    this.pay_statusLessThan = pay_statusLessThan;
  }

  public java.lang.Integer getPay_statusNotEquals() {
    return pay_statusNotEquals;
  }

  public void setPay_statusNotEquals(java.lang.Integer pay_statusNotEquals) {
    this.pay_statusNotEquals = pay_statusNotEquals;
  }

  public java.lang.Integer[] getPay_statusIns() {
    return pay_statusIns;
  }

  public void setPay_statusIns(java.lang.Integer[] pay_statusIns) {
    this.pay_statusIns = pay_statusIns;
  }

  public java.lang.Integer[] getPay_statusNotIns() {
    return pay_statusNotIns;
  }

  public void setPay_statusNotIns(java.lang.Integer[] pay_statusNotIns) {
    this.pay_statusNotIns = pay_statusNotIns;
  }

  public java.lang.String getConsigneeLeftLike() {
    return consigneeLeftLike;
  }

  public void setConsigneeLeftLike(java.lang.String consigneeLeftLike) {
    this.consigneeLeftLike = consigneeLeftLike;
  }

  public java.lang.String getConsigneeRightLike() {
    return consigneeRightLike;
  }

  public void setConsigneeRightLike(java.lang.String consigneeRightLike) {
    this.consigneeRightLike = consigneeRightLike;
  }

  public java.lang.String getConsigneeLike() {
    return consigneeLike;
  }

  public void setConsigneeLike(java.lang.String consigneeLike) {
    this.consigneeLike = consigneeLike;
  }

  public java.lang.String getConsigneeNotEquals() {
    return consigneeNotEquals;
  }

  public void setConsigneeNotEquals(java.lang.String consigneeNotEquals) {
    this.consigneeNotEquals = consigneeNotEquals;
  }

  public java.lang.String[] getConsigneeIns() {
    return consigneeIns;
  }

  public void setConsigneeIns(java.lang.String[] consigneeIns) {
    this.consigneeIns = consigneeIns;
  }

  public java.lang.String[] getConsigneeNotIns() {
    return consigneeNotIns;
  }

  public void setConsigneeNotIns(java.lang.String[] consigneeNotIns) {
    this.consigneeNotIns = consigneeNotIns;
  }

  public java.lang.Integer getCountryGreaterThan() {
    return countryGreaterThan;
  }

  public void setcountryGreaterThan(java.lang.Integer countryGreaterThan) {
    this.countryGreaterThan = countryGreaterThan;
  }

  public java.lang.Integer getCountryGreaterEqual() {
    return countryGreaterEqual;
  }

  public void setCountryGreaterEqual(java.lang.Integer countryGreaterEqual) {
    this.countryGreaterEqual = countryGreaterEqual;
  }

  public java.lang.Integer getCountryLessEqual() {
    return countryLessEqual;
  }

  public void setCountryLessEqual(java.lang.Integer countryLessEqual) {
    this.countryLessEqual = countryLessEqual;
  }

  public java.lang.Integer getCountryLessThan() {
    return countryLessThan;
  }

  public void setCountryLessThan(java.lang.Integer countryLessThan) {
    this.countryLessThan = countryLessThan;
  }

  public java.lang.Integer getCountryNotEquals() {
    return countryNotEquals;
  }

  public void setCountryNotEquals(java.lang.Integer countryNotEquals) {
    this.countryNotEquals = countryNotEquals;
  }

  public java.lang.Integer[] getCountryIns() {
    return countryIns;
  }

  public void setCountryIns(java.lang.Integer[] countryIns) {
    this.countryIns = countryIns;
  }

  public java.lang.Integer[] getCountryNotIns() {
    return countryNotIns;
  }

  public void setCountryNotIns(java.lang.Integer[] countryNotIns) {
    this.countryNotIns = countryNotIns;
  }

  public java.lang.Integer getProvinceGreaterThan() {
    return provinceGreaterThan;
  }

  public void setprovinceGreaterThan(java.lang.Integer provinceGreaterThan) {
    this.provinceGreaterThan = provinceGreaterThan;
  }

  public java.lang.Integer getProvinceGreaterEqual() {
    return provinceGreaterEqual;
  }

  public void setProvinceGreaterEqual(java.lang.Integer provinceGreaterEqual) {
    this.provinceGreaterEqual = provinceGreaterEqual;
  }

  public java.lang.Integer getProvinceLessEqual() {
    return provinceLessEqual;
  }

  public void setProvinceLessEqual(java.lang.Integer provinceLessEqual) {
    this.provinceLessEqual = provinceLessEqual;
  }

  public java.lang.Integer getProvinceLessThan() {
    return provinceLessThan;
  }

  public void setProvinceLessThan(java.lang.Integer provinceLessThan) {
    this.provinceLessThan = provinceLessThan;
  }

  public java.lang.Integer getProvinceNotEquals() {
    return provinceNotEquals;
  }

  public void setProvinceNotEquals(java.lang.Integer provinceNotEquals) {
    this.provinceNotEquals = provinceNotEquals;
  }

  public java.lang.Integer[] getProvinceIns() {
    return provinceIns;
  }

  public void setProvinceIns(java.lang.Integer[] provinceIns) {
    this.provinceIns = provinceIns;
  }

  public java.lang.Integer[] getProvinceNotIns() {
    return provinceNotIns;
  }

  public void setProvinceNotIns(java.lang.Integer[] provinceNotIns) {
    this.provinceNotIns = provinceNotIns;
  }

  public java.lang.Integer getCityGreaterThan() {
    return cityGreaterThan;
  }

  public void setcityGreaterThan(java.lang.Integer cityGreaterThan) {
    this.cityGreaterThan = cityGreaterThan;
  }

  public java.lang.Integer getCityGreaterEqual() {
    return cityGreaterEqual;
  }

  public void setCityGreaterEqual(java.lang.Integer cityGreaterEqual) {
    this.cityGreaterEqual = cityGreaterEqual;
  }

  public java.lang.Integer getCityLessEqual() {
    return cityLessEqual;
  }

  public void setCityLessEqual(java.lang.Integer cityLessEqual) {
    this.cityLessEqual = cityLessEqual;
  }

  public java.lang.Integer getCityLessThan() {
    return cityLessThan;
  }

  public void setCityLessThan(java.lang.Integer cityLessThan) {
    this.cityLessThan = cityLessThan;
  }

  public java.lang.Integer getCityNotEquals() {
    return cityNotEquals;
  }

  public void setCityNotEquals(java.lang.Integer cityNotEquals) {
    this.cityNotEquals = cityNotEquals;
  }

  public java.lang.Integer[] getCityIns() {
    return cityIns;
  }

  public void setCityIns(java.lang.Integer[] cityIns) {
    this.cityIns = cityIns;
  }

  public java.lang.Integer[] getCityNotIns() {
    return cityNotIns;
  }

  public void setCityNotIns(java.lang.Integer[] cityNotIns) {
    this.cityNotIns = cityNotIns;
  }

  public java.lang.Integer getDistrictGreaterThan() {
    return districtGreaterThan;
  }

  public void setdistrictGreaterThan(java.lang.Integer districtGreaterThan) {
    this.districtGreaterThan = districtGreaterThan;
  }

  public java.lang.Integer getDistrictGreaterEqual() {
    return districtGreaterEqual;
  }

  public void setDistrictGreaterEqual(java.lang.Integer districtGreaterEqual) {
    this.districtGreaterEqual = districtGreaterEqual;
  }

  public java.lang.Integer getDistrictLessEqual() {
    return districtLessEqual;
  }

  public void setDistrictLessEqual(java.lang.Integer districtLessEqual) {
    this.districtLessEqual = districtLessEqual;
  }

  public java.lang.Integer getDistrictLessThan() {
    return districtLessThan;
  }

  public void setDistrictLessThan(java.lang.Integer districtLessThan) {
    this.districtLessThan = districtLessThan;
  }

  public java.lang.Integer getDistrictNotEquals() {
    return districtNotEquals;
  }

  public void setDistrictNotEquals(java.lang.Integer districtNotEquals) {
    this.districtNotEquals = districtNotEquals;
  }

  public java.lang.Integer[] getDistrictIns() {
    return districtIns;
  }

  public void setDistrictIns(java.lang.Integer[] districtIns) {
    this.districtIns = districtIns;
  }

  public java.lang.Integer[] getDistrictNotIns() {
    return districtNotIns;
  }

  public void setDistrictNotIns(java.lang.Integer[] districtNotIns) {
    this.districtNotIns = districtNotIns;
  }

  public java.lang.String getAddressLeftLike() {
    return addressLeftLike;
  }

  public void setAddressLeftLike(java.lang.String addressLeftLike) {
    this.addressLeftLike = addressLeftLike;
  }

  public java.lang.String getAddressRightLike() {
    return addressRightLike;
  }

  public void setAddressRightLike(java.lang.String addressRightLike) {
    this.addressRightLike = addressRightLike;
  }

  public java.lang.String getAddressLike() {
    return addressLike;
  }

  public void setAddressLike(java.lang.String addressLike) {
    this.addressLike = addressLike;
  }

  public java.lang.String getAddressNotEquals() {
    return addressNotEquals;
  }

  public void setAddressNotEquals(java.lang.String addressNotEquals) {
    this.addressNotEquals = addressNotEquals;
  }

  public java.lang.String[] getAddressIns() {
    return addressIns;
  }

  public void setAddressIns(java.lang.String[] addressIns) {
    this.addressIns = addressIns;
  }

  public java.lang.String[] getAddressNotIns() {
    return addressNotIns;
  }

  public void setAddressNotIns(java.lang.String[] addressNotIns) {
    this.addressNotIns = addressNotIns;
  }

  public java.lang.String getMobileLeftLike() {
    return mobileLeftLike;
  }

  public void setMobileLeftLike(java.lang.String mobileLeftLike) {
    this.mobileLeftLike = mobileLeftLike;
  }

  public java.lang.String getMobileRightLike() {
    return mobileRightLike;
  }

  public void setMobileRightLike(java.lang.String mobileRightLike) {
    this.mobileRightLike = mobileRightLike;
  }

  public java.lang.String getMobileLike() {
    return mobileLike;
  }

  public void setMobileLike(java.lang.String mobileLike) {
    this.mobileLike = mobileLike;
  }

  public java.lang.String getMobileNotEquals() {
    return mobileNotEquals;
  }

  public void setMobileNotEquals(java.lang.String mobileNotEquals) {
    this.mobileNotEquals = mobileNotEquals;
  }

  public java.lang.String[] getMobileIns() {
    return mobileIns;
  }

  public void setMobileIns(java.lang.String[] mobileIns) {
    this.mobileIns = mobileIns;
  }

  public java.lang.String[] getMobileNotIns() {
    return mobileNotIns;
  }

  public void setMobileNotIns(java.lang.String[] mobileNotIns) {
    this.mobileNotIns = mobileNotIns;
  }

  public java.lang.String getPostscriptLeftLike() {
    return postscriptLeftLike;
  }

  public void setPostscriptLeftLike(java.lang.String postscriptLeftLike) {
    this.postscriptLeftLike = postscriptLeftLike;
  }

  public java.lang.String getPostscriptRightLike() {
    return postscriptRightLike;
  }

  public void setPostscriptRightLike(java.lang.String postscriptRightLike) {
    this.postscriptRightLike = postscriptRightLike;
  }

  public java.lang.String getPostscriptLike() {
    return postscriptLike;
  }

  public void setPostscriptLike(java.lang.String postscriptLike) {
    this.postscriptLike = postscriptLike;
  }

  public java.lang.String getPostscriptNotEquals() {
    return postscriptNotEquals;
  }

  public void setPostscriptNotEquals(java.lang.String postscriptNotEquals) {
    this.postscriptNotEquals = postscriptNotEquals;
  }

  public java.lang.String[] getPostscriptIns() {
    return postscriptIns;
  }

  public void setPostscriptIns(java.lang.String[] postscriptIns) {
    this.postscriptIns = postscriptIns;
  }

  public java.lang.String[] getPostscriptNotIns() {
    return postscriptNotIns;
  }

  public void setPostscriptNotIns(java.lang.String[] postscriptNotIns) {
    this.postscriptNotIns = postscriptNotIns;
  }

  public java.lang.Double getShipping_feeGreaterThan() {
    return shipping_feeGreaterThan;
  }

  public void setshipping_feeGreaterThan(java.lang.Double shipping_feeGreaterThan) {
    this.shipping_feeGreaterThan = shipping_feeGreaterThan;
  }

  public java.lang.Double getShipping_feeGreaterEqual() {
    return shipping_feeGreaterEqual;
  }

  public void setShipping_feeGreaterEqual(java.lang.Double shipping_feeGreaterEqual) {
    this.shipping_feeGreaterEqual = shipping_feeGreaterEqual;
  }

  public java.lang.Double getShipping_feeLessEqual() {
    return shipping_feeLessEqual;
  }

  public void setShipping_feeLessEqual(java.lang.Double shipping_feeLessEqual) {
    this.shipping_feeLessEqual = shipping_feeLessEqual;
  }

  public java.lang.Double getShipping_feeLessThan() {
    return shipping_feeLessThan;
  }

  public void setShipping_feeLessThan(java.lang.Double shipping_feeLessThan) {
    this.shipping_feeLessThan = shipping_feeLessThan;
  }

  public java.lang.Double getShipping_feeNotEquals() {
    return shipping_feeNotEquals;
  }

  public void setShipping_feeNotEquals(java.lang.Double shipping_feeNotEquals) {
    this.shipping_feeNotEquals = shipping_feeNotEquals;
  }

  public java.lang.Double[] getShipping_feeIns() {
    return shipping_feeIns;
  }

  public void setShipping_feeIns(java.lang.Double[] shipping_feeIns) {
    this.shipping_feeIns = shipping_feeIns;
  }

  public java.lang.Double[] getShipping_feeNotIns() {
    return shipping_feeNotIns;
  }

  public void setShipping_feeNotIns(java.lang.Double[] shipping_feeNotIns) {
    this.shipping_feeNotIns = shipping_feeNotIns;
  }

  public java.lang.String getPay_nameLeftLike() {
    return pay_nameLeftLike;
  }

  public void setPay_nameLeftLike(java.lang.String pay_nameLeftLike) {
    this.pay_nameLeftLike = pay_nameLeftLike;
  }

  public java.lang.String getPay_nameRightLike() {
    return pay_nameRightLike;
  }

  public void setPay_nameRightLike(java.lang.String pay_nameRightLike) {
    this.pay_nameRightLike = pay_nameRightLike;
  }

  public java.lang.String getPay_nameLike() {
    return pay_nameLike;
  }

  public void setPay_nameLike(java.lang.String pay_nameLike) {
    this.pay_nameLike = pay_nameLike;
  }

  public java.lang.String getPay_nameNotEquals() {
    return pay_nameNotEquals;
  }

  public void setPay_nameNotEquals(java.lang.String pay_nameNotEquals) {
    this.pay_nameNotEquals = pay_nameNotEquals;
  }

  public java.lang.String[] getPay_nameIns() {
    return pay_nameIns;
  }

  public void setPay_nameIns(java.lang.String[] pay_nameIns) {
    this.pay_nameIns = pay_nameIns;
  }

  public java.lang.String[] getPay_nameNotIns() {
    return pay_nameNotIns;
  }

  public void setPay_nameNotIns(java.lang.String[] pay_nameNotIns) {
    this.pay_nameNotIns = pay_nameNotIns;
  }

  public java.lang.Integer getPay_idGreaterThan() {
    return pay_idGreaterThan;
  }

  public void setpay_idGreaterThan(java.lang.Integer pay_idGreaterThan) {
    this.pay_idGreaterThan = pay_idGreaterThan;
  }

  public java.lang.Integer getPay_idGreaterEqual() {
    return pay_idGreaterEqual;
  }

  public void setPay_idGreaterEqual(java.lang.Integer pay_idGreaterEqual) {
    this.pay_idGreaterEqual = pay_idGreaterEqual;
  }

  public java.lang.Integer getPay_idLessEqual() {
    return pay_idLessEqual;
  }

  public void setPay_idLessEqual(java.lang.Integer pay_idLessEqual) {
    this.pay_idLessEqual = pay_idLessEqual;
  }

  public java.lang.Integer getPay_idLessThan() {
    return pay_idLessThan;
  }

  public void setPay_idLessThan(java.lang.Integer pay_idLessThan) {
    this.pay_idLessThan = pay_idLessThan;
  }

  public java.lang.Integer getPay_idNotEquals() {
    return pay_idNotEquals;
  }

  public void setPay_idNotEquals(java.lang.Integer pay_idNotEquals) {
    this.pay_idNotEquals = pay_idNotEquals;
  }

  public java.lang.Integer[] getPay_idIns() {
    return pay_idIns;
  }

  public void setPay_idIns(java.lang.Integer[] pay_idIns) {
    this.pay_idIns = pay_idIns;
  }

  public java.lang.Integer[] getPay_idNotIns() {
    return pay_idNotIns;
  }

  public void setPay_idNotIns(java.lang.Integer[] pay_idNotIns) {
    this.pay_idNotIns = pay_idNotIns;
  }

  public java.lang.Double getActual_priceGreaterThan() {
    return actual_priceGreaterThan;
  }

  public void setactual_priceGreaterThan(java.lang.Double actual_priceGreaterThan) {
    this.actual_priceGreaterThan = actual_priceGreaterThan;
  }

  public java.lang.Double getActual_priceGreaterEqual() {
    return actual_priceGreaterEqual;
  }

  public void setActual_priceGreaterEqual(java.lang.Double actual_priceGreaterEqual) {
    this.actual_priceGreaterEqual = actual_priceGreaterEqual;
  }

  public java.lang.Double getActual_priceLessEqual() {
    return actual_priceLessEqual;
  }

  public void setActual_priceLessEqual(java.lang.Double actual_priceLessEqual) {
    this.actual_priceLessEqual = actual_priceLessEqual;
  }

  public java.lang.Double getActual_priceLessThan() {
    return actual_priceLessThan;
  }

  public void setActual_priceLessThan(java.lang.Double actual_priceLessThan) {
    this.actual_priceLessThan = actual_priceLessThan;
  }

  public java.lang.Double getActual_priceNotEquals() {
    return actual_priceNotEquals;
  }

  public void setActual_priceNotEquals(java.lang.Double actual_priceNotEquals) {
    this.actual_priceNotEquals = actual_priceNotEquals;
  }

  public java.lang.Double[] getActual_priceIns() {
    return actual_priceIns;
  }

  public void setActual_priceIns(java.lang.Double[] actual_priceIns) {
    this.actual_priceIns = actual_priceIns;
  }

  public java.lang.Double[] getActual_priceNotIns() {
    return actual_priceNotIns;
  }

  public void setActual_priceNotIns(java.lang.Double[] actual_priceNotIns) {
    this.actual_priceNotIns = actual_priceNotIns;
  }

  public java.lang.Integer getIntegralGreaterThan() {
    return integralGreaterThan;
  }

  public void setintegralGreaterThan(java.lang.Integer integralGreaterThan) {
    this.integralGreaterThan = integralGreaterThan;
  }

  public java.lang.Integer getIntegralGreaterEqual() {
    return integralGreaterEqual;
  }

  public void setIntegralGreaterEqual(java.lang.Integer integralGreaterEqual) {
    this.integralGreaterEqual = integralGreaterEqual;
  }

  public java.lang.Integer getIntegralLessEqual() {
    return integralLessEqual;
  }

  public void setIntegralLessEqual(java.lang.Integer integralLessEqual) {
    this.integralLessEqual = integralLessEqual;
  }

  public java.lang.Integer getIntegralLessThan() {
    return integralLessThan;
  }

  public void setIntegralLessThan(java.lang.Integer integralLessThan) {
    this.integralLessThan = integralLessThan;
  }

  public java.lang.Integer getIntegralNotEquals() {
    return integralNotEquals;
  }

  public void setIntegralNotEquals(java.lang.Integer integralNotEquals) {
    this.integralNotEquals = integralNotEquals;
  }

  public java.lang.Integer[] getIntegralIns() {
    return integralIns;
  }

  public void setIntegralIns(java.lang.Integer[] integralIns) {
    this.integralIns = integralIns;
  }

  public java.lang.Integer[] getIntegralNotIns() {
    return integralNotIns;
  }

  public void setIntegralNotIns(java.lang.Integer[] integralNotIns) {
    this.integralNotIns = integralNotIns;
  }

  public java.lang.Double getIntegral_moneyGreaterThan() {
    return integral_moneyGreaterThan;
  }

  public void setintegral_moneyGreaterThan(java.lang.Double integral_moneyGreaterThan) {
    this.integral_moneyGreaterThan = integral_moneyGreaterThan;
  }

  public java.lang.Double getIntegral_moneyGreaterEqual() {
    return integral_moneyGreaterEqual;
  }

  public void setIntegral_moneyGreaterEqual(java.lang.Double integral_moneyGreaterEqual) {
    this.integral_moneyGreaterEqual = integral_moneyGreaterEqual;
  }

  public java.lang.Double getIntegral_moneyLessEqual() {
    return integral_moneyLessEqual;
  }

  public void setIntegral_moneyLessEqual(java.lang.Double integral_moneyLessEqual) {
    this.integral_moneyLessEqual = integral_moneyLessEqual;
  }

  public java.lang.Double getIntegral_moneyLessThan() {
    return integral_moneyLessThan;
  }

  public void setIntegral_moneyLessThan(java.lang.Double integral_moneyLessThan) {
    this.integral_moneyLessThan = integral_moneyLessThan;
  }

  public java.lang.Double getIntegral_moneyNotEquals() {
    return integral_moneyNotEquals;
  }

  public void setIntegral_moneyNotEquals(java.lang.Double integral_moneyNotEquals) {
    this.integral_moneyNotEquals = integral_moneyNotEquals;
  }

  public java.lang.Double[] getIntegral_moneyIns() {
    return integral_moneyIns;
  }

  public void setIntegral_moneyIns(java.lang.Double[] integral_moneyIns) {
    this.integral_moneyIns = integral_moneyIns;
  }

  public java.lang.Double[] getIntegral_moneyNotIns() {
    return integral_moneyNotIns;
  }

  public void setIntegral_moneyNotIns(java.lang.Double[] integral_moneyNotIns) {
    this.integral_moneyNotIns = integral_moneyNotIns;
  }

  public java.lang.Double getOrder_priceGreaterThan() {
    return order_priceGreaterThan;
  }

  public void setorder_priceGreaterThan(java.lang.Double order_priceGreaterThan) {
    this.order_priceGreaterThan = order_priceGreaterThan;
  }

  public java.lang.Double getOrder_priceGreaterEqual() {
    return order_priceGreaterEqual;
  }

  public void setOrder_priceGreaterEqual(java.lang.Double order_priceGreaterEqual) {
    this.order_priceGreaterEqual = order_priceGreaterEqual;
  }

  public java.lang.Double getOrder_priceLessEqual() {
    return order_priceLessEqual;
  }

  public void setOrder_priceLessEqual(java.lang.Double order_priceLessEqual) {
    this.order_priceLessEqual = order_priceLessEqual;
  }

  public java.lang.Double getOrder_priceLessThan() {
    return order_priceLessThan;
  }

  public void setOrder_priceLessThan(java.lang.Double order_priceLessThan) {
    this.order_priceLessThan = order_priceLessThan;
  }

  public java.lang.Double getOrder_priceNotEquals() {
    return order_priceNotEquals;
  }

  public void setOrder_priceNotEquals(java.lang.Double order_priceNotEquals) {
    this.order_priceNotEquals = order_priceNotEquals;
  }

  public java.lang.Double[] getOrder_priceIns() {
    return order_priceIns;
  }

  public void setOrder_priceIns(java.lang.Double[] order_priceIns) {
    this.order_priceIns = order_priceIns;
  }

  public java.lang.Double[] getOrder_priceNotIns() {
    return order_priceNotIns;
  }

  public void setOrder_priceNotIns(java.lang.Double[] order_priceNotIns) {
    this.order_priceNotIns = order_priceNotIns;
  }

  public java.lang.Double getGoods_priceGreaterThan() {
    return goods_priceGreaterThan;
  }

  public void setgoods_priceGreaterThan(java.lang.Double goods_priceGreaterThan) {
    this.goods_priceGreaterThan = goods_priceGreaterThan;
  }

  public java.lang.Double getGoods_priceGreaterEqual() {
    return goods_priceGreaterEqual;
  }

  public void setGoods_priceGreaterEqual(java.lang.Double goods_priceGreaterEqual) {
    this.goods_priceGreaterEqual = goods_priceGreaterEqual;
  }

  public java.lang.Double getGoods_priceLessEqual() {
    return goods_priceLessEqual;
  }

  public void setGoods_priceLessEqual(java.lang.Double goods_priceLessEqual) {
    this.goods_priceLessEqual = goods_priceLessEqual;
  }

  public java.lang.Double getGoods_priceLessThan() {
    return goods_priceLessThan;
  }

  public void setGoods_priceLessThan(java.lang.Double goods_priceLessThan) {
    this.goods_priceLessThan = goods_priceLessThan;
  }

  public java.lang.Double getGoods_priceNotEquals() {
    return goods_priceNotEquals;
  }

  public void setGoods_priceNotEquals(java.lang.Double goods_priceNotEquals) {
    this.goods_priceNotEquals = goods_priceNotEquals;
  }

  public java.lang.Double[] getGoods_priceIns() {
    return goods_priceIns;
  }

  public void setGoods_priceIns(java.lang.Double[] goods_priceIns) {
    this.goods_priceIns = goods_priceIns;
  }

  public java.lang.Double[] getGoods_priceNotIns() {
    return goods_priceNotIns;
  }

  public void setGoods_priceNotIns(java.lang.Double[] goods_priceNotIns) {
    this.goods_priceNotIns = goods_priceNotIns;
  }

  public java.lang.Integer getAdd_timeGreaterThan() {
    return add_timeGreaterThan;
  }

  public void setadd_timeGreaterThan(java.lang.Integer add_timeGreaterThan) {
    this.add_timeGreaterThan = add_timeGreaterThan;
  }

  public java.lang.Integer getAdd_timeGreaterEqual() {
    return add_timeGreaterEqual;
  }

  public void setAdd_timeGreaterEqual(java.lang.Integer add_timeGreaterEqual) {
    this.add_timeGreaterEqual = add_timeGreaterEqual;
  }

  public java.lang.Integer getAdd_timeLessEqual() {
    return add_timeLessEqual;
  }

  public void setAdd_timeLessEqual(java.lang.Integer add_timeLessEqual) {
    this.add_timeLessEqual = add_timeLessEqual;
  }

  public java.lang.Integer getAdd_timeLessThan() {
    return add_timeLessThan;
  }

  public void setAdd_timeLessThan(java.lang.Integer add_timeLessThan) {
    this.add_timeLessThan = add_timeLessThan;
  }

  public java.lang.Integer getAdd_timeNotEquals() {
    return add_timeNotEquals;
  }

  public void setAdd_timeNotEquals(java.lang.Integer add_timeNotEquals) {
    this.add_timeNotEquals = add_timeNotEquals;
  }

  public java.lang.Integer[] getAdd_timeIns() {
    return add_timeIns;
  }

  public void setAdd_timeIns(java.lang.Integer[] add_timeIns) {
    this.add_timeIns = add_timeIns;
  }

  public java.lang.Integer[] getAdd_timeNotIns() {
    return add_timeNotIns;
  }

  public void setAdd_timeNotIns(java.lang.Integer[] add_timeNotIns) {
    this.add_timeNotIns = add_timeNotIns;
  }

  public java.lang.Integer getConfirm_timeGreaterThan() {
    return confirm_timeGreaterThan;
  }

  public void setconfirm_timeGreaterThan(java.lang.Integer confirm_timeGreaterThan) {
    this.confirm_timeGreaterThan = confirm_timeGreaterThan;
  }

  public java.lang.Integer getConfirm_timeGreaterEqual() {
    return confirm_timeGreaterEqual;
  }

  public void setConfirm_timeGreaterEqual(java.lang.Integer confirm_timeGreaterEqual) {
    this.confirm_timeGreaterEqual = confirm_timeGreaterEqual;
  }

  public java.lang.Integer getConfirm_timeLessEqual() {
    return confirm_timeLessEqual;
  }

  public void setConfirm_timeLessEqual(java.lang.Integer confirm_timeLessEqual) {
    this.confirm_timeLessEqual = confirm_timeLessEqual;
  }

  public java.lang.Integer getConfirm_timeLessThan() {
    return confirm_timeLessThan;
  }

  public void setConfirm_timeLessThan(java.lang.Integer confirm_timeLessThan) {
    this.confirm_timeLessThan = confirm_timeLessThan;
  }

  public java.lang.Integer getConfirm_timeNotEquals() {
    return confirm_timeNotEquals;
  }

  public void setConfirm_timeNotEquals(java.lang.Integer confirm_timeNotEquals) {
    this.confirm_timeNotEquals = confirm_timeNotEquals;
  }

  public java.lang.Integer[] getConfirm_timeIns() {
    return confirm_timeIns;
  }

  public void setConfirm_timeIns(java.lang.Integer[] confirm_timeIns) {
    this.confirm_timeIns = confirm_timeIns;
  }

  public java.lang.Integer[] getConfirm_timeNotIns() {
    return confirm_timeNotIns;
  }

  public void setConfirm_timeNotIns(java.lang.Integer[] confirm_timeNotIns) {
    this.confirm_timeNotIns = confirm_timeNotIns;
  }

  public java.lang.Integer getPay_timeGreaterThan() {
    return pay_timeGreaterThan;
  }

  public void setpay_timeGreaterThan(java.lang.Integer pay_timeGreaterThan) {
    this.pay_timeGreaterThan = pay_timeGreaterThan;
  }

  public java.lang.Integer getPay_timeGreaterEqual() {
    return pay_timeGreaterEqual;
  }

  public void setPay_timeGreaterEqual(java.lang.Integer pay_timeGreaterEqual) {
    this.pay_timeGreaterEqual = pay_timeGreaterEqual;
  }

  public java.lang.Integer getPay_timeLessEqual() {
    return pay_timeLessEqual;
  }

  public void setPay_timeLessEqual(java.lang.Integer pay_timeLessEqual) {
    this.pay_timeLessEqual = pay_timeLessEqual;
  }

  public java.lang.Integer getPay_timeLessThan() {
    return pay_timeLessThan;
  }

  public void setPay_timeLessThan(java.lang.Integer pay_timeLessThan) {
    this.pay_timeLessThan = pay_timeLessThan;
  }

  public java.lang.Integer getPay_timeNotEquals() {
    return pay_timeNotEquals;
  }

  public void setPay_timeNotEquals(java.lang.Integer pay_timeNotEquals) {
    this.pay_timeNotEquals = pay_timeNotEquals;
  }

  public java.lang.Integer[] getPay_timeIns() {
    return pay_timeIns;
  }

  public void setPay_timeIns(java.lang.Integer[] pay_timeIns) {
    this.pay_timeIns = pay_timeIns;
  }

  public java.lang.Integer[] getPay_timeNotIns() {
    return pay_timeNotIns;
  }

  public void setPay_timeNotIns(java.lang.Integer[] pay_timeNotIns) {
    this.pay_timeNotIns = pay_timeNotIns;
  }

  public java.lang.Integer getFreight_priceGreaterThan() {
    return freight_priceGreaterThan;
  }

  public void setfreight_priceGreaterThan(java.lang.Integer freight_priceGreaterThan) {
    this.freight_priceGreaterThan = freight_priceGreaterThan;
  }

  public java.lang.Integer getFreight_priceGreaterEqual() {
    return freight_priceGreaterEqual;
  }

  public void setFreight_priceGreaterEqual(java.lang.Integer freight_priceGreaterEqual) {
    this.freight_priceGreaterEqual = freight_priceGreaterEqual;
  }

  public java.lang.Integer getFreight_priceLessEqual() {
    return freight_priceLessEqual;
  }

  public void setFreight_priceLessEqual(java.lang.Integer freight_priceLessEqual) {
    this.freight_priceLessEqual = freight_priceLessEqual;
  }

  public java.lang.Integer getFreight_priceLessThan() {
    return freight_priceLessThan;
  }

  public void setFreight_priceLessThan(java.lang.Integer freight_priceLessThan) {
    this.freight_priceLessThan = freight_priceLessThan;
  }

  public java.lang.Integer getFreight_priceNotEquals() {
    return freight_priceNotEquals;
  }

  public void setFreight_priceNotEquals(java.lang.Integer freight_priceNotEquals) {
    this.freight_priceNotEquals = freight_priceNotEquals;
  }

  public java.lang.Integer[] getFreight_priceIns() {
    return freight_priceIns;
  }

  public void setFreight_priceIns(java.lang.Integer[] freight_priceIns) {
    this.freight_priceIns = freight_priceIns;
  }

  public java.lang.Integer[] getFreight_priceNotIns() {
    return freight_priceNotIns;
  }

  public void setFreight_priceNotIns(java.lang.Integer[] freight_priceNotIns) {
    this.freight_priceNotIns = freight_priceNotIns;
  }

  public java.lang.Integer getCoupon_idGreaterThan() {
    return coupon_idGreaterThan;
  }

  public void setcoupon_idGreaterThan(java.lang.Integer coupon_idGreaterThan) {
    this.coupon_idGreaterThan = coupon_idGreaterThan;
  }

  public java.lang.Integer getCoupon_idGreaterEqual() {
    return coupon_idGreaterEqual;
  }

  public void setCoupon_idGreaterEqual(java.lang.Integer coupon_idGreaterEqual) {
    this.coupon_idGreaterEqual = coupon_idGreaterEqual;
  }

  public java.lang.Integer getCoupon_idLessEqual() {
    return coupon_idLessEqual;
  }

  public void setCoupon_idLessEqual(java.lang.Integer coupon_idLessEqual) {
    this.coupon_idLessEqual = coupon_idLessEqual;
  }

  public java.lang.Integer getCoupon_idLessThan() {
    return coupon_idLessThan;
  }

  public void setCoupon_idLessThan(java.lang.Integer coupon_idLessThan) {
    this.coupon_idLessThan = coupon_idLessThan;
  }

  public java.lang.Integer getCoupon_idNotEquals() {
    return coupon_idNotEquals;
  }

  public void setCoupon_idNotEquals(java.lang.Integer coupon_idNotEquals) {
    this.coupon_idNotEquals = coupon_idNotEquals;
  }

  public java.lang.Integer[] getCoupon_idIns() {
    return coupon_idIns;
  }

  public void setCoupon_idIns(java.lang.Integer[] coupon_idIns) {
    this.coupon_idIns = coupon_idIns;
  }

  public java.lang.Integer[] getCoupon_idNotIns() {
    return coupon_idNotIns;
  }

  public void setCoupon_idNotIns(java.lang.Integer[] coupon_idNotIns) {
    this.coupon_idNotIns = coupon_idNotIns;
  }

  public java.lang.Integer getParent_idGreaterThan() {
    return parent_idGreaterThan;
  }

  public void setparent_idGreaterThan(java.lang.Integer parent_idGreaterThan) {
    this.parent_idGreaterThan = parent_idGreaterThan;
  }

  public java.lang.Integer getParent_idGreaterEqual() {
    return parent_idGreaterEqual;
  }

  public void setParent_idGreaterEqual(java.lang.Integer parent_idGreaterEqual) {
    this.parent_idGreaterEqual = parent_idGreaterEqual;
  }

  public java.lang.Integer getParent_idLessEqual() {
    return parent_idLessEqual;
  }

  public void setParent_idLessEqual(java.lang.Integer parent_idLessEqual) {
    this.parent_idLessEqual = parent_idLessEqual;
  }

  public java.lang.Integer getParent_idLessThan() {
    return parent_idLessThan;
  }

  public void setParent_idLessThan(java.lang.Integer parent_idLessThan) {
    this.parent_idLessThan = parent_idLessThan;
  }

  public java.lang.Integer getParent_idNotEquals() {
    return parent_idNotEquals;
  }

  public void setParent_idNotEquals(java.lang.Integer parent_idNotEquals) {
    this.parent_idNotEquals = parent_idNotEquals;
  }

  public java.lang.Integer[] getParent_idIns() {
    return parent_idIns;
  }

  public void setParent_idIns(java.lang.Integer[] parent_idIns) {
    this.parent_idIns = parent_idIns;
  }

  public java.lang.Integer[] getParent_idNotIns() {
    return parent_idNotIns;
  }

  public void setParent_idNotIns(java.lang.Integer[] parent_idNotIns) {
    this.parent_idNotIns = parent_idNotIns;
  }

  public java.lang.Double getCoupon_priceGreaterThan() {
    return coupon_priceGreaterThan;
  }

  public void setcoupon_priceGreaterThan(java.lang.Double coupon_priceGreaterThan) {
    this.coupon_priceGreaterThan = coupon_priceGreaterThan;
  }

  public java.lang.Double getCoupon_priceGreaterEqual() {
    return coupon_priceGreaterEqual;
  }

  public void setCoupon_priceGreaterEqual(java.lang.Double coupon_priceGreaterEqual) {
    this.coupon_priceGreaterEqual = coupon_priceGreaterEqual;
  }

  public java.lang.Double getCoupon_priceLessEqual() {
    return coupon_priceLessEqual;
  }

  public void setCoupon_priceLessEqual(java.lang.Double coupon_priceLessEqual) {
    this.coupon_priceLessEqual = coupon_priceLessEqual;
  }

  public java.lang.Double getCoupon_priceLessThan() {
    return coupon_priceLessThan;
  }

  public void setCoupon_priceLessThan(java.lang.Double coupon_priceLessThan) {
    this.coupon_priceLessThan = coupon_priceLessThan;
  }

  public java.lang.Double getCoupon_priceNotEquals() {
    return coupon_priceNotEquals;
  }

  public void setCoupon_priceNotEquals(java.lang.Double coupon_priceNotEquals) {
    this.coupon_priceNotEquals = coupon_priceNotEquals;
  }

  public java.lang.Double[] getCoupon_priceIns() {
    return coupon_priceIns;
  }

  public void setCoupon_priceIns(java.lang.Double[] coupon_priceIns) {
    this.coupon_priceIns = coupon_priceIns;
  }

  public java.lang.Double[] getCoupon_priceNotIns() {
    return coupon_priceNotIns;
  }

  public void setCoupon_priceNotIns(java.lang.Double[] coupon_priceNotIns) {
    this.coupon_priceNotIns = coupon_priceNotIns;
  }

  public java.lang.String getCallback_statusLeftLike() {
    return callback_statusLeftLike;
  }

  public void setCallback_statusLeftLike(java.lang.String callback_statusLeftLike) {
    this.callback_statusLeftLike = callback_statusLeftLike;
  }

  public java.lang.String getCallback_statusRightLike() {
    return callback_statusRightLike;
  }

  public void setCallback_statusRightLike(java.lang.String callback_statusRightLike) {
    this.callback_statusRightLike = callback_statusRightLike;
  }

  public java.lang.String getCallback_statusLike() {
    return callback_statusLike;
  }

  public void setCallback_statusLike(java.lang.String callback_statusLike) {
    this.callback_statusLike = callback_statusLike;
  }

  public java.lang.String getCallback_statusNotEquals() {
    return callback_statusNotEquals;
  }

  public void setCallback_statusNotEquals(java.lang.String callback_statusNotEquals) {
    this.callback_statusNotEquals = callback_statusNotEquals;
  }

  public java.lang.String[] getCallback_statusIns() {
    return callback_statusIns;
  }

  public void setCallback_statusIns(java.lang.String[] callback_statusIns) {
    this.callback_statusIns = callback_statusIns;
  }

  public java.lang.String[] getCallback_statusNotIns() {
    return callback_statusNotIns;
  }

  public void setCallback_statusNotIns(java.lang.String[] callback_statusNotIns) {
    this.callback_statusNotIns = callback_statusNotIns;
  }

}
