package com.kerbybit.shrug;

import com.kerbybit.shrug.Commands.*;
import com.kerbybit.shrug.Commands.Hypixel.*;
import net.minecraft.command.CommandBase;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "shrug", name="\u203E\\_(\u30C4)_/\u203E", version="1.3")
public class Main {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
        registerCommands(new shrug(), new flip(), new excuse(), new excuses(),
                new pc(), new gc(), new s(),
                new cp(), new cg(), new ca());

        FileHandler.loadFiles();
    }

    private void registerCommands(CommandBase... commandBases) {
        for (CommandBase commandBase : commandBases) {
            ClientCommandHandler.instance.registerCommand(commandBase);
        }
    }
}
