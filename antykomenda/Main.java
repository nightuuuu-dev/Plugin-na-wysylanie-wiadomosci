// 
// Decompiled by Procyon v0.5.36
// 

package antykomenda;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("ANTYKOMENDA 1.0 - WLACZONA");
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
    }
    
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("ANTYKOMENDA 1.0 - WYLACZONA");
    }
    
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (label.equalsIgnoreCase("siemka")) {
            sender.sendMessage(ChatColor.GOLD + " KOCHAM ZELKOW ");
        }
        return false;
    }
}
