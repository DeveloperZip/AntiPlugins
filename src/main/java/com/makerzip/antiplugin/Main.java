package com.makerzip.antiplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent e) {
        String plugin = getConfig().getString("PluginsMessage.Message");
        String Help = getConfig().getString("HelpMessage.Message");
        plugin = plugin.replaceAll("&", "§");
        Help = Help.replaceAll("&", "§");
        //Help = Help.replaceAll("\n", "\n");
        if (e.getMessage().startsWith("/pl")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(plugin);
        }
        if (e.getMessage().startsWith("/plugin")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(plugin);
        }
        if (e.getMessage().startsWith("/bukkit:pl")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(plugin);
        }
        if (e.getMessage().startsWith("/bukkit:plugin")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(plugin);
        }
        if (e.getMessage().startsWith("/?")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Help);
        }
        if (e.getMessage().startsWith("/help")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Help);
        }
        if (e.getMessage().startsWith("/bukkit:?")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Help);
        }
        if (e.getMessage().startsWith("/bukkit:help")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Help);
        }
        if (e.getMessage().startsWith("/minecraft:?")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Help);
        }
        if (e.getMessage().startsWith("/minecraft:help")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Help);
        }
    }
}
