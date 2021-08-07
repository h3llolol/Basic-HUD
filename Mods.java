package com.tecknix.client.hud;

public class Mods {

    public static List<Mod> listOfMods = new ArrayList();
    public static TestMod testMod = new TestMod(Minecraft.getMinecraft());

    public Mods() {
        this.listOfMods.add(testMod);
    }

    public static void renderOverlay() {

        for (Mod mod : listOfMods) {
            mod.render(new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth());
        }
    }
}
