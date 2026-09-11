package net.rose.main;

import net.rose.main.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World! This is my plugin!");
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("glowing").setExecutor(new GlowingCommand());
        getCommand("test").setExecutor(new TestCommand());
        getCommand("cmdarg").setExecutor(new CommandArgument());
        getCommand("cnslcmd").setExecutor(new CnslCommand());
        Bukkit.getPluginManager().registerEvents(new Events(), this); // Register the event listener
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
