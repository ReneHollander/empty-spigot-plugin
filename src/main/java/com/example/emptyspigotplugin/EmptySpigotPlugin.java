package com.example.emptyspigotplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class EmptySpigotPlugin extends JavaPlugin {

  public void onEnable() {
    System.out.println("Enabled EmptySpigotPlugin");
  }

  @Override
  public void onDisable() {
    System.out.println("Disabled EmptySpigotPlugin");
  }

}
