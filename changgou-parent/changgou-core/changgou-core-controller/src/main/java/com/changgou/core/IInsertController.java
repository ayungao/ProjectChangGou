package com.changgou.core;

import entity.Result;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 23:42
 */
public interface IInsertController<T> {
    /**
     * 添加记录
     *
     * @param record
     * @return
     */
    Result insert(T record);
}
