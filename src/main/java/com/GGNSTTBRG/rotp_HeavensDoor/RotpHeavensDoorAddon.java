package com.GGNSTTBRG.rotp_HeavensDoor;

import com.GGNSTTBRG.rotp_HeavensDoor.init.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.GGNSTTBRG.rotp_HeavensDoor.init.InitEntities;
import com.GGNSTTBRG.rotp_HeavensDoor.init.InitSounds;
import com.GGNSTTBRG.rotp_HeavensDoor.init.InitStands;
import com.GGNSTTBRG.rotp_HeavensDoor.init.InitEffects;
import com.GGNSTTBRG.rotp_HeavensDoor.init.InitParticles;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RotpHeavensDoorAddon.MOD_ID) 
public class RotpHeavensDoorAddon {
    // The value here should match an entry in the META-INF/mods.toml file
    public static final String MOD_ID = "rotp_HeavensDoor";
    private static final Logger LOGGER = LogManager.getLogger();

    public RotpHeavensDoorAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitEffects.EFFECTS.register(modEventBus);
        InitParticles.PARTICLES.register((modEventBus));
        InitStands.STANDS.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
