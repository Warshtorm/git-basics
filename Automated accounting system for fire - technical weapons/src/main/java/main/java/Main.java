package main.java;

import java.util.*;

public class Main {
    public static final String ADD = "add";
    public static final String ADD_ALL = "addall";
    public static final String LIST = "list";
    public static final String HELP = "help";
    public static final String DEL = "del";
    public static final String INFO = "info";
    public static final String EXIT = "exit";
    public static final String EXIT_PROGRAMM_MESSAGE = "\"Завершение работы программы..........\"";

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            try {
                String command = scaner.nextLine();
                String[] tokens = command.split("\\s+", 3);

                if (tokens.length == 2 && tokens[0].equals(ADD)) {
                    Storage.add(tokens[1]);

                } else if (tokens.length == 3 && tokens[0].equals(ADD)) {
                    Storage.add(tokens[1], Integer.parseInt(tokens[2]));

                } else if (tokens[0].equals(LIST)) {
                    getListOfDevices();

                } else if (tokens[0].equals(HELP)) {
                    getListOfHelpCommands();

                } else if (tokens[0].equals(DEL)) {
                    System.out.println("not work !");

                } else if (tokens[0].equals(INFO)) {
                    System.out.println("not work");

                } else if (tokens[0].equals(EXIT) || tokens[0].equals("0")) {
                    System.out.println(EXIT_PROGRAMM_MESSAGE);
                    scaner.close();
                    break;
                } else {
                    System.out.println("команда " + "\"" + tokens[0] + "\"" + " отсутствует ...\n");
                    getListOfHelpCommands();
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Input Error!");
            }catch (IllegalArgumentException exception){
                System.out.println("Ошибка ввода аргумента!...");
            }

        }

    }

    //TODO реализовать список устройств через MAP
    public static void getListOfDevices() {
        System.out.println("\nСписок устройств: \n" + Storage.getStorageList().toString()
                .replaceAll("}, ","\n").replaceAll("\\[", "")
                .replaceAll("\\]",""));
        System.out.println("Колличество: " + Storage.getStorageList().size() + "\n");
    }

    public static void getListOfHelpCommands() {
        System.out.println("Список команд: " +
                "\nadd \"название устройства\" - добавить устройство, " +
                "\nlist - список устройств, rm - удалить, " +
                "\ninfo - информация об устройстве, exit - выход из программы...");
    }


}


