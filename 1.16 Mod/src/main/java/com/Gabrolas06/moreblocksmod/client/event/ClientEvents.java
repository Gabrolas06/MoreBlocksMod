package com.Gabrolas06.moreblocksmod.client.event;

import com.Gabrolas06.moreblocksmod.MBM;
import com.Gabrolas06.moreblocksmod.core.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = MBM.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockInit.STONE_DOOR.get(), RenderType.cutout());
		System.out.println("placed");
	}
}