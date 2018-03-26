package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.AdPosition;
import cn.hualuomoli.mp.nideshop.base.query.entity.AdPositionQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.AdPositionQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.AdPositionQueryService")
@Transactional(readOnly = true)
public class AdPositionQueryService {

  @Autowired
  private AdPositionQueryMapper adPositionQueryMapper;

  /** 查询列表 */
  public List<AdPosition> findList(AdPositionQuery adPositionQuery) {
    return adPositionQueryMapper.findList(adPositionQuery);
  }

  /** 查询列表排序 */
  public List<AdPosition> findList(AdPositionQuery adPositionQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return adPositionQueryMapper.findList(adPositionQuery);
  }

  /** 查询分页 */
  public Page findPage(AdPositionQuery adPositionQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<AdPosition> list = adPositionQueryMapper.findList(adPositionQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(AdPositionQuery adPositionQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<AdPosition> list = adPositionQueryMapper.findList(adPositionQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
