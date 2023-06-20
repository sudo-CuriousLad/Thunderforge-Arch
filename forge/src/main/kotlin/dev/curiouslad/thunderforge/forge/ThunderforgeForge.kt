package dev.curiouslad.thunderforge.forge

import dev.architectury.platform.forge.EventBuses
import dev.curiouslad.thunderforge.Thunderforge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext

@Mod(Thunderforge.MOD_ID)
class ThunderforgeForge {
    init {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Thunderforge.MOD_ID, FMLJavaModLoadingContext.get().modEventBus)
        Thunderforge.init()
    }
}