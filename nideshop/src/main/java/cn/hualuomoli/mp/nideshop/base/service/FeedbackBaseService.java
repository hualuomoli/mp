package cn.hualuomoli.mp.nideshop.base.service;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import com.github.hualuomoli.framework.util.CollectionUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Feedback;
import cn.hualuomoli.mp.nideshop.base.mapper.FeedbackBaseMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.service.FeedbackBaseService")
@Transactional(readOnly = true)
public class FeedbackBaseService {

  @Autowired
  private FeedbackBaseMapper feedbackBaseMapper;

  /** 根据主键msg_id查询 */
  public Feedback get(java.lang.Integer msg_id) {
    Validate.notNull(msg_id, "msg_id is null.");

    return feedbackBaseMapper.get(msg_id);
  }

  /** 添加 */
  @Transactional(readOnly = false)
  public int insert(Feedback feedback) {
    Validate.notNull(feedback, "feedback is null.");

    return feedbackBaseMapper.insert(feedback);
  }

  /** 批量添加 */
  @Transactional(readOnly = false)
  public <T extends Feedback> int batchInsert(List<T> list, int fetchSize) {
    if (list == null || list.size() == 0) {
      return 0;
    }
    List<List<T>> splits = CollectionUtils.split(list, fetchSize);
    int count = 0;
    for (int i = 0; i < splits.size(); i++) {
      count += feedbackBaseMapper.batchInsert(splits.get(i));
    }
    return count;
  }

  /** 根据主键msg_id修改全部信息 */
  @Transactional(readOnly = false)
  public int update(Feedback feedback) {
    Validate.notNull(feedback, "feedback is null.");

    return feedbackBaseMapper.update(feedback);
  }

  /** 根据主键msg_id修改 */
  @Transactional(readOnly = false)
  public int updateByMsg_id(java.lang.Integer msg_id, Feedback feedback) {
    Validate.notNull(msg_id, "msg_id is null.");
    Validate.notNull(feedback, "feedback is null.");

    feedback.setMsg_id(msg_id);
    return feedbackBaseMapper.updateByMsg_id(feedback);
  }

  /** 根据主键删除 */
  @Transactional(readOnly = false)
  public int delete(java.lang.Integer msg_id) {
    Validate.notNull(msg_id, "msg_id is null.");

    return feedbackBaseMapper.delete(msg_id);
  }

  /** 根据主键批量删除 */
  @Transactional(readOnly = false)
  public int deleteByArray(java.lang.Integer[] msg_ids) {
    if (msg_ids == null || msg_ids.length == 0) {
      return 0;
    }
    return feedbackBaseMapper.deleteByArray(msg_ids);
  }

  /** 查询列表 */
  public List<Feedback> findList(Feedback feedback) {
    Validate.notNull(feedback, "feedback is null.");

    return feedbackBaseMapper.findList(feedback);
  }

  /** 查询列表排序 */
  public List<Feedback> findList(Feedback feedback, String orderBy) {
    Validate.notNull(feedback, "feedback is null.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return feedbackBaseMapper.findList(feedback);
  }

  /** 查询分页 */
  public Page findPage(Feedback feedback, Integer pageNo, Integer pageSize) {
    Validate.notNull(feedback, "feedback is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Feedback> list = feedbackBaseMapper.findList(feedback);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(Feedback feedback, Integer pageNo, Integer pageSize, String orderBy) {
    Validate.notNull(feedback, "feedback is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Feedback> list = feedbackBaseMapper.findList(feedback);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
