package com.changgou.goods.controller;

import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;

import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.changgou.core.AbstractCoreController;

import java.util.List;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController extends AbstractCoreController<Brand> {

    private BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        super(brandService, Brand.class);
        this.brandService = brandService;
    }

    //    根据分类的ID 获取分类下的所有的品牌的列表
    @GetMapping("/category/{id}")
    public Result<List<Brand>> findBrandByCategory(@PathVariable(name = "id") Integer id) {
        List<Brand> brandList = brandService.findBrandByCategory(id);
        return new Result<List<Brand>>(true, StatusCode.OK, "查询品牌的列表成功", brandList);
    }
}
