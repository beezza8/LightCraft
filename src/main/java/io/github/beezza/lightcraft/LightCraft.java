package io.github.beezza.lightcraft;

import io.github.beezza.lightcraft.Commands.hellobees;
import org.bukkit.plugin.java.JavaPlugin;

public final class LightCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabling LightCraft...");
        getLogger().info("Registering Commands...");
        /*Registering Commands*/
        getCommand("hellobees").setExecutor(new hellobees());
        getLogger().info("Registered Success");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
