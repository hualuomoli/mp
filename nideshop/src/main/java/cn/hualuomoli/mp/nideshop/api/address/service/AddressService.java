package cn.hualuomoli.mp.nideshop.api.address.service;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hualuomoli.mp.nideshop.api.address.entity.ApiAddress;
import cn.hualuomoli.mp.nideshop.api.address.mapper.AddressMapper;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;

@Service(value = "cn.hualuomoli.mp.api.address.service.AddressService")
@Transactional(readOnly = true)
public class AddressService {

  @Autowired
  private AddressMapper addressMapper;

  /**
   * 列举当前用户的收货地址
   * @return 用户的收货地址
   */
  public List<ApiAddress> find() {
    return addressMapper.find(null, ApiUtils.getCurrentUserId());
  }

  /**
   * 列举当前用户的收货地址
   * @param addressId 地址ID
   * @return 用户的收货地址
   */
  public ApiAddress findByAddressId(Integer addressId) {
    Validate.notNull(addressId, "addressId is null.");
    List<ApiAddress> list = addressMapper.find(addressId, ApiUtils.getCurrentUserId());
    Validate.notEmpty(list, "地址未找到");
    Validate.isTrue(list.size() == 1, "地址信息错误");
    return list.get(0);
  }

  /**
   * 移除默认
   * @param defaultValue 选中值
   * @param nomalValue 默认值
   */
  @Transactional(readOnly = false)
  public void removeDefault(int defaultValue, int nomalValue) {
    addressMapper.removeDefault(defaultValue, nomalValue);
  }

}
