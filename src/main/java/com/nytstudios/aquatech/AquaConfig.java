package com.nytstudios.aquatech;

import com.nytstudios.aquatech.Loghelper;


        import net.minecraftforge.common.config.Configuration;

        import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Toph on 2/1/2017.
 */
public class AquaConfig {

    private static final String CATEGORY_MOD = "Base Settings";

    private static final String CATEGORY_CROPS = "Crops Settings";

    private static final String CATEGORY_DANGER = "Danger Area";

    public static String configpath;

    public static Configuration config;

    public static boolean enableBonemealUse;
    public static boolean rightClickHarvest;
    public static int regularSeedExtraChance;
    public static int specialSeedExtraChance;



    public static void configure(Configuration config) {

        enableBonemealUse = config.getBoolean("allowBonemealCrops", CATEGORY_MOD, true, "Set to false if you don't want bonemeal to speed up crop growth");
        rightClickHarvest = config.getBoolean("harvestOnRightClick", CATEGORY_MOD, false, "Set to true if you want right click harvesting of crops (not yet implimented) (this option is ignored if Pams Harvestcraft installed)");
        regularSeedExtraChance = config.getInt("extraSeedChanceRegular", CATEGORY_MOD, 20, 0, 100, "Percentage chance you get an extra seed from regular crops");
        specialSeedExtraChance = config.getInt("extraSeedChanceSpecial", CATEGORY_MOD, 3, 0, 100, "Percentage chance you get an extra seed from special crops");
    }


}
