package com.haarisiqbal.explodingarrows.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class Listeners implements Listener {
  
  @EventHandler
  public void EntityEvent(ProjectileHitEvent event) {
    
    EntityType et = event.getEntityType();
    
    if (et == EntityType.ARROW) {
      EntityExplodeEvent(event.getEntity());
      event.getEntity().remove(); // removes floating arrow bug.
    }
    
  }
  
  public void EntityExplodeEvent(Entity entity) {
    entity.getWorld().createExplosion(entity.getLocation(), 4f); // Note: 4f is TNT sized explosion.
  }

}
