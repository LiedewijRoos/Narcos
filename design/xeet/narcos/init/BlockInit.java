package design.xeet.narcos.init;

import design.xeet.narcos.NarcosMod;
import design.xeet.narcos.crops.WeedCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NarcosMod.MOD_ID);
	public static final RegistryObject<Block> WEEDCROP= BLOCKS.register("weedcrop", ()-> new WeedCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0f).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

}
