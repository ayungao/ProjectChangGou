package com.changgou.goods.controller;
import com.changgou.goods.pojo.Sku;
import com.changgou.goods.service.SkuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.changgou.core.AbstractCoreController;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/sku")
@CrossOrigin
public class SkuController extends AbstractCoreController<Sku>{

    private SkuService  skuService;

    @Autowired
    public SkuController(SkuService  skuService) {
        super(skuService, Sku.class);
        this.skuService = skuService;
        }
}
