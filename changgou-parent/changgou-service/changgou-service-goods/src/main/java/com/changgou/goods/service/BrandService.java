package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/2 19:27
 */
public interface BrandService {
    /**
     * 查询所有的品牌列表
     * @return
     */
    List<Brand> findAll();

    /**
     * 添加品牌
     * @param brand
     */
    void add(Brand brand);

    /**
     * 根据ID 获取品牌的数据
     * @param id
     * @return
     */
    Brand findById(Integer id);

    /**
     * 更新品牌
     * @param brand
     */
    void update(Brand brand);

    /**
     * 根据ID 删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 条件搜索
     * @param brand
     * @return
     */
    List<Brand> search(Brand brand);

    /**
     * 无条件的 分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Brand> findByPage(Integer page, Integer size);

    /**
     * 有条件的分页查询
     * @param page
     * @param size
     * @param brand
     * @return
     */
    PageInfo<Brand> findByPage(Integer page, Integer size, Brand brand);
}
