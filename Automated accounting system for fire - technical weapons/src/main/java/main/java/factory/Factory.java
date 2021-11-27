package main.java.factory;

import main.java.Equip;

@FunctionalInterface
public interface Factory {
    Equip create(String device);
}
