package net.rose.main;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Events implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {

        e.setCancelled(false);
        //e.getPlayer().sendMessage(ChatColor.RED + "You can't move.");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {

        e.getPlayer().sendMessage("You threw an egg!");


    }

}