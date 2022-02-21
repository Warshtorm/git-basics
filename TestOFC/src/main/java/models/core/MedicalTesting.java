package models.core;

import models.TestCreator;
import java.util.ArrayList;

public class MedicalTesting extends LogicProgram implements TestCreator {

    @Override
    public void start() {
        String medDataFile = "src/main/resources/med.txt";
        getQuestionsFromThe(array = new ArrayList<>(getARandomItemTo(convertFromFileToArray(medDataFile))));

    }
}
