package models;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class TestLogic {
    protected static final String SUOT_DATA_FILE = "src/main/resources/suot.txt";
    protected static final String PTV_DATA_FILE = "src/main/resources/ptv.txt";
    protected List<String> array;
    public final int questionsSize = 10;
    private int correctAnswerCount = 0;
    private int wrongAnswerCount = 0;
    protected int inputAnswer;

    public List<String> getARandomItemTo(List<String> arrayList) {
        Random random = new Random();
        List<String> questions = new ArrayList<>();
        for (int i = 0; i < questionsSize; i++) {
            int index = random.nextInt(arrayList.size());
            questions.add(arrayList.get(index));
            arrayList.remove(index);
        }
        return questions;
    }

    public String getAnswer(String question, int inputAnswer) {
        int index = question.lastIndexOf('+');
        if (index > 0 & inputAnswer == 1 || index < 0 & inputAnswer == 0) {
            correctAnswerCount++;
            return "верно ";
        } else if (index > 0 & inputAnswer == 0 || index < 0 & inputAnswer == 1) {
            wrongAnswerCount++;
            return "не верно ";
        }
        return "";
    }

    public  List<String> convertFromFileToArray(String dataFile) {
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

    public void go(List<String> array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Вопрос : " + (i + 1) + " "
                    + array.get(i).replace('+', ' ').trim());
            System.out.print("Введите ответ: ");
            inputAnswer = scanner.nextInt();
            String answer = getAnswer(array.get(i), inputAnswer);
            System.out.println(answer);
        }
    }

    public String getresultTest() {
        return "Ответов : " + " Правильных - " + correctAnswerCount +
                ", " + "Не правильных - " + wrongAnswerCount;
    }

}






