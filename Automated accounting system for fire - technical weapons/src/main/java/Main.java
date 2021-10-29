package main.java;
import main.java.firebarrells.*;
import main.java.factory.FireBarrelsCreator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Equipments> mainList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                FireBarrelsCreator.getInstance().createDevice(new Sprk22());
            }else {
                FireBarrelsCreator.getInstance().createDevice(new Sprk8());
            }
        }

        mainList.addAll(FireBarrelsCreator.getInstance().getFireBarrelsList());
        mainList.stream().forEach(System.out::println);

        System.out.println("\nРазмер списка: " + mainList.size());
        System.out.println("Счетчик стволов: " + FireBarrels.getCount());











    }




}
