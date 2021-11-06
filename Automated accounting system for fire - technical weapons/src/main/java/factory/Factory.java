package main.java.factory;

import main.java.Equipment;

import java.time.format.DateTimeFormatter;

@FunctionalInterface
public interface Factory {

    void create(Equipment device);
}
