package com.taxigame.buildings;

import com.taxigame.cars.BMW_3;
import com.taxigame.cars.BMW_M6_Gran_Coupe;
import com.taxigame.cars.BMW_X6;
import com.taxigame.enums.CarCatalog;
import com.taxigame.humans.TaxiDriver;

/**
 * класс салон автомобилей
 */
public class CarsSalon {

    public void sellAuto(CarCatalog carCatalog, TaxiDriver taxiDriver) {
        // покупка авто + вычет его стоимости из кошелька таксиста

        System.out.println("------Cars Salon------");

        switch (carCatalog) {

            case BMW_X6: taxiDriver.car = new BMW_X6();
                taxiDriver.pay(CarCatalog.BMW_X6.getPrice()); break;

            case BMW_M6_GRAN_COUPE: taxiDriver.car = new BMW_M6_Gran_Coupe();
                taxiDriver.pay(CarCatalog.BMW_M6_GRAN_COUPE.getPrice()); break;

            case BMW_3: taxiDriver.car = new BMW_3();
                taxiDriver.pay(CarCatalog.BMW_3.getPrice()); break;

        }

    }

}
