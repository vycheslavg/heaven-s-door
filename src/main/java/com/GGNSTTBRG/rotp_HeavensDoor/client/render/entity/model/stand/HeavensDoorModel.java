package com.GGNSTTBRG.rotp_HeavensDoor.client.render.entity.model.stand;
import com.GGNSTTBRG.rotp_HeavensDoor.entity.stand.stands.HeavensDoorEntity;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;
import net.minecraft.client.renderer.entity.model.EntityModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class HeavensDoorModel extends EntityModel<HeavensDoorEntity> {
    private final ModelPart HeavensDoor;

	public HeavensDoorModel() {
		texWidth = 64;
		texHeight = 64;

	}

	@Override
	public void setupAnim(HeavensDoorProjectileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		HeavensDoor.yRot = netHeadYaw * ((float)Math.PI / 180F);
		HeavensDoor.xRot = ageInTicks * 2F;
	}

	@Override
	public void setupAnim(HeavensDoorEntity entity, float limbSwing, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		HeavensDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}