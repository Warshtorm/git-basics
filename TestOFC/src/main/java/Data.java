import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


<<<<<<< HEAD:TestOFC/src/main/java/Parser.java
public class Parser {
    private final List<String> questions = new ArrayList<>();
=======
public class Data {
    private final List<String> repositoryOfQuestions = new ArrayList<>();
>>>>>>> eb0e50b0496d2ef392840c79e12e25850323bf33:TestOFC/src/main/java/Data.java

    public void readFile(String dataFile) {

        try(FileReader reader = new FileReader(dataFile))
        {
            BufferedReader buffer = new BufferedReader(reader);

            String line;
            while((line = buffer.readLine()) != null) {
                repositoryOfQuestions.add(line.replaceAll("/", "\n"));
            }
            buffer.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    public List<String> getRepositoryOfQuestions() {
        return repositoryOfQuestions;
    }
}
