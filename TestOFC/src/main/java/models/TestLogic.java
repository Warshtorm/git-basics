package models;


import java.util.*;

class TestLogic {
    protected static final String SUOT_DATA_FILE = "src/main/resources/suot.txt";
    protected static final String PTV_DATA_FILE = "src/main/resources/ptv.txt";
    protected List<String> array;

    protected int correctAnswerCount = 0;
    protected int wrongAnswerCount = 0;
    protected int inputAnswer;

    protected final FileConverter file = new FileConverter();



    public List<String> getARandomItemTo(List<String> arrayList) {
        Random random = new Random();
        List<String> questions = new ArrayList<>();
        int questionsSize = 10;
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

    public String getresultTest() {
        return "Ответов : " + " Правильных - " + correctAnswerCount +
                ", " + "Не правильных - " + wrongAnswerCount;
    }

}






