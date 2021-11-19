package main.java.factory;

import main.java.Equip;
import main.java.firebarrels.*;


public class FireBarrelsConveyor implements Factory {

    private static FireBarrelsConveyor instance;

    public static FireBarrelsConveyor getInstance() {
        if (instance == null){
            instance = new FireBarrelsConveyor();
        }
        return instance;
    }

    @Override
    public Firebarrels createDevice(String device) {
            return switch (device) {
                case "sprk8" -> new Sprk8();
                case "sprk12" -> new Sprk12();
                case "sprk19" -> new Sprk19();
                case "sprk22" -> new Sprk22();
                default -> throw new RuntimeException("Объекта " + device + " не существует, или неверный ввод! ");
            };
    }
}