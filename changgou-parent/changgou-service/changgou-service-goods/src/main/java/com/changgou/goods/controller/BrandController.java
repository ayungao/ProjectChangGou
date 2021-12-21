package com.changgou.goods.controller;

import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import com.github.pagehelper.PageInfo;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/2 19:15
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 查询所有的品牌列表
     *
     * @return
     */
    @GetMapping("/findAll")
    public Result<List<Brand>> findAll() {
        List<Brand> all = brandService.findAll();
        return new Result(true, StatusCode.OK, "查询所有品牌成功", all);
    }

    /**
     * 添加品牌
     *
     * @param brand
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Brand brand) {
        brandService.add(brand);
        return new Result(true, StatusCode.OK, "添加成功了");
    }

    /**
     * 根据ID 获取品牌的数据
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<Brand> findById(@PathVariable Integer id) {
        Brand brand = brandService.findById(id);
        return new Result<Brand>(true, StatusCode.OK, "查询成功", brand);
    }

    /**
     * 更新品牌
     *
     * @param id
     * @param brand
     * @return
     */
    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody Brand brand) {
        brand.setId(id);
        brandService.update(brand);
        return new Result(true, StatusCode.OK, "更新成功");
    }

    /**
     * 根据ID 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        brandService.delete(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }


    /**
     * 条件搜索
     *
     * @param brand
     * @return
     */
    @PostMapping("/search")
    public Result search(@RequestBody Brand brand) {
        List<Brand> brandList = brandService.search(brand);
        return new Result<List<Brand>>(true, StatusCode.OK, "条件搜索查询成功", brandList);
    }

    /**
     * 无条件的 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/search/{page}/{size}")
    public Result findByPage(@PathVariable Integer page, @PathVariable Integer size) {
        PageInfo<Brand> pageinfo = brandService.findByPage(page, size);
        return new Result<PageInfo<Brand>>(true, StatusCode.OK, "条件搜索查询成功", pageinfo);
    }

    /**
     * 有条件的分页查询
     *
     * @return
     */
    @PostMapping("/search/{page}/{size}")
    public Result findByPage(@PathVariable Integer page, @PathVariable Integer size, @RequestBody Brand brand) {
        PageInfo<Brand> pageinfo = brandService.findByPage(page, size, brand);
        return new Result<PageInfo<Brand>>(true, StatusCode.OK, "有条件分页查询成功", pageinfo);
    }
}
