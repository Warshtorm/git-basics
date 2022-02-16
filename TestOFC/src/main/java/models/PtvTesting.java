package models;
import java.util.ArrayList;

public class PtvTesting extends TestLogic implements TestCreator {

    @Override
    public void start() {
        getQuestionsFromThe(array = new ArrayList<>
                (getARandomItemTo(convertFromFileToArray(PTV_DATA_FILE))));
    }
}
