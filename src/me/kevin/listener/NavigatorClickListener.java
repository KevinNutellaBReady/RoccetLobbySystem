/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.managers.ItemManager;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 *
 * @author haral
 */
public class NavigatorClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
       final Player p = (Player) e.getWhoClicked();
        if(e.getInventory().getName().equalsIgnoreCase("§6§lNavigator")) {
            if(e.getCurrentItem().getType() == Material.SLIME_BALL) {
                Bukkit.dispatchCommand(p, "warp spawn");
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.IRONGOLEM_HIT, 1, 1);
            } else if(e.getCurrentItem().getType() == Material.STICK) {
                Bukkit.dispatchCommand(p, "warp mlgrush");
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.IRONGOLEM_HIT, 1, 1);
            } else if(e.getCurrentItem().getType() == Material.GOLD_SWORD) {
                Bukkit.dispatchCommand(p, "warp buildffa");
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.IRONGOLEM_HIT, 1, 1);
            } else if(e.getCurrentItem().getType() == Material.GRASS) {
                Bukkit.dispatchCommand(p, "warp skywars");
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.IRONGOLEM_HIT, 1, 1);
            } else if(e.getCurrentItem().getType() == Material.BED) {
                Bukkit.dispatchCommand(p, "warp bedwars");
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.IRONGOLEM_HIT, 1, 1);
            } else if(e.getCurrentItem().getType() == Material.BARRIER) {
                p.closeInventory();
                p.playSound(p.getLocation(), Sound.EXPLODE, 1, 1);
            } else if(e.getCurrentItem().getType() == Material.GLOWSTONE_DUST) {
                RoccetLobbySystem.quicknav = Bukkit.getServer().createInventory(null, 45, "§e§lQuickJoin");
                
                Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(4, new ItemManager("§3Skywars", Material.GRASS, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 5);
                 
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(22, new ItemManager("§a§lSpawn", Material.SLIME_BALL, (byte)0, 1, Enchantment.DURABILITY).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 7);
                 
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(20, new ItemManager("§e§lBuildFFA", Material.GOLD_SWORD, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 9);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(24, new ItemManager("§d§lMLGRush", Material.STICK, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 11);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(40, new ItemManager("§d§lBedwars", Material.BED, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 13);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(0, new ItemManager("§e§lQuickJoin", Material.GLOWSTONE_DUST, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 15);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(8, new ItemManager("§4§lKommt bald", Material.BARRIER, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 17);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(44, new ItemManager("§4§lKommt bald", Material.BARRIER, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 19);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {
                     @Override
                     public void run() {
                        RoccetLobbySystem.quicknav.setItem(36, new ItemManager("§4§lKommt bald", Material.BARRIER, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.BLAZE_BREATH, 1, 1);
                     }
                 }, 21);
                
                p.openInventory(RoccetLobbySystem.quicknav);
            }
        } else  if(e.getInventory().getName().equalsIgnoreCase("§6§lNavigator")) {
            
        }
    }
}
