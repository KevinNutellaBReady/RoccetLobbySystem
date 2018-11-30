/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.roccetlobby;

import de.dytanic.cloudnet.api.CloudAPI;
import org.bukkit.Bukkit;

/**
 *
 * @author haral
 */
public class RoccetLobbySystem {
    
    public static String prefix = "§6§lLobby §7: ";
    public static String noperms = getPrefix() + "§cDazu hast du keine Rechte";
    public static CloudAPI cloud = CloudAPI.getInstance();

   public void onEnable() {
       Bukkit.getConsoleSender().sendMessage("RoccetLobby aktiviert");
       
   }
   public void onDisable() {
       
   }
    public void registerEvents() {
        
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
