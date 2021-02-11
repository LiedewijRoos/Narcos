package design.xeet.narcos;

import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Potion;

public class NarcosOverdose {
	
	public static class NarcosOverdoseEffect extends Effect{
	    private static final Logger LOGGER = LogManager.getLogger();

		public NarcosOverdoseEffect(EffectType typeIn, int liquidColorIn) {
			super(typeIn, liquidColorIn);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void affectEntity(@Nullable Entity source, @Nullable Entity indirectSource, LivingEntity entityLivingBaseIn, int amplifier, double health) {
			if (entityLivingBaseIn.getHealth()>=0) {
				entityLivingBaseIn.setHealth(1);
			}
			
		}
		public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
			if (entityLivingBaseIn.getHealth()>=0) {
				entityLivingBaseIn.setHealth(2);
			}
		}
	}
	
}
