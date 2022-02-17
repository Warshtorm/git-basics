package models.core;
import models.TestCreator;


import java.util.ArrayList;

public class SuotTesting extends LogicProgram implements TestCreator {

    @Override
    public void start() {
        getQuestionsFromThe(array = new ArrayList<>
                (getARandomItemTo(convertFromFileToArray(SUOT_DATA_FILE))));
    }
}
