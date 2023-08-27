package fr.trisout.simplebroadcast;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        System.out.println("§cBy Trisout");
        getCommand("Broadcast").setExecutor(new CommandBroadcast());
        getCommand("Annonce").setExecutor(new CommandAnnonce());
    }
    public void onDisable() {
        System.out.println("§cBy Trisout");
    }
}
