package models.core;
import models.TestCreator;


import java.util.ArrayList;

public class PtvTesting extends LogicProgram implements TestCreator {

    @Override
    public void start() {
        getQuestionsFromThe(array = new ArrayList<>
                (getARandomItemTo(convertFromFileToArray(PTV_DATA_FILE))));
    }
}
