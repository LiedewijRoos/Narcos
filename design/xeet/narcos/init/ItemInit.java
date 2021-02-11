package design.xeet.narcos.init;

import design.xeet.narcos.NarcosMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NarcosMod.MOD_ID);
	
	public static final RegistryObject<Item> MORPHINE = ITEMS.register("morphine", ()-> new Item(new Item.Properties()
			.food(new Food.Builder()
					.effect(()-> new EffectInstance(Effects.INSTANT_DAMAGE, 1, 2), 0.05f)
					.effect(()-> new EffectInstance(Effects.NAUSEA, 20*5, 0), 0.15f)
					.effect(()-> new EffectInstance(Effects.SPEED, 20*60, 1), 0.9f)
					.effect(()-> new EffectInstance(Effects.HASTE, 20*60, 1), 1f)
					.effect(()-> new EffectInstance(Effects.STRENGTH, 20*60, 1), 1f)
					.setAlwaysEdible().fastToEat().build())));
	public static final RegistryObject<Item> NUGGET = ITEMS.register("weednugget", ()->new Item(new Item.Properties()));
	public static final RegistryObject<Item> OPIUM = ITEMS.register("opium", ()->new Item(new Item.Properties()));
	public static final RegistryObject<Item> COCAINELEAVES = ITEMS.register("cocaineleaves", ()->new Item(new Item.Properties()));
	public static final RegistryObject<Item> EDIBLE= ITEMS.register("edible", ()-> new Item(new Item.Properties()
			.food(new Food.Builder()
					.effect(()-> new EffectInstance(Effects.HUNGER, 20*15, 0), 0.95f)
					.effect(()-> new EffectInstance(Effects.NAUSEA, 20*10, 1), 0.15f)
					.effect(()-> new EffectInstance(Effects.SLOWNESS, 20*30, 0), 0.7f)
					.effect(()-> new EffectInstance(Effects.SLOW_FALLING, 20*30, 0), 0.8f)
					.effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 20*90, 2), 1f)
					.setAlwaysEdible().fastToEat().build())));
	public static final RegistryObject<Item> SHROOMS= ITEMS.register("shrooms", ()-> new Item(new Item.Properties()
			.food(new Food.Builder()
					.effect(()-> new EffectInstance(Effects.REGENERATION, 20*90, 1), 0.95f)
					.effect(()-> new EffectInstance(Effects.NAUSEA, 20*20, 0), 0.95f)
					.setAlwaysEdible().fastToEat().build())));
	public static final RegistryObject<Item> COCAINE= ITEMS.register("cocaine", ()-> new Item(new Item.Properties()
			.food(new Food.Builder()
					.effect(()-> new EffectInstance(Effects.SPEED, 20*90, 1), 0.95f)
					.effect(()-> new EffectInstance(Effects.HASTE, 20*20, 1), 0.95f)
					.effect(()-> new EffectInstance(Effects.BLINDNESS, 20*20, 0), 0.25f)
					.setAlwaysEdible().fastToEat().build())));
	public static final RegistryObject<Item> METH = ITEMS.register("meth", ()-> new Item(new Item.Properties()
			.food(new Food.Builder()
					.effect(()-> new EffectInstance(Effects.ABSORPTION, 20*90, 2), 0.95f)
					.effect(()-> new EffectInstance(Effects.FIRE_RESISTANCE, 20*60, 0), 0.95f)
					.effect(()-> new EffectInstance(Effects.GLOWING, 20*65, 0), 0.85f)
					.effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 20*90, 2), 0.75f)
					.effect(()-> new EffectInstance(Effects.INSTANT_HEALTH, 20*90, 1), 0.75f)
					.effect(()-> new EffectInstance(Effects.JUMP_BOOST, 20*90, 1), 0.75f)
					.effect(()-> new EffectInstance(Effects.WITHER, 20*40, 0), 0.10f)
					.setAlwaysEdible().fastToEat().build())));
	public static final RegistryObject<Item> WEEDSEED = ITEMS.register("weedseed", ()-> new BlockItem(BlockInit.WEEDCROP
			.get(), new Item.Properties()));
	
}
