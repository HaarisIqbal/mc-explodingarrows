package me.volcifier.opmobs.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener {
  
  @EventHandler
  public void creatureSpawn(CreatureSpawnEvent event) {
    
    // What to do if a creeper has spawned.
    if (event.getEntityType() == EntityType.CREEPER) {
      Creeper creeper = (Creeper) event.getEntity();
      
      creeper.setPowered(true); // when creepers spawn, they will be powered.
    }
    
    // what to do if a zombie has spawned.
    if (event.getEntityType() == EntityType.ZOMBIE) {
      Zombie zombie = (Zombie) event.getEntity();
      
      zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
      zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
      zombie.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
      zombie.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
    }
    
    // what to do if a skeleton has spawned.
    if (event.getEntityType() == EntityType.SKELETON) {
      Skeleton skeleton = (Skeleton) event.getEntity();
      
      // armour
      skeleton.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
      skeleton.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
      skeleton.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
      skeleton.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
      
      // Power Bow
      ItemStack powerBow = new ItemStack(Material.BOW);
      powerBow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
      powerBow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
      
      // Giving Skeleton the Power Bow
      skeleton.getEquipment().setItemInMainHand(new ItemStack(powerBow));
    }
    
  }
  
}
