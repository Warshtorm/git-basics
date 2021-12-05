package main.java.factory;

import main.java.equipments.Equip;

@FunctionalInterface
public interface Factory {
    Equip create(String device);
}
