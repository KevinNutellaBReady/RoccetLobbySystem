/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

import de.dytanic.cloudnet.lib.server.info.ServerInfo;
import java.util.Collection;
import me.kevin.roccetlobby.RoccetLobbySystem;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class QuickJoinManager {
    public static void quickJoin(Player p, String serverGroup){
         Collection<ServerInfo> servers = RoccetLobbySystem.getCloud().getServers(serverGroup);
         ServerInfo sf = null;
         for(ServerInfo gameServer : servers){
              if(!gameServer.isIngame()){
                  if(sf == null){
                      sf = gameServer;
                  }
                  int ia = sf.getPlayers().size();
                  int i = gameServer.getPlayers().size();
                  if(i > ia){
                      if(i  != gameServer.getMaxPlayers()){
                          sf = gameServer;
                      }
                  }
              }
          }
         if(sf != null){
             RoccetLobbySystem.getCloud().getOnlinePlayer(p.getUniqueId()).setServer(sf.getServiceId().getServerId());

         }
    }
}
