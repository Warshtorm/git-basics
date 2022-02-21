package models.core;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class LogicProgram {
    protected List<String> array;
    public final int QUESTIONS_SIZE = 10;
    private int correctAnswerCount = 0;
    private int wrongAnswerCount = 0;
    protected int inputAnswer;

    public void getQuestionsFromThe(List<String> questions){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Вопрос : " + (i + 1) + " "
                    + questions.get(i).replace('+', ' ').trim());
            System.out.print("Введите ответ: ");
            inputAnswer = scanner.nextInt();
            String answer = getAnswer(questions.get(i), inputAnswer);
            System.out.println(answer);
        }

        String writeResult = getresultTest();
        System.out.println(writeResult);
    }

    public List<String> getARandomItemTo(List<String> convertedRepositoryWithQuestions) {
        Random random = new Random();
        List<String> questions = new ArrayList<>();
        for (int i = 0; i < QUESTIONS_SIZE; i++) {
            int index = random.nextInt(convertedRepositoryWithQuestions.size());
            questions.add(convertedRepositoryWithQuestions.get(index));
            convertedRepositoryWithQuestions.remove(index);
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

    public List<String> convertFromFileToArray(String dataFile) {
        List<String> convertedRepositoryWithQuestions = new ArrayList<>();

        try {
            convertedRepositoryWithQuestions = Files.readAllLines(Paths.get(dataFile));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return convertedRepositoryWithQuestions;
    }



    public String getresultTest() {
        return "Ответов : " + " Правильных - " + correctAnswerCount +
                ", " + "Не правильных - " + wrongAnswerCount;
    }

}






