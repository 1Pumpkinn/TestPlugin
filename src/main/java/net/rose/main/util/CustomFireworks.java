package net.rose.main.util;

import org.bukkit.FireworkEffect;
import org.bukkit.Color;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomFireworks implements Listener {


    @EventHandler
    public void onPlayerSneakEvent(PlayerToggleSneakEvent e) {

        Firework firework = e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), Firework.class);
        FireworkMeta meta = (FireworkMeta) firework.getFireworkMeta();
        meta.addEffect(FireworkEffect.builder().withColor(Color.FUCHSIA).withColor(Color.MAROON).with(Type.BURST).withTrail().build());
        meta.setPower(1);
        firework.setFireworkMeta(meta);
    }

}
