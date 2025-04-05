package com.GGNSTTBRG.rotp_HeavensDoor.client.render.entity.renderer.stand;

import com.github.standobyte.jojo.client.render.entity.model.stand.StandModelRegistry;
import com.GGNSTTBRG.rotp_HeavensDoor.RotpHeavensDoorAddon;
import com.GGNSTTBRG.rotp_HeavensDoor.client.render.entity.model.stand.HeavensDoorModel;
import com.GGNSTTBRG.rotp_HeavensDoor.entity.stand.stands.HeavensDoorEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class HeavensDoorRenderer extends StandEntityRenderer<HeavensDoorEntity, HeavensDoorModel> {
    
    public HeavensDoorRenderer(EntityRendererManager renderManager) {
        super(renderManager,
                StandModelRegistry.registerModel(new ResourceLocation(RotpHeavensDoorAddon.MOD_ID, "HeavensDoor"), HeavensDoorModel::new),
                new ResourceLocation(RotpHeavensDoorAddon.MOD_ID, "textures/entity/stand/HeavensDoor.png"), 0);
    }
}
