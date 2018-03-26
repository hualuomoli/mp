package cn.hualuomoli.mp.nideshop.base.service;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import com.github.hualuomoli.framework.util.CollectionUtils;
import cn.hualuomoli.mp.nideshop.base.entity.Goods;
import cn.hualuomoli.mp.nideshop.base.mapper.GoodsBaseMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.service.GoodsBaseService")
@Transactional(readOnly = true)
public class GoodsBaseService {

  @Autowired
  private GoodsBaseMapper goodsBaseMapper;

  /** 根据主键id查询 */
  public Goods get(java.lang.Integer id) {
    Validate.notNull(id, "id is null.");

    return goodsBaseMapper.get(id);
  }

  /** 添加 */
  @Transactional(readOnly = false)
  public int insert(Goods goods) {
    Validate.notNull(goods, "goods is null.");

    return goodsBaseMapper.insert(goods);
  }

  /** 批量添加 */
  @Transactional(readOnly = false)
  public <T extends Goods> int batchInsert(List<T> list, int fetchSize) {
    if (list == null || list.size() == 0) {
      return 0;
    }
    List<List<T>> splits = CollectionUtils.split(list, fetchSize);
    int count = 0;
    for (int i = 0; i < splits.size(); i++) {
      count += goodsBaseMapper.batchInsert(splits.get(i));
    }
    return count;
  }

  /** 根据主键id修改全部信息 */
  @Transactional(readOnly = false)
  public int update(Goods goods) {
    Validate.notNull(goods, "goods is null.");

    return goodsBaseMapper.update(goods);
  }

  /** 根据主键id修改 */
  @Transactional(readOnly = false)
  public int updateById(java.lang.Integer id, Goods goods) {
    Validate.notNull(id, "id is null.");
    Validate.notNull(goods, "goods is null.");

    goods.setId(id);
    return goodsBaseMapper.updateById(goods);
  }

  /** 根据主键删除 */
  @Transactional(readOnly = false)
  public int delete(java.lang.Integer id) {
    Validate.notNull(id, "id is null.");

    return goodsBaseMapper.delete(id);
  }

  /** 根据主键批量删除 */
  @Transactional(readOnly = false)
  public int deleteByArray(java.lang.Integer[] ids) {
    if (ids == null || ids.length == 0) {
      return 0;
    }
    return goodsBaseMapper.deleteByArray(ids);
  }

  /** 查询列表 */
  public List<Goods> findList(Goods goods) {
    Validate.notNull(goods, "goods is null.");

    return goodsBaseMapper.findList(goods);
  }

  /** 查询列表排序 */
  public List<Goods> findList(Goods goods, String orderBy) {
    Validate.notNull(goods, "goods is null.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return goodsBaseMapper.findList(goods);
  }

  /** 查询分页 */
  public Page findPage(Goods goods, Integer pageNo, Integer pageSize) {
    Validate.notNull(goods, "goods is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<Goods> list = goodsBaseMapper.findList(goods);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(Goods goods, Integer pageNo, Integer pageSize, String orderBy) {
    Validate.notNull(goods, "goods is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<Goods> list = goodsBaseMapper.findList(goods);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
