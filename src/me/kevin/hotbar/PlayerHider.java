/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.hotbar;

import java.util.concurrent.CopyOnWriteArrayList;
import me.kevin.managers.ItemManager;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 *
 * @author haral
 */
public class PlayerHider implements Listener {
    private RoccetLobbySystem plugin;

    public void PlayerHider(RoccetLobbySystem plugin) {
        this.plugin = plugin;
    }
    
    
    
    private static CopyOnWriteArrayList<Player> hidden = new CopyOnWriteArrayList<>();
    
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(e.getMaterial().equals(Material.GOLDEN_APPLE)) {
                Player p = e.getPlayer();
                hidden.add(p);
                p.sendMessage(plugin.getPrefix() + "§7Alle Spieler wurden §4§lversteckt");
                 p.getInventory().setItem(1, new ItemManager("§e§lSpieler-Verstecken §7x §4Aus", Material.APPLE, (byte)0, 1, "").build());
                 for(Player all : Bukkit.getOnlinePlayers()) {
                     all.hidePlayer(p);
                     p.hidePlayer(all);
                 }
                
            } else if(e.getMaterial().equals(Material.APPLE)) {
                Player p = e.getPlayer();
                hidden.remove(p);
                p.sendMessage(plugin.getPrefix() + "§7Alle Spieler wurden §a§lAngezeigt");
                 p.getInventory().setItem(1, new ItemManager("§e§lSpieler-Verstecken §7x §4Aus", Material.APPLE, (byte)0, 1, "").build());
                 for(Player all : Bukkit.getOnlinePlayers()) {
                     all.showPlayer(p);
                     p.showPlayer(all);
                 }
            }
        }
    }
    
}
