package com.orihama.kimetu_no_yaiba.util.handlers;

import java.util.Map;
import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.collect.Maps;

public enum particle_enum {
	BUTTERFLY("butterfly", 0, true),
	MOON1("moon1", 1, true),
	MOON2("moon2", 2, true),
	MOON3("moon3", 3, true),
	MOON1B("moon1B", 1, true),
	MOON2B("moon2B", 2, true),
	MOON3B("moon3B", 3, true);

	private final String particleName;
	private final int particleID;
	private final boolean shouldIgnoreRange;
	private static final Map<Integer, particle_enum> PARTICLES;
	private static final Map<String, particle_enum> BY_NAME;

	static {
		PARTICLES = Maps.newHashMap();
		BY_NAME = Maps.newHashMap();
		for (particle_enum enumparticletypes : values()) {
			PARTICLES.put(Integer.valueOf(enumparticletypes.getParticleID()), enumparticletypes);
			BY_NAME.put(enumparticletypes.getParticleName(), enumparticletypes);
		}
	}

	particle_enum(String particleNameIn, int particleIDIn, boolean shouldIgnoreRangeIn) {
		this.particleName = particleNameIn;
		this.particleID = particleIDIn;
		this.shouldIgnoreRange = shouldIgnoreRangeIn;
	}

	public static Set<String> getParticleNames() {
		return BY_NAME.keySet();
	}

	public String getParticleName() {
		return this.particleName;
	}

	public int getParticleID() {
		return this.particleID;
	}

	public boolean getShouldIgnoreRange() {
		return this.shouldIgnoreRange;
	}

	@Nullable
	public static particle_enum getParticleFromId(int particleId) {
		return PARTICLES.get(Integer.valueOf(particleId));
	}

	@Nullable
	public static particle_enum getByName(String nameIn) {
		return BY_NAME.get(nameIn);
	}
}
