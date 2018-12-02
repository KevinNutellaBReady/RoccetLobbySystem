/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.BukkitPVP.PointsAPI.PointsAPI;
import me.kevin.hotbar.Items;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.GameMode;
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
        p.setGameMode(GameMode.ADVENTURE);
        Integer herzen = plugin.getConfig().getInt("Settings.herzen");
        Integer maxherzen = plugin.getConfig().getInt("Settings.maxherzen");
        p.setHealth(herzen);
        p.setMaxHealth(maxherzen);
        p.setFoodLevel(7);
        p.setExp(2018);
        Items.setItems(p);
        p.sendTitle(null, null);
        
        
    }
    
}
