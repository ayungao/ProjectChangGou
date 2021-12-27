package com.changgou.goods.controller;
import com.changgou.goods.pojo.Para;
import com.changgou.goods.service.ParaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.changgou.core.AbstractCoreController;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/para")
@CrossOrigin
public class ParaController extends AbstractCoreController<Para>{

    private ParaService  paraService;

    @Autowired
    public ParaController(ParaService  paraService) {
        super(paraService, Para.class);
        this.paraService = paraService;
        }
}
