package com.company;

import java.util.Random;
import java.util.Scanner;

public class Questions {
    public int enterAresponse;

    String[] array = new String[10];  //массив для хранения вопросов
    Scanner scanner = new Scanner(System.in);  // вызов сканнера
    Random random = new Random();

    public Questions() {
        array[0] = "Длина струи пожарного ствола СПРК-8Б - 35 метров.";
        array[1] = "Длина струи пожарного ствола СПРК-8Б - 25 метров.";
        array[2] = "Производительность ГПС-600 составляет - 400 л.с.";
        array[3] = "Производительность ГПС-600 составляет - 600 л.с.";
        array[4] = "СПРК - ствол пожарный, разной, кратности";
        array[5] = "СПРК - ствол пожарный, ручной комбинированный";
        array[6] = "Рабочее давление СПРК-8Б составляет 0,6 мПа";
        array[7] = "Рабочее давление СПРК-8Б составляет 0,7 мПа";
        array[8] = "СВП - ствол водно - пенный";
        array[9] = "СВП - ствол воздушно - пенный";
    }

    //  вывод 10 вопросов из списка через цикл
    public void beginTest() {

        for (int cycle = 0; cycle < 5; cycle++) {

            // создаём переменную в которую заносим случайный индекс массива
            int num = random.nextInt(array.length);

            // выводим вопрос на экран в текстовом виде
            System.out.println();
            System.out.println(array[num]);

            // вводим ответ в консоль
            System.out.print("Верно ли утверждение: 1 - да, 0 - нет ");
            enterAresponse = scanner.nextInt();

            // если остаток от деления 1 и ввод 1 или остаток 0 и ввод 0 то правильно, остальное не правильно
            if (num % 2 != 0 & num % 2 == enterAresponse || num % 2 == 0 & num % 2 == enterAresponse) {
                System.out.println(" - правильно");
            } else
                System.out.println(" - не правильно");
        }
    }
}



