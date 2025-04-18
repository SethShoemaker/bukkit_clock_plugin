package com.sethshoemaker.block_plugin;

import java.time.LocalTime;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ClockPlugin is enabled!");
        getServer().getScheduler().runTaskTimer(this, () -> {
            if(getServer().getOnlinePlayers().size() == 0){
                return;
            }
            LocalTime now = LocalTime.now();
            int minute = now.getMinute();
            if(minute % 5 != 0){
                return;
            }
            int hour = now.getHour();
            getServer().broadcastMessage("It is currently " + hour + ":" + String.format("%02d", minute));
        }, 0L, 20L * 60L); // 20 ticks per second × 60 seconds = 1 minute
    }
}