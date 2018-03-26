package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Shipper;
import cn.hualuomoli.mp.nideshop.base.query.entity.ShipperQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.ShipperQueryMapper;

// 快递公司
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.ShipperQueryService")
@Transactional(readOnly = true)
public class ShipperQueryService {

  @Autowired
  private ShipperQueryMapper shipperQueryMapper;

  /** 查询列表 */
  public List<Shipper> findList(ShipperQuery shipperQuery) {
    return shipperQueryMapper.findList(shipperQuery);
  }

  /** 查询列表排序 */
  public List<Shipper> findList(ShipperQuery shipperQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return shipperQueryMapper.findList(shipperQuery);
  }

  /** 查询分页 */
  public Page findPage(ShipperQuery shipperQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Shipper> list = shipperQueryMapper.findList(shipperQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(ShipperQuery shipperQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Shipper> list = shipperQueryMapper.findList(shipperQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
