package me.kevin.hotbar;



import java.util.concurrent.CopyOnWriteArrayList;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class Playerhider implements Listener {
    

    //<editor-fold defaultstate="collapsed" desc="Arraylisten">
            private static CopyOnWriteArrayList<Player> hidden = new CopyOnWriteArrayList<>();
//</editor-fold>
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		 if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
	            if(e.getMaterial().equals(Material.BLAZE_ROD)) {
                        if(hidden.contains(p)) {
                            hidden.remove(p);
                              p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du hast nun alle Spieler wieder §4versteckt");
                            for(Player all : Bukkit.getOnlinePlayers()) {
                                all.hidePlayer(p);
                                p.hidePlayer(all);
                            }
                        } else if(!hidden.contains(p)) {
                            hidden.add(p);
                             p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du hast nun alle Spieler wieder §aangezeigt");
                            for(Player all : Bukkit.getOnlinePlayers()) {
                                all.showPlayer(p);
                                p.showPlayer(all);
                            }
                        }
                    }
	
		
	}
       }
        
	}
	


