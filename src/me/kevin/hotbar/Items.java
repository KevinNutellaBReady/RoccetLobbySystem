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
            p.getInventory().clear();
        p.getInventory().setItem(0, new ItemManager("§6§lNavigator", Material.SUGAR, (byte)0, 1, "").build());
        p.getInventory().setItem(1, new ItemManager("§e§lSpieler-Verstecken", Material.BLAZE_ROD, (byte)0, 1, "").build());
        p.getInventory().setItem(3, new ItemManager("§e§lSilentlobbyLobby", Material.EXPLOSIVE_MINECART, (byte)0, 1, "").build());
        p.getInventory().setItem(4, new ItemManager("§4§lKein Gadget ausgewählt", Material.BARRIER, (byte)0, 1, "").build());
        p.getInventory().setItem(7, new ItemManager("§c§lDein Inventar", Material.CHEST, (byte)0, 1, "").build());
        p.getInventory().setItem(8, new ItemManager("§e§lLobbySwitcher", Material.GLOWSTONE_DUST, (byte)0, 1, "").build());
        } else {
        p.getInventory().clear();
        p.getInventory().setItem(0, new ItemManager("§6§lNavigator", Material.SUGAR, (byte)0, 1, "").build());
        p.getInventory().setItem(1, new ItemManager("§e§lSpieler-Verstecken", Material.BLAZE_ROD, (byte)0, 1, "").build());
        p.getInventory().setItem(4, new ItemManager("§4§lKein Gadget ausgewählt", Material.BARRIER, (byte)0, 1, "").build());
        p.getInventory().setItem(7, new ItemManager("§c§lDein Inventar", Material.CHEST, (byte)0, 1, "").build());
        p.getInventory().setItem(8, new ItemManager("§e§lLobbySwitcher", Material.GLOWSTONE_DUST, (byte)0, 1, "").build());
       
        }
    }
    
}
