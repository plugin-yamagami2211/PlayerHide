package jp.yama2211.plhide;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equalsIgnoreCase("hide")){
            Player player = (Player) sender;
            for(Player ps: Bukkit.getOnlinePlayers()){
                player.hidePlayer(this,ps);
            }
            player.sendMessage("Player hide!");
        }
        if(cmd.getName().equalsIgnoreCase("show")){
            Player player = (Player) sender;
            for(Player ps: Bukkit.getOnlinePlayers()){
                player.showPlayer(this,ps);
            }
            player.sendMessage("Player show!");
        }

        return false;
    }


}
