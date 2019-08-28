package com.syahiramir.bakingDecorator.bakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/26/2019.
 */
public abstract class BakedGoods {
    String description = "Unknown Baked Goods";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
