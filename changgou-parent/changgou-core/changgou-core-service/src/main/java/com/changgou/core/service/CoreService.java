package com.changgou.core.service;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 22:46
 */
public interface CoreService<T> extends
        DeleteService<T>,
        InsertService<T>,
        PagingService<T>,
        SelectService<T>,
        UpdateService<T> {
}
