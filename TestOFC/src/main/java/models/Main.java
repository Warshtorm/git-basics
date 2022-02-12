package models;

import java.util.Scanner;

public class Main {

    public static TestCreator testCreator ;
    public static Scanner scanner = new Scanner(System.in);

    public static void run(int input) {
        if (input == 1) {
            testCreator = new PtvTesting();
        } else if (input == 2){
            testCreator = new SuotTesting();
        }
        testCreator.beginTest();
    }


    public static void main(String[] args) {
        System.out.println("1 - load PTV Testing: \n2 - load SUOT Testing:");
    int input =  scanner.nextInt();
    run(input);


    }



}
