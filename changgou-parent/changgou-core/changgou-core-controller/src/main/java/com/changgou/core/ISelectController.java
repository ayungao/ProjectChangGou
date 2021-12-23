package com.changgou.core;

import entity.Result;

import java.util.List;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 23:43
 */
public interface ISelectController<T> {
    //根据ID 获取信息
    public Result<T> findById(Object id);


    //根据ID 获取信息列表
    public Result<List<T>> findAll();
}
