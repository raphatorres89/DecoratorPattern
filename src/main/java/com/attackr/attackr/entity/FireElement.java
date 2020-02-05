package com.attackr.attackr.entity;

public class FireElement extends WeaponDecorator {

    public FireElement(Weapon weapon) {
        super(weapon);
    }

    public String getName() {
        return super.getName() + decorateWithFireElement();
    }

    private String decorateWithFireElement() {
        return " of Fire";
    }
}
