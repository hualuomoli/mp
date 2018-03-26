package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.TopicCategory;
import cn.hualuomoli.mp.nideshop.base.query.entity.TopicCategoryQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.TopicCategoryQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.TopicCategoryQueryService")
@Transactional(readOnly = true)
public class TopicCategoryQueryService {

  @Autowired
  private TopicCategoryQueryMapper topicCategoryQueryMapper;

  /** 查询列表 */
  public List<TopicCategory> findList(TopicCategoryQuery topicCategoryQuery) {
    return topicCategoryQueryMapper.findList(topicCategoryQuery);
  }

  /** 查询列表排序 */
  public List<TopicCategory> findList(TopicCategoryQuery topicCategoryQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return topicCategoryQueryMapper.findList(topicCategoryQuery);
  }

  /** 查询分页 */
  public Page findPage(TopicCategoryQuery topicCategoryQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<TopicCategory> list = topicCategoryQueryMapper.findList(topicCategoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(TopicCategoryQuery topicCategoryQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<TopicCategory> list = topicCategoryQueryMapper.findList(topicCategoryQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
