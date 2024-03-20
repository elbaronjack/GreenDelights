package com.elbaronjack.greendelights.common.item;

//Food libraries
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
//Farmers Delight
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodValues
{
	//Helper Variables
	public static final int BRIEF_DURATION = 600;    // 30 seconds
	public static final int SHORT_DURATION = 1200;    // 1 minute
	public static final int MEDIUM_DURATION = 3600;    // 3 minutes
	public static final int LONG_DURATION = 6000;    // 5 minutes

	//Cactus
	public static final FoodProperties CACTUS_PEELED = (new FoodProperties.Builder())
			.nutrition(1).saturationMod(0.4f).fast()
			.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 0), 0.8F).build();

	public static final FoodProperties CACTUS_DRIED = (new FoodProperties.Builder())
			.nutrition(2).saturationMod(0.8f).fast().build();

	public static final FoodProperties CACTUS_SANDWICH = (new FoodProperties.Builder())
			.nutrition(8).saturationMod(0.8f).build();

	public static final FoodProperties CACTUS_STICK = (new FoodProperties.Builder())
			.nutrition(5).saturationMod(0.9f).build();

	public static final FoodProperties CACTUS_JUICE = (new FoodProperties.Builder())
			.nutrition(5).saturationMod(0.8f).alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.8F)
			.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 0), 1.0F).build();

	public static final FoodProperties CACTUS_COLA = (new FoodProperties.Builder())
			.nutrition(7).saturationMod(0.9f).alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, BRIEF_DURATION, 0), 1.0F).build();

	public static final FoodProperties CACTUS_RUM = (new FoodProperties.Builder())
			.nutrition(2).saturationMod(0.8f).alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, LONG_DURATION, 0), 1.0F).build();


	//Bamboo
	public static final FoodProperties BAMBOO_RICE = (new FoodProperties.Builder())
			.nutrition(14).saturationMod(0.75f)
			.effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F).build();
	public static final FoodProperties BAMBOO_PASTA = (new FoodProperties.Builder())
			.nutrition(14).saturationMod(0.75f)
			.effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();

	public static final FoodProperties BAMBOO_BEEF = (new FoodProperties.Builder())
			.nutrition(12).saturationMod(0.8f)
			.effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();


	//Slime
	public static final FoodProperties SLIME_BREAD = (new FoodProperties.Builder())
			.nutrition(5).saturationMod(0.8f).fast().alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.LUCK, BRIEF_DURATION, 0), 1.0F).build();

	public static final FoodProperties SLIME_POPSICLE = (new FoodProperties.Builder())
			.nutrition(3).saturationMod(0.2f).fast().alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.LUCK, BRIEF_DURATION, 0), 1.0F).build();


	public static final FoodProperties SLIME_MOUSSE = (new FoodProperties.Builder())
			.nutrition(7).saturationMod(0.6f).alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.LUCK, BRIEF_DURATION, 0), 1.0F).build();

	public static final FoodProperties SLIME_JELLY = (new FoodProperties.Builder())
			.nutrition(14).saturationMod(0.75f)
			.effect(() -> new MobEffectInstance(MobEffects.LUCK, BRIEF_DURATION, 0), 1.0F)
			.effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();


	//Sweets
	public static final FoodProperties CREEPER_COOKIE = (new FoodProperties.Builder())
			.nutrition(2).saturationMod(0.1f).fast().alwaysEat()
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0F).build();

	//Salads
	public static final FoodProperties SEA_SALAD = (new FoodProperties.Builder())
			.nutrition(6).saturationMod(0.6f)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();
}
