/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kevin.managers;

import me.MineHome.PointsAPI.Displays.ActionBar;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;




/**
 *
 * @author haral
 */
public class ActionbarManager {
   
    
    public static void SetActionbar() {
        for(Player all : Bukkit.getOnlinePlayers()) {
            String Beta = "§7Wir sind in der §bBeta";
            ActionBar.sendAction(all, Beta);
        }
    }
    
}

