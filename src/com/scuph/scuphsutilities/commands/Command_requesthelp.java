package com.scuph.scuphsutilities.commands;

import com.scuph.scuphsutilities.ScuphsUtilities;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.PLAYER, permission = "utils.requesthelp")
public class Command_requesthelp extends BukkitCommand<ScuphsUtilities> {

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Bukkit.broadcastMessage(ChatColor.DARK_RED + "NOTICE: " + sender.getName() + " has requested help!");
        sender.sendMessage(ChatColor.GRAY + "You have requested help. Someone will be with you shortly!");
        LoggerUtils.info("INFO: " + sender.getName() + " requested help.");
        return true;
    }
    
}
