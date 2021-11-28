package main.java;

import main.java.factory.FireBarrelsConveyor;
import main.java.factory.FirehosesConveyor;
import main.java.firebarrels.EnumBarrel;
import main.java.firehoses.EnumHose;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Equip> storageList = new ArrayList<>();

    public static void add(String input) throws ArrayIndexOutOfBoundsException {

        if (EnumBarrel.isMatch(input)) {
            storageList.add(FireBarrelsConveyor.getInstance().create(input));

        } else if (EnumHose.isMatch(input)){
            storageList.add(FirehosesConveyor.getInstance().create(input));

        } else throw new ArrayIndexOutOfBoundsException();
    }

    public static ArrayList<Equip> getStorageList() {
        return new ArrayList<>(storageList);
    }

    
}
