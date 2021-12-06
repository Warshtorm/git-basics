package main.java.factory;


import main.java.equipments.Equipment;

@FunctionalInterface
public interface Factory {
    Equipment create(String device);
}
