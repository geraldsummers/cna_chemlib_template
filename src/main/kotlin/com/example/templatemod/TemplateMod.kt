package com.example.templatemod

import com.mojang.logging.LogUtils
import net.minecraftforge.fml.common.Mod
import org.slf4j.Logger

@Mod(TemplateMod.MOD_ID)
class TemplateMod {
    init {
        LOGGER.info("Loaded mod {}", MOD_ID)
    }

    companion object {
        const val MOD_ID: String = "templatemod"
        val LOGGER: Logger = LogUtils.getLogger()
    }
}

