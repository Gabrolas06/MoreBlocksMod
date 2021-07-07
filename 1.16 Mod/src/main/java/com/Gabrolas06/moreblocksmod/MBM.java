package com.Gabrolas06.moreblocksmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Gabrolas06.moreblocksmod.core.init.BlockInit;
import com.Gabrolas06.moreblocksmod.core.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MBM.MOD_ID)
public class MBM {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moreblocksmod";

    public MBM() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        
    }
}
