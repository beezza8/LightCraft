package io.github.beezza.lightcraft;

import io.github.beezza.lightcraft.Commands.hellobees;
import io.github.beezza.lightcraft.Commands.rank;
import org.bukkit.plugin.java.JavaPlugin;

public final class LightCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabling LightCraft...");
        getLogger().info("Registering Commands...");
        /*Registering Commands*/
        getCommand("hellobees").setExecutor(new hellobees());
        getCommand("rank").setExecutor(new rank());
        getLogger().info("Registered Success");


        super.onEnable();
    }

    @Override
    public void onDisable() {
        getLogger().info("LightCraft Disabled!");


        super.onDisable();
    }
}
