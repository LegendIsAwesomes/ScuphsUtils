package com.scuph.scuphsutilities.commands;

import com.scuph.scuphsutilities.ScuphsUtilities;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



@CommandPermissions(source = SourceType.PLAYER, permission = "utils.welcome")
public class Command_welcome extends BukkitCommand<ScuphsUtilities> {
    
    public boolean run(final CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Bukkit.broadcastMessage(ChatColor.RESET + "<" + ChatColor.RED + sender.getName() + ChatColor.RESET + ">" + " Welcome to ScuphGaming! Enjoy your stay!");
        return true;
        
    }

}
