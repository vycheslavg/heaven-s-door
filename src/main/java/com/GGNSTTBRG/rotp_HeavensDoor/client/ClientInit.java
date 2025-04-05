package com.GGNSTTBRG.rotp_HeavensDoor.client;

import com.GGNSTTBRG.rotp_HeavensDoor.RotpHeavensDoorAddon;
import com.GGNSTTBRG.rotp_HeavensDoor.client.render.entity.renderer.stand.HeavensDoorRenderer;
import com.GGNSTTBRG.rotp_HeavensDoor.init.AddonStands;
import com.GGNSTTBRG.rotp_HeavensDoor.init.InitEntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = RotpHeavensDoorAddon.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(AddonStands.HEAVENS_DOOR.getEntityType(), HeavensDoorRenderer::new);
    }
}
