package net.rose.main.util;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PluginSound implements Listener {

    @EventHandler
    public void onJump(PlayerJumpEvent e) {

        e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_AMETHYST_BLOCK_CHIME, 1.0F, 1.0F);

    }

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e) {

        // NoteBlock
        e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_TRUMPET_OXIDIZED, 1.0F, 5.0F);

        if(e.isSneaking()) {
            e.getPlayer().playEffect(new Location(Bukkit.getWorld("world"), 0, 76, 0), Effect.RECORD_PLAY, Material.MUSIC_DISC_BOUNCE);
        }

    }


}
