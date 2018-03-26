package cn.hualuomoli.mp.nideshop.api.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.hualuomoli.mp.nideshop.api.address.entity.ApiAddress;
import cn.hualuomoli.mp.nideshop.api.address.service.AddressService;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.api.util.Auth;
import cn.hualuomoli.mp.nideshop.base.entity.Address;
import cn.hualuomoli.mp.nideshop.base.service.AddressBaseService;

@Auth
@RequestMapping(value = "/api/address")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.address.controller.AddressController")
public class AddressController {

  @Autowired
  private AddressBaseService addressBaseService;

  @Autowired
  private AddressService addressService;

  // 列表
  @RequestMapping(value = "/list")
  public String list() {
    List<ApiAddress> list = addressService.find();
    return ApiUtils.success(list);
  }

  // 详情
  @RequestMapping(value = "/detail")
  public String detail(@RequestParam(value = "id") Integer addressId) {
    ApiAddress apiAddress = addressService.findByAddressId(addressId);
    return ApiUtils.success(apiAddress);
  }

  // 新增或修改
  @RequestMapping(value = "/save")
  public String save(Address address) {

    // 如果设置为默认，则取消其它的默认
    if (address.getIs_default() == 1) {
      addressService.removeDefault(1, 0);
    }

    if (address.getId() == null) {
      addressBaseService.insert(address);
    } else {
      addressBaseService.update(address);
    }

    return ApiUtils.success(address);
  }

  // 删除
  @RequestMapping(value = "/delete")
  public String delete(@RequestParam(value = "id") Integer addressId) {
    addressBaseService.delete(addressId);
    return ApiUtils.success("删除成功");
  }

}
