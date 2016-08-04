package com.taxigame.interfaces;

/**
 * задать поведение для автомобилей
 *
 */
public interface InterfaceCar {

    String getCarBrand(); // марка авто

    String getCarModel(); // модель авто

    int getHealth(); // уровень повреждения автомобился

    int getFuel(); // количество топлива в баке

    int getMaxHealth(); // максимальное "здоровье" для авто

    int getMaxFuel(); // максимальное количество топлива для авто

    void getInfoCarSystem(); // информация о системах авто

    void setMaxHealth(); // отремонтировать авто или новый авто

    void setMaxFuel(); // заправиться или новый авто

    void carDrive(int destination); // поехать

}
