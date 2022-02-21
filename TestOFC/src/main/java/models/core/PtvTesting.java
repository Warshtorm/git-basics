package models.core;
import models.TestCreator;
import java.util.ArrayList;

public class PtvTesting extends LogicProgram implements TestCreator {
    private final String PTV_DATA_FILE = "src/main/resources/ptv.txt";

    @Override
    public void start() {
        getQuestionsFromThe(array = new ArrayList<>(getARandomItemTo(convertFromFileToArray(PTV_DATA_FILE))));
    }
}
