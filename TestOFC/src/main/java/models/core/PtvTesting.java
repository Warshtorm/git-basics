package models.core;
import models.TestCreator;
import java.util.ArrayList;

public class PtvTesting extends LogicProgram implements TestCreator {

    @Override
    public void start() {
        String ptvDataFile = "src/main/resources/ptv.txt";
        getQuestionsFromThe(array = new ArrayList<>(getARandomItemTo(convertFromFileToArray(ptvDataFile))));
    }
}
