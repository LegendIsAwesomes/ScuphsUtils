package com.scuph.scuphsutilities.commands;

import com.scuph.scuphsutilities.ScuphsUtilities;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY, permission = "utils.staff")
public class Command_staff extends BukkitCommand<ScuphsUtilities> {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.DARK_RED + "Scuph - Owner of ScuphGaming " + ChatColor.AQUA + "and " + ChatColor.DARK_PURPLE + "Lead Developer of ScuphsUtilities");
        return true;
    }
    
}
