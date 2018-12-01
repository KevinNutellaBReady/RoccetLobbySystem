/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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
    private RoccetLobbySystem plugin;

    public LobbySwitcherClicklistener(RoccetLobbySystem plugin) {
        this.plugin = plugin;
    }
    
    
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if(e.getInventory().getName().equalsIgnoreCase("§eWähle deine Lobby")) {
           e.setCancelled(true);
               if(e.getCurrentItem().getType() == Material.STORAGE_MINECART) {
                  if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-1 §8x §aAn")) {
                      ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);
		try{
			out.writeUTF("Connect");
			out.writeUTF("Lobby-1");
		}catch(IOException a){
			
		}
		p.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
                
                      p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zu Lobby-1 gesendet");
                  } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-2 §8x §aAn")) {
                       ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);
		try{
			out.writeUTF("Connect");
			out.writeUTF("Lobby-2");
		}catch(IOException a){
			
		}
		p.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
                      p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zu Lobby-2 gesendet");
                  } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-3 §8x §aAn")) {
                      ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);
		try{
			out.writeUTF("Connect");
			out.writeUTF("Lobby-3");
		}catch(IOException a){
			
		}
		p.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
                      p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zu Lobby-3 gesendet");
                  } else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Lobby-4 §8x §aAn")) {
                       ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);
		try{
			out.writeUTF("Connect");
			out.writeUTF("Lobby-4");
		}catch(IOException a){
			
		}
		p.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
                      p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du wurdest zu Lobby-4 gesendet");
                  }
           }
        }
        
    }
}
