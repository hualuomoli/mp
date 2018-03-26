package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Address;
import cn.hualuomoli.mp.nideshop.base.query.entity.AddressQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.AddressQueryMapper")
public interface AddressQueryMapper {

  /** 查询列表 */
  List<Address> findList(AddressQuery addressQuery);

}
