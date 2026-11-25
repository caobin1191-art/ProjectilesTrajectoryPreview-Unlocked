package fr.madu59.ptp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.madu59.ptp.HandshakeNetworking.HANDSHAKE_C2SPayload;
import fr.madu59.ptp.HandshakeNetworking.HANDSHAKE_S2CPayload;

public class Ptp implements ModInitializer {
	public static final String MOD_ID = "ptp";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Handshake channel registration removed in Unlocked build to stay completely silent on servers.
		LOGGER.info("Hello Fabric world!");
	}
}