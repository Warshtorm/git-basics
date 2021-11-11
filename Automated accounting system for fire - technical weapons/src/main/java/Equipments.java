package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Equipments implements EquipInfo {
    protected static int equipmentsCount; // счетчик, пока непонятно для чего

    protected int deviceId;
    protected int deviceNumber;
    protected String deviceInventoryNumber;
    protected String deviceName;
    protected String deviceTU;
    protected String deviceManufacturer;
    protected String deviceType;
    protected String deviceClass;
    protected String deviceWorkingPressure;
    protected String deviceWaterConsumption;

    protected double deviceWeight;
    protected String deviceSizes;
    protected int deviceLength;

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

    public void setDeviceTU(String deviceTU) {
        if (!deviceTU.equals(null)) {
            this.deviceTU = deviceTU;
        }
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    //TODO доработать возврат ТУ
    public String getDeviceTU() {
        StringBuilder sb = new StringBuilder();
        return sb.append(deviceTU).replace(0,2,"TU").toString();
    }


}
