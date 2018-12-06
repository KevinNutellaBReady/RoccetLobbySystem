/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.commands;

import de.dytanic.cloudnet.lib.server.ServerState;
import java.util.ArrayList;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class Fly implements CommandExecutor {
    
     private static ArrayList<Player> flylist = new ArrayList<>();
     private ServerState serverState;
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("fly")) {
            Player p = (Player)cs;
            if(p.hasPermission("lobby.fly")) {
                if(flylist.contains(p)) {
                    flylist.remove(p);
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du kannst nun nicht mehr fliegen");
                    p.setAllowFlight(false);
                } else if(!flylist.contains(p)) {
                    flylist.add(p);
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du kannst nun mehr fliegen");
                    p.setAllowFlight(true);
                }
            } else {
                p.sendMessage(RoccetLobbySystem.noperms);
            }
            
        } else {
            
        }
        
        
        return false;
    }
    
    
}
