package com.taxigame.humans;

import com.taxigame.abstracts.AbstractHuman;

/**
 * класс клиент
 */
public class Client extends AbstractHuman {

    private int distance; // место назначения клиента (расстояние)

    public Client(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    @Override
    public void showName() {
        // показать имя клиента
        System.out.println("Client name: " + name);
    }

    public void showDistance() {
        // показать место назначения
        System.out.println("Destination: " + distance + " kilometers");
    }

    public int getDistance() {
        return distance;
    }

    public int pay(int tariff) {
        // заплатить за поездку
        return distance * tariff;
    }
}
