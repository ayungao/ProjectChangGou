package com.changgou.goods.service.impl;

import com.changgou.goods.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/2 19:28
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 查询所有的品牌列表
     *
     * @return
     */
    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    /**
     * 添加品牌
     *
     * @param brand
     */
    @Override
    public void add(Brand brand) {
        brandMapper.insertSelective(brand);
    }

    /**
     * 根据ID 获取品牌的数据
     *
     * @param id
     * @return
     */
    @Override
    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新品牌
     *
     * @param brand
     */
    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKeySelective(brand);
    }

    /**
     * 根据ID 删除
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        brandMapper.deleteByPrimaryKey(id);
    }

    /**
     * 条件搜索
     *
     * @param brand
     * @return
     */
    @Override
    public List<Brand> search(Brand brand) {
        Example example = getExample(brand);
        List<Brand> brandList = brandMapper.selectByExample(example);
        return brandList;
    }

    /**
     * 无条件的 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<Brand> findByPage(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Brand> brandList = brandMapper.selectAll();
        PageInfo<Brand> pageInfo = new PageInfo<Brand>(brandList);
        return pageInfo;
    }

    /**
     * 有条件的分页查询
     *
     * @param page
     * @param size
     * @param brand
     * @return
     */
    @Override
    public PageInfo<Brand> findByPage(Integer page, Integer size, Brand brand) {
        Example example = getExample(brand);
        PageHelper.startPage(page, size);
        List<Brand> brandList = brandMapper.selectByExample(example);
        PageInfo<Brand> pageInfo = new PageInfo<Brand>(brandList);
        return pageInfo;
    }

    private Example getExample(Brand brand) {
        Example example = new Example(Brand.class);
        if (brand != null) {
            Example.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(brand.getName())) {
                criteria.andLike("name", "%" + brand.getName() + "%");
            }
            if (!StringUtils.isEmpty(brand.getLetter())) {
                criteria.andEqualTo("letter", brand.getLetter());
            }
        }
        return example;
    }
}
