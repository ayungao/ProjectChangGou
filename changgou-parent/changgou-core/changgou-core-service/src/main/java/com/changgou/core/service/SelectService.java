package com.changgou.core.service;

import java.util.List;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 22:47
 */
public interface SelectService<T> {
    /**
     * 查询所有
     *
     * @return
     */
    public List<T> selectAll();

    /**
     * 查询一个对象
     *
     * @param id
     * @return
     */
    public T selectByPrimaryKey(Object id);

    /**
     * 根据条件查询
     *
     * @param record
     * @return
     */
    public List<T> select(T record);

}
