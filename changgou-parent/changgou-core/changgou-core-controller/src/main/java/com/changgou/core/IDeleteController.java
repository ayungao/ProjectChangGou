package com.changgou.core;

import entity.Result;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 23:42
 */
public interface IDeleteController<T> {
    /**
     * 根据ID 删除
     *
     * @param id
     * @return
     */
    Result deleteById(Object id);
}
