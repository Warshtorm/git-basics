import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileConverter {

    public  List<String> convertToArray(String dataFile) {
        List<String> repositoryOfQuestions = new ArrayList<>();

        try (FileReader reader = new FileReader(dataFile)) {
            BufferedReader buffer = new BufferedReader(reader);

            String line;
            while ((line = buffer.readLine()) != null) {
                repositoryOfQuestions.add(line.replaceAll("/", "\n"));
            }
            buffer.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        return repositoryOfQuestions;
    }
}
