package com.changgou.goods.dao;

import com.changgou.goods.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/****
 * @Author:admin
 * @Description:Brand的Dao
 * @Date 2019/6/14 0:12
 *****/
public interface BrandMapper extends Mapper<Brand> {
    //查询
    @Select(value = "select tb.* from tb_category_brand tcb,tb_brand tb where tcb.category_id=#{id} and tcb.brand_id=tb.id")
    List<Brand> findBrandByCategory(Integer id);
}
