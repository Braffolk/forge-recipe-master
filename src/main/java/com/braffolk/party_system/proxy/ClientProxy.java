package com.braffolk.party_system.proxy;

import com.braffolk.party_system.client.gui.GuiPartyOverlay;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);


    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
        GuiPartyOverlay overlay = new GuiPartyOverlay();
        overlay.init();
        MinecraftForge.EVENT_BUS.register(overlay);
    }
}
