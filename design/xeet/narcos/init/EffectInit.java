package design.xeet.narcos.init;

import design.xeet.narcos.NarcosMod;
import design.xeet.narcos.NarcosOverdose;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectInit {
	
	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, NarcosMod.MOD_ID);
	public static final RegistryObject<Effect> ODEFFECT = EFFECTS.register("odeffect", ()->new NarcosOverdose.NarcosOverdoseEffect(EffectType.HARMFUL, 0x000000));

}
