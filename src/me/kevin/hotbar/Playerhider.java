package me.kevin.hotbar;



import java.util.concurrent.CopyOnWriteArrayList;
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
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;


public class Playerhider implements Listener {
    

    //<editor-fold defaultstate="collapsed" desc="Arraylisten">
            private static CopyOnWriteArrayList<Player> hidden = new CopyOnWriteArrayList<>();
//</editor-fold>
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		 if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
	            if(e.getMaterial().equals(Material.BLAZE_ROD)) {
                        RoccetLobbySystem.playerhider = p.getServer().createInventory(null, InventoryType.HOPPER, "§5Wähle eine Option");
                        
                        Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                            @Override
                            public void run() {
                               RoccetLobbySystem.playerhider.setItem(0, new ItemManager("§a§lAlle Spieler anzeigen", Material.INK_SACK, (byte) 10, 1, "").build());
                                p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                            }
                        }, 5);
                        Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                            @Override
                            public void run() {
                               RoccetLobbySystem.playerhider.setItem(2, new ItemManager("§e§lVIP Spieler anzeigen", Material.INK_SACK, (byte) 5, 1, "").build());
                                p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                            }
                        }, 7);
                        Bukkit.getScheduler().runTaskLater(RoccetLobbySystem.getInstance(), new Runnable() {

                            @Override
                            public void run() {
                               RoccetLobbySystem.playerhider.setItem(4, new ItemManager("§4§lAlle Spieler verstecken", Material.INK_SACK, (byte) 1, 1, "").build());
                               p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
                            }
                        }, 9);
                        
                        p.openInventory(RoccetLobbySystem.playerhider);
                    
	
		
	}
       }
        
	}
}
	


