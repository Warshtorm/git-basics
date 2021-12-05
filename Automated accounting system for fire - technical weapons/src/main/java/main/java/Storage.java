package main.java;

import main.java.equipments.EnumDevices;
import main.java.equipments.Equipment;
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
            String inputNumber = scanner.nextLine();
            String[] element = getElementFrom(device);

            if (element.length == 1) {
                equip = Conveyor.getInstance().create(device);
                equip.setDeviceNumber(Integer.parseInt(inputNumber));
                storageList.add(equip);
            }else {
                System.out.println("Ошибка ввода: Введен больше чем один номер устройства!!!");
            }
        } else throw new IllegalArgumentException();
    }


    public static void add(String device, int numbers) throws IllegalArgumentException {

        if (EnumDevices.isMatch(device)) {
            System.out.println(ENTER_DEVICES_MESSAGE + numbers);
            String[] element = getElementFrom(device, numbers);

            if (numbers == element.length) {
                for (int i = 0; i < numbers; i++) {
                    equip = Conveyor.getInstance().create(device);
                    equip.setDeviceNumber(Integer.parseInt(element[i]));
                    storageList.add(equip);
                }
            } else System.out.println("Ошибка ввода : Запрос - " + numbers + ",введено - " + element.length);

        } else throw new IllegalArgumentException();
    }

    public static String[] getElementFrom(String str, int num){
        Scanner scanner = new Scanner(System.in);
        String inputNumbers = scanner.nextLine();
        return inputNumbers.split("\\s+");
    }

    public static String[] getElementFrom(String str){
        return str.split("\\s+");
    }

    public static ArrayList<Equipment> getStorageList() {
        return new ArrayList<>(storageList);
    }


}
