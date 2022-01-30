import java.util.*;

class Questions {
    private static final String PTV_DATA_FILE = "src/main/resources/ptv.txt";
    private static final String SUOT_DATA_FILE = "src/main/resources/suot.txt";
    private int enterAresponse;
    private int correctAnswerCount = 0;
    private int wrongAnswerCount = 0;
    private int numIndex = 0;
    private static int questionsNumTitle = 0;

    String[] questions = new String[10];

    Parser parser = new Parser();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void beginTestPtv() {
        parser.readFile(PTV_DATA_FILE);
        getElementIn(parser.getQuestions());


//        for (int i = 0; i < 10; ++i) {
//            numIndex = random.nextInt(questions.size());
//            System.out.println("Array" + questions);
//            questionsNumTitle++;  // номер вопроса
//            System.out.println("Вопрос №  " + questionsNumTitle + "\n");
//            System.out.println(parser.getQuestions().get(numIndex));
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

    public void getElementIn(List<String> arrayList) {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(arrayList.size());
            index++;
            if (questions[0] == null) {
                questions[0] = arrayList.get(num);
            } else questions[i] = arrayList.get(i);

//            if (!questions[i].equals(arrayList.get(i))) {
//                questions[i] = arrayList.get(i);
//            }


        }
        System.out.println(Arrays.toString(questions));
    }


}



