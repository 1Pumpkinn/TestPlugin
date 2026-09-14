package net.rose.main;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items {

    public Items() {

        // Itemstack and Itemmeta
        ItemStack itemstack = new ItemStack(Material.CARROT, 3);
        ItemMeta meta = itemstack.getItemMeta();
        itemstack.setItemMeta(meta);

        // Getting block
        Block block = Bukkit.getWorld("world").getBlockAt(15, 60, 42);
        block.getType().equals(Material.DIRT);

        // Setting block
        Bukkit.getWorld("world").getBlockAt(1, 1, 1).setType(Material.LAVA);

        Bukkit.getWorld("world").getStructures(100, 100);

    }

}