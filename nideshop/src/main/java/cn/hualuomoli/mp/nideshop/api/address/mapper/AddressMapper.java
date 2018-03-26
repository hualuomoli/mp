package cn.hualuomoli.mp.nideshop.api.address.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.api.address.entity.ApiAddress;

@Repository(value = "cn.hualuomoli.mp.api.address.mapper.AddressMapper")
public interface AddressMapper {

  List<ApiAddress> find(@Param(value = "addressId") Integer addressId, @Param(value = "currentUserId") Integer currentUserId);

  void removeDefault(int defaultValue, int nomalValue);

}
