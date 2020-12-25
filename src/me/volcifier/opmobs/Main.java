package me.volcifier.opmobs;

import org.bukkit.plugin.java.JavaPlugin;
import me.volcifier.opmobs.listeners.Listeners;

public class Main extends JavaPlugin{
  
  private static Main instance;
  
  public static Main getInstance() {
    return instance;
  }

  @Override
  public void onEnable() {
    instance = this;
    
    getServer().getPluginManager().registerEvents(new Listeners(), this);
  }
  
  @Override
  public void onDisable() {
    instance = null;
  }
  
}
