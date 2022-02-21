package models.core;
import models.TestCreator;
import java.util.ArrayList;

public class SuotTesting extends LogicProgram implements TestCreator {

    @Override
    public void start() {
        String suotDataFile = "src/main/resources/suot.txt";
        getQuestionsFromThe(array = new ArrayList<>(getARandomItemTo(convertFromFileToArray(suotDataFile))));
    }
}
