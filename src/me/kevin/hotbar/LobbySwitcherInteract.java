/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.hotbar;

import me.kevin.managers.ItemManager;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 *
 * @author haral
 */
public class LobbySwitcherInteract implements Listener {
    @EventHandler
    public void OnInteract(PlayerInteractEvent e) {
           final Player p = e.getPlayer();
		 if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
                     if(e.getMaterial().equals(Material.GLOWSTONE_DUST)) {
                         RoccetLobbySystem.switcher = p.getServer().createInventory(p, InventoryType.BREWING, "§eWähle deine Lobby");
                         
                           Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                             @Override
                             protected void finalize() throws Throwable {
                                 super.finalize(); //To change body of generated methods, choose Tools | Templates.
                             }

                             @Override
                             public boolean equals(Object o) {
                                 return super.equals(o); //To change body of generated methods, choose Tools | Templates.
                             }

                             @Override
                             protected Object clone() throws CloneNotSupportedException {
                                 return super.clone(); //To change body of generated methods, choose Tools | Templates.
                             }
                               
                             @Override
                             public void run() {
                                 if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-1") != null) {
                                     RoccetLobbySystem.switcher.setItem(3, new ItemManager("§7Lobby-1 §8x §aAn", Material.STORAGE_MINECART, (byte) 0, 1, "").build());
                                 } else if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-1") == null) {
                                     RoccetLobbySystem.switcher.setItem(3, new ItemManager("§7Lobby-1 §8x §4Aus", Material.MINECART, (byte) 0, 1, "").build());
                                 }
                                 
                                 p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                             }
                         }, 5);
                           
                           Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                             @Override
                             public void run() {
                                 if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-2") != null) {
                                     RoccetLobbySystem.switcher.setItem(0, new ItemManager("§7Lobby-2 §8x §aAn", Material.STORAGE_MINECART, (byte) 0, 1, "").build());
                                 } else if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-2") == null) {
                                     RoccetLobbySystem.switcher.setItem(0, new ItemManager("§7Lobby-2 §8x §4Aus", Material.MINECART, (byte) 0, 1, "").build());
                                 }
                                 
                                 p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                             }
                         }, 10);
                           Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                             @Override
                             public void run() {
                                 if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-3") != null) {
                                     RoccetLobbySystem.switcher.setItem(1, new ItemManager("§7Lobby-3 §8x §aAn", Material.STORAGE_MINECART, (byte) 0, 1, "").build());
                                 } else if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-3") == null) {
                                     RoccetLobbySystem.switcher.setItem(1, new ItemManager("§7Lobby-3 §8x §4Aus", Material.MINECART, (byte) 0, 1, "").build());
                                 }
                                 
                                 p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                             }
                         }, 15);
                           Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                             @Override
                             public void run() {
                                 if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-4") != null) {
                                     RoccetLobbySystem.switcher.setItem(2, new ItemManager("§7Lobby-4 §8x §aAn", Material.STORAGE_MINECART, (byte) 0, 1, "").build());
                                 } else if(RoccetLobbySystem.getCloud().getServerInfo("Lobby-4") == null) {
                                     RoccetLobbySystem.switcher.setItem(2, new ItemManager("§7Lobby-4 §8x §4Aus", Material.MINECART, (byte) 0, 1, "").build());
                                 }
                                 
                                 p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                             }
                         }, 20);
                         p.openInventory(RoccetLobbySystem.switcher);
                     }
       }
    }
}
