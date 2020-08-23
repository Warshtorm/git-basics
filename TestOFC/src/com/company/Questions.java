package com.company;

import java.util.Scanner;

public class Questions {

    boolean response;  // переменная для сравнения ответа
    String[] array = new String[10];  //массив для вопросов
    Scanner scan = new Scanner(System.in);  // вызов сканнера

    // через методы выводим вопросы под номерами
    public void zeroQuestion() {
        array[0] = "Длина струи пожарного ствола СПРК-8Б 25 метров.";
        response = true;
        System.out.println(array[0]);
        scannerResponse();
    }

    public void firstQuestion() {
        array[1] = "Длина струи пожарного ствола СПРК-8Б 35 метров.";
        response = false;
        System.out.println(array[1]);
    }

    public void secondQuestion() {
        array[2] = "";
        response = false;
        System.out.println(array[2]);
    }

    public void threeQuestion() {
        array[3] = "";
        response = true;
        System.out.println(array[3]);
    }

    public void fourthQuestion() {
        array[4] = "";
        response = false;
        System.out.println(array[4]);
    }

    public void fifthQuestion() {
        array[5] = "";
        response = true;
        System.out.println(array[5]);
    }

    //метод для ввода ответа на вопрос
    public void scannerResponse() {
            System.out.println("Верно утверждение? Да - 1: Нет - 0 ");
            int response = scan.nextInt();
        }
    }
