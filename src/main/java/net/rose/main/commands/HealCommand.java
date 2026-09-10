package net.rose.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player =  (Player) sender; // forcing sender to be a player
            player.sendMessage("Your health has been restored!");
            player.setHealth(20);
            
        }

        return false;
    }
}
