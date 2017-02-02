package com.nytstudios.aquatech;



/**
 * Created by Toph on 1/30/2017.
 */
public class Reference {

    public static final String MOD_ID = "aquatech";
    public static final String NAME = "AquaTech";
    public static final String VERSION = "1.3";
    public static final String ACCEPTED_VERSIONS = "1.10.2";

    public static final String CLIENT_PROXY_CLASS = "com.nytstudios.aquatech.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.nytstudios.aquatech.proxy.ServerProxy";

    public static enum AquaItems {
        CORALDUST("coraldust", "ItemCoralDust"),
        CORALDUSTBLUE("coraldustblue", "ItemCoralDustBlue");

        private String unlocalizedName;
        private String registryName;


        AquaItems(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;

        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }

    public static enum AquaBlocks{

        COMPRESSEDCORALDUST("compressedcoraldust", "BlockCompressedCoralDust");




        private String unlocalizedName;
        private String registryName;


        AquaBlocks(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;

        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }

    }


    public static enum AquaFoods{

        CORALCHUNKS("coralchunks", "ItemCoralChunks"),
        KELP("kelp", "Kelp");




        private String unlocalizedName;
        private String registryName;


        AquaFoods(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;

        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }

    }

    public static enum AquaSeeds{

        BLUECORALSEEDS("bluecoralseed", "BlueCoralSeed");




        private String unlocalizedName;
        private String registryName;


        AquaSeeds(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;

        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }

    }

}
