package com.company;

import java.util.Scanner;

public class Questions {

    String[] array = new String[10];  //массив для хранения вопросов
    Scanner scan = new Scanner(System.in);  // вызов сканнера



    public Questions() {
        array[0] = "Длина струи пожарного ствола СПРК-8Б - 25 метров.";
        array[1] = "Длина струи пожарного ствола СПРК-8Б - 35 метров.";
        array[2] = "Производительность ГПС-600 составляет - 600 л.с.";
        array[3] = "Производительность ГПС-600 составляет - 500 л.с.";
        array[4] = "СПРК - ствол пожарный, ручной, комбинированный";
        array[5] = "СПРК - ствол пожарный, разной кратности";
        array[6] = "СПРК - ствол пожарный, разной кратности";
        array[7] = "СПРК - ствол пожарный, разной кратности";
        array[8] = "СПРК - ствол пожарный, разной кратности";
        array[9] = "СПРК - ствол пожарный, разной кратности";
    }

    // через методы выводим вопросы под номерами
    public void zeroQuestion() {
        System.out.println("Верно утверждение? Да - 1: Нет - 0 " + array[0]);
        

    }

    public void firstQuestion() {
        System.out.println(array[1]);
    }

    public void secondQuestion() {
        System.out.println(array[2]);
    }

    public void threeQuestion() {
        System.out.println(array[3]);
    }

    public void fourthQuestion() {
        System.out.println(array[4]);
    }

    public void fifthQuestion() {
        System.out.println(array[5]);
    }

    // вводим ответ в консоль
    public  void anAnswer(){

    }
}
