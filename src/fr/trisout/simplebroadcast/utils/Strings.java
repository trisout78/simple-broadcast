package fr.trisout.simplebroadcast.utils;

import org.bukkit.ChatColor;

public class Strings {
    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}