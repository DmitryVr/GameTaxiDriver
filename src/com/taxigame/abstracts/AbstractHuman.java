package com.taxigame.abstracts;

/**
 * класс человек
 */
public abstract class AbstractHuman {

    protected String name;

    public AbstractHuman(String name) {
        this.name = name;
    }

    public abstract void showName();

}
