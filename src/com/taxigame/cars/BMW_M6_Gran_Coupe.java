package com.taxigame.cars;

import com.taxigame.abstracts.AbstractBMW;

/**
 * класс BMW M6 Gran Coupe
 */
public class BMW_M6_Gran_Coupe extends AbstractBMW {

    public BMW_M6_Gran_Coupe() {

        carModel = "M6 Gran Coupe";
        maxHealth = 280;
        maxFuel = 140;
        healthDecrease = 1;
        fuelDecrease = 1;

        health = maxHealth;
        fuel = maxFuel;

    }

}
