package com.changgou.goods.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: AyuNGao
 * @date: 22/1/8 1:03
 */
public class Goods implements Serializable {
    private Spu spu;
    private List<Sku> skuList;

    public Spu getSpu() {
        return spu;
    }

    public void setSpu(Spu spu) {
        this.spu = spu;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }
}
