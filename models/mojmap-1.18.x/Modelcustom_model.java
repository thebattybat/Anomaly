// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leftarm;
	private final ModelPart rightarm;

	public Modelcustom_model(ModelPart root) {
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(),
				PartPose.offset(4.0F, 3.0F, 0.0F));

		PartDefinition cube_r1 = leftleg
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 17.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftleg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(30, 35).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 8.755F, 0.1387F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftleg
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, -6.0F, -1.0F, 2.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 3.0F, 0.0F));

		PartDefinition cube_r4 = rightleg
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -6.0F, -1.0F, 2.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r5 = rightleg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(38, 35).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 8.755F, 0.1387F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = rightleg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(35, 15).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 17.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(30, 30).addBox(
				-4.0F, -1.0F, -1.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(43, 0).addBox(-2.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1831F, -2.8902F, -0.2164F, 0.2182F, 0.0F, 0.3491F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(43, 15).addBox(-0.5F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -2.9526F, -0.4329F, 0.2182F, 0.0F, -0.3491F));

		PartDefinition cube_r9 = body
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(16, 30).addBox(-2.0F, -18.0F, -1.0F, 4.0F, 18.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 15).addBox(-6.0F, -2.0F, -5.5F, 12.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.1539F, -7.2261F, 0.2182F, -0.0436F, -0.0436F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -2.0F, -5.5F, 12.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0322F, -6.3367F, 0.5672F, 0.0F, 0.0436F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.3488F, -12.4262F, -2.1247F, -0.3927F, 0.0F, -0.4363F));

		PartDefinition cube_r12 = leftarm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(8, 30).addBox(14.0F, -37.0F, -1.0F, 2.0F, 35.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.1499F, 33.8041F, 7.0898F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-1.843F, -12.8668F, -1.5846F));

		PartDefinition cube_r13 = rightarm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 30).addBox(1.0F, -17.5F, -1.0F, 2.0F, 35.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.723F, 12.186F, -1.3928F, -0.0288F, 0.3085F, 0.4414F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}