package com.scuph.scuphsutilities;

import com.scuph.scuphsutilities.listeners.ScuphsUtilitiesListener;
import com.scuph.scuphsutilities.commands.Command_owner;
import com.scuph.scuphsutilities.commands.Command_staff;
import com.scuph.scuphsutilities.commands.Command_iwantadmin;
import com.scuph.scuphsutilities.commands.Command_developer;
import com.scuph.scuphsutilities.commands.Command_information;
import com.scuph.scuphsutilities.commands.Command_requesthelp;
import com.scuph.scuphsutilities.commands.Command_welcome;
import com.scuph.scuphsutilities.listeners.joinListener;
import com.scuph.scuphsutilities.listeners.leaveListener;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class ScuphsUtilities extends BukkitPlugin {
    
    public ScuphsUtilities plugin;
    public YamlConfig config;
    public BukkitCommandHandler handler;
    
    @Override
    public void onLoad() {
        this.plugin = this;
        this.handler = new BukkitCommandHandler(plugin);
    }
    
    @Override
    public void onEnable() {
        BukkitLib.init(plugin);
        config = new YamlConfig(plugin, "config.yml", true);
        config.load();
        
        register(new ScuphsUtilitiesListener());
        register(new leaveListener());
        register(new joinListener());
        
        handler.setCommandLocation(Command_information.class.getPackage());
        handler.setCommandLocation(Command_owner.class.getPackage());
        handler.setCommandLocation(Command_iwantadmin.class.getPackage());
        handler.setCommandLocation(Command_staff.class.getPackage());
        handler.setCommandLocation(Command_welcome.class.getPackage());
        handler.setCommandLocation(Command_requesthelp.class.getPackage());
        handler.setCommandLocation(Command_developer.class.getPackage());
        handler.setCommandLocation(Command_requesthelp.class.getPackage());
        
        LoggerUtils.info(plugin, "for " + config.getString("server-name") + " Version: " + plugin.getVersion() + " by " + plugin.getAuthor() + " is enabled.");
  }
    
  @Override
  public void onDisable() {
     LoggerUtils.info(plugin, "for " + config.getString("server-name") + " Version: " + plugin.getVersion() + " by " + plugin.getAuthor() + " was disabled."); 
      
  }
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
      return handler.handleCommand(sender, cmd, commandLabel, args); 
  }
  
}
