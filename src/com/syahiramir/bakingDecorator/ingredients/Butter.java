package com.syahiramir.bakingDecorator.ingredients;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/27/2019.
 */
public class Butter extends IngredientsDecorator {
    private BakedGoods bakedGoods;

    public Butter (BakedGoods bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getDescription () {
        return bakedGoods.getDescription() + ", Butter ";
    }

    public double cost() { return .2 + bakedGoods.cost(); }
}
