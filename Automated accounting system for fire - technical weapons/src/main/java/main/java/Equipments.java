package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Equipments implements Equip {
    protected static int count; // счетчик, пока непонятно для чего

    protected int deviceId;
    protected int deviceNumber;
    protected String deviceInventoryNumber;
    protected String deviceName;
    protected String deviceTU;
    protected String deviceManufacturer;
    protected String deviceType;
    protected String deviceClass;
    protected String deviceWorkingPressure; //mPa
    protected String deviceWaterConsumption;

    protected double deviceWeight;
    protected String deviceSizes;
    protected int deviceLength;

    protected LocalDate dateOfManufacture;
    protected LocalDate previousServiceDate;
    protected LocalDate currentServiceDate;
    protected LocalDate nextServiceDate;
    protected DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public int getId() {
        return deviceId;
    }

    public int getDeviceNumber() {
        return deviceNumber;
    }

    public String getInventoryNumber() {
        return deviceInventoryNumber;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getTypeDevice() {
        return deviceType;
    }

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

    public void setDeviceTU(String deviceTU) {
        this.deviceTU = deviceTU;
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public String getDeviceTU() {
        return deviceTU += " TU" ;
    }

    public double getDeviceWeight() {
        return deviceWeight;
    }

    public String getDeviceSizes() {
        return deviceSizes;
    }



}
