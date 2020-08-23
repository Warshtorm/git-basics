package com.company;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean response;  // переменная для сравнения ответа
        String[] array = new String[100];  //массив для вопросов
        Scanner scan = new Scanner(System.in);  // ввод в консоль ответа



        array[0] = "Длина струи пожарного ствола СПРК-8Б 25 метров.";
        response = true;
        System.out.println(array[0]);

        array[1] = "Длина струи пожарного ствола СПРК-8Б 35 метров.";
        response = false;
        System.out.println(array[1]);
        array[2] = "";
        response = false;
        System.out.println(array[2]);
        array[3] = "";
        response = true;
        System.out.println(array[3]);
        array[4] = "";
        response = false;
        System.out.println(array[4]);
        array[5] = "";
        response = true;
        System.out.println(array[5]);


    
    }
}
