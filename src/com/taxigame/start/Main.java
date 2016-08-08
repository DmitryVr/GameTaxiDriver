package com.taxigame.start;

import com.taxigame.world.City;
/**
 * имитация игры в таксиста
 */
public class Main {
    public static void main(String[] args) {
        imitateGameTaxiDriver();
    }

    private static void imitateGameTaxiDriver() {
        City city = new City("Minsk");
        city.cityStart();
    }
}


