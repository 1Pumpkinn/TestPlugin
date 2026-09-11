package net.rose.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CnslCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {

    if(sender instanceof Player) {
        ((Player) sender).sendMessage(ChatColor.RED + "You are not allowed to use this command Console Only.");
    } else {
        System.out.println("Hello Console!");
    }


       return false;
    }
}
