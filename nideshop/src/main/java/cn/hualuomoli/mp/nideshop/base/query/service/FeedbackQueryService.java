package cn.hualuomoli.mp.nideshop.base.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import cn.hualuomoli.mp.nideshop.base.entity.Feedback;
import cn.hualuomoli.mp.nideshop.base.query.entity.FeedbackQuery;
import cn.hualuomoli.mp.nideshop.base.query.mapper.FeedbackQueryMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.query.service.FeedbackQueryService")
@Transactional(readOnly = true)
public class FeedbackQueryService {

  @Autowired
  private FeedbackQueryMapper feedbackQueryMapper;

  /** 查询列表 */
  public List<Feedback> findList(FeedbackQuery feedbackQuery) {
    return feedbackQueryMapper.findList(feedbackQuery);
  }

  /** 查询列表排序 */
  public List<Feedback> findList(FeedbackQuery feedbackQuery, String orderBy) {
    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return feedbackQueryMapper.findList(feedbackQuery);
  }

  /** 查询分页 */
  public Page findPage(FeedbackQuery feedbackQuery, Integer pageNo, Integer pageSize) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Feedback> list = feedbackQueryMapper.findList(feedbackQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(FeedbackQuery feedbackQuery, Integer pageNo, Integer pageSize, String orderBy) {
    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Feedback> list = feedbackQueryMapper.findList(feedbackQuery);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
