// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsmiler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "smiler"), "main");
	private final ModelPart lowerjaw;
	private final ModelPart highjaw;

	public Modelsmiler(ModelPart root) {
		this.lowerjaw = root.getChild("lowerjaw");
		this.highjaw = root.getChild("highjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition lowerjaw = partdefinition
				.addOrReplaceChild("lowerjaw",
						CubeListBuilder.create().texOffs(0, 29).addBox(-9.0F, -0.5F, -18.0F, 19.0F, 7.0F, 18.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 9.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition highjaw = partdefinition.addOrReplaceChild("highjaw", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-9.0F, -11.5F, -18.0F, 19.0F, 11.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.5F, 9.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		lowerjaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		highjaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.lowerjaw.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.lowerjaw.xRot = headPitch / (180F / (float) Math.PI);
		this.highjaw.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.highjaw.xRot = headPitch / (180F / (float) Math.PI);
	}
}