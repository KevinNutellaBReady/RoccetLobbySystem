/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.roccetlobby;

import de.dytanic.cloudnet.api.CloudAPI;
import me.kevin.commands.Build;
import me.kevin.hotbar.LobbySwitcherInteract;
import me.kevin.hotbar.NavigatorInteract;
import me.kevin.hotbar.Playerhider;
import me.kevin.listener.Joinlistener;
import me.kevin.listener.Jumppads;
import me.kevin.listener.LobbySwitcherClicklistener;
import me.kevin.listener.NavigatorClickListener;
import me.kevin.listener.PlayerhiderClicklistener;
import me.kevin.listener.Protection;
import me.kevin.listener.Quitlistener;
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
    public static Inventory playerhider = null;
    public static Inventory switcher = null;
    
    public static String prefix = "§6§lLobby §7: ";
    public static String noperms = getPrefix() + "§c§lDazu hast du keine Rechte";
    private static RoccetLobbySystem instance;
    private static CloudAPI cloud;
    
    @Override
   public void onEnable() {
       Bukkit.getConsoleSender().sendMessage("§aRoccetLobby aktiviert");
       loadConfig();
       registerCommands();
       registerEvents();
       instance = this;
       cloud = CloudAPI.getInstance();
    
       
   }
    @Override
   public void onDisable() {
       Bukkit.getConsoleSender().sendMessage("§4RoccetLobby deaktiviert");
   }
   
    public void registerCommands() {
        getCommand("build").setExecutor(new Build());
    }
    public void registerEvents() {
    this.getServer().getPluginManager().registerEvents( this, this);
    Bukkit.getPluginManager().registerEvents(this, this);
    
    Bukkit.getPluginManager().registerEvents(new Joinlistener(this), this);
    Bukkit.getPluginManager().registerEvents(new Playerhider(), this);
    Bukkit.getPluginManager().registerEvents(new Jumppads(), this);
    Bukkit.getPluginManager().registerEvents(new Quitlistener(), this);
    Bukkit.getPluginManager().registerEvents(new Protection(), this);
    Bukkit.getPluginManager().registerEvents(new LobbySwitcherInteract(), this);
    Bukkit.getPluginManager().registerEvents(new Protection(), this);
    Bukkit.getPluginManager().registerEvents(new LobbySwitcherClicklistener(this), this);
    Bukkit.getPluginManager().registerEvents(new NavigatorInteract(), this);
    Bukkit.getPluginManager().registerEvents(new NavigatorClickListener(), this);
    Bukkit.getPluginManager().registerEvents(new PlayerhiderClicklistener(), this);
    }
     public void loadConfig() {
     getConfig().options().header("Das ist die Config vom RoccetLobbySystem");
      getConfig().options().copyDefaults(true);
       saveConfig();
   
     }
    public static String getPrefix() {
        return prefix;
    }

    public static String getNoperms() {
        return noperms;
    }

    public static RoccetLobbySystem getInstance() {
        return instance;
    }

    public static CloudAPI getCloud() {
        return cloud;
    }
    
   
    
}
