package com.changgou.core.service;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 22:47
 */
public interface DeleteService<T> {
    /**
     * 根据条件删除
     *
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 根据ID 删除
     *
     * @param id
     * @return
     */
    int deleteById(Object id);
}
