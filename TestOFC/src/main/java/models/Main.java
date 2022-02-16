package models;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("1 - load PTV Testing: \n2 - load SUOT Testing:");
        int input = scanner.nextInt();

        run(input);


    }

    public static void run(int input) {
        TestCreator test = null;
        if (input == 1) {
            test = new PtvTesting();
        } else if (input == 2) {
            test = new SuotTesting();
        }
        if (test != null){test.create();}

        scanner.close();

    }


}
