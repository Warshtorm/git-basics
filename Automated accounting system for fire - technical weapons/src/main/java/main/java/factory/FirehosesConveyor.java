package main.java.factory;

import main.java.firehoses.Firehoses;
import main.java.firehoses.Hose51;

import java.util.ArrayList;
import java.util.List;

public class FirehosesConveyor implements Factory {

    private static FirehosesConveyor instance;
    private List<Firehoses> fireHosesList;

    private FirehosesConveyor(){
        fireHosesList = new ArrayList<>();
    }

    public static FirehosesConveyor getInstance() {
        if (instance == null){
            instance = new FirehosesConveyor();
        }
        return instance;
    }

    public List<Firehoses> getFirehosesList() {
        return new ArrayList<>(fireHosesList);
    }

    @Override
    public Firehoses create(String device) {
        return switch (device) {
            case "sprk8" -> new Hose51();

            default -> throw new RuntimeException("Объекта " + device + " не существует, или неверный ввод! ");
        };
    }
}
