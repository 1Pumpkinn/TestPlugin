package net.rose.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandArgument implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 1) {
                if(args[0].equalsIgnoreCase("Heal")) {
                    ((Player) sender).setHealth(20);
                    player.sendMessage("You have been healed!");

                }
            }
        }

        return false;
    }
}
