package net.rose.main.util;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class BarsAndTitles implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        e.getPlayer().sendTitle(ChatColor.RED + "Hello",
                ChatColor.GREEN + "Welcome to the Server",
                20, // 1 second
                100, // 5 seconds
                20); // 1 second

        e.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.DARK_RED + "BLOOD"));

        e.getPlayer().setPlayerListHeaderFooter(ChatColor.RED + "Hello", "Meow\nSecond Line");




    }
}
