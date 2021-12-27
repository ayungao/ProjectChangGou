package com.changgou.goods.controller;
import com.changgou.goods.pojo.Template;
import com.changgou.goods.service.TemplateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.changgou.core.AbstractCoreController;

/****
 * @Author:admin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/template")
@CrossOrigin
public class TemplateController extends AbstractCoreController<Template>{

    private TemplateService  templateService;

    @Autowired
    public TemplateController(TemplateService  templateService) {
        super(templateService, Template.class);
        this.templateService = templateService;
        }
}
