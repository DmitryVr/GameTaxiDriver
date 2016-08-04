package com.taxigame.world;

import com.taxigame.abstracts.AbstractHuman;
import com.taxigame.buildings.CarsSalon;
import com.taxigame.buildings.GasStation;
import com.taxigame.buildings.ServiceStation;
import com.taxigame.humans.Client;
import com.taxigame.humans.TaxiDriver;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * класс город
 *
 * это имитация движка игры
 */
public class City {

    private String cityName; // название города


    public TaxiDriver taxiDriver = null; // таксист
    public CarsSalon carShowRoom = null; // автосалон
    public GasStation gasStation = null; // заправочная станция
    public ServiceStation serviceStation = null; // станция тех. обслуживания
    private Queue<Client> clients = new ArrayDeque<>(); // FIFO клиенты


    public Client youAreNext() {
        // следующий клиент
        return clients.remove();
    }


    public City(String name) {
        this.cityName = name;
    }

    public void showCityName() {
        System.out.println("City: " + cityName);
    }


    public void addTaxiDriver(TaxiDriver taxiDriver) {
        // метод "добавляет" таксиста на "карту"
        this.taxiDriver = taxiDriver;
    }

    public void addCarShowRoom(CarsSalon carShowRoom) {
        // метод "добавляет" автосалон на "карту"
        this.carShowRoom = carShowRoom;
    }

    public void addClient(Client client) {
        // метод "добавляет" клиента на "карту"
        clients.add(client);
    }

    public void addGasStation(GasStation gasStation) {
        // метод "добавляет" заправочную станцию на "карту"
        this.gasStation = gasStation;
    }

    public void addServiceStation(ServiceStation serviceStation) {
        // метод "добавляет" станцию тех. обслуживания на "карту"
        this.serviceStation = serviceStation;
    }

}
