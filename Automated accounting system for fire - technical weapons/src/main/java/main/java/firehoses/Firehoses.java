package main.java.firehoses;

import main.java.Equipments;
import java.time.LocalDate;

// TODO доработать поля и методы
public abstract class Firehoses extends Equipments {

    public final static String HOSE_51_TEXT = "Рукав напорный ДУ:51";
    public final static String HOSE_66_TEXT = "Рукав напорный ДУ:66";
    public final static String HOSE_77_TEXT = "Рукав напорный ДУ:77";
    public final static String HOSE_89_TEXT = "Рукав напорный ДУ:89";
    public final static String HOSE_150_TEXT = "Рукав напорный ДУ:150";

    protected double waterSkipping;
    protected int volume;
    protected double resistanceOfOneHose;
    protected double lossOfPressureInOneHose;
    protected int testPressure;
    protected int destructivePressure;
    protected String speedOfTheWaterMovementOfHose;



    public String allInformationAboutTheDevice() {
        return NUMBER_TEXT + ": ".concat(Integer.toString(deviceNumber))
                .concat("\n" + INVENTORY_NUMBER_TEXT + ": ").concat(deviceInventoryNumber)
                .concat("\n" + DEVICE_NAME_TEXT + ": ").concat(deviceName)
                .concat("\n" + MANUFACTURER_TEXT + ": ").concat(NONE_MANUFACTURER_TEXT)
                .concat("\n" + TYPE_DEVICE_TEXT + ": ").concat(deviceType)
                .concat("\n" + deviceTU)
                .concat("\n" + DATE_OF_MANUFACTURE_TEXT + ": ").concat(String.valueOf(dateOfManufacture))
                .concat("\n" + WORKING_PRESSURE_TEXT + ": ").concat(deviceWorkingPressure)
                .concat("\n" + WATER_CONSUMPTION_TEXT + ": ").concat(deviceWaterConsumption)
                .concat("\n" + DEVICE_WEIGHT_TEXT + ": ").concat(String.valueOf(deviceWeight))
                .concat("\n" + DEVICE_LENGHT_TEXT + ": ").concat(String.valueOf(deviceLength));
    }

    @Override
    public String toString(){
        return "Firehoses{" + "ID = " + deviceId + ", number = " + deviceNumber + ", Name = " + deviceName + '}';
    }

    public void setNextServiceDate(LocalDate nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }

    public void setCurrentServiceDate(LocalDate currentServiceDate) {
        this.currentServiceDate = currentServiceDate;
    }

    public void setDeviceNumber(int deviceNumber){
        this.deviceNumber = deviceNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.deviceInventoryNumber = inventoryNumber;
    }

    public void setDeviceTU(String deviceTU) {
        this.deviceTU = deviceTU;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setPreviousServiceDate(LocalDate previousServiceDate) {
        this.previousServiceDate = previousServiceDate;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public static int getFireHosesCount(){
        return count;
    }

    public int getId() {
        return deviceId;
    }

    public int getDeviceNumber() {
        return deviceNumber;
    }

    public String getInventoryNumber() {
        return deviceInventoryNumber;
    }


    public String getTypeDevice() {
        return deviceType;
    }

    public String getManufacturer() {
        return deviceManufacturer;
    }

    public String getWorkingPressure() {
        return deviceWorkingPressure;
    }

    public String getWaterConsumption() {
        return deviceWaterConsumption;
    }




}
