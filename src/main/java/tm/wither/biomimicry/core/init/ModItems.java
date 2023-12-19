package tm.wither.biomimicry.core.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tm.wither.biomimicry.Biomimicry;
import tm.wither.biomimicry.item.CactusSpearItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Biomimicry.MOD_ID);

    public static final RegistryObject<Item> CACTUS_FIBER = ITEMS.register("cactus_fiber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_PULP = ITEMS.register("cactus_pulp",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEATHER = ITEMS.register("raw_leather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_CACTUS_PULP = ITEMS.register("dried_cactus_pulp",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROKEN_STICK = ITEMS.register("broken_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LONELY_SWEET_BERRY = ITEMS.register("lonely_sweet_berry",
            () -> new Item(new Item.Properties().food(ModFoods.SWEET_BERRY)));
    public static final RegistryObject<Item> DULL_CACTUS_SPINE = ITEMS.register("dull_cactus_spine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> CHOPPED_ONIONS = ITEMS.register("chopped_onions",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOPPED_CARROTS = ITEMS.register("chopped_carrots",
            () -> new Item(new Item.Properties().food(ModFoods.CHOPPED_CARROTS)));
    public static final RegistryObject<Item> RAW_MEATBALL = ITEMS.register("raw_meatball",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_MEATBALL)));
    public static final RegistryObject<Item> MEATBALL = ITEMS.register("meatball",
            () -> new Item(new Item.Properties().food(ModFoods.MEATBALL )));
    public static final RegistryObject<Item> WHEAT_RICE_MIX = ITEMS.register("wheat_rice_mix",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> CACTUS_SPEAR = ITEMS.register("cactus_spear",
            () -> new CactusSpearItem(new Item.Properties()));


    public static final RegistryObject<BlockItem> WASHED_CACTUS = ITEMS.register("washed_cactus",
            () -> new BlockItem(ModBlocks.WASHED_CACTUS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> WHEAT_GRASS = ITEMS.register("wheat_grass",
            () -> new BlockItem(ModBlocks.WHEAT_GRASS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CHEESE_WHEEL = ITEMS.register("cheese_wheel",
            () -> new BlockItem(ModBlocks.CHEESE_WHEEL.get(), new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
