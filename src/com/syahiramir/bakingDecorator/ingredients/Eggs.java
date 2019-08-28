package com.syahiramir.bakingDecorator.ingredients;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/27/2019.
 */
public class Eggs extends IngredientsDecorator {
    private BakedGoods bakedGoods;

    public Eggs (BakedGoods bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getDescription () {
        return bakedGoods.getDescription() + ", Eggs ";
    }

    public double cost() { return .25 + bakedGoods.cost(); }
}
