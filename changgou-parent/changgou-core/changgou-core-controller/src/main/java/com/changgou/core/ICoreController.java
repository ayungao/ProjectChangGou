package com.changgou.core;

/**
 * @description:
 * @author: AyuNGao
 * @date: 21/12/23 23:43
 */
public interface ICoreController<T> extends
        ISelectController<T>,
        IInsertController<T>,
        IPagingController<T>,
        IDeleteController<T>,
        IUpdateController<T> {
}
