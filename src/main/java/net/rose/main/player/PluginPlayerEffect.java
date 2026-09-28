package net.rose.main.player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PluginPlayerEffect implements Listener {

    @EventHandler
    public void playerJoinEvent(PlayerJoinEvent e) {

        e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 0, true, true, true));

        for (PotionEffect effect : e.getPlayer().getActivePotionEffects()) {
            e.getPlayer().hasPotionEffect(PotionEffectType.SLOW_FALLING);

            System.out.println("DOES THIS PLAYER HAVE SLOW FALLING " + e.getPlayer().hasPotionEffect(PotionEffectType.SLOW_FALLING));
        }
    }
}
