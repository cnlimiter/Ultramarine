package com.voxelutopia.ultramarine.common.block.state;

import net.minecraft.util.StringRepresentable;

public enum OrientableBlockType implements StringRepresentable {
    LEFT("left", 1),
    RIGHT("right", 0);

    public static final OrientableBlockType[] BY_ID = values();
    private final String name;
    private final int opposite;

    OrientableBlockType(String name, int opposite) {
        this.name = name;
        this.opposite = opposite;
    }

    public String getSerializedName() {
        return this.name;
    }

    public OrientableBlockType getOpposite() {
        return BY_ID[this.opposite];
    }
}
