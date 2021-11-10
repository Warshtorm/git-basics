package main.java;

import main.java.firebarrels.*;
import main.java.factory.FirebarrelsConveyor;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputName;
        int defaultCountDevice = 1;
        int countDevice = defaultCountDevice;

        while (true) {
            System.out.print("Добавить устройство: ");
            inputName = sc.nextLine();

            if (!inputName.equals("exit")) {
                addDevice(inputName, countDevice);
                List<Firebarrels> fb = FirebarrelsConveyor.getInstance().getFireBarrelsList();

                    System.out.println("fb: " + fb.get(0));

                    System.out.println("Счетчик стволов: " + Firebarrels.getFirebarrelsCount());
                    System.out.println("------------------------------------------");
                    System.out.println(fb.get(0).allInformationAboutTheDevice());
                    System.out.println("дата " + fb.get(0).getNextServiceDate());

                System.out.println(getDeviceInfo(fb.get(0)));
            } else {
                break;
            }
        }
        System.out.println("Завершение работы программы..........");
        sc.close();
    }







    public static void addDevice(String e, int count) {
        int num = FirebarrelsConveyor.getInstance().getFireBarrelsList().size() + 1;
        for (int i = 0; i < count; i++) {
            if (e.equals("sprk8")) {
                FirebarrelsConveyor.getInstance().create(new Sprk8(num + i));
            } else if (e.equals("sprk12")) {
                FirebarrelsConveyor.getInstance().create(new Sprk12(num + i));
            } else if (e.equals("sprk19")) {
                FirebarrelsConveyor.getInstance().create(new Sprk19(num + i));
            } else if (e.equals("sprk22")) {
                FirebarrelsConveyor.getInstance().create(new Sprk22(num + i));
            }
        }

    }

    public static String getDeviceInfo(EquipInfo equipInfo){
        return equipInfo.getDeviceInformation();
    }


}
