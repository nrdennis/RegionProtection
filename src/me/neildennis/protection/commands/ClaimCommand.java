package me.neildennis.protection.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.neildennis.protection.Protection;

public class ClaimCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player pl = (Player) sender;
		Protection.openMenu(pl);
		
		return true;
	}

}
