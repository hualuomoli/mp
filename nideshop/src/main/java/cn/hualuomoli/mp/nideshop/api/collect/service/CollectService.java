package cn.hualuomoli.mp.nideshop.api.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hualuomoli.mp.nideshop.api.collect.entity.ApiCollect;
import cn.hualuomoli.mp.nideshop.api.collect.mapper.CollectMapper;
import cn.hualuomoli.mp.nideshop.api.util.ApiUtils;

@Service(value = "cn.hualuomoli.mp.nideshop.api.collect.service.CollectService")
@Transactional(readOnly = true)
public class CollectService {

  @Autowired
  private CollectMapper collectMapper;

  public List<ApiCollect> find(Integer type_id) {
    return collectMapper.find(ApiUtils.getCurrentUserId(), type_id);
  }

}
