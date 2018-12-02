/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

import org.bukkit.entity.Player;

/**
 *
 * @author haral
 */
public class TitleManager {
    public static void setTitle(Player p, String title, String Subtitle) {
        p.sendTitle(title, Subtitle);
    }
    
}
