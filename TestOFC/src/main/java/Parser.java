import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Parser {
    private List<String> questions = new ArrayList<>();

    public void readFile(String dataFile) {

        try(FileReader reader = new FileReader(dataFile))
        {
            BufferedReader buffer = new BufferedReader(reader);

            String line;
            while((line = buffer.readLine()) != null) {
                questions.add(line.replaceAll("/", "\n"));
            }
            buffer.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    public List<String> getQuestions() {
        return questions;
    }
}
