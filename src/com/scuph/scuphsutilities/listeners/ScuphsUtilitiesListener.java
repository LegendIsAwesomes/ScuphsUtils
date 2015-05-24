package com.scuph.scuphsutilities.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class ScuphsUtilitiesListener implements Listener {
    
@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)    
public void onBlockPlace(BlockPlaceEvent event) {
    Player player = event.getPlayer();
    
    switch (event.getBlockPlaced().getType()) {
        case TNT: {
            if(!player.hasPermission("utils.tnt")) {
                player.sendMessage(ChatColor.RED + "I'm sorry, only staff may use " + ChatColor.DARK_RED + "TNT");
                event.setCancelled(true);
            }
        }
        case STATIONARY_LAVA:
        case LAVA_BUCKET:    
        case LAVA: {
            if(!player.hasPermission("utils.lava")) {
                player.sendMessage(ChatColor.RED + "I'm sorry, only staff may use " + ChatColor.GOLD + "lava");
                event.setCancelled(true);
            }
      }    
    }
  }
}