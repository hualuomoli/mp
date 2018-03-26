package cn.hualuomoli.mp.nideshop.api.brand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hualuomoli.framework.entity.Page;

import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Brand;
import cn.hualuomoli.mp.nideshop.base.service.BrandBaseService;

/**
 * 品牌
 */
@RequestMapping(value = "品牌")
@RestController(value = "cn.hualuomoli.mp.nideshop.api.brand.controller.BrandController")
public class BrandController {

  @Autowired
  private BrandBaseService brandBaseService;

  // 品牌列表
  @RequestMapping(value = "/list")
  public String list() {
    Integer pageNo = ApiUtils.getRequestPageNo();
    Integer pageSize = ApiUtils.getRequestPageSize();
    Page page = brandBaseService.findPage(new Brand(), pageNo, pageSize);
    return ApiUtils.page(page);
  }

  // 品牌详情
  @RequestMapping(value = "/detail")
  public String detail(Brand brand) {
    brand = brandBaseService.get(brand.getId());
    return ApiUtils.success("brand", brand);
  }

}
