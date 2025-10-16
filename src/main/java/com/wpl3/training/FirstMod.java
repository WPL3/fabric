package com.wpl3.training;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "first-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    // what is this line doing?
	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}