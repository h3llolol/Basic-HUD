package com.tecknix.client.hud;

import com.tecknix.client.config.ConfigOption;
import net.minecraft.client.gui.Gui;

public abstract class Mod {
    protected int posX;
    protected int posY;
    protected int offY;
    protected int offX;

    public void render(int scaledWidth) {
    }

    public abstract int width();

    public abstract int height();

}
