package com.taxigame.start;

import com.taxigame.buildings.CarsSalon;
import com.taxigame.buildings.GasStation;
import com.taxigame.buildings.ServiceStation;
import com.taxigame.enums.CarCatalog;
import com.taxigame.humans.Client;
import com.taxigame.humans.TaxiDriver;
import com.taxigame.world.City;

/**
 * имитация игры в таксиста
 */
public class Main {

    public static void main(String[] args) {
        imitateGameTaxiDriver();
    }


    private static void imitateGameTaxiDriver() {

        City city = new City("Minsk"); // создать город

        city.addTaxiDriver(new TaxiDriver("Boris", 150000, 6)); // добавить таксиста в город

        city.addClient(new Client("Olga", 16)); // добавить клиента в город
        city.addClient(new Client("Alexandr", 6));
        city.addClient(new Client("Mariya", 21));
        city.addClient(new Client("Pavel", 19));
        city.addClient(new Client("Elena", 11));

        city.addCarShowRoom(new CarsSalon()); // добавить автосалон в город

        city.addGasStation(new GasStation()); // добавить заправочную станцию в город

        city.addServiceStation(new ServiceStation()); // добавить станцию тех. обслуживания в город



        System.out.println("------Game started------");

        city.showCityName(); // показать название города

        city.taxiDriver.showName(); // показать имя таксиста

        city.taxiDriver.showDollars(); // показать сколько денег у таксиста

        city.taxiDriver.goToCarsSalon(city.carShowRoom, CarCatalog.BMW_M6_GRAN_COUPE); // выбрать и купить авто в автосалоне который в городе

        city.taxiDriver.getInfoResources(); // информация о ресурсах

        city.taxiDriver.ClientService(city.youAreNext()); // услуга клиенту
        city.taxiDriver.ClientService(city.youAreNext()); // услуга клиенту
        city.taxiDriver.ClientService(city.youAreNext()); // услуга клиенту

        city.taxiDriver.getInfoResources(); // информация о ресурсах

        city.taxiDriver.goToGasStation(city.gasStation); // заправить авто

        city.taxiDriver.getInfoResources(); // информация о ресурсах

        city.taxiDriver.goToServiceStation(city.serviceStation); // ремонтировать авто

        city.taxiDriver.getInfoResources(); // информация о ресурсах

        city.taxiDriver.ClientService(city.youAreNext()); // услуга клиенту
        city.taxiDriver.ClientService(city.youAreNext()); // услуга клиенту

        System.out.println("You won. It was so easy :)");

    }

}


