package com.company;

import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        Ptv ptvQuestion = new Ptv();
        Suot suotQuestion = new Suot();
        Scanner scan = new Scanner(System.in);  // вызов сканнера

        int exit = 1;  // переменная для выхода

        //  цикл, пока не нажмём ноль, остаёмся в программе и работаем
        while (exit != 0) {

                ptvQuestion.beginTestPtv(); // начинаем тест

            // получаем и выводим статистику по ответам
            System.out.print("Правильных ответов: " + ptvQuestion.getCorrectAnswer()
                    + " Неправильных ответов: " + ptvQuestion.getWrongAnswer());
            System.out.println();

            // проверка ввода, выход или продолжение программы
            System.out.println("Продолжить: 1, Выход: 0.");
            exit = scan.nextInt();
        }


    }

}