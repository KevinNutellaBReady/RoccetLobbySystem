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
    
    
   //<editor-fold defaultstate="collapsed" desc="Arraylisten">
            private static CopyOnWriteArrayList<Player> hidden = new CopyOnWriteArrayList<>();
	    private static CopyOnWriteArrayList<Player> cooldown = new CopyOnWriteArrayList<>();
//</editor-fold>
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		 if(e.getPlayer() == null)return;
		 
		 if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
	            if(e.getItem() != null){
	                if(e.getItem().getType() == Material.BONE){
	                    

	                        if(hasCooldown(p)){
	                            p.sendMessage(plugin.getPrefix() + "§cBitte warte noch einen Moment...");
	                            return;
	                        }

	                        if(hidden.contains(p)){
	                            startCooldown(p);
	                            hidden.remove(p);
	                            for(Player all : Bukkit.getOnlinePlayers()){
	                                p.showPlayer(all);
	                            }

	                            p.sendMessage(plugin.getPrefix() + "§e§§lDu siehst nun wieder alle Spieler!");

	                        } else {

	                            startCooldown(p);
	                            hidden.add(p);
	                            for(Player all : Bukkit.getOnlinePlayers()){
	                                p.hidePlayer(all);
	                            }

	                            p.sendMessage(plugin.getPrefix() + "§e§§lDu hast nun alle Spieler versteckt!");

	                        

	                    }

	                }

	            }

	        }
		
	
		
	}
	@SuppressWarnings("deprecation")
	private void startCooldown(final Player p){

      cooldown.add(p);

      Bukkit.getScheduler().scheduleAsyncDelayedTask(plugin.getInstance(), new Runnable() {
                  @Override
                  public void run() {
                      cooldown.remove(p);
                  }
              }, 100);
  }
	private boolean hasCooldown(Player p){
      return cooldown.contains(p);
  }
    
}
