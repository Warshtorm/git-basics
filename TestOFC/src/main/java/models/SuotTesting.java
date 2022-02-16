package models;
import java.util.ArrayList;

public class SuotTesting extends TestLogic implements TestCreator{

    @Override
    public void create() {
        getQuestionsFromThe(array = new ArrayList<>
                (getARandomItemTo(convertFromFileToArray(SUOT_DATA_FILE))));
    }
}
