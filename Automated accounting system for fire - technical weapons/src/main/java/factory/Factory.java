package main.java.factory;

import main.java.EquipInfo;

@FunctionalInterface
public interface Factory {

    void create(EquipInfo device);
}
