/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.roccetlobby;

import me.kevin.hotbar.Playerhider;
import me.kevin.listener.Joinlistener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author haral
 */
public class RoccetLobbySystem extends JavaPlugin implements Listener {
    
    public static Inventory nav = null;
    
    public String prefix = "§6§lLobby §7: ";
    public String noperms = getPrefix() + "§cDazu hast du keine Rechte";
    private static RoccetLobbySystem instance;
    
    @Override
   public void onEnable() {
       Bukkit.getConsoleSender().sendMessage("§aRoccetLobby aktiviert");
       loadConfig();
       registerCommands();
       registerEvents();
       
       instance = this;
  
    
       
   }
    @Override
   public void onDisable() {
       
   }
   
    public void registerCommands() {
        
    }
    public void registerEvents() {
    this.getServer().getPluginManager().registerEvents( this, this);
    Bukkit.getPluginManager().registerEvents(this, this);
    
    Bukkit.getPluginManager().registerEvents(new Joinlistener(this), this);
    Bukkit.getPluginManager().registerEvents(new Playerhider(this), this);
    
    }
     public void loadConfig() {
     getConfig().options().header("Das ist die Config vom RoccetLobbySystem");
      getConfig().options().copyDefaults(true);
       saveConfig();
   
     }
    public  String getPrefix() {
        return prefix;
    }

    public String getNoperms() {
        return noperms;
    }

    

    public static RoccetLobbySystem getInstance() {
        return instance;
    }
   
    
}
