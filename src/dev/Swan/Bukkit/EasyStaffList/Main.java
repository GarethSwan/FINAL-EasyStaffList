package dev.Swan.Bukkit.EasyStaffList;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	public void onEnable() {
		getConfig().options().copyDefaults(true);
		saveConfig();
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("EasyStaffList v1.0 by Gareth Swan enabled!");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
			if(cmd.getName().equalsIgnoreCase("staff")){
				sender.sendMessage(ChatColor.AQUA + "-----------------------------------------------------");
				sender.sendMessage(ChatColor.BLUE + (ChatColor.BOLD + (getConfig().getString("title"))));
				sender.sendMessage(ChatColor.AQUA + "-----------------------------------------------------");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Owner " + (ChatColor.GOLD + (getConfig().getString("owner"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Co-Owner: " + (ChatColor.GOLD + (getConfig().getString("coowner"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Head-Developer: " + (ChatColor.GOLD + (getConfig().getString("headdev"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Developer " + (ChatColor.GOLD + (getConfig().getString("dev"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Head-Admin: " + (ChatColor.GOLD + (getConfig().getString("headadmin"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Admin: " + (ChatColor.GOLD + (getConfig().getString("admin"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Head-Mod: " + (ChatColor.GOLD + (getConfig().getString("headmod"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Mod: " + (ChatColor.GOLD + (getConfig().getString("mod"))));
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Builder: " + ChatColor.GOLD + (getConfig().getString("builder")));
				sender.sendMessage(ChatColor.AQUA + "-----------------------------------------------------");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "Author: " + (ChatColor.RED + (getConfig().getString("author"))));
				sender.sendMessage(ChatColor.AQUA + "-----------------------------------------------------");
			}
			return false;
	}
	public void onDisable() {
		getLogger().info("EasyStaffList v1.0 by Gareth Swan disabled!");
	}

}
