package net.rose.main;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class Entities implements Listener {

    private Main main;

    public Entities(Main main)  {
        this.main = main;

        Entity entitiy = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 86, 81, 48), EntityType.FOX);
        entitiy.setGlowing(true);

        ArmorStand stand = (ArmorStand) Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 86, 81, 48), EntityType.ARMOR_STAND);
        stand.setGlowing(true);
        stand.setMarker(true);
        stand.setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));


    }

    @EventHandler
    public void onEntitySpawn(CreatureSpawnEvent e) {
      //  System.out.println(e.getSpawnReason());



    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        e.setDroppedExp(500);
    }

    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
       // System.out.println(e.getCause());
    }

}
