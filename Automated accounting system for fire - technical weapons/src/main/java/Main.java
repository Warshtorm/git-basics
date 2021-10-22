package main.java;
import main.java.Firebarrells.*;

public class Main {

    public static void main(String[] args) {


        //FireBarrels sprk = new Sprk8();
        //FireBarrels sprk = new Sprk12();
        //FireBarrels sprk = new Sprk19();
       FireBarrels sprk = new Sprk22();

        System.out.println(sprk.allInformationAboutTheDevice());
        System.out.println();

        String s = sprk.getDeviceInformation();
        System.out.println(s);
    }




}
