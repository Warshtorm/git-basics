import java.util.*;

class Questions {
    private static final String PTV_DATA_FILE = "src/main/resources/ptv.txt";
    private static final String SUOT_DATA_FILE = "src/main/resources/suot.txt";
    private int correctAnswerCount = 0;
    private int wrongAnswerCount = 0;
    private int inputAnswer;

    private final List<String> questions = new ArrayList<>();
    private final Parser now = new Parser();
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();



    public void beginTestPtv() {
        now.readFile(PTV_DATA_FILE);
        List<String> array = new ArrayList<>(getARandomItemTo(now.getRepositoryOfQuestions()));

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Вопрос : " + (i + 1) + " " + array.get(i).replace('+', ' ').trim());
            System.out.print("Введите ответ: ");
            inputAnswer = scanner.nextInt();
            String answer = getAnswer(array.get(i), inputAnswer);
            System.out.println(answer);
        }
        String writeResult = getresultTest();
        System.out.println(writeResult);
    }

//    public void beginTestSuot() {
//        for (int i = 0; i < 10; ++i) {
//
//            // создаём переменную в которую заносим случайный индекс массива
//            numIndex = random.nextInt(suotQuestions.size());
//
//            questionsNumTitle++;  // номер вопроса
//            System.out.println("Вопрос №  " + questionsNumTitle + "\n");
//            // выводим вопрос на экран в текстовом виде
//            System.out.println(suotQuestions.get(numIndex));
//            correctOrincorrectanswer(); // выводим ответ, верно или нет
//        }
//    }

    public List<String> getARandomItemTo(List<String> arrayList) {
        int NUMBER_OF_QUESTIONS = 10;
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int index = random.nextInt(arrayList.size());
            questions.add(arrayList.get(index));
            arrayList.remove(index);
        }
        return questions;
    }

    public String getAnswer(String str, int inputAnswer) {
        int index = str.lastIndexOf('+');
        if (index > 0 & inputAnswer == 1 || index < 0 & inputAnswer == 0) {
            correctAnswerCount++;
            return  "верно ";
        } else if (index > 0 & inputAnswer == 0 || index < 0 & inputAnswer == 1) {
            wrongAnswerCount++;
            return  "не верно ";
        }
        return "";
    }

    public String getresultTest() {
        return "Ответов : " + " Правильных - " + correctAnswerCount +
                ", " + "Не правильных - " + wrongAnswerCount;
    }

}






