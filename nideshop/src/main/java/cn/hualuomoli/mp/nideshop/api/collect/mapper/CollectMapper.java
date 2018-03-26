package cn.hualuomoli.mp.nideshop.api.collect.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.api.collect.entity.ApiCollect;

@Repository(value = "cn.hualuomoli.mp.nideshop.api.collect.mapper.CollectMapper")
public interface CollectMapper {

  List<ApiCollect> find(@Param(value = "user_id") Integer user_id, @Param(value = "type_id") Integer type_id);

}
