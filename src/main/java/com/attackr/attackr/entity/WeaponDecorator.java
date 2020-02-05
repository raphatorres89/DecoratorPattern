package com.attackr.attackr.entity;

public abstract class WeaponDecorator implements Weapon {
    private Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getName() {
        return this.weapon.getName();
    }
}
