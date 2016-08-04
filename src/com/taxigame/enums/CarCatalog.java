package com.taxigame.enums;

/**
 * каталог автомобилей
 */
public enum CarCatalog {

    BMW_X6(62000),
    BMW_M6_GRAN_COUPE(124000),
    BMW_3(29000);

    private int price;

    CarCatalog(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
