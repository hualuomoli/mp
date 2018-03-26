package cn.hualuomoli.mp.nideshop.api.footprint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;

import cn.hualuomoli.mp.nideshop.api.footprint.entity.ApiFootPrint;
import cn.hualuomoli.mp.nideshop.api.footprint.mapper.FootPrintMapper;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;

@Service(value = "cn.hualuomoli.mp.nideshop.api.footprint.service.FootPrintService")
@Transactional(readOnly = true)
public class FootPrintService {

  @Autowired
  private FootPrintMapper footPrintMapper;

  /**
   * 分页查询
   * @param pageNo 当前页码
   * @param pageSize 每页数量
   * @return 分页数据
   */
  public Page page(Integer pageNo, Integer pageSize) {
    PaginationInterceptor.setPagination(pageNo, pageSize, "t.add_time desc, t.id desc");
    List<ApiFootPrint> dataList = footPrintMapper.list(ApiUtils.getCurrentUserId());
    Integer count = PaginationInterceptor.getCount();
    return new Page(pageNo, pageSize, count, dataList);
  }

}
