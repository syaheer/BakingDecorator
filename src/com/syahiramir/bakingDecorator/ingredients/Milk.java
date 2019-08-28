package com.syahiramir.bakingDecorator.ingredients;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/27/2019.
 */
public class Milk extends IngredientsDecorator {
    private BakedGoods bakedGoods;

    public Milk (BakedGoods bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getDescription () {
        return bakedGoods.getDescription() + ", Milk ";
    }

    public double cost() { return .3 + bakedGoods.cost(); }
}
