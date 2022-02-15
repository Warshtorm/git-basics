package models;
import java.util.ArrayList;

public class PtvTesting extends TestLogic implements TestCreator {

    @Override
    public void create() {
        array = new ArrayList<>(getARandomItemTo(convertFromFileToArray(PTV_DATA_FILE)));
            go(array);
        String writeResult = getresultTest();
        System.out.println(writeResult);
    }
}
