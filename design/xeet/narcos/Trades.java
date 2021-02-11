package design.xeet.narcos;

import java.util.List;

import design.xeet.narcos.init.ItemInit;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.BasicTrade;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Trades {
	@SubscribeEvent
    public void addNewTrade(WandererTradesEvent event) {
		List<VillagerTrades.ITrade> trades = event.getGenericTrades();
        trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,2), new ItemStack(ItemInit.EDIBLE.get(),12), 5, 10, 1));
        trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,4), new ItemStack(ItemInit.COCAINE.get(),12), 5, 10, 1));
        trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,6), new ItemStack(ItemInit.METH.get(),12), 5, 10, 1));
        trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,4), new ItemStack(ItemInit.SHROOMS.get(),12), 5, 10, 1));
        trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,10), new ItemStack(ItemInit.MORPHINE.get(),12), 5, 10, 1));

	}
	@SubscribeEvent
    public void addNewTrade(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.NITWIT) {
            List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
            trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,2), new ItemStack(ItemInit.WEEDSEED.get(),12), 5, 10, 1));
            trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,4), new ItemStack(ItemInit.COCAINE.get(),12), 5, 10, 1));
            trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,6), new ItemStack(ItemInit.METH.get(),12), 5, 10, 1));
            trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,4), new ItemStack(ItemInit.SHROOMS.get(),12), 5, 10, 1));
            trades.add(new BasicTrade(new ItemStack(Items.DIAMOND,10), new ItemStack(ItemInit.OPIUM.get(),12), 5, 10, 1));
        }
	}
}
