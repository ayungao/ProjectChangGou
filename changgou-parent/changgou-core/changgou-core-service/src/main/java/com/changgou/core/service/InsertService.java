package com.changgou.core.service;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 22:47
 */
public interface InsertService<T> {
    /**
     * 添加记录
     *
     * @param record
     * @return
     */
    int insert(T record);
}
