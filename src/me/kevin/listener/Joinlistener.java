/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author haral
 */
public class Joinlistener implements Listener {
    
    private RoccetLobbySystem plugin;

    public Joinlistener(RoccetLobbySystem plugin) {
        this.plugin = plugin;
    }
    
    
    
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(null);
        Player p = e.getPlayer();
        
        if(!p.hasPlayedBefore()) {
            
        }
        
        
    }
    
}
