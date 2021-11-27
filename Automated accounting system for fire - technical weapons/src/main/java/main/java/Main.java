package main.java;
import java.util.*;


public class Main {
    public static final String ADD = "add";
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
            String command = scaner.nextLine();
            String[] tokens = command.split("\\s+", 2);

            if (tokens[0].equals(ADD)) {
                    Storage.add(tokens[1]);

            } else if (tokens[0].equals(LIST)) {
                getListOfDevices();

            } else if (tokens[0].equals(HELP)) {
                getListOfHelpCommands();

            } else if (tokens[0].equals(DEL)) {
                System.out.println("not work !");

            } else if (tokens[0].equals(INFO)) {
                System.out.println("not work");

            } else if (tokens[0].equals(EXIT)) {
                System.out.println(EXIT_PROGRAMM_MESSAGE);
                scaner.close();
                break;
            }else {
                System.out.println("команда " + "\"" + tokens[0] + "\"" + " отсутствует ...");
                getListOfHelpCommands();
            }
        }

    }


    public static void getListOfDevices() {
        System.out.println("Список стволов: " + Storage.getFirebarrelList());
        System.out.println("Колличество: " + Storage.getFirebarrelList().size() + "\n");

        System.out.println("Список рукавов: " + Storage.getFirehosesList());
        System.out.println("Колличество: " + Storage.getFirehosesList().size() + "\n");
    }

    public static void getListOfHelpCommands() {
        System.out.println("Список команд: " +
                "\nadd \"название устройства\" - добавить устройство, " +
                "\nlist - список устройств, rm - удалить, " +
                "\ninfo - информация об устройстве, exit - выход из программы...");
    }


}


