package net.rose.main.player;

import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.EquipmentSlotGroup;

public class PluginProjectiles implements Listener {

    @EventHandler
    public void onLaunch(ProjectileLaunchEvent e) {

        //e.getEntity().getShooter() <-- Gets the person who launched the Projectile.

        //e.setCancelled(true); <-- Cancels the ProjectileLaunch Event.

    }

    @EventHandler
    public void onHit(ProjectileHitEvent e) {

        // e.getEntity().getShooter() <- - Gets the person who launched the Projectile.
        // e.getHitBlock(); <-- Gets the Block that the Projectile Hit.
        // e.getHitEntity(); <-- Gets the Entity that was hit by the Projectile.

    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {

        Player player = e.getPlayer();

        if(e.getHand().equals(EquipmentSlot.HAND)) {
            if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_HOE)) {
                    player.launchProjectile(Egg.class, player.getLocation().getDirection());

                    // adding Egg egg allows u to access the egg's methods and allows u to change their properties.
                }
            }
        }

    }

}
