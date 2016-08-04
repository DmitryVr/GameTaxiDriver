package com.taxigame.cars;

import com.taxigame.abstracts.AbstractBMW;

/**
 * класс BMW 3
 */
public class BMW_3 extends AbstractBMW {

    public BMW_3() {

        carModel = "3";
        maxHealth = 160;
        maxFuel = 110;
        healthDecrease = 2;
        fuelDecrease = 3;

        health = maxHealth;
        fuel = maxFuel;

    }

}
