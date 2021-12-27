package com.changgou.goods.controller;
import com.changgou.goods.pojo.Category;
import com.changgou.goods.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.changgou.core.AbstractCoreController;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController extends AbstractCoreController<Category>{

    private CategoryService  categoryService;

    @Autowired
    public CategoryController(CategoryService  categoryService) {
        super(categoryService, Category.class);
        this.categoryService = categoryService;
        }
}
