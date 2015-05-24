package com.scuph.scuphsutilities.commands;

import com.scuph.scuphsutilities.ScuphsUtilities;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.PLAYER, permission = "utils.iwantadmin")
public class Command_iwantadmin extends BukkitCommand<ScuphsUtilities> {

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.RED + "So, you wan't admin ayy?");
        sender.sendMessage(ChatColor.RED + "Unfortunately, we don't give that out, You may apply when applications open!");
        return true;
    }
    
}
