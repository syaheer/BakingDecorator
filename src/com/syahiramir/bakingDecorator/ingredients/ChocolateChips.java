package com.syahiramir.bakingDecorator.ingredients;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;

/**
 * Created by MuhamadSyahirAmir on 8/27/2019.
 */
public class ChocolateChips extends IngredientsDecorator {
    private BakedGoods bakedGoods;

    public ChocolateChips (BakedGoods bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public String getDescription () {
        return bakedGoods.getDescription() + ", Chocolate Chips ";
    }

    public double cost() { return .1 + bakedGoods.cost(); }
}
