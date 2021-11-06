package main.java;

import java.time.format.DateTimeFormatter;

/**Интерфейс Equipments объединяет в себе все устройства*/
@FunctionalInterface
public interface Equipment {
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    String getDeviceInformation();
}
