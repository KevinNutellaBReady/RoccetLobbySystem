/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.commands;

import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class Gamemode implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String string, String[] args) {
        if(cmd.getName().equalsIgnoreCase("gamemode")) {
            Player p = (Player)cs;
            if(p.hasPermission("lobby.gm")) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("1")) {
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Dein Spielmodus wurde auf §e§lCREATIVE §7gesetzt");
                    } else if(args[0].equalsIgnoreCase("2")) {
                        p.setGameMode(GameMode.ADVENTURE);
                        p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Dein Spielmodus wurde auf §e§lADVENTURE §7gesetzt");
                    } else if(args[0].equalsIgnoreCase("3")) {
                        p.setGameMode(GameMode.SPECTATOR);
                        p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Dein Spielmodus wurde auf §e§lSPECTATOR §7gesetzt");
                    } else if(args[0].equalsIgnoreCase("0")) {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.sendMessage(RoccetLobbySystem.getPrefix() + "§7Dein Spielmodus wurde auf §e§lSURVIVAL §7gesetzt");
                    }
                    
                    
                    
                } else {
                    p.sendMessage(RoccetLobbySystem.getPrefix() + "§c§lBitte benutze: /gamemode [1,2,3,0] oder /gm [1,2,3,0]");
                }
            } else {
                p.sendMessage(RoccetLobbySystem.noperms);
            }
        }
        
        return false;
    }
    
}
