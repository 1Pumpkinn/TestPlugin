package net.rose.main.commands;

import net.rose.main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ConfigCommand implements CommandExecutor {

    // Passing through live instance in short gives access to Main for this class
    private Main main;

    public ConfigCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            main.getConfig().set("Word", "Cake");

            List<String> list = main.getConfig().getStringList("String-list");
            list.add("New Value!");
            main.getConfig().set("String-list", list);

            player.sendMessage(main.getConfig().getDouble("Double") + "");

            main.saveConfig();
        }

        return false;
    }
}
