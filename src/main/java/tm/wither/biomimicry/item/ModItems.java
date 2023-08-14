package tm.wither.biomimicry.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tm.wither.biomimicry.Biomimicry;
import tm.wither.biomimicry.block.custom.CactusSpikeItem;

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
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DULL_CACTUS_SPIKE = ITEMS.register("dull_cactus_spike",
            () -> new Item(new Item.Properties()));
    public  static final RegistryObject<Item> CLEAN_SWEET_BERRY = ITEMS.register("clean_sweet_berry",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<SwordItem> CACTUS_SPIKE = ITEMS.register("cactus_spike",
            () -> new CactusSpikeItem(Tiers.STONE, 6, -2.5f, new Item.Properties().durability(512)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
