package com.natamus.hideexperimentalwarning;


public class ModCommon {

	public static void init() {
		load();
	}

	private static void load() {
		// This mod doesn't contain the code itself, but triggers the mixins in Collective.
		// The reason for this is that Collective always disables the experimental warning in a development environment, for my sanity.
		// Via the mod, the functionality is added to production. Without it being a hidden config somewhere.
	}
}