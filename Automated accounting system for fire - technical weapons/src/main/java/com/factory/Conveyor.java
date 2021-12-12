package com.factory;

import com.equipments.Equipment;
import com.equipments.firebarrels.Sprk12;
import com.equipments.firebarrels.Sprk19;
import com.equipments.firebarrels.Sprk22;
import com.equipments.firebarrels.Sprk8;
import com.equipments.firehoses.Hose150;
import com.equipments.firehoses.Hose51;
import com.equipments.firehoses.Hose66;
import com.equipments.firehoses.Hose77;



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