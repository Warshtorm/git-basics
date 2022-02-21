package models.core;

import models.TestCreator;

public class MedicalTesting implements TestCreator {
    private final String MED_DATA_FILE = "src/main/resources/med.txt";

    @Override
    public void start() {
        System.out.println("тестирование находится в разработке");

    }
}
