package net.rose.main.world;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.world.WorldLoadEvent;

public class WorldStuff implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = null;

        player.getWorld().setStorm(true);
        player.getWorld().setThundering(true);
        player.getWorld().setTime();
        //0-24000, 0/24000 = 6AM, 6000 = MidDay, 12000 = 6PM, 18000 Midnight.
        Bukkit.getWorld("world");
        Bukkit.createWorld(new WorldCreator("CustomWorld"));



    }
        @EventHandler
        public void onWorldLoad(WorldLoadEvent e) {
            System.out.println("The World has Loaded");


    }
}
