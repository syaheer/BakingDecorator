package com.syahiramir.bakingDecorator;

import com.syahiramir.bakingDecorator.bakedGoods.BakedGoods;
import com.syahiramir.bakingDecorator.bakedGoods.Cake;
import com.syahiramir.bakingDecorator.bakedGoods.Cookie;
import com.syahiramir.bakingDecorator.bakedGoods.Pie;
import com.syahiramir.bakingDecorator.ingredients.*;

import java.text.DecimalFormat;

/**
 * Created by MuhamadSyahirAmir on 8/26/2019.
 */
public class Kitchen {
    public static void main(String args[]) {
        // Prepare decimal formal for cost
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        // Cookie
        BakedGoods cookie = new Cookie();

        // Ingredients for a cookie
        cookie = new Flour(cookie);
        cookie = new Sugar(cookie);
        cookie = new Eggs(cookie);
        cookie = new Butter(cookie);
        cookie = new ChocolateChips(cookie);

        System.out.println(cookie.getDescription() + " $" + df.format(cookie.cost()));

        // Cake
        BakedGoods cake = new Cake();

        // Ingredients for a cake
        cake = new Flour(cake);
        cake = new Sugar(cake);
        cake = new Eggs(cake);
        cake = new Butter(cake);
        cake = new ChocolateChips(cake);
        cake = new Milk(cake);
        cake = new BakingPowder(cake);

        System.out.println(cake.getDescription() + " $" + df.format(cake.cost()));

        // Pie
        BakedGoods pie = new Pie();

        // Ingredients for a cake
        pie = new Sugar(pie);
        pie = new Eggs(pie);
        pie = new BakingPowder(pie);
        pie = new Cinnamon(pie);
        pie = new PieCrust(pie);

        System.out.println(pie.getDescription() + " $" + df.format(pie.cost()));
    }
}
