import java.util.*;

class QuestionsServiceImpl implements QuestionsService {
    private static final String PTV_DATA_FILE = "src/main/resources/ptv.txt";
    private static final String SUOT_DATA_FILE = "src/main/resources/suot.txt";
    private int correctAnswerCount = 0;
    private int wrongAnswerCount = 0;
    private int inputAnswer;

    private final FileConverter file = new FileConverter();
    private final Scanner scanner = new Scanner(System.in);
    private List<String> array = new ArrayList<>();


    public void beginTestPtv() {
         array = new ArrayList<>(getARandomItemTo(file.convertToArray(PTV_DATA_FILE)));

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Вопрос : " + (i + 1) + " "
                    + array.get(i).replace('+', ' ').trim());
            System.out.print("Введите ответ: ");
            inputAnswer = scanner.nextInt();
            String answer = getAnswer(array.get(i), inputAnswer);
            System.out.println(answer);
        }
        String writeResult = getresultTest();
        System.out.println(writeResult);
    }


    public void beginTestSuot() {
        array = new ArrayList<>(getARandomItemTo(file.convertToArray(SUOT_DATA_FILE)));

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Вопрос : " + (i + 1) + " "
                    + array.get(i).replace('+', ' ').trim());
            System.out.print("Введите ответ: ");
            inputAnswer = scanner.nextInt();
            String answer = getAnswer(array.get(i), inputAnswer);
            System.out.println(answer);
        }
        String writeResult = getresultTest();
        System.out.println(writeResult);
    }

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






