package com.scuph.scuphsutilities.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class leaveListener implements Listener {
    
    public Main plugin;
    
    @EventHandler
    public void OnLeave(PlayerQuitEvent event) {
       Player p = (Player) event.getPlayer();
       String name = p.getName();
      
           Bukkit.getServer().broadcastMessage(ChatColor.RED + name + " Left the server! D:");
       }
        
    }

