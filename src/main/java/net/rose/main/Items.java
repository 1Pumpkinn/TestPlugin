package net.rose.main;


import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.CompassMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Items implements Listener {

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

//        ItemStack is = new ItemStack(Material.BOOK);
//        BookMeta isMeta = (BookMeta) is.getItemMeta();
//        isMeta.setTitle("Meow");
//        isMeta.setAuthor("Admin");
//        is.setItemMeta(isMeta); does not work

        ItemStack comp = new ItemStack(Material.COMPASS);
        CompassMeta compMeta = (CompassMeta) comp.getItemMeta();


    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmetMeta.setColor(Color.PURPLE);
        helmet.setItemMeta(helmetMeta);

        e.getPlayer().getInventory().addItem(helmet);

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        chestplateMeta.setColor(org.bukkit.Color.fromRGB(153, 0, 61));
        chestplate.setItemMeta(chestplateMeta);
        e.getPlayer().getInventory().addItem(chestplate);

    }


}