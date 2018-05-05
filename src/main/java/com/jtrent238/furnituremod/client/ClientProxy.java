package com.jtrent238.furnituremod.client;

import com.jtrent238.furnituremod.common.CommonProxy;
import com.jtrent238.furnituremod.entity.tileentity.TileEntityBlockChairChesterfield;
import com.jtrent238.furnituremod.entity.tileentity.TileEntityBlockToilet;
import com.jtrent238.furnituremod.render.tileentity.RenderTileEntityBlockChairChesterfield;
import com.jtrent238.furnituremod.render.tileentity.RenderTileEntityBlockToilet;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends CommonProxy {
  
    private static Minecraft theMinecraft;
 
    // Version checking instance
 	//public static VersionChecker versionChecker;
 	//public static boolean haveWarnedVersionOutOfDate = false;
 
	
 	
	public void init(FMLInitializationEvent e) {
    super.init (e);
    //System.out.print("client init fired!");
    
    // Register client-specific stuff (e.g. renderer & packet-handler callback etc)
  }
  

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
  
  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
  public void onEvent(PlayerTickEvent event)
  {
    
    
  }
  
  @Override
  public void registerRenderThings()
  {
	  GameRegistry.registerTileEntity(TileEntityBlockChairChesterfield.class, "tileBlockChesterfield");
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockChairChesterfield.class, new RenderTileEntityBlockChairChesterfield());
      GameRegistry.registerTileEntity(TileEntityBlockToilet.class, "tileBlockToliet");
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockToilet.class, new RenderTileEntityBlockToilet());
  }

  }
