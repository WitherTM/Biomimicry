package tm.wither.biomimicry.core.init;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CHOPPED_CARROTS = new FoodProperties.Builder().alwaysEat().nutrition(2).fast().build();
    public static final FoodProperties SWEET_BERRY = new FoodProperties.Builder().fast().nutrition(1).build();
    public static final FoodProperties MEAT_COMPOUND = new FoodProperties.Builder().nutrition(3).build();
}
