/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.listener;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

/**
 *
 * @author haral
 */
public class Jumppads implements Listener {
    @EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if(p.getLocation().getBlock().getType() == Material.GOLD_PLATE){
            if(p.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getType() == Material.REDSTONE_BLOCK){
                Vector v = p.getLocation().getDirection().multiply(3D).setY(1);
                p.setVelocity(v);
                p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 1);
                p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1, 1);
	
            }
		}
	}
    
}
