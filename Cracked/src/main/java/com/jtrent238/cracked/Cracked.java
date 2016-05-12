package com.jtrent238.cracked;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cracked extends JavaPlugin {
	
	@Override
    public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		this.getCommand("basic").setExecutor(new MyPluginCommandExecutor(this));
		this.getCommand("list").setExecutor(new MyPluginCommandExecutor(this));
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked!");
    	getLogger().log(Level.INFO, "§b§l§kXXX §a§lCracked Made By: jtrent238 §b§l§kXXX§r");
   	getLogger().log(Level.INFO, "§b§l§kXXX §a§lPlugin Is WIP! §b§l§kXXX§r");
   	getLogger().log(Level.INFO, "§b§l§kXXX §a§lBye! §b§l§kXXX§r");
    }
    
    @Override
    public void onLoad(){
    	getLogger().info("onLoad has been invoked!");
   	getLogger().log(Level.INFO, "§b§l§kXXX §a§lHello! §b§l§kXXX§r");
    	getLogger().log(Level.INFO, "§b§l§kXXX §a§lCracked Made By: jtrent238 §b§l§kXXX§r");
   	getLogger().log(Level.INFO, "§b§l§kXXX §a§lPlugin Is WIP! §b§l§kXXX§r");
    }
    
   // @EventHandler
   // public void onLogin(PlayerLoginEvent event) {
   // 	getLogger().log(Level.INFO, "Player " + event.getPlayer().getName() + " is logging in!");
   // 	getLogger().log(Level.INFO, "§b§l§kXXX §a§lCracked Made By: jtrent238 §b§l§kXXX§r");
   // 	getLogger().log(Level.INFO, "§b§l§kXXX §a§lPlugin Is WIP! §b§l§kXXX§r");
   // }
    
    @EventHandler
    public void join(PlayerJoinEvent e) {
            Player p = e.getPlayer();
            e.setJoinMessage(ChatColor.BLUE + p.getName()+ ChatColor.GRAY + " has joined the game!");
           
    }
    @EventHandler
    public void join(PlayerQuitEvent e) {
            Player p = e.getPlayer();
            e.setQuitMessage(ChatColor.BLUE + p.getName()+ ChatColor.RED + " has left the game!");
           
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed /basic then do the following...
    		// doSomething
    		return true;
    	} //If this has happened the function will return true. 
            // If this hasn't happened the value of false will be returned.
    	return false; 
}
}
