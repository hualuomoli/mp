package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.GoodsIssue;
import cn.hualuomoli.mp.nideshop.base.query.entity.GoodsIssueQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.GoodsIssueQueryMapper")
public interface GoodsIssueQueryMapper {

  /** 查询列表 */
  List<GoodsIssue> findList(GoodsIssueQuery goodsIssueQuery);

}
