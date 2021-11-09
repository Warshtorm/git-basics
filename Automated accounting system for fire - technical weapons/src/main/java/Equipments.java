package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Equipments implements Equipment {

    public static final int SERVICE_PERIOD_IN_MONTHS = 6;
    protected final String NUMBER_TEXT = "Номер";
    protected final String INVENTORY_NUMBER_TEXT = "Инвентарный номер";
    protected final String DEVICE_NAME_TEXT = "Название";
    protected final String MANUFACTURER_TEXT = "Завод изготовитель";
    protected final String CLASS_DEVICE_TEXT = "Класс";
    protected final String TYPE_DEVICE_TEXT = "Тип";
    protected final String DATE_OF_MANUFACTURE_TEXT = "Дата выпуска";
    protected final String WORKING_PRESSURE_TEXT = "Рабочее давление, мПа";
    protected final String WATER_CONSUMPTION_TEXT = "Расход воды/расствора, литра(ов)";
    protected final String CURTAIN_ANGLE_TEXT = "Угол защиты, градуса(ов)";
    protected final String CURTAIN_DIAMETR_TEXT = "Диаметр факела защитной завесы, метра(ов)";
    protected final String WATER_JETRANGE_TEXT = "Дальность водяной струи, метра(ов)";
    protected final String WATER_SPRAY_JET_RANGE_TEXT = "Дальность водяной, расспыленной струи, метра(ов)";
    protected final String FOAM_JET_RANGE_TEXT = "Дальность пенной струи, метра(ов)";
    protected final String FOAM_MULTIPLICITY_TEXT = "Кратность пены";
    protected final String DEVICE_WEIGHT_TEXT = "Вес, кг";
    protected final String DEVICE_SIZE_TEXT = "Размер";
    protected final String NONE_MANUFACTURER_TEXT = "none";
    protected final String NONE_TU_TEXT = "none";

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
    protected LocalDate currentServiceDate = LocalDate.now();
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
