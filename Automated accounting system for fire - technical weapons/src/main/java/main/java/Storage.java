package main.java;

import main.java.factory.Conveyor;
import java.util.*;

public class Storage {
    public static final String ENTER_DEVICE_MESSAGE = "Введите номер устройства ";
    public static final String ENTER_DEVICES_MESSAGE = "Введите номера устройств через пробел, максимум: ";
    private static List<Equipment> storageList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Equipment equip;

    public static void add(String device) throws IllegalArgumentException {

        if (EnumDevices.isMatch(device)) {
            System.out.println(ENTER_DEVICE_MESSAGE);
            String inputNumbers = scanner.nextLine();
            String[] element = inputNumbers.split("\\s+");
            if (element.length == 1) {
                equip = Conveyor.getInstance().create(device);
                equip.setDeviceNumber(Integer.parseInt(inputNumbers));
                storageList.add(equip);
            }else {
                System.out.println("Ошибка ввода: Введен больше чем один номер!!!");
            }
        } else throw new IllegalArgumentException();
    }

    // TODO провести рефакторинг метода
    public static void add(String device, int count) throws IllegalArgumentException {
         if (EnumDevices.isMatch(device)) {
            System.out.println(ENTER_DEVICES_MESSAGE + count);
            String inputNumbers = scanner.nextLine();
            String[] element = inputNumbers.split("\\s+");

            if (count == element.length) {
                for (int i = 0; i < count; i++) {
                    equip = Conveyor.getInstance().create(device);
                    equip.setDeviceNumber(Integer.parseInt(element[i]));
                    storageList.add(equip);
                }
            } else System.out.println("Ошибка ввода : Запрос - " + count + ",введено - " + element.length);

        } else throw new IllegalArgumentException();
    }

    public static ArrayList<Equipment> getStorageList() {
        return new ArrayList<>(storageList);
    }


}
