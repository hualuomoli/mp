package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Address;
import cn.hualuomoli.mp.nideshop.base.query.entity.AddressQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.AddressQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.AddressQueryService")
@Transactional(readOnly = true)
public class AddressQueryService {

  @Autowired
  private AddressQueryMapper addressQueryMapper;

  /** 查询列表 */
  public List<Address> findList(AddressQuery addressQuery) {
    return addressQueryMapper.findList(addressQuery);
  }

  /** 查询列表排序 */
  public List<Address> findList(AddressQuery addressQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return addressQueryMapper.findList(addressQuery);
  }

  /** 查询分页 */
  public Page findPage(AddressQuery addressQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Address> list = addressQueryMapper.findList(addressQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(AddressQuery addressQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Address> list = addressQueryMapper.findList(addressQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
