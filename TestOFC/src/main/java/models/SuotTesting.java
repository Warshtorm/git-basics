package models;
import java.util.ArrayList;

public class SuotTesting extends TestLogic implements TestCreator{

    @Override
    public void create() {
        array = new ArrayList<>(getARandomItemTo(convertFromFileToArray(SUOT_DATA_FILE)));
        go(array);
        String writeResult = getresultTest();
        System.out.println(writeResult);
    }
}
