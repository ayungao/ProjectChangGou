package com.changgou.goods.controller;
import com.changgou.goods.pojo.Pref;
import com.changgou.goods.service.PrefService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.changgou.core.AbstractCoreController;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/pref")
@CrossOrigin
public class PrefController extends AbstractCoreController<Pref>{

    private PrefService  prefService;

    @Autowired
    public PrefController(PrefService  prefService) {
        super(prefService, Pref.class);
        this.prefService = prefService;
        }
}
