/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import me.kevin.managers.SendManager;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 *
 * @author haral
 */
public class LobbySwitcherClicklistener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        
        if(p.getInventory().getName().equalsIgnoreCase("§eWähle deine Lobby")) {
            if(e.getCurrentItem().getType() == Material.STORAGE_MINECART) {
                if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-1 §8x §aAn")) {
                    new SendManager().send(p, "Lobby-1");
                    p.closeInventory();
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zur §aLobby-1 gesendet");
                } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-2 §8x §aAn")) {
                    new SendManager().send(p, "Lobby-2");
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zur §aLobby-2 gesendet");
                    p.closeInventory();
                } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-3 §8x §aAn")) {
                    new SendManager().send(p, "Lobby-3");
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zur §aLobby-3 gesendet");
                    p.closeInventory();
                } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-4 §8x §aAn")) {
                    new SendManager().send(p, "Lobby-4");
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zur §aLobby-4 gesendet");
                    p.closeInventory();
                }
            }
        }
        
    }
}
