package fr.trisout.simplebroadcast;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Sound;
import fr.trisout.simplebroadcast.utils.Strings;


public class CommandAnnonce implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player)sender;
            if(args.length == 0){
                player.sendMessage("§cUtilisation: /annonce <message>");
            } else{
                StringBuilder bc = new StringBuilder();
                for(String part : args){
                    bc.append(part + " ");
                }
                for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                    onlinePlayer.sendTitle("§7§l≫ §c§n§lAnnonce§r §7§l≪", Strings.color(bc.toString()));
                    onlinePlayer.playSound(onlinePlayer.getLocation(), Sound.valueOf("UI_TOAST_CHALLENGE_COMPLETE"), 1, 1);
                }

            }

        }
        return false;
    }
}
