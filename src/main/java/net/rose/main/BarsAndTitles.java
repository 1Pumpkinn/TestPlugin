package net.rose.main;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class BarsAndTitles implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        e.getPlayer().sendTitle(ChatColor.RED + "Hello",
                ChatColor.GREEN + "Welcome to the Server",
                20, // 1 second
                100, // 5 seconds
                20); // 1 second




    }
}
