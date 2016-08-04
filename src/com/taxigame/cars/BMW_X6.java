package com.taxigame.cars;

import com.taxigame.abstracts.AbstractBMW;

/**
 * класс BMW X6
 */
public class BMW_X6 extends AbstractBMW {

    public BMW_X6() {

        carModel = "X6";
        maxHealth = 320;
        maxFuel = 185;
        healthDecrease = 2;
        fuelDecrease = 2;

        health = maxHealth;
        fuel = maxFuel;

    }

}
