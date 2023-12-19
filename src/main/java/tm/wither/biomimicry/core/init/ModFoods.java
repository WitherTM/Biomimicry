package tm.wither.biomimicry.core.init;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CHOPPED_CARROTS = new FoodProperties.Builder().alwaysEat().nutrition(2).fast().build();
    public static final FoodProperties SWEET_BERRY = new FoodProperties.Builder().fast().nutrition(1).build();
    public static final FoodProperties RAW_MEATBALL = new FoodProperties.Builder().meat().nutrition(4).build();
    public static final FoodProperties MEATBALL = new FoodProperties.Builder().meat().nutrition(8).saturationMod(1.5F).build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().fast().nutrition(3).build();
}
