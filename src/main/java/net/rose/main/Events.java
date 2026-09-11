package net.rose.main;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import net.kyori.adventure.sound.Sound;
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

    @EventHandler
    public void onPlayerJumpEvent(PlayerJumpEvent e) {
        e.getPlayer().sendMessage("Wow You have just Jumped!");

    }



}