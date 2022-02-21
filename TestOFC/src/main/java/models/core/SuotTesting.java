package models.core;
import models.TestCreator;
import java.util.ArrayList;

public class SuotTesting extends LogicProgram implements TestCreator {
   private final String SUOT_DATA_FILE = "src/main/resources/suot.txt";

    @Override
    public void start() {

        getQuestionsFromThe(array = new ArrayList<>
                (getARandomItemTo(convertFromFileToArray(SUOT_DATA_FILE))));
    }
}
