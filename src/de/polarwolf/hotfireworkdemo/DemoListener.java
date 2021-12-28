package de.polarwolf.hotfireworkdemo;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import de.polarwolf.hotblocks.config.ConfigRule;
import de.polarwolf.hotblocks.config.Coordinate;
import de.polarwolf.hotblocks.events.HotBlocksTriggerBlockEvent;
import de.polarwolf.hotblocks.worlds.HotWorld;

public class DemoListener implements Listener {

	protected final Main main;

	public DemoListener(Main main) {
		this.main = main;
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onHotBlocksTriggerEvent(HotBlocksTriggerBlockEvent event) {

		// Use firework only for the "ConcreteRed" rule.
		if (!event.getRule().getName().equals("ConcreteRed")) {
			return;
		}

		// Set my custom modification object
		HotWorld hotWorld = event.getHotWorld();
		Coordinate coordinate = event.getBlockCoordinate();
		ConfigRule rule = event.getRule();
		DemoModification demoModification = new DemoModification(hotWorld, coordinate, rule);
		event.setModification(demoModification);
	}

}
