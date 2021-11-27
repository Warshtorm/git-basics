package main.java;

import main.java.factory.FirehosesConveyor;
import main.java.firebarrels.*;
import main.java.factory.FireBarrelsConveyor;
import main.java.firehoses.Firehoses;
import java.util.*;


public class Main {
    public static List<Firebarrels> barrelList = new ArrayList<>();
    public static List<Firehoses> hosesList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);


        while (true) {
            System.out.print("Enter command: ");
            String command = scaner.nextLine();
            String[] tokens = command.split("\\s+", 2);
            Equip device;

            if (tokens[0].equals("add")) {

                device = addFireBarrel(tokens[1]);
                System.out.println("added: " + device);

            } else if (tokens[0].equals("list")) {
                getListOfDevices();

            } else if (tokens[0].equals("help")) {
                getListOfHelpCommands();

            } else if (tokens[0].equals("rm")) {
                System.out.println("not work !");

            } else if (tokens[0].equals("info")) {
                System.out.println("not work");

            } else if (tokens[0].equals("exit")) {
                System.out.println("Завершение работы программы..........");
                scaner.close();
                break;
            }
        }

    }


    public static Firebarrels addFireBarrel(String device) {
        Firebarrels barrel = FireBarrelsConveyor.getInstance().create(device);
        barrelList.add(barrel);
        return barrel;
    }

    public static Firehoses addFireHoses(String device) {
        Firehoses hoses = FirehosesConveyor.getInstance().create(device);
        hosesList.add(hoses);
        return hoses;
    }

    public static void getListOfDevices(){
        System.out.println("Список устройств: " + barrelList);
        System.out.println("Колличество устройств: " + barrelList.size() + "\n");
    }

    public static void getListOfHelpCommands(){
        System.out.println("add sprk8 - добавить устройство, " +
                "\nlist - список устройств, rm - удалить, " +
                "\ninfo - информация об устройстве, exit - выход из программы...");
    }





}


