package com.taxigame.world;

import com.taxigame.buildings.CarsSalon;
import com.taxigame.buildings.GasStation;
import com.taxigame.buildings.ServiceStation;
import com.taxigame.enums.CarCatalog;
import com.taxigame.humans.Client;
import com.taxigame.humans.TaxiDriver;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * класс город
 */
public class City {

    private String cityName; // название города

    private TaxiDriver taxiDriver = null; // таксист
    private CarsSalon carsSalon = null; // автосалон
    private GasStation gasStation = null; // заправочная станция
    private ServiceStation serviceStation = null; // станция тех. обслуживания
    private Queue<Client> clients = new ArrayDeque<>(); // FIFO клиенты

    public City(String name) {

        this.cityName = name;

        taxiDriver = new TaxiDriver("Boris", 150000, 6);
        carsSalon = new CarsSalon();
        gasStation = new GasStation();
        serviceStation = new ServiceStation();
        clients.add(new Client("Olga", 16));
        clients.add(new Client("Alexandr", 6));
        clients.add(new Client("Mariya", 21));
        clients.add(new Client("Pavel", 19));
        clients.add(new Client("Elena", 11));

    }

    public void cityStart() {

        System.out.println("City: " + cityName);

        taxiDriver.showName(); // показать имя таксиста

        taxiDriver.showDollars(); // показать сколько денег у таксиста

        taxiDriver.goToCarsSalon(carsSalon, CarCatalog.BMW_M6_GRAN_COUPE); // выбрать и купить авто в автосалоне который в городе

        taxiDriver.getInfoResources(); // информация о ресурсах

        taxiDriver.ClientService(youAreNext()); // услуга клиенту
        taxiDriver.ClientService(youAreNext()); // услуга клиенту
        taxiDriver.ClientService(youAreNext()); // услуга клиенту

        taxiDriver.getInfoResources(); // информация о ресурсах

        taxiDriver.goToGasStation(gasStation); // заправить авто

        taxiDriver.getInfoResources(); // информация о ресурсах

        taxiDriver.goToServiceStation(serviceStation); // ремонтировать авто

        taxiDriver.getInfoResources(); // информация о ресурсах

        taxiDriver.ClientService(youAreNext()); // услуга клиенту
        taxiDriver.ClientService(youAreNext()); // услуга клиенту

    }

    private Client youAreNext() {
        // следующий клиент
        return clients.remove();
    }

}
