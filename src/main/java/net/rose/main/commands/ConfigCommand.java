package net.rose.main.commands;

import net.rose.main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ConfigCommand implements CommandExecutor {

    // Passing through live instance in short gives access to Main
    private Main main;

    public ConfigCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(main.getConfig().getString("Word"));
            player.sendMessage(main.getConfig().getInt("Number") + "");
            if(main.getConfig().getBoolean("Boolean")) {
                player.sendMessage("This feature is enabled!");
            }
            for(String string : main.getConfig().getStringList("String-list")) {
                player.sendMessage(string);
            }

        }



        return false;
    }
}
