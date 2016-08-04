package com.taxigame.abstracts;

import com.taxigame.interfaces.InterfaceCar;

/**
 * класс BMW
 *
 * BMW - это абстракция
 * потому что по городу ездят конкректные модели
 *
 */
public abstract class AbstractBMW implements InterfaceCar {

    private static final String CAR_BRAND = "BMW";

    protected String carModel; // модель авто
    protected int maxHealth; // максимально количество "здоровья"
    protected int maxFuel; // максимальное количество топлива
    protected int healthDecrease; // уменьшение "здоровья" за 1 км
    protected int fuelDecrease; // уменьшение топлива за 1 км


    protected int health; // уровень "здоровья"

    protected int fuel; // уровень топлива


    @Override
    public String getCarBrand() {
        return CAR_BRAND;
    }

    @Override
    public String getCarModel() {
        return carModel;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public int getMaxFuel() {
        return maxFuel;
    }

    @Override
    public void getInfoCarSystem() {
        // информация о топливе и "здоровье"

        System.out.println("Fuel: " + fuel + "/" + maxFuel);
        System.out.println("Health: " + health + "/" + maxHealth);
    }

    @Override
    public void setMaxHealth() {
        health = maxHealth;
    }

    @Override
    public void setMaxFuel() {
        fuel = maxFuel;
    }

    @Override
    public void carDrive(int destination) {
        // транспортировка клиентов
        // уменьшается количество топлива и "здоровья авто"

        System.out.print("Start");

        for (int i = 0; i < destination; ++i)
            System.out.print(".");

        fuel = fuel - (fuelDecrease * destination);
        health = health - (healthDecrease * destination);

        System.out.println("Stop");

    }

}
