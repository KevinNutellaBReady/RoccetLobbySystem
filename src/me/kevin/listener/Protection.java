/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.commands.Build;
import org.bukkit.EntityEffect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.Inventory;

/**
 *
 * @author haral
 */
public class Protection implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        if(Build.build.contains(p)) {
            e.setCancelled(false);
        } else if(!Build.build.contains(p)) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if(Build.build.contains(p)) {
            e.setCancelled(false);
        } else if(!Build.build.contains(p)) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onPickUP(PlayerPickupItemEvent e) {
        Player p = e.getPlayer();
        if(Build.build.contains(p)) {
            e.setCancelled(false);
        } else if(!Build.build.contains(p)) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        if(Build.build.contains(p)) {
            e.setCancelled(false);
        } else if(!Build.build.contains(p)) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        e.setCancelled(true);
    }
    @EventHandler
    public void onExplosion(EntityExplodeEvent e) {
        e.setCancelled(true);
    }
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        ClickType p = e.getClick();
        if(Build.build.contains(p)) {
             e.setCancelled(false);
        } else if(!Build.build.contains(p)) {
            e.setCancelled(true);
        } 
           
        
    }
    @EventHandler
    public void onHotbar(PlayerItemHeldEvent e) {
        Player p = e.getPlayer();
        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
    }
    
}
