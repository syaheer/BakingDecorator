package com.syahiramir.bakingDecorator.ingredients;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/27/2019.
 */
public class Sugar extends IngredientsDecorator {
    private BakedGoods bakedGoods;

    public Sugar (BakedGoods bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getDescription () {
        return bakedGoods.getDescription() + ", Sugar ";
    }

    public double cost() { return .05 + bakedGoods.cost(); }
}
