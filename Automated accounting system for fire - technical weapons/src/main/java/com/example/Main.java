package com.example;

import java.util.*;

public class Main {
    public static final String ADD = "add";
    public static final String DELETE = "del";
    public static final String LIST = "list";
    public static final String HELP = "help";
    public static final String INFO = "info";
    public static final String EXIT = "exit";
    public static final String IN_DEVELOPMENT = "функционал находится в разработке...\n";
    public static final String ARGUMENT_INPUT_ERROR = "Ошибка ввода аргумента\n";
    public static final String EXIT_PROGRAMM_MESSAGE = "\"Завершение работы программы...\"";

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter command: ");
            try {
                String command = scaner.nextLine();
                String[] tokens = command.split("\\s+", 3);

                if (tokens.length == 2 && tokens[0].equals(ADD)) {
                    Storage.add(tokens[1]);

                } else if (tokens.length == 3 && tokens[0].equals(ADD)) {
                    Storage.add(tokens[1], Integer.parseInt(tokens[2]));

                } else if (tokens[0].equals(LIST)) {
                    Storage.getListOfDevices();

                } else if (tokens[0].equals(DELETE)) {
                    Storage.delete(Integer.parseInt(tokens[1]));

                } else if (tokens[0].equals(HELP)) {
                    getListOfHelpCommands();

                } else if (tokens[0].equals(INFO)) {
                    Storage.deviceInfo(tokens[1]);

                } else if (tokens[0].equals(EXIT) || tokens[0].equals("0")) {
                    System.out.println(EXIT_PROGRAMM_MESSAGE);
                    scaner.close();
                    break;
                } else {
                    System.out.println("Команда " + "\"" + tokens[0] + "\"" + " введена не корректно или отсутствует ...\n");
                    getListOfHelpCommands();
                }

            } catch (IllegalArgumentException exception) {
                System.out.println(ARGUMENT_INPUT_ERROR);
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Введите аргумент поиска...");
            }

        }

    }

    public static void getListOfHelpCommands() {
        System.out.println("Список команд: " +
                "\nadd \"название устройства\" - добавить устройство, " +
                "\nadd \"название устройства\"  \"колличество\" - добавить несколько устройств, " +
                "\ndel \"номер устройства\" - удалить устройство, " +
                "\nlist - список устройств," +
                "\ninfo - информация об устройстве, \nexit или \"0\" - выход из программы...");
    }


}


