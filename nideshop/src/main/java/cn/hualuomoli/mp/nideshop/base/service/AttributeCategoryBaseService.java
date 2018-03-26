package cn.hualuomoli.mp.nideshop.base.service;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hualuomoli.framework.entity.Page;
import com.github.hualuomoli.framework.plugin.mybatis.interceptor.pagination.PaginationInterceptor;
import com.github.hualuomoli.framework.util.CollectionUtils;
import cn.hualuomoli.mp.nideshop.base.entity.AttributeCategory;
import cn.hualuomoli.mp.nideshop.base.mapper.AttributeCategoryBaseMapper;

// 
@Service(value = "cn.hualuomoli.mp.nideshop.base.service.AttributeCategoryBaseService")
@Transactional(readOnly = true)
public class AttributeCategoryBaseService {

  @Autowired
  private AttributeCategoryBaseMapper attributeCategoryBaseMapper;

  /** 根据主键id查询 */
  public AttributeCategory get(java.lang.Integer id) {
    Validate.notNull(id, "id is null.");

    return attributeCategoryBaseMapper.get(id);
  }

  /** 添加 */
  @Transactional(readOnly = false)
  public int insert(AttributeCategory attributeCategory) {
    Validate.notNull(attributeCategory, "attributeCategory is null.");

    return attributeCategoryBaseMapper.insert(attributeCategory);
  }

  /** 批量添加 */
  @Transactional(readOnly = false)
  public <T extends AttributeCategory> int batchInsert(List<T> list, int fetchSize) {
    if (list == null || list.size() == 0) {
      return 0;
    }
    List<List<T>> splits = CollectionUtils.split(list, fetchSize);
    int count = 0;
    for (int i = 0; i < splits.size(); i++) {
      count += attributeCategoryBaseMapper.batchInsert(splits.get(i));
    }
    return count;
  }

  /** 根据主键id修改全部信息 */
  @Transactional(readOnly = false)
  public int update(AttributeCategory attributeCategory) {
    Validate.notNull(attributeCategory, "attributeCategory is null.");

    return attributeCategoryBaseMapper.update(attributeCategory);
  }

  /** 根据主键id修改 */
  @Transactional(readOnly = false)
  public int updateById(java.lang.Integer id, AttributeCategory attributeCategory) {
    Validate.notNull(id, "id is null.");
    Validate.notNull(attributeCategory, "attributeCategory is null.");

    attributeCategory.setId(id);
    return attributeCategoryBaseMapper.updateById(attributeCategory);
  }

  /** 根据主键删除 */
  @Transactional(readOnly = false)
  public int delete(java.lang.Integer id) {
    Validate.notNull(id, "id is null.");

    return attributeCategoryBaseMapper.delete(id);
  }

  /** 根据主键批量删除 */
  @Transactional(readOnly = false)
  public int deleteByArray(java.lang.Integer[] ids) {
    if (ids == null || ids.length == 0) {
      return 0;
    }
    return attributeCategoryBaseMapper.deleteByArray(ids);
  }

  /** 查询列表 */
  public List<AttributeCategory> findList(AttributeCategory attributeCategory) {
    Validate.notNull(attributeCategory, "attributeCategory is null.");

    return attributeCategoryBaseMapper.findList(attributeCategory);
  }

  /** 查询列表排序 */
  public List<AttributeCategory> findList(AttributeCategory attributeCategory, String orderBy) {
    Validate.notNull(attributeCategory, "attributeCategory is null.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置排序
    PaginationInterceptor.setListOrder(orderBy);
    // 查询列表
    return attributeCategoryBaseMapper.findList(attributeCategory);
  }

  /** 查询分页 */
  public Page findPage(AttributeCategory attributeCategory, Integer pageNo, Integer pageSize) {
    Validate.notNull(attributeCategory, "attributeCategory is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize);
    // 查询
    List<AttributeCategory> list = attributeCategoryBaseMapper.findList(attributeCategory);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

  /** 查询分页 */
  public Page findPage(AttributeCategory attributeCategory, Integer pageNo, Integer pageSize, String orderBy) {
    Validate.notNull(attributeCategory, "attributeCategory is null.");
    Validate.notNull(pageNo, "pageNo is null.");
    Validate.isTrue(pageNo > 0, "invalid pageNo.");
    Validate.notNull(pageSize, "pageSize is null.");
    Validate.isTrue(pageSize > 0, "invalid pageSize.");
    Validate.notNull(orderBy, "orderBy is blank.");

    // 设置分页
    PaginationInterceptor.setPagination(pageNo, pageSize, orderBy);
    // 查询
    List<AttributeCategory> list = attributeCategoryBaseMapper.findList(attributeCategory);
    // 总数量
    int count = PaginationInterceptor.getCount();
    // 组装
    return new Page(pageNo, pageSize, count, list);
  }

}
