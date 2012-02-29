package me.Sanzennin.XplosiveNO;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class XplosiveNO extends JavaPlugin {

	public static XplosiveNO plugin;
	public final Logger logger = Logger.getLogger("minecraft");
	public final ServerChatPlayerListener playerListener = new ServerChatPlayerListener(this);
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is now disabled.");
	}
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this.playerListener, this);
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + "is enabled");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("xplosiveno") && (args.length==0)){
			ChatColor RED = ChatColor.RED;
			ChatColor WHITE = ChatColor.WHITE;
			sender.sendMessage(RED + "[XNO]" + WHITE + "XplosiveNO! When you need to say NO with an attitude! When people don't quite get that NO! means XPLOSIVE NO!");
			sender.sendMessage(RED + "[XNO]" + WHITE + "(for people with power) /xno <player> will say NO!");
			sender.sendMessage(RED + "[XNO]" + WHITE + "(for people with power) Permissions: XplosiveNO.XplosiveNO=This. XplosiveNO.XNO=command stated above.");
			sender.sendMessage(RED + "[XNO]" + WHITE + "============================================");
			sender.sendMessage(RED + "[XNO]" + WHITE + "      Created by The Allmighty Sanzennin      ");
			sender.sendMessage(RED + "[XNO]" + WHITE + "            with a Magical Bukkit Tome.       ");
			sender.sendMessage(RED + "[XNO]" + WHITE + "          Assisted by: Jr. Dev Mariohgcz     ");
			sender.sendMessage(RED + "[XNO]" + WHITE + "============================================");
			return true;
			}
		    if(cmd.getName().equalsIgnoreCase("xno") && (args.length==1)){
			ChatColor RED = ChatColor.RED;
			ChatColor WHITE = ChatColor.WHITE;
			Player p = Bukkit.getPlayer(args[0]);
			sender.sendMessage(RED + "[XNO]" + WHITE + "You zapped "+p.getName()+" with a NO!");
			p.sendMessage(RED + "[XNO]" + WHITE + "NO! means (XPLOSIVE) NO!");
			Location loca = p.getLocation();
			p.getWorld().strikeLightningEffect(loca);
			p.damage(4);
			return true;
			}
		    return false;
		}
}
