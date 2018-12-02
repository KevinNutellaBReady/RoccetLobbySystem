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
public class NavigatorClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
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
            }
        }
    }
}
