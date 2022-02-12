package models;

import java.util.ArrayList;
import java.util.Scanner;

public class SuotTesting extends TestLogic implements TestCreator{

    @Override
    public void beginTest() {
        Scanner scanner = new Scanner(System.in);
        array = new ArrayList<>(getARandomItemTo(file.convertFromFileToArray(SUOT_DATA_FILE)));

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
}
