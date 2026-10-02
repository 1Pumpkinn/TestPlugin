package net.rose.main.events;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class ToggleListener implements Listener {

    private boolean enabled = true;

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {

        Player player = e.getPlayer();

        if (e.getHand().equals(EquipmentSlot.HAND)) {
            if (player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().getType().equals(Material.NETHER_STAR)) {
                if (enabled) {
                    enabled = false;
                    player.sendMessage("You have disabled the Chat!");
                } else {
                    enabled = true;
                    player.sendMessage("You have enabled the Chat!");
                }
            }
        }
    }

    @EventHandler
    public void onChat(AsyncChatEvent e) {

        if(!enabled) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("Chat is disabled right now!");
        }

    }

}
