package main.java.equipments;

import lombok.Getter;
import lombok.Setter;
import main.java.equipments.Equip;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Equipment implements Equip {
    protected static int count; // счетчик, пока непонятно для чего
    protected DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Setter @Getter protected int id;
    @Setter @Getter protected int number;
    @Setter @Getter protected String inventoryNumber;
    @Setter @Getter protected String name;
    @Setter @Getter protected String tu;
    @Setter @Getter protected String manufacturer;
    @Setter @Getter protected String type;
    @Setter @Getter protected String clas;

    @Setter @Getter protected String workingPressure; //mPa
    @Setter @Getter protected String waterConsumption;

    @Setter @Getter protected double weight;
    @Setter @Getter protected String sizes;
    @Setter @Getter protected int length;

    protected LocalDate dateOfManufacture;
    @Setter @Getter protected LocalDate previousServiceDate;
    protected LocalDate currentServiceDate;
    protected LocalDate nextServiceDate;



    public LocalDate getDateOfManufacture() {
        if (dateOfManufacture == null){
            dateOfManufacture = LocalDate.now();
        }
        return dateOfManufacture;
    }

    public LocalDate getCurrentServiceDate() {
        if (currentServiceDate == null) {
            currentServiceDate = LocalDate.now();
        }
        if (currentServiceDate.equals(nextServiceDate)) {
            previousServiceDate = currentServiceDate;
            currentServiceDate = nextServiceDate;
        }
        return currentServiceDate;
    }

    public LocalDate getNextServiceDate() {
        nextServiceDate = currentServiceDate.plusMonths(SERVICE_PERIOD_IN_MONTHS);
        return nextServiceDate;
    }

}
