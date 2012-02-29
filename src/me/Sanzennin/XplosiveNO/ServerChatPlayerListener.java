package me.Sanzennin.XplosiveNO;

import org.bukkit.ChatColor;
import org.bukkit.Location;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;


public class ServerChatPlayerListener implements Listener {
	public static XplosiveNO plugin;
	public ServerChatPlayerListener(XplosiveNO instance){
		plugin = instance;
	}
	@EventHandler
	public void onPlayerChat(PlayerChatEvent chat){
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		ChatColor RED = ChatColor.RED;
		ChatColor WHITE = ChatColor.WHITE;
		
		//Mod messages:
		if(((message_lower.contains("make") && message_lower.contains("me")) || (message_lower.contains("can") && message_lower.contains("i be"))) && message_lower.contains("mod")){
			p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new mods");
			Location loca = p.getLocation();
			p.getWorld().strikeLightningEffect(loca);
			p.damage(2);
			chat.setCancelled(true);
		}
		if(message_lower.contains("give") && message_lower.contains("me") && message_lower.contains("mod")){
				p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new mods");
				Location loca = p.getLocation();
				p.getWorld().strikeLightningEffect(loca);
				p.damage(2);
				chat.setCancelled(true);
				}
		
		if(message_lower.contains("i") && (message_lower.contains("want to be") || message_lower.contains("wanna be"))&& message_lower.contains("mod")){
			p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new mods");
			Location loca = p.getLocation();
			p.getWorld().strikeLightningEffect(loca);
			p.damage(2);
			chat.setCancelled(true);
		}
        //op messages
		if(message_lower.contains("can") && message_lower.contains("i be") && message_lower.contains("op")){
			p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new ops");
			Location loca = p.getLocation();
			p.getWorld().strikeLightningEffect(loca);
			p.damage(2);
			chat.setCancelled(true);
		}
 
		if(message_lower.contains("op me")){
		p.sendMessage(RED + "[XNO]" + WHITE + "We are not opping you");
		Location loca = p.getLocation();
		p.getWorld().strikeLightningEffect(loca);
		p.damage(2);
		chat.setCancelled(true);
		}
		if(message_lower.contains("make me op")){
		p.sendMessage(RED + "[XNO]" + WHITE + "We are not opping you");
		Location loca = p.getLocation();
		p.getWorld().strikeLightningEffect(loca);
		p.damage(2);
		chat.setCancelled(true);
		}
		if(message_lower.contains("make me an op")){
		p.sendMessage(RED + "[XNO]" + WHITE + "We are not opping you");
		Location loca = p.getLocation();
		p.getWorld().strikeLightningEffect(loca);
		p.damage(2);
		chat.setCancelled(true);
		}
		//Architect Messages:
			if(message_lower.contains("can") && message_lower.contains("i be") && message_lower.contains("architect")){
				p.sendMessage(RED + "[XNO]" + WHITE + "No, you can't be Architect");
				Location loca = p.getLocation();
				p.getWorld().strikeLightningEffect(loca);
				p.damage(2);
				chat.setCancelled(true);
			}
			if(message_lower.contains("give") && message_lower.contains("me") && message_lower.contains("architect")){
				p.sendMessage(RED + "[XNO]" + WHITE + "No, you can't be Architect");
				Location loca = p.getLocation();
				p.getWorld().strikeLightningEffect(loca);
				p.damage(2);
				chat.setCancelled(true);
			}
			if(message_lower.contains("i") && (message_lower.contains("want to be") || message_lower.contains("wanna be"))&& message_lower.contains("architect")){
				p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new architects");
				Location loca = p.getLocation();
				p.getWorld().strikeLightningEffect(loca);
				p.damage(2);
				chat.setCancelled(true);
			}
			//admin messages:
				if(((message_lower.contains("give") && message_lower.contains("me")) || (message_lower.contains("can") && message_lower.contains("i be"))) && message_lower.contains("admin")){
				p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new admins");
				Location loca = p.getLocation();
				p.getWorld().strikeLightningEffect(loca);
				p.damage(2);
				chat.setCancelled(true);
			} 
				if(message_lower.contains("i") && (message_lower.contains("want to be") || message_lower.contains("wanna be"))&& message_lower.contains("admin")){
					p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new admins");
					Location loca = p.getLocation();
					p.getWorld().strikeLightningEffect(loca);
					p.damage(2);
					chat.setCancelled(true);
				}
			//dev messages:
			if(((message_lower.contains("can") && message_lower.contains("i be")) || (message_lower.contains("give") && message_lower.contains("me")))&& message_lower.contains("dev")){
			p.sendMessage(RED + "[XNO]" + WHITE + "No, you can't be Developer");
			Location loca = p.getLocation();
			p.getWorld().strikeLightningEffect(loca);
			p.damage(2);
			chat.setCancelled(true);
			}

			if(message_lower.contains("i") && (message_lower.contains("want to be") || message_lower.contains("wanna be"))&& message_lower.contains("dev")){
				p.sendMessage(RED + "[XNO]" + WHITE + "We are not looking for new Devs");
				Location loca = p.getLocation();
				p.getWorld().strikeLightningEffect(loca);
				p.damage(2);
				chat.setCancelled(true);
			}
			//Misc messages:
			if(message_lower.contains("this") && message_lower.contains("server") && message_lower.contains("sucks") && (!(message_lower.contains("doesn")))){
			p.sendMessage(RED + "[XNO]" + WHITE + "Think you can do better?");
			Location loca = p.getLocation();
			p.getWorld().strikeLightningEffect(loca);
			p.damage(2);
			chat.setCancelled(true);
			}
}
}