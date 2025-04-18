package com.sethshoemaker.block_plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ClockPlugin is enabled!");
    }
}