package main.java.factory;

import main.java.firehoses.*;

public class FirehosesConveyor implements Factory {

    private static FirehosesConveyor instance;

    public static FirehosesConveyor getInstance() {
        if (instance == null) {
            instance = new FirehosesConveyor();
        }
        return instance;
    }


    @Override
    public Firehoses create(String device) throws IllegalArgumentException{
        return switch (device) {
            case "du51" -> new Hose51();
            case "du66" -> new Hose66();
            case "du77" -> new Hose77();
            case "du150" -> new Hose150();
            default -> throw new IllegalArgumentException();
        };
    }
}
