package cn.hualuomoli.mp.nideshop.api.footprint.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.api.footprint.entity.ApiFootPrint;

@Repository(value = "cn.hualuomoli.mp.nideshop.api.footprint.mapper.FootPrintMapper")
public interface FootPrintMapper {

  List<ApiFootPrint> list(@Param(value = "user_id") Integer user_id);

}
