package com.example;

import com.example.equipments.EnumDevices;
import com.example.models.Equipment;
import com.example.factory.Conveyor;

import java.util.*;

public class Storage {
    public static final String ENTER_DEVICE_MESSAGE = "Введите номер устройства ";
    public static final String ENTER_DEVICES_MESSAGE = "Введите номера устройств через пробел, максимум: ";
    public static final String DEVICES_LIST_EMTY = "Список устройств пуст...\n";
    public static final String DEVICE_NOT_FOUND = "Устройство не найдено...\n";
    private static final ArrayList<Equipment> storageList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static Equipment device;


    //TODO доработать метод getElementFrom(){};
    public static void add(String input) throws IllegalArgumentException {

        if (EnumDevices.isMatch(input)) {
            System.out.println(ENTER_DEVICE_MESSAGE);
            String inputNumber = scanner.nextLine();
            String[] element = getElementFrom(input);

            if (element.length == 1) {
                device = createFrom(input);
                device.setNumber(Integer.parseInt(inputNumber));
                storageList.add(device);

            } else {
                System.out.println("Ошибка ввода: Введен больше чем один номер устройства!!!");
            }
        } else throw new IllegalArgumentException();
    }


    public static void add(String input, int inputNumbers) throws IllegalArgumentException {

        if (EnumDevices.isMatch(input)) {
            System.out.println(ENTER_DEVICES_MESSAGE + inputNumbers);
            String[] element = getElementFrom(input, inputNumbers);

            if (inputNumbers == element.length) {
                for (int i = 0; i < inputNumbers; i++) {
                    device = createFrom(input);
                    device.setNumber(Integer.parseInt(element[i]));
                    storageList.add(device);
                }
            } else System.out.println("Ошибка ввода : Запрос - " + inputNumbers + ",введено - " + element.length);

        } else throw new IllegalArgumentException();
    }


    public static void delete(int deviceId) {
        storageList.removeIf(element -> element.getId() == deviceId);
    }


    public static void deviceInfo(String deviceId) throws ArrayIndexOutOfBoundsException{
        if (deviceId.length() != 0) {
            for (Equipment element : storageList) {
                if (element.getId() == Integer.parseInt(deviceId)) {
                     element.allInformationAboutTheDevice();
                     element.getDeviceInformation();
                }else {
                    System.out.println(DEVICE_NOT_FOUND);
                }
            }
        }else throw new ArrayIndexOutOfBoundsException();

    }


    //TODO реализовать список устройств через MAP?
    public static void getListOfDevices() {
        if (Storage.getStorageList().isEmpty()) {
            System.out.println(DEVICES_LIST_EMTY);
        } else {
            storageList.forEach(System.out::println);
        }
    }


    public static Equipment createFrom(String device) {
        return Conveyor.getInstance().create(device);
    }


    public static String[] getElementFrom(String str, int num) {
        Scanner scanner = new Scanner(System.in);
        String inputNumbers = scanner.nextLine();
        return inputNumbers.split("\\s+");
    }

    public static String[] getElementFrom(String str) {
        return str.split("\\s+");
    }

    public static ArrayList<Equipment> getStorageList() {
        return new ArrayList<>(storageList);
    }


}
