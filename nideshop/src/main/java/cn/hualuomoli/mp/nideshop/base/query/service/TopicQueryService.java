package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Topic;
import cn.hualuomoli.mp.nideshop.base.query.entity.TopicQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.TopicQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.TopicQueryService")
@Transactional(readOnly = true)
public class TopicQueryService {

  @Autowired
  private TopicQueryMapper topicQueryMapper;

  /** 查询列表 */
  public List<Topic> findList(TopicQuery topicQuery) {
    return topicQueryMapper.findList(topicQuery);
  }

  /** 查询列表排序 */
  public List<Topic> findList(TopicQuery topicQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return topicQueryMapper.findList(topicQuery);
  }

  /** 查询分页 */
  public Page findPage(TopicQuery topicQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Topic> list = topicQueryMapper.findList(topicQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(TopicQuery topicQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Topic> list = topicQueryMapper.findList(topicQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
