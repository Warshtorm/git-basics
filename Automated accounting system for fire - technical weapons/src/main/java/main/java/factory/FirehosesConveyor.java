/*
package main.java.factory;

import main.java.Equip;
import main.java.firehoses.Firehoses;
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
    public Equip create(Equip device) {
        return device;

    }
}
*/
