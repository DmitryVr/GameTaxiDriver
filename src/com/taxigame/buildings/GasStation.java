package com.taxigame.buildings;

import com.taxigame.humans.TaxiDriver;
/**
 * класс заправка
 */
public class GasStation {

    private static final int GAS_INCREASE = 1; // стоимость за единицу топлива

    public void fillTheCar(TaxiDriver taxiDriver) {
        // заправить авто топливом

        System.out.println("------Gas Station------");

        int difference = GAS_INCREASE * (taxiDriver.car.getMaxFuel() - taxiDriver.car.getFuel()); // сколько не хватает до максимума
        taxiDriver.pay(difference); // заплатить за топливо

        taxiDriver.car.setMaxFuel(); // заправиться

    }

}
