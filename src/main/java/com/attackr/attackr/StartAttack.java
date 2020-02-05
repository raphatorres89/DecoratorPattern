package com.attackr.attackr;

import com.attackr.attackr.entity.Axe;
import com.attackr.attackr.entity.FireElement;
import com.attackr.attackr.entity.Sword;
import com.attackr.attackr.entity.WaterElement;
import com.attackr.attackr.entity.Weapon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartAttack implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Crafting a sword.");
        Weapon sword = new Sword();
        System.out.println(sword.getName());
        System.out.println("Adding fire element");
        sword = new FireElement(sword);
        System.out.println(sword.getName());

        System.out.println("Crafting a sword adding water element");
        Weapon sword2 = new WaterElement(new Sword());
        System.out.println(sword2.getName());

        System.out.println("Crafting a axe adding water element");
        Weapon axe = new WaterElement(new Axe());
        System.out.println(axe.getName());
    }
}
