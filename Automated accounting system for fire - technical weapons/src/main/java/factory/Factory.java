package main.java.factory;

import main.java.Equipment;

@FunctionalInterface
public interface Factory {

    void create(Equipment device);
}
