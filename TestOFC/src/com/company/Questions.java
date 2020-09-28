package com.company;

import java.util.Random;
import java.util.Scanner;

class Questions {
    private int enterAresponse; // ответ
    private int correctAnswer = 0; // колличество правильных ответов
    private int wrongAnswer = 0; // колличество неправильных ответов
    private int num = 0; // хранение случайного индекса массива
    private static int numTitle = 0; // номер вопроса

    String[] arrayPtv = new String[116];  // массив для хранения вопросов по теме ПТВ
    String[] arraySuot = new String[36];  // массив для хранения вопросов по теме СУОТ
    Scanner scanner = new Scanner(System.in);  // вызов сканнера
    Random random = new Random(); // создаём рандомайзер

    public void beginTestPtv() {
        //  вывод 5 вопросов из списка через цикл по теме ПТВ
        for (int i = 0; i < 10; ++i) {

            // создаём переменную в которую заносим случайный индекс массива
            num = random.nextInt(arrayPtv.length);

            // выводим вопрос на экран в текстовом виде
            numTitle++;  // номер вопроса
            System.out.println("Вопрос №  " + numTitle + "\n");
            System.out.println(arrayPtv[num]);
            correctOrincorrectanswer(); // выводим ответ, верно или нет
        }
    }

    public void beginTestSuot() {
        //  вывод 5 вопросов из списка через цикл по теме СУОТ
        for (int i = 0; i < 10; ++i) {

            // создаём переменную в которую заносим случайный индекс массива
            num = random.nextInt(arraySuot.length);

            numTitle++;  // номер вопроса
            System.out.println("Вопрос №  " + numTitle + "\n");
            // выводим вопрос на экран в текстовом виде
            System.out.println(arraySuot[num]);
            correctOrincorrectanswer(); // выводим ответ, верно или нет
        }
    }

    /*вводим ответ в консоль
     если остаток от деления 1 и ввод 1 или остаток 0 и ввод 0 то правильно,
     остальное не правильно*/
    public void correctOrincorrectanswer() {
        System.out.print("Верно ли утверждение: 1 - да, 0 - нет ");
        enterAresponse = scanner.nextInt();
        if (num % 2 != 0 & num % 2 == enterAresponse || num % 2 == 0 & num % 2 == enterAresponse) {
            correctAnswer++;
            System.out.println(" - верно \n========================================================= ");
        } else {
            wrongAnswer++;
            System.out.println(" - не верно \n=========================================================");
        }
    }

    public void getStatistic() {
        // получаем и выводим статистику по ответам
        System.out.print("Правильных ответов: " + getCorrectAnswer()
                + " Неправильных ответов: " + getWrongAnswer());
        System.out.println();
    }

    public static void getInfoOfWorkProgramm() {
        System.out.println("Вопросы задаются в форме утверждения, нужно определить верно ли оно" +
                " и выбрать соответствующий ответ.");
    }


    // геттер для правильного ответа
    public int getCorrectAnswer() {
        return correctAnswer;
    }

    // геттер для неправильного ответа
    public int getWrongAnswer() {
        return wrongAnswer;
    }
}



