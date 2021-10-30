package main.java;
import main.java.firebarrells.*;
import main.java.factory.FireBarrelsCreator;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FireBarrels> mainList = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
                FireBarrelsCreator.getInstance().createDevice(new Sprk8(1001 + i));

        }

        mainList.addAll(FireBarrelsCreator.getInstance().getFireBarrelsList());
        //mainList.stream().forEach(System.out::println);

        System.out.println(mainList.get(0).allInformationAboutTheDevice());
        System.out.println();
        System.out.println(mainList.get(0).getDeviceInformation());



        System.out.println("\nРазмер списка: " + mainList.size());
        System.out.println("Счетчик стволов: " + FireBarrels.getCount());











    }




}
