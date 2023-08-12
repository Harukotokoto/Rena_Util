package org.rena.rena_util;

import org.bukkit.plugin.java.JavaPlugin;
import org.rena.rena_util.Commands.Fly;
import org.rena.rena_util.TabCompleter.FlyCompleter;

import java.util.Objects;

public final class Rena_util extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("プラグインを有効化しました。");

        getCommand("fly").setExecutor(new Fly());
        getCommand("fly").setTabCompleter(new FlyCompleter());
    }

    @Override
    public void onDisable() {
        getLogger().info("プラグインを無効化しました。");
        super.onDisable();
    }
}
