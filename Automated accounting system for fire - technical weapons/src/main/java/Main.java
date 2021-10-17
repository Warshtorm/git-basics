package main.java;
import main.java.Firebarrells.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //FireBarrels sprk = new Sprk8();
        //FireBarrels sprk = new Sprk12();
        //FireBarrels sprk = new Sprk19();
        FireBarrels sprk = new Sprk22();

        System.out.println(sprk);
        System.out.println();

        String s = sprk.getDisplayInfo();
        System.out.println(s);
    }




}
