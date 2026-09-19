package net.rose.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PluginBossBar implements Listener {

    private BossBar bossBar;

    @EventHandler

    public void onPlayerJoin(PlayerJoinEvent e) {
        bossBar = Bukkit.createBossBar(
                ChatColor.DARK_PURPLE + "Grace Period",
                BarColor.PINK,
                BarStyle.SEGMENTED_6,
                BarFlag.CREATE_FOG,
                BarFlag.PLAY_BOSS_MUSIC);

        bossBar.setProgress(0.5);



        bossBar.addPlayer(e.getPlayer());
    }
}
