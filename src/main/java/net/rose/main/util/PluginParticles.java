package net.rose.main.util;

import net.rose.main.Main;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRiptideEvent;

public class PluginParticles implements Listener {


    private Main main;

    public PluginParticles(Main main) {

        this.main = main;

//        Player player;
//        World world;
//
//        player.spawnParticle(Particle.ANGRY_VILLAGER, 5, 5);
//        world.spawnParticle(Particle.FIREWORK, player.getLocation(), 5);

    }

    @EventHandler
    public void onRiptide(PlayerRiptideEvent e) {
        e.getPlayer().spawnParticle(Particle.ANGRY_VILLAGER, e.getPlayer().getLocation(), 5);
    }

}
