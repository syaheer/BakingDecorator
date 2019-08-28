package com.syahiramir.bakingDecorator.ingredients;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/27/2019.
 */
public class BakingPowder extends IngredientsDecorator {
    private BakedGoods bakedGoods;

    public BakingPowder (BakedGoods bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getDescription () {
        return bakedGoods.getDescription() + ", Baking Powder ";
    }

    public double cost() { return .3 + bakedGoods.cost(); }
}
