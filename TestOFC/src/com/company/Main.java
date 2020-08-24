package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Questions ask = new Questions();
        Questions get = new Questions();
        Scanner scan = new Scanner(System.in);  // вызов сканнера

        int exit = 1;  // переменная для выхода

        //  цикл, пока не нажмём ноль, программа работает
        while (exit != 0) {
            //  вывод 10 вопросов из списка
            for (int cycle = 0; cycle < 5; cycle++) {
                ask.zeroQuestion();

                ask.fifthQuestion();
                get.anAnswer();
                ask.secondQuestion();
                ask.threeQuestion();
                ask.fourthQuestion();
                ask.firstQuestion();
            }

            // проверка ввода, выход или продолжение программы
            System.out.println("Продолжить: 1, Выход: 0.");
            exit = scan.nextInt();
        }


    }
}
