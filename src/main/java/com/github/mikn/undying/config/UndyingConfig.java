package com.github.mikn.undying.config;

import com.github.mikn.undying.UndyingEnchantmentMod;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = UndyingEnchantmentMod.MODID)
public class UndyingConfig implements ConfigData {
    public int costIfTotemHasBeenUsed = 6;
    public int costIfTotemHasNeverBeenUsed = 11;
}