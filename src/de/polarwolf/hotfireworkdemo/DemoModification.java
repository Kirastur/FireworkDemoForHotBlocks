package de.polarwolf.hotfireworkdemo;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;

import de.polarwolf.hotblocks.config.ConfigRule;
import de.polarwolf.hotblocks.config.Coordinate;
import de.polarwolf.hotblocks.modifications.Modification;
import de.polarwolf.hotblocks.worlds.HotWorld;

public class DemoModification extends Modification {

	public DemoModification(HotWorld hotWorld, Coordinate coordinate, ConfigRule rule) {
		super(hotWorld, coordinate, rule);
	}

	@Override
	protected void performDefaultBlockModification() {
		super.performDefaultBlockModification();
		Location fireworkLocation = getLocation();
		Firework firework = (Firework) getWorld().spawnEntity(fireworkLocation, EntityType.FIREWORK);
		firework.detonate();
	}

}
