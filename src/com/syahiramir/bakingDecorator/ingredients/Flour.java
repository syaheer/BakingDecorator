package com.syahiramir.bakingDecorator.ingredients;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/27/2019.
 */
public class Flour extends IngredientsDecorator {
    private BakedGoods bakedGoods;

    public Flour (BakedGoods bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getDescription () {
        return bakedGoods.getDescription() + ", Flour ";
    }

    public double cost() { return .05 + bakedGoods.cost(); }
}
