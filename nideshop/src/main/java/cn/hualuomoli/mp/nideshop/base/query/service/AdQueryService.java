package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Ad;
import cn.hualuomoli.mp.nideshop.base.query.entity.AdQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.AdQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.AdQueryService")
@Transactional(readOnly = true)
public class AdQueryService {

  @Autowired
  private AdQueryMapper adQueryMapper;

  /** 查询列表 */
  public List<Ad> findList(AdQuery adQuery) {
    return adQueryMapper.findList(adQuery);
  }

  /** 查询列表排序 */
  public List<Ad> findList(AdQuery adQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return adQueryMapper.findList(adQuery);
  }

  /** 查询分页 */
  public Page findPage(AdQuery adQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Ad> list = adQueryMapper.findList(adQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(AdQuery adQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Ad> list = adQueryMapper.findList(adQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
