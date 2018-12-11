/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.managers.QuickJoinManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 *
 * @author haral
 */
public class QuickJoinClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        if(e.getInventory().getName().equalsIgnoreCase("§e§lQuickJoin")) {
            if(e.getCurrentItem().getType() == Material.GRASS) {
                
            } else if(e.getCurrentItem().getType().equals(Material.GOLD_SWORD)) {
                QuickJoinManager.quickJoin(p, "BuildFFA");
                
            } else if(e.getCurrentItem().getType().equals(Material.STICK)) {
                QuickJoinManager.quickJoin(p, "Oneline");
                
            }
                
        } 
    }
    
}
