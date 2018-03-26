package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Cart;
import cn.hualuomoli.mp.nideshop.base.query.entity.CartQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.CartQueryMapper")
public interface CartQueryMapper {

  /** 查询列表 */
  List<Cart> findList(CartQuery cartQuery);

}
