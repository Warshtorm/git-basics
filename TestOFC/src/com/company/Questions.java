package com.company;

import java.util.Scanner;

public class Questions {

    boolean response;  // переменная для сравнения ответа
    String[] array = new String[10];  //массив для хранения вопросов
    Scanner scan = new Scanner(System.in);  // вызов сканнера

    public Questions(){
        array[0] = "Длина струи пожарного ствола СПРК-8Б 25 метров.";
        array[1] = "Длина струи пожарного ствола СПРК-8Б 35 метров.";
        array[2] = "Вопрос";
        array[3] = "Вопрос";
        array[4] = "Вопрос";
        array[5] = "Вопрос";
    }

    // через методы выводим вопросы под номерами
    public void zeroQuestion() {
        System.out.println(array[0]);
        response = true;
        scannerResponse();
    }

    public void firstQuestion() {
        System.out.println(array[1]);
        response = false;
        scannerResponse();
    }

    public void secondQuestion() {
        System.out.println(array[2]);
        response = false;
        scannerResponse();
    }

    public void threeQuestion() {
        System.out.println(array[3]);
        response = true;
        scannerResponse();
    }

    public void fourthQuestion() {
        System.out.println(array[4]);
        response = false;
        scannerResponse();
    }

    public void fifthQuestion() {
        System.out.println(array[5]);
        response = true;
        scannerResponse();
    }

    //метод для ввода ответа на вопрос
    public void scannerResponse() {
            System.out.println("Верно утверждение? Да - 1: Нет - 0 ");
            int response = scan.nextInt();
        }
    }
