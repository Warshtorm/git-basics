package com.company;

import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        int inputExit = 1;  // переменная для выхода

        Ptv ptvQuestion = new Ptv();  // ссылка на вопросы птв
        Suot suotQuestion = new Suot(); // ссылка на вопросы суот
        Scanner scan = new Scanner(System.in);  // вызов сканнера

        //  цикл, пока не нажмём ноль, остаёмся в программе и работаем
        while (inputExit != 0) {

            Loader.startMenu(); //  стартуем меню программы
            int switchChoice = scan.nextInt();
            switch (switchChoice) {
                case 1: {
                    ptvQuestion.beginTestPtv(); // начинаем тест по теме ПТВ
                    ptvQuestion.getStatistic(); // получаем и выводим статистику по ответам
                }
                break;

                case 2: {
                    suotQuestion.beginTestSuot(); // начинаем тест по теме СУОТ
                    suotQuestion.getStatistic(); // получаем и выводим статистику по ответам
                }
                break;

                case 3: {
                    Questions.getInfoOfWorkProgramm(); // руководство по работе с программой
                }
                break;
                default: {
                    System.out.println("Ошибка выбора в меню, повторите попытку... ");
                }
            }
            // проверка ввода, выход или продолжение программы
            System.out.println("Продолжить: 1, Выход: 0.");
            inputExit = scan.nextInt();
        }
    }

    public static void startMenu() {
        System.out.println("Вы находитесь в меню программы: " +
                "\n - Нажмите 1 + Enter для начала теста по теме ПТВ " +
                "\n - Нажмите 2 + Enter для начала теста по СУОТ" +
                "\n - Нажмите 3 + Enter для получения информации по работе с программой  " +
                "\n Ввод :");

    }
}
