package net.rose.main;

import net.rose.main.commands.*;
import net.rose.main.events.Events;
import net.rose.main.player.PluginPlayerEffect;
import net.rose.main.player.PluginProjectiles;
import net.rose.main.util.*;
import net.rose.main.world.WorldStuff;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        // Plugin startup logic
        System.out.println("Hello World! This is my plugin!");
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("glowing").setExecutor(new GlowingCommand());
        getCommand("test").setExecutor(new TestCommand());
        getCommand("cmdarg").setExecutor(new CommandArgument());
        getCommand("cnslcmd").setExecutor(new CnslCommand());
        getCommand("config").setExecutor(new ConfigCommand(this));
        getCommand("permissioncmd").setExecutor(new PermissionCommand());

        Bukkit.getPluginManager().registerEvents(new BarsAndTitles(), this);
        Bukkit.getPluginManager().registerEvents(new Entities(this), this);
        Bukkit.getPluginManager().registerEvents(new Items(), this);
        Bukkit.getPluginManager().registerEvents(new PluginSound(), this);
        Debugging debugging = new Debugging(this);

        Bukkit.getPluginManager().registerEvents(new PluginBossBar(), this);
        Bukkit.getPluginManager().registerEvents(new Events(), this); // Register the event listener
        Bukkit.getPluginManager().registerEvents(new CustomFireworks(), this);
        Bukkit.getPluginManager().registerEvents(new PluginPlayerEffect(), this);
        Bukkit.getPluginManager().registerEvents(new PluginProjectiles(), this);
        Bukkit.getPluginManager().registerEvents(new PluginParticles(this), this);
        // Bukkit.getPluginManager().registerEvents(new WorldStuff(), this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
