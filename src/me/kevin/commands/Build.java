/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.commands;

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
public class Build implements CommandExecutor {

    public static ArrayList<Player> build = new ArrayList<>();
            
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if(cmd.getName().equalsIgnoreCase("build")) {
            Player p = (Player)sender;
            if(p.hasPermission("lobby.build")) {
                if(build.contains(p)) {
                    build.remove(p);
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du hast den Baumodus §4§lverlassen");
                } else if(!build.contains(p)) {
                    build.add(p);
                     p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Du hast den Baumodus §a§lbetreten");
                }
            } else {
                p.sendMessage(RoccetLobbySystem.getNoperms());
            }
        }
        
        return false;
    }
    
}
