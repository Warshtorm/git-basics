package main.java.firebarrels;
import main.java.Equipments;

import java.time.LocalDate;

public abstract class Firebarrels extends Equipments{

    public final static String SPRK_8_TEXT = "СПРК-8Б";
    public final static String SPRK_12_TEXT = "СПРК-12А";
    public final static String SPRK_19_TEXT = "СПРК-19А-АД";
    public final static String SPRK_22_TEXT = "СПРК-22А-А";
    public final String SPRK_MANUFACTURER_TEXT = "Великолукский завод \"ТРАНСНЕФТЕМАШ\", Россия, " +
            "\n182100, Псковская область, город Великие Луки, улица Гоголя дом 2 ";
    public final String SPRK_DEFAULT_TU_TEXT = "ТУ 4854-032-00139181-2011";
    public final String SPRK_CURTAIN_ANGLE_TEXT = "0 - 120";
    protected final int SPRK_CURTAIN_DIAMETER_TEXT = 3;

    protected int waterJetrange; //
    protected int waterSprayJetRange;
    protected int foamJetRange;
    protected double foamMultiplicity;
    protected String curtainAngle;
    protected int curtainDiameter;

    public String allInformationAboutTheDevice() {
        return NUMBER_TEXT + ": ".concat(Integer.toString(deviceNumber))
                .concat("\n" + INVENTORY_NUMBER_TEXT + ": ").concat(deviceInventoryNumber)
                .concat("\n" + DEVICE_NAME_TEXT + ": ").concat(deviceName)
                .concat("\n" + MANUFACTURER_TEXT + ": ").concat(deviceManufacturer)
                .concat("\n" + CLASS_DEVICE_TEXT + ": ").concat(deviceClass)
                .concat("\n" + TYPE_DEVICE_TEXT + ": ").concat(deviceType)
                .concat("\n" + deviceTU)
                .concat("\n" + DATE_OF_MANUFACTURE_TEXT + ": ").concat(String.valueOf(getDateOfManufacture()))
                .concat("\n" + WORKING_PRESSURE_TEXT + ": ").concat(deviceWorkingPressure)
                .concat("\n" + WATER_CONSUMPTION_TEXT + ": ").concat(deviceWaterConsumption)
                .concat("\n" + CURTAIN_ANGLE_TEXT + ": ").concat(curtainAngle)
                .concat("\n" + CURTAIN_DIAMETR_TEXT + ": ").concat(String.valueOf(curtainDiameter))
                .concat("\n" + WATER_JETRANGE_TEXT + ": ").concat(String.valueOf(waterJetrange))
                .concat("\n" + WATER_SPRAY_JET_RANGE_TEXT + ": ").concat(String.valueOf(waterSprayJetRange))
                .concat("\n" + FOAM_JET_RANGE_TEXT + ": ").concat(String.valueOf(foamJetRange))
                .concat("\n" + FOAM_MULTIPLICITY_TEXT + ": ").concat(String.valueOf(foamMultiplicity))
                .concat("\n" + DEVICE_WEIGHT_TEXT + ": ").concat(String.valueOf(deviceWeight))
                .concat("\n" + DEVICE_SIZE_TEXT + ": ").concat(deviceSizes);
    }

    @Override
    public String toString(){
        return "Firebarrels{" + "ID = " + deviceId + ", number = " + deviceNumber + ", Name = " + deviceName + '}';
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


    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setPreviousServiceDate(LocalDate previousServiceDate) {
        this.previousServiceDate = previousServiceDate;
    }

    public static int getFirebarrelsCount(){
        return count;
    }

    public String getWorkingPressure() {
        return deviceWorkingPressure;
    }

    public String getWaterConsumption() {
        return deviceWaterConsumption;
    }

    public int getWaterJetrange() {
        return waterJetrange;
    }

    public int getWaterSprayJetRange() {
        return waterSprayJetRange;
    }

    public int getFoamJetRange() {
        return foamJetRange;
    }

    public double getFoamMultiplicity() {
        return foamMultiplicity;
    }

    public String getCurtainAngle() {
        return curtainAngle;
    }

    public int getCurtainDiameter() {
        return curtainDiameter;
    }

}
