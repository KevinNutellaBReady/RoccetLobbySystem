/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.BukkitPVP.PointsAPI.PointsAPI;
import me.kevin.hotbar.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author haral
 */
public class Joinlistener implements Listener {
    
    
    
    
    
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(null);
        Player p = e.getPlayer();
        
        if(!p.hasPlayedBefore()) {
            Items.setItems(p);
            PointsAPI.addPoints(p, 10);
            p.sendTitle("§7Willkommen", "§b" + p.getName());
            
        } else if(p.hasPlayedBefore()) {
            Items.setItems(p);
            p.sendTitle("§7Willkommen", "§b" + p.getName());
            
        }
        
        
    }
    
}
