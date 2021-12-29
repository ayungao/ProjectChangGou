package com.changgou.goods.service;
import com.changgou.goods.pojo.Brand;
import com.github.pagehelper.PageInfo;
import com.changgou.core.service.CoreService;

import java.util.List;

/****
 * @Author:admin
 * @Description:Brand业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface BrandService extends CoreService<Brand> {

    List<Brand> findBrandByCategory(Integer id);
}
