package com.jtrent238.cracked;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MyPluginCommandExecutor implements CommandExecutor {
	private final Cracked plugin;

	public MyPluginCommandExecutor(Cracked plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
		// implementation exactly as before...
	}

	public Cracked getPlugin() {
		return plugin;
	}
}