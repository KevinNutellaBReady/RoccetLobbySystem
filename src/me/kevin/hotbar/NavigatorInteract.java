/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.hotbar;

import de.dytanic.cloudnet.api.player.PermissionProvider;
import me.kevin.managers.ItemManager;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 *
 * @author haral
 */
public class NavigatorInteract implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
       final Player p = e.getPlayer();
         if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
             if(e.getMaterial().equals(Material.SUGAR)) {
                 RoccetLobbySystem.nav = p.getServer().createInventory(null, 45, "§6§lNavigator");
                 
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(4, new ItemManager("§3Skywars", Material.GRASS, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 5);
                 
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(22, new ItemManager("§a§lSpawn", Material.SLIME_BALL, (byte)0, 1, Enchantment.DURABILITY).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 7);
                 
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(20, new ItemManager("§e§lBuildFFA", Material.GOLD_SWORD, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 9);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(24, new ItemManager("§d§lMLGRush", Material.STICK, (byte)0, 1, Enchantment.DURABILITY).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 11);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(40, new ItemManager("§d§lBedwars", Material.BED, (byte)0, 1, Enchantment.DURABILITY).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 13);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(0, new ItemManager("§4§lKommt bald", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 15);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(8, new ItemManager("§4§lKommt bald", Material.BARRIER, (byte)0, 1, Enchantment.DURABILITY).build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 17);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(44, new ItemManager("§4§lKommt bald", Material.BARRIER, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 19);
                 Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                     @Override
                     public void run() {
                        RoccetLobbySystem.nav.setItem(36, new ItemManager("§4§lKommt bald", Material.BARRIER, (byte)0, 1, "").build());
                        p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                     }
                 }, 21);
                 
                         
                 
                 p.openInventory(RoccetLobbySystem.nav);
             }
         }
    }
}
