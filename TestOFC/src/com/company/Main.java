package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        QuestionsPtv get = new QuestionsPtv();
        Scanner scan = new Scanner(System.in);  // вызов сканнера

        int exit = 1;  // переменная для выхода

        //  цикл, пока не нажмём ноль, остаёмся в программе и работаем
        while (exit != 0) {
            get.beginTest();
            // проверка ввода, выход или продолжение программы
            System.out.println("Продолжить: 1, Выход: 0.");
            exit = scan.nextInt();
        }


    }

}
