package net.rose.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            // if first argument is equal to 'hello', then send hello back
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("hello")) {
                    ((Player) sender).sendMessage("Hello!");
                }
             }
        }


        return false;
    }
}
