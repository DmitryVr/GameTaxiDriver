package com.taxigame.humans;

import com.taxigame.abstracts.AbstractHuman;
import com.taxigame.buildings.CarsSalon;
import com.taxigame.buildings.GasStation;
import com.taxigame.buildings.ServiceStation;
import com.taxigame.enums.CarCatalog;
import com.taxigame.interfaces.InterfaceCar;

/**
 * класс таксист
 *
 */
public class TaxiDriver extends AbstractHuman {

    private int tariff; // тариф за километр

    private int dollars; // деньги у таксиста

    public InterfaceCar car = null; // авто таксиста

    public TaxiDriver(String name, int dollars, int tariff) {
        super(name);
        this.dollars = dollars;
        this.tariff = tariff;
    }

    public void addDollars(int reward) {
        // награда за выполненное задание
        dollars += reward;
    }

    public void pay(int dollars) {
        // заплатить
        this.dollars -= dollars;
    }

    @Override
    public void showName() {
        System.out.println("Taxi driver name: " + name);
    }

    public void showDollars() {
        System.out.println("You has " + this.dollars + " dollars");
    }


    public void goToCarsSalon(CarsSalon carsSalon, CarCatalog carCatalog) {
        // покупка авто

        carsSalon.sellAuto(carCatalog, this);
        System.out.println(name + ", you bought a \"" + car.getCarBrand() + " " + car.getCarModel() + "\" car"); // сообщение о покупке авто

    }

    public void goToGasStation(GasStation gasStation) {
        // заправка авто

        gasStation.fillTheCar(this);
        System.out.println(name + ", you refilled your car"); // сообщение о заправке авто

    }

    public void goToServiceStation(ServiceStation serviceStation) {
        // ремонт авто

        serviceStation.repairTheCar(this);
        System.out.println(name + ", your car repaired"); // сообщение о ремонте авто

    }


    public void getInfoResources() {
        // информация о ресурсах (деньги, топливо, "здоровье" авто)

        System.out.println("------Resources------");
        showDollars();
        car.getInfoCarSystem();
    }

    public void ClientService(Client client) {

        System.out.println("------New Client------");

        client.showName(); // узнать имя клиента

        client.showDistance(); // узнать место назначения (расстояние)

        car.carDrive(client.getDistance()); // транспортировка клиента

        addDollars(client.pay(tariff)); // получить денежное вознаграждение за услугу

    }

}
