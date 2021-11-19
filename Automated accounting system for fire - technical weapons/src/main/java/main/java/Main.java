package main.java;

import main.java.firebarrels.*;
import main.java.factory.FireBarrelsConveyor;

import java.util.*;

public class Main {
    public static List<Firebarrels> fbList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputDevice;


        while (true) {
            System.out.print("Добавить устройство: ");
            inputDevice = sc.nextLine();

            if (!inputDevice.equals("exit")) {
                Firebarrels firebarrel = addFireBarrel(inputDevice);
                System.out.println(getDeviceInfo(firebarrel));
            } else {
                break;
            }
        }
        System.out.println("Завершение работы программы..........");
        sc.close();
    }

    public static Firebarrels addFireBarrel(String device){
        Firebarrels barrel = FireBarrelsConveyor.getInstance().createDevice(device);
        fbList.add(barrel);
        System.out.println("добавлен: " + barrel.getDeviceName());
        System.out.println("Список устройств: " + fbList);
        System.out.println("Колличество устройств: " + fbList.size() + "\n");
        return barrel;
    }

    public static String getDeviceInfo(Equip equip) {
        return equip.getDeviceInformation();
    }
}
