package net.rose.main.util;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PluginSound implements Listener {

    @EventHandler
    public void onJump(PlayerJumpEvent e) {

        e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_AMETHYST_BLOCK_CHIME, 1.0F, 1.0F);
        //Bukkit.getWorld("world").playSound();

    }


}
