package com.changgou.goods.controller;

import com.changgou.goods.pojo.Category;
import com.changgou.goods.service.CategoryService;

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
@RequestMapping("/category")
@CrossOrigin
public class CategoryController extends AbstractCoreController<Category> {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        super(categoryService, Category.class);
        this.categoryService = categoryService;
    }

    //    根据父类型id获取商品类型列表，一级分类父类id为0
    @GetMapping("/list/{pid}")
    public Result findByParentId(@PathVariable Integer pid) {
        List<Category> categoryList = categoryService.findByParentId(pid);
        return new Result<List<Category>>(true, StatusCode.OK, "查询分类列表成功", categoryList);
    }
}
