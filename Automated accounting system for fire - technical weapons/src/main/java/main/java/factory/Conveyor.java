package main.java.factory;

import main.java.equipments.Equipment;
import main.java.firebarrels.*;
import main.java.firehoses.Hose150;
import main.java.firehoses.Hose51;
import main.java.firehoses.Hose66;
import main.java.firehoses.Hose77;


public class Conveyor implements Factory {

    private static Conveyor instance;

    public static Conveyor getInstance() {
        if (instance == null) {
            instance = new Conveyor();
        }
        return instance;
    }

    //TODO что с эксепшеном?
    @Override
    public Equipment create(String input) throws IllegalArgumentException{

        return switch (input) {
            case "sprk8" -> new Sprk8();
            case "sprk12" -> new Sprk12();
            case "sprk19" -> new Sprk19();
            case "sprk22" -> new Sprk22();
            case "du51" -> new Hose51();
            case "du66" -> new Hose66();
            case "du77" -> new Hose77();
            case "du150" -> new Hose150();
            default -> throw new IllegalArgumentException();
        };

    }
}