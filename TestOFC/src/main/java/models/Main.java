package models;
import models.core.MedicalTesting;
import models.core.PtvTesting;
import models.core.SuotTesting;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input = -1;

        while (input != 0) {
            System.out.println("1 - load PTV Testing: \n2 - load SUOT Testing: " +
                    "\n3 - load Medical Testing: " +
                    "\n0 - Exit programm");
            input = scanner.nextInt();
            run(input);
        }
        scanner.close();
    }

    public static void run(int input) {
        TestCreator test = switch (input) {
            case 1 -> new PtvTesting();
            case 2 -> new SuotTesting();
            case 3 -> new MedicalTesting();
            default -> null;
        };
        if (test != null) {
            test.start();
        }
    }
}
