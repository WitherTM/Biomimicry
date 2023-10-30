package tm.wither.biomimicry.core.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;
import tm.wither.biomimicry.Biomimicry;
import tm.wither.biomimicry.block.WashedCactusBlock;
import tm.wither.biomimicry.block.WheatGrassBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Biomimicry.MOD_ID);
    public static final RegistryObject<CactusBlock> WASHED_CACTUS = registerBlock("washed_cactus",
            () -> new WashedCactusBlock(BlockBehaviour.Properties.copy(Blocks.CACTUS)));
    public static final RegistryObject<Block> WHEAT_GRASS = registerBlock("wheat_grass",
            () -> new WheatGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));

    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
