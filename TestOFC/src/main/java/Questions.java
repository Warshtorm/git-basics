import java.util.*;

class Questions {
    private static final String PTV_DATA_FILE = "src/main/resources/ptv.txt";
    private static final String SUOT_DATA_FILE = "src/main/resources/suot.txt";
    private int enterAresponse;
    private int correctAnswerCount = 0;
    private int wrongAnswerCount = 0;
    private int numIndex = 0;
    private static int questionsNumTitle = 0;

    List<String> questions = new ArrayList<>();
    Parser parser = new Parser();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    public void beginTestPtv() {
        parser.readFile(PTV_DATA_FILE);
        List<String> array = new ArrayList<>(getRandomElementIn(parser.getQuestions()));

        for (int i = 0; i < array.size(); i++){
            System.out.println("Вопрос : " + (i+1) + " " + array.get(i) + isTrue(array.get(i)));
//            if (isTrue(array.get(i))){
//                System.out.print("true");
//            }else {
//                System.out.print("false");
//            }
        }
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

    public List<String> getRandomElementIn(List<String> arrayList) {
        for (int i = 0; i < 10; i++){
            int index = random.nextInt(arrayList.size());
            questions.add(arrayList.get(index));
            arrayList.remove(index);
        }
        return questions;
    }

    public boolean isTrue(String str){
        if (str.lastIndexOf('+') > 0){
            return true;
        }
        return false;
    }


}



