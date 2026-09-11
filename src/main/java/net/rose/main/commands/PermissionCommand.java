package net.rose.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PermissionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(player.hasPermission("testplugin.use")) {
                player.sendMessage(ChatColor.GREEN + "You have Permission to use this Command!");
            } else {
                player.sendMessage(ChatColor.RED + "You do not have Permission to use this Command!");
            }

        }


        return false;
    }
}
