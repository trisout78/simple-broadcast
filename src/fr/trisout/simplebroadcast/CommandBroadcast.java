package fr.trisout.simplebroadcast;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Sound;


public class CommandBroadcast implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player)sender;
            if(args.length == 0){
                player.sendMessage("§cUtilisation: /broadcast <message>");
            } else{
                StringBuilder bc = new StringBuilder();
                for(String part : args){
                    bc.append(part + " ");
                }
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage("§c§n§lAnnouncement :§r " + bc.toString());
                Bukkit.broadcastMessage("");
                for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                    onlinePlayer.sendTitle("§c§lAnnouncement :", bc.toString());
                    onlinePlayer.playSound(onlinePlayer.getLocation(), Sound.valueOf("UI_TOAST_CHALLENGE_COMPLETE"), 1, 1);
                }

            }

        }
        return false;
    }
}
