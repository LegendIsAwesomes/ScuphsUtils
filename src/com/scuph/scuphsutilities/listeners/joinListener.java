package com.scuph.scuphsutilities.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinListener implements Listener {
    
    public Main plugin;
    
    @EventHandler
    public void OnJoin(PlayerJoinEvent event) {
       Player p = (Player) event.getPlayer();
       String name = p.getName();
       //If player has not joined before
       if(!p.hasPlayedBefore()){
           Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Please welcome" + name + " to the server with /welcome!");
       }else{
           p.sendMessage(ChatColor.DARK_GREEN + "Welcome back, :D");
       }
        
    }
}
