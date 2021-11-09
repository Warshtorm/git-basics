package main.java.firehoses;

import main.java.Equipments;

public abstract class Firehoses extends Equipments {
    protected static int hosesCount; // счетчик, пока непонятно для чего

    public final static String PRESSURE_HOSE_51_TEXT = "Рукав напорный ДУ:51";
    public final static String PRESSURE_HOSE_66_TEXT = "Рукав напорный ДУ:66";
    public final static String PRESSURE_HOSE_77_TEXT = "Рукав напорный ДУ:77";
    public final static String PRESSURE_HOSE_89_TEXT = "Рукав напорный ДУ:89";
    public final static String PRESSURE_HOSE_150_TEXT = "Рукав напорный ДУ:150";



    public String allInformationAboutTheDevice() {
        return NUMBER_TEXT + ": ".concat(Integer.toString(deviceNumber))
                .concat("\n" + INVENTORY_NUMBER_TEXT + ": ").concat(inventoryNumber)
                .concat("\n" + DEVICE_NAME_TEXT + ": ").concat(deviceName)
                .concat("\n" + MANUFACTURER_TEXT + ": ").concat(NONE_MANUFACTURER_TEXT)
                .concat("\n" + CLASS_DEVICE_TEXT + ": ").concat(classDevice)
                .concat("\n" + TYPE_DEVICE_TEXT + ": ").concat(typeDevice)
                .concat("\n" + deviceTU)
                .concat("\n" + DATE_OF_MANUFACTURE_TEXT + ": ").concat(String.valueOf(dateOfManufacture))
                .concat("\n" + WORKING_PRESSURE_TEXT + ": ").concat(workingPressure)
                .concat("\n" + WATER_CONSUMPTION_TEXT + ": ").concat(waterConsumption)
                .concat("\n" + DEVICE_WEIGHT_TEXT + ": ").concat(String.valueOf(deviceWeight))
                .concat("\n" + DEVICE_SIZE_TEXT + ": ").concat(deviceSizes);
    }

}
