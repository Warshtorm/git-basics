package main.java.factory;

import main.java.Equip;

@FunctionalInterface
public interface Factory {
    Equip createDevice(String device);
}
