/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.hotbar;

import me.kevin.managers.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class Items {
    
    public static void setItems(Player p) {
        
        if(p.hasPermission("lobby.specialitems")) {
        p.getInventory().setItem(0, new ItemManager("§6Navigator", Material.BUCKET, (byte)0, 1, "").build());
        p.getInventory().setItem(1, new ItemManager("§eSpieler-Verstecken", Material.APPLE, (byte)0, 1, "").build());
        p.getInventory().setItem(3, new ItemManager("§eSiltentLobby", Material.BEACON, (byte)0, 1, "").build());
        p.getInventory().setItem(4, new ItemManager("§4Kein Gadget ausgewählt", Material.BARRIER, (byte)0, 1, "").build());
        }
        
        p.getInventory().setItem(0, new ItemManager("§6Navigator", Material.BUCKET, (byte)0, 1, "").build());
        p.getInventory().setItem(1, new ItemManager("§eSpieler-Verstecken", Material.APPLE, (byte)0, 1, "").build());
        p.getInventory().setItem(4, new ItemManager("§4Kein Gadget ausgewählt", Material.BARRIER, (byte)0, 1, "").build());
  
        
    }
    
}
