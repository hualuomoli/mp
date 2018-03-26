package cn.hualuomoli.mp.nideshop.api.cart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.api.cart.entity.ApiCart;
import cn.hualuomoli.mp.nideshop.api.cart.entity.ApiCartStatistic;

@Repository(value = "cn.hualuomoli.mp.nideshop.api.cart.mapper.CartMapper")
public interface CartMapper {

  List<ApiCart> find(@Param(value = "user_id") Integer user_id);

  ApiCartStatistic statistic(Integer user_id);

  int incrementCart(@Param(value = "cart_id") Integer cart_id, @Param(value = "number") Integer number);

  int decreaseCart(@Param(value = "cart_id") Integer cart_id, @Param(value = "number") Integer number);

  int decreaseProduct(@Param(value = "product_id") Integer product_id, @Param(value = "number") Integer number);

  List<String> findGoodsSpecifitionNames(@Param(value = "goods_specifition_ids") List<Integer> ids);

  int checked(@Param(value = "product_ids") List<Integer> product_ids, @Param(value = "isChecked") Integer isChecked);

  void delete(@Param(value = "product_ids") List<Integer> product_ids);

}
