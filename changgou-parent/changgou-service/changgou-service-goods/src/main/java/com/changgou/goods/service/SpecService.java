package com.changgou.goods.service;
import com.changgou.goods.pojo.Spec;
import com.github.pagehelper.PageInfo;
import com.changgou.core.service.CoreService;

import java.util.List;

/****
 * @Author:admin
 * @Description:Spec业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface SpecService extends CoreService<Spec> {

    List<Spec> findByCategoryId(Integer id);
}
