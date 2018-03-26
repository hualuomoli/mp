package cn.hualuomoli.mp.nideshop.base.service;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import com.github.hualuomoli.framework.util.CollectionUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Topic;
import cn.hualuomoli.mp.nideshop.base.mapper.TopicBaseMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.service.TopicBaseService")
@Transactional(readOnly = true)
public class TopicBaseService {

  @Autowired
  private TopicBaseMapper topicBaseMapper;

  /** 添加 */
  @Transactional(readOnly = false)
  public int insert(Topic topic) {
    Validate.notNull(topic, "topic is null.");

    return topicBaseMapper.insert(topic);
  }

  /** 批量添加 */
  @Transactional(readOnly = false)
  public <T extends Topic> int batchInsert(List<T> list, int fetchSize) {
    if (list == null || list.size() == 0) {
      return 0;
    }
    List<List<T>> splits = CollectionUtils.split(list, fetchSize);
    int count = 0;
    for (int i = 0; i < splits.size(); i++) {
      count += topicBaseMapper.batchInsert(splits.get(i));
    }
    return count;
  }

  /** 查询列表 */
  public List<Topic> findList(Topic topic) {
    Validate.notNull(topic, "topic is null.");

    return topicBaseMapper.findList(topic);
  }

  /** 查询列表排序 */
  public List<Topic> findList(Topic topic, String orderBy) {
    Validate.notNull(topic, "topic is null.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return topicBaseMapper.findList(topic);
  }

  /** 查询分页 */
  public Page findPage(Topic topic, Integer pageNo, Integer pageSize) {
    Validate.notNull(topic, "topic is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Topic> list = topicBaseMapper.findList(topic);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(Topic topic, Integer pageNo, Integer pageSize, String orderBy) {
    Validate.notNull(topic, "topic is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Topic> list = topicBaseMapper.findList(topic);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
