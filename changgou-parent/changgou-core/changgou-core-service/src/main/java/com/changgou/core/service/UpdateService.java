package com.changgou.core.service;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 22:47
 */
public interface UpdateService<T> {
    /**
     * 根据对象进行更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);
}
