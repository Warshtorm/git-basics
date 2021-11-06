package main.java;

import main.java.firebarrells.*;
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
               // System.out.println("fb: " + fb.toString().replaceAll(",", "\n\t"));

                System.out.println("iteration 1 : " + fb.get(0).getDeviceName() +
                        "\nНомер : " + fb.get(0).getDeviceNumber() +
                        "\nДата предыд. ТО : " + fb.get(0).getPreviousServiceDate() +
                        "\nДата ТО : " + fb.get(0).getCurrentServiceDate()
                        + "\nДата след. ТО : " + fb.get(0).getNextServiceDate());

                System.out.println();
                fb.get(0).setCurrentServiceDate(LocalDate.of(2022,05,06));

                System.out.println("iteration 2 : " + fb.get(0).getDeviceName() +
                        "\nНомер : " + fb.get(0).getDeviceNumber() +
                        "\nДата предыд. ТО : " + fb.get(0).getPreviousServiceDate() +
                        "\nДата ТО : " + fb.get(0).getCurrentServiceDate()
                        + "\nДата след. ТО : " + fb.get(0).getNextServiceDate());

                System.out.println();
                fb.get(0).setCurrentServiceDate(LocalDate.of(2022,11,06));

                System.out.println("iteration 3 : " + fb.get(0).getDeviceName() +
                        "\nНомер : " + fb.get(0).getDeviceNumber() +
                        "\nДата предыд. ТО : " + fb.get(0).getPreviousServiceDate() +
                        "\nДата ТО : " + fb.get(0).getCurrentServiceDate()
                        + "\nДата след. ТО : " + fb.get(0).getNextServiceDate());

                System.out.println();
                fb.get(0).setCurrentServiceDate(LocalDate.of(2023,05,06));

                System.out.println("iteration 4 : " + fb.get(0).getDeviceName() +
                        "\nНомер : " + fb.get(0).getDeviceNumber() +
                        "\nДата предыд. ТО : " + fb.get(0).getPreviousServiceDate() +
                        "\nДата ТО : " + fb.get(0).getCurrentServiceDate()
                        + "\nДата след. ТО : " + fb.get(0).getNextServiceDate());



                System.out.println("Счетчик стволов: " + Firebarrels.getCount());
                System.out.println("------------------------------------------");


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


}
