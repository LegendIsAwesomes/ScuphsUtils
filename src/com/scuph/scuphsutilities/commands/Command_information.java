package com.scuph.scuphsutilities.commands;

import com.scuph.scuphsutilities.ScuphsUtilities;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import net.pravian.bukkitlib.config.YamlConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY, permission = "utils.info")
public class Command_information extends BukkitCommand<ScuphsUtilities> {
public YamlConfig config;
    
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "This plugin was made by Scuph, made for the ScuphGaming server!");
        sender.sendMessage(ChatColor.RED + "This plugin's version is " + plugin.getVersion() + ".");
<<<<<<< HEAD
        sender.sendMessage(ChatColor.RED + "We currently don't have a website/forum.");
=======
        sender.sendMessage(ChatColor.RED + "We currently don't have a website/forum.")
>>>>>>> origin/master
        return true;
    }
    
}
