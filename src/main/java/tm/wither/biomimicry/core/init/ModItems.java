package tm.wither.biomimicry.core.init;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;
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
    public static final RegistryObject<Item> CACTUS_SPINE = ITEMS.register("cactus_spine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOPPED_CARROTS = ITEMS.register("chopped_carrots",
            () -> new Item(new Item.Properties().food(ModFoods.CHOPPED_CARROTS)));

    public static final RegistryObject<Item> CARROT_PASTE = ITEMS.register("carrot_paste",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEAT_PASTE = ITEMS.register("meat_paste",
            () -> new Item(new Item.Properties().food(ModFoods.MEAT_PASTE)));
    public static final RegistryObject<Item> WHEAT_RICE_MIX = ITEMS.register("wheat_rice_mix",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CACTUS_SPEAR = ITEMS.register("cactus_spear",
            () -> new CactusSpearItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
