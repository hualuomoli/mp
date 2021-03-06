package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Channel;
import cn.hualuomoli.mp.nideshop.base.query.entity.ChannelQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.ChannelQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.ChannelQueryService")
@Transactional(readOnly = true)
public class ChannelQueryService {

  @Autowired
  private ChannelQueryMapper channelQueryMapper;

  /** 查询列表 */
  public List<Channel> findList(ChannelQuery channelQuery) {
    return channelQueryMapper.findList(channelQuery);
  }

  /** 查询列表排序 */
  public List<Channel> findList(ChannelQuery channelQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return channelQueryMapper.findList(channelQuery);
  }

  /** 查询分页 */
  public Page findPage(ChannelQuery channelQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Channel> list = channelQueryMapper.findList(channelQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(ChannelQuery channelQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Channel> list = channelQueryMapper.findList(channelQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
