package main.java;

import main.java.factory.FireBarrelsConveyor;
import main.java.factory.FirehosesConveyor;
import main.java.firebarrels.Firebarrels;
import main.java.firehoses.Firehoses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    private static List<Firebarrels> barrelList = new ArrayList<>();
    private static List<Firehoses> hosesList = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);
    private static Equip device;

    public static void add(String input) {

            if (input.equals("sprk8") || input.equals("sprk12") || input.equals("sprk19") || input.equals("sprk22")) {
                device = FireBarrelsConveyor.getInstance().create(input);
                barrelList.add((Firebarrels) device);
            } else if (input.equals("du51") || input.equals("du77") || input.equals("du150") || input.equals("du66")) {
                device = FirehosesConveyor.getInstance().create(input);
                hosesList.add((Firehoses) device);
            }


    }

    public static ArrayList<Firebarrels> getFirebarrelList() {
        return new ArrayList<>(barrelList);
    }

    public static ArrayList<Firehoses> getFirehosesList() {
        return new ArrayList<>(hosesList);
    }


}
