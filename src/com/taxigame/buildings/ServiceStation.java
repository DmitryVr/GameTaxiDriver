package com.taxigame.buildings;

import com.taxigame.humans.TaxiDriver;
/**
 * класс станция тех. обслуживания
 */
public class ServiceStation {

    private static final int HEALTH_INCREASE = 2; // стоимость за единицу ремонта

    public void repairTheCar(TaxiDriver taxiDriver) {
        // метод ремонтный сервис

        System.out.println("------Service Station------");

        int difference = HEALTH_INCREASE * (taxiDriver.car.getMaxHealth() - taxiDriver.car.getHealth()); // сколько не хватает до максимума
        taxiDriver.pay(difference); // заплатить за ремонт

        taxiDriver.car.setMaxHealth(); // отремонтировать авто

    }


}
