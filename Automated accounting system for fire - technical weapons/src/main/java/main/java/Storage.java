package main.java;

import main.java.factory.Conveyor;
import main.java.firebarrels.EnumBarrel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    public static final String ENTER_DEVICE_MESSAGE = "Введите номер устройства";
    public static final String ENTER_DEVICES_MESSAGE = "Введите номера устройств через пробел, равное: ";
    private static List<Equip> storageList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Equipment equip;

    public static void add(String input) throws ArrayIndexOutOfBoundsException {
        System.out.println(ENTER_DEVICE_MESSAGE);
        int inputNumbers = scanner.nextInt();

        if (EnumBarrel.isMatch(input)) {
            equip = Conveyor.getInstance().create(input);
            equip.setDeviceNumber(inputNumbers);
            storageList.add(equip);

        } else throw new ArrayIndexOutOfBoundsException();
    }

    // TODO провести рефакторинг метода
    public static void add(String input, int count) throws IllegalArgumentException {

        System.out.println(ENTER_DEVICES_MESSAGE + count);
        String inputNumbers = scanner.nextLine();
        String[] element = inputNumbers.split("\\s+");

        if (EnumBarrel.isMatch(input) && count == element.length) {

            for (int i = 0; i < count; i++) {
                equip = Conveyor.getInstance().create(input);
                equip.setDeviceNumber(Integer.parseInt(element[i]));
                storageList.add(equip);
            }
        } else throw new IllegalArgumentException();
    }

    public static ArrayList<Equip> getStorageList() {
        return new ArrayList<>(storageList);
    }


}
