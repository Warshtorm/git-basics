package models;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1 - load PTV Testing: \n2 - load SUOT Testing: \n3 - load Medical Testing");
        int input = scanner.nextInt();
        run(input);
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
        scanner.close();

    }
}
