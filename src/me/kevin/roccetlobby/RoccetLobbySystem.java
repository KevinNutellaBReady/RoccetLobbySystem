/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.roccetlobby;

import de.dytanic.cloudnet.api.CloudAPI;
import me.kevin.listener.Joinlistener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author haral
 */
public class RoccetLobbySystem extends JavaPlugin implements Listener{
    
    public static String prefix = "§6§lLobby §7: ";
    public static String noperms = getPrefix() + "§cDazu hast du keine Rechte";
    public static CloudAPI cloud = CloudAPI.getInstance();
    
    @Override
   public void onEnable() {
       Bukkit.getConsoleSender().sendMessage("RoccetLobby aktiviert");
       
    this.getServer().getPluginManager().registerEvents( this, this);
    Bukkit.getPluginManager().registerEvents(this, this);
    
    Bukkit.getPluginManager().registerEvents(new Joinlistener(this), this);
    
       
   }
    @Override
   public void onDisable() {
       
   }
   
    public void registerCommands() {
        
    }
    
    public static CloudAPI getCloud() {
        return cloud;
    }
   
    public static String getPrefix() {
        return prefix;
    }

    public static String getNoperms() {
        return noperms;
    }

    

  
    
   
    
}
