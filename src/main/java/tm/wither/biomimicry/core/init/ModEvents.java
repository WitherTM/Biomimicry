package tm.wither.biomimicry.core.init;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import tm.wither.biomimicry.Biomimicry;

@Mod.EventBusSubscriber(modid = Biomimicry.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    static void addBuiltinPack(final AddPackFindersEvent event) {
        if (event.getPackType() == PackType.SERVER_DATA) {
            event.addRepositorySource(onLoad -> onLoad.accept(Pack.readMetaAndCreate("exnihilo_disabled", Component.translatable("datapack.exnihilo_disable_pack.name"), false, pId ->
                            new PathPackResources(pId, ModList.get().getModFileById(Biomimicry.MOD_ID).getFile().findResource("data/biomimicry/datapacks/" + pId), false)
                    , PackType.SERVER_DATA, Pack.Position.TOP, PackSource.BUILT_IN)));
        }
    }
}