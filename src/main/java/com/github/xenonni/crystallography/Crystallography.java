package com.github.xenonni.crystallography;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main Mod class, this is how forge knows things about your mod.
 */
@Mod(Crystallography.MODID)
public class Crystallography {

    public static final String MODID = "crystallography";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Crystallography() {
        // LOGGER.debug("Hello from Example Mod!");
    }
}
