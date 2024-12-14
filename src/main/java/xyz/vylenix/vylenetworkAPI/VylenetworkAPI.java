package xyz.vylenix.vylenetworkAPI;

import org.bukkit.plugin.java.JavaPlugin;

public final class VylenetworkAPI extends JavaPlugin {
    private static VylenetworkAPI instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static VylenetworkAPI getInstance() {
        return instance;
    }
}
