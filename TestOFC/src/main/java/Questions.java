import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Questions {
    private int enterAresponse;
    private int correctAnswerCount = 0;
    private int wrongAnswerCount = 0;
    private int numIndex = 0;
    private static int questionsNumTitle = 0;

    List<String> ptvQuestions = new ArrayList<>();
    List<String> suotQuestions = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void beginTestPtv() {

        for (int i = 0; i < 10; ++i) {
            numIndex = random.nextInt(ptvQuestions.size());

            questionsNumTitle++;  // номер вопроса
            System.out.println("Вопрос №  " + questionsNumTitle + "\n");
            System.out.println(ptvQuestions.get(numIndex));
            correctOrincorrectanswer();
        }
    }

    public void beginTestSuot() {
        for (int i = 0; i < 10; ++i) {

            // создаём переменную в которую заносим случайный индекс массива
            numIndex = random.nextInt(suotQuestions.size());

            questionsNumTitle++;  // номер вопроса
            System.out.println("Вопрос №  " + questionsNumTitle + "\n");
            // выводим вопрос на экран в текстовом виде
            System.out.println(suotQuestions.get(numIndex));
            correctOrincorrectanswer(); // выводим ответ, верно или нет
        }
    }

    /*вводим ответ в консоль
     если остаток от деления 1 и ввод 1 или остаток 0 и ввод 0 то правильно,
     остальное не правильно*/
    public void correctOrincorrectanswer() {
        System.out.print("Верно ли утверждение: 1 - да, 0 - нет ");
        enterAresponse = scanner.nextInt();
        if (numIndex % 2 != 0 & numIndex % 2 == enterAresponse || numIndex % 2 == 0 & numIndex % 2 == enterAresponse) {
            correctAnswerCount++;
            System.out.println(" - верно \n========================================================= ");
        } else {
            wrongAnswerCount++;
            System.out.println(" - не верно \n=========================================================");
        }
    }

    public void getStatistic() {
        // получаем и выводим статистику по ответам
        System.out.print("Правильных ответов: " + getCorrectAnswerCount()
                + " Неправильных ответов: " + getWrongAnswerCount());
        System.out.println();
    }

    public static void getInfoOfWorkProgramm() {
        System.out.println("Вопросы задаются в форме утверждения, нужно определить верно ли оно" +
                " и выбрать соответствующий ответ.");
    }


    // геттер для правильного ответа
    public int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    // геттер для неправильного ответа
    public int getWrongAnswerCount() {
        return wrongAnswerCount;
    }
}



