package com.therealm18studios.beyondplanetscore;

import com.therealm18studios.beyondplanetscore.registries.BlocksRegistry;
import com.therealm18studios.beyondplanetscore.registries.ItemsRegistry;
import com.therealm18studios.beyondplanetscore.world.modifier.PlanetBiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BeyondPlanetsCore.MODID)
public class BeyondPlanetsCore
{
    public static final String MODID = "beyond_planets_core";

    // Back to us

    public BeyondPlanetsCore() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        //Config

        /**
         * Order of current planet layouts
         * 1) Mars (Beyond Earth)
         * 2) Venus (Beyond Earth)
         * 3) Moon (Beyond Earth)
         * 4) Mercury (Beyond Earth)
         * 5) Glacio (Beyond Earth)
         */

        //Registries
        ItemsRegistry.ITEMS.register(bus);
        BlocksRegistry.BLOCKS.register(bus);
        PlanetBiomeModifier.BIOME_MODIFIER_SERIALIZERS.register(bus);
    }
}