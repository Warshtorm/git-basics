package main.java.factory;

import main.java.Equipments;

import java.util.List;

public interface EquipmentFactory {

    List<Equipments> createDevice(Equipments device);
}
