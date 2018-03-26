package cn.hualuomoli.mp.nideshop.base.query.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.Channel;
import cn.hualuomoli.mp.nideshop.base.query.entity.ChannelQuery;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.query.mapper.ChannelQueryMapper")
public interface ChannelQueryMapper {

  /** 查询列表 */
  List<Channel> findList(ChannelQuery channelQuery);

}
