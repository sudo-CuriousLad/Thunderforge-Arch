package dev.curiouslad.thunderforge.fabric

import dev.curiouslad.thunderforge.Thunderforge
import net.fabricmc.api.ModInitializer

class ThunderforgeFabric : ModInitializer {
    override fun onInitialize() {
        Thunderforge.init()
    }
}