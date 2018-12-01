/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class SendManager {
    private RoccetLobbySystem plugin;

    public SendManager(RoccetLobbySystem plugin) {
        this.plugin = plugin;
    }

    public SendManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void send(Player p, String server){
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);
		try{
			out.writeUTF("Connect");
			out.writeUTF(server);
		}catch(IOException e){
			
		}
		p.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
	}
}
