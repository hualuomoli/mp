package cn.hualuomoli.mp.nideshop.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.hualuomoli.mp.nideshop.base.entity.User;

// 
@Repository(value = "cn.hualuomoli.mp.nideshop.base.mapper.UserBaseMapper")
public interface UserBaseMapper {

  /** 根据主键id查询 */
  User get(java.lang.Integer id);

  /** 添加 */
  int insert(User user);

  /** 批量添加 */
  <T extends User> int batchInsert(@Param(value = "list") List<T> list);

  /** 根据主键修改全部信息 */
  int update(User user);

  /** 根据主键修改 */
  int updateById(User user);

  /** 根据主键删除 */
  int delete(java.lang.Integer id);

  /** 根据主键批量删除 */
  int deleteByArray(@Param(value = "ids") java.lang.Integer[] id);

  /** 查询列表 */
  List<User> findList(User user);

}
