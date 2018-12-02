/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class ActionbarManager {
    private static void sendActionbar(final Player player, final String message) {
        final IChatBaseComponent iChatBaseComponent = IChatBaseComponent.ChatSerializer
                .a("{\"text\": \"" + ChatColor.translateAlternateColorCodes('&', message) + "\"}");
        final PacketPlayOutChat packet = new PacketPlayOutChat(iChatBaseComponent, (byte) 2);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
    }
    
    
    public static void updateTimeBar() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        final String message = "Aktuelle Zeit: " + simpleDateFormat.format(new Date());
        for(Player all : Bukkit.getOnlinePlayers()) {
            sendActionbar(all, message);
        }
    }
}

