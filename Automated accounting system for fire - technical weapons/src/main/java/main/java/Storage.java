package main.java;

import main.java.factory.FireBarrelsConveyor;
import main.java.factory.FirehosesConveyor;
import main.java.firebarrels.EnumBarrel;
import main.java.firebarrels.Firebarrels;
import main.java.firehoses.EnumHose;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    private static List<Equip> storageList = new ArrayList<>();

    public static void add(String input) throws ArrayIndexOutOfBoundsException {

        if (EnumBarrel.isMatch(input)) {
            storageList.add(FireBarrelsConveyor.getInstance().create(input));

        } else if (EnumHose.isMatch(input)){
            storageList.add(FirehosesConveyor.getInstance().create(input));

        } else throw new ArrayIndexOutOfBoundsException();
    }


    // TODO провести рефакторинг метода
    public static void add(String input, int count) throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        Equipments equip;
        System.out.println("Введите номера устройств через пробел, равное: " + count);
        String inputNumbers = scanner.nextLine();
        String[] element =  inputNumbers.split("\\s+");

        if (EnumBarrel.isMatch(input) && count == element.length) {
            for (int i = 0; i < count; i ++){
                equip = FireBarrelsConveyor.getInstance().create(input);
                equip.setDeviceNumber(Integer.parseInt(element[i]));
                storageList.add(equip);
            }
        }else if (EnumHose.isMatch(input)) {
            for (int i = 0; i < count; i ++){
                equip = FirehosesConveyor.getInstance().create(input);
                equip.setDeviceNumber(Integer.parseInt(element[i]));
                storageList.add(equip);
            }
        }else throw  new IllegalArgumentException();
    }

    public static ArrayList<Equip> getStorageList() {
        return new ArrayList<>(storageList);
    }

    
}
