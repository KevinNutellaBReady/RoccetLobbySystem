/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 *
 * @author haral
 */
public class PlayerhiderClicklistener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        
        if(e.getInventory().getName().equalsIgnoreCase("§5Wähle eine Option")) {
            if(e.getCurrentItem().getType() == Material.INK_SACK) {
                if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lAlle Spieler anzeigen")) {
                    for(Player all : Bukkit.getOnlinePlayers()) {
                        p.showPlayer(all);
                    }
                    p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lVIP Spieler anzeigen")) {
                    for(Player vip : Bukkit.getOnlinePlayers()) {
                        if(vip.hasPermission("lobby.vip")) {
                            p.showPlayer(vip);
                        }
                    }
                    p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lAlle Spieler verstecken")) {
                    for(Player all : Bukkit.getOnlinePlayers()) {
                        p.hidePlayer(all);
                        all.hidePlayer(p);
                    }
                    p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                }
            }
        }
        
        
    }
    
}
