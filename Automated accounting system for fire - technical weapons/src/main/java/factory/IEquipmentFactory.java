package main.java.factory;

import main.java.Equipments;

@FunctionalInterface
public interface IEquipmentFactory {

    void createDevice(Equipments device);
}
