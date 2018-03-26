package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Feedback;
import cn.hualuomoli.mp.nideshop.base.query.entity.FeedbackQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.FeedbackQueryMapper")
public interface FeedbackQueryMapper {

  /** 查询列表 */
  List<Feedback> findList(FeedbackQuery feedbackQuery);

}
