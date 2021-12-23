package com.changgou.core;

import entity.Result;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 23:43
 */
public interface IUpdateController<T> {
    /**
     * 根据对象进行更新 根据ID
     *
     * @param record
     * @return
     */
    Result updateByPrimaryKey(T record);
}
