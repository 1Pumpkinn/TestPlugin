package net.rose.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GlowingCommand implements CommandExecutor {

    
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            player.setGlowing(true);

        }


        return false;
    }
}
