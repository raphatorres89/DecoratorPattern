package com.attackr.attackr.entity;

public class WaterElement extends WeaponDecorator {

    public WaterElement(Weapon weapon) {
        super(weapon);
    }

    public String getName() {
        return super.getName() + decorateWithWaterElement();
    }

    private String decorateWithWaterElement() {
        return " of Water";
    }
}
