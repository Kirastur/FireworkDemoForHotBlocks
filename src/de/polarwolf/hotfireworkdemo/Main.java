package de.polarwolf.hotfireworkdemo;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new DemoListener(this);
		this.getLogger().info("Watch the firework!");
	}

}
