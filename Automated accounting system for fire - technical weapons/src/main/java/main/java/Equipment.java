package main.java;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Equipment implements Equip {
    protected static int count; // счетчик, пока непонятно для чего
    protected DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Setter @Getter protected int deviceId;
    @Setter @Getter protected int deviceNumber;
    @Setter @Getter protected String deviceInventoryNumber;
    @Setter @Getter protected String deviceName;
    @Setter @Getter protected String deviceTU;
    @Setter @Getter protected String deviceManufacturer;
    @Setter @Getter protected String deviceType;
    @Setter @Getter protected String deviceClass;

    @Setter @Getter protected String deviceWorkingPressure; //mPa
    @Setter @Getter protected String deviceWaterConsumption;

    @Setter @Getter protected double deviceWeight;
    @Setter @Getter protected String deviceSizes;
    @Setter @Getter protected int deviceLength;

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
