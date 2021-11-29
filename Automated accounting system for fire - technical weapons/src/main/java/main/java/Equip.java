package main.java;

@FunctionalInterface
public interface Equip {
     int SERVICE_PERIOD_IN_MONTHS = 6;
     String NUMBER_TEXT = "Номер";
     String INVENTORY_NUMBER_TEXT = "Инвентарный номер";
     String DEVICE_NAME_TEXT = "Название";
     String MANUFACTURER_TEXT = "Завод изготовитель";
     String CLASS_DEVICE_TEXT = "Класс";
     String TYPE_DEVICE_TEXT = "Тип";
     String DATE_OF_MANUFACTURE_TEXT = "Дата выпуска";
     String WORKING_PRESSURE_TEXT = "Рабочее давление, мПа";
     String WATER_CONSUMPTION_TEXT = "Расход воды/расствора, литра(ов)";
     String CURTAIN_ANGLE_TEXT = "Угол защиты, градуса(ов)";
     String CURTAIN_DIAMETR_TEXT = "Диаметр факела защитной завесы, метра(ов)";
     String WATER_JETRANGE_TEXT = "Дальность водяной струи, метра(ов)";
     String WATER_SPRAY_JET_RANGE_TEXT = "Дальность водяной, расспыленной струи, метра(ов)";
     String FOAM_JET_RANGE_TEXT = "Дальность пенной струи, метра(ов)";
     String FOAM_MULTIPLICITY_TEXT = "Кратность пены";
     String DEVICE_WEIGHT_TEXT = "Вес, кг";
     String DEVICE_SIZE_TEXT = "Размер";
     String DEVICE_LENGHT_TEXT = "Длина, метра(ов)";
     String NONE_MANUFACTURER_TEXT = "none";
     String NONE_TEXT = "  none";

     String getDeviceInformation();

}
