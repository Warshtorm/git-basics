package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Equipments implements EquipInfo {
    protected static int equipmentsCount; // счетчик, пока непонятно для чего

    protected int id;
    protected int deviceNumber;
    protected String inventoryNumber;
    protected String deviceName;
    protected String deviceTU;
    protected String manufacturer;
    protected String typeDevice;
    protected String classDevice;
    protected String workingPressure;
    protected String waterConsumption;

    protected double deviceWeight;
    protected String deviceSizes;

    protected LocalDate dateOfManufacture;
    protected LocalDate previousServiceDate;
    protected LocalDate currentServiceDate;
    protected LocalDate nextServiceDate;
    protected DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public LocalDate getDateOfManufacture() {
        if (dateOfManufacture == null){
            dateOfManufacture = LocalDate.now();
        }
        return dateOfManufacture;
    }

    public LocalDate getPreviousServiceDate() {
        return previousServiceDate;
    }

    public LocalDate getCurrentServiceDate() {
            currentServiceDate = LocalDate.now();
         if (currentServiceDate.equals(nextServiceDate)){
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
