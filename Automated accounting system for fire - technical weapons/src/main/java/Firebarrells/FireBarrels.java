package main.java.Firebarrells;

import main.java.Equipments;
import java.time.LocalDate;

/**Класс FireBarrels объединяет в себе все пожарные стволы
 * их  параметры и методы*/
public abstract class FireBarrels implements Equipments {

    protected  String sprkManufacturerText = "Великолукский завод \"ТРАНСНЕФТЕМАШ\", Россия, " +
            "\n182100, Псковская область, город Великие Луки, улица Гоголя дом 2 ";
    protected String sprkCurtainAngleText = "0 - 120";
    protected int sprkCurtainDiameterText = 3;
    protected static int count; // счетчик

    protected int id; /*идентификатор*/
    protected int deviceNumber; // номер
    protected String inventoryNumber; // инвентарный номер
    protected String deviceName; // название
    protected String deviceTU; // пример
    protected char deviceType; // тип: пример Тип - А, Тип - В
    protected String manufacturer;

    /*Рабочие харрактеристики*/
    /**рабочее давление, мПа (1мПа = 10 атмосфер)*/
    protected String workingPressure;
    /**расход воды / расствора, л.с*/
    protected String waterConsumption;
    /**дальность водяной струи, Mетров*/
    protected int waterJetrange; //
    /**дальность водяной, расспыленной струи, Mетров*/
    protected int waterSprayJetRange;
    /**дальность пенной струи, Mетров*/
    protected int foamJetRange;
    /**кратность пены*/
    protected double foamMultiplicity;
    /**угол защитной завесы в градусах*/
    protected String curtainAngle;
    protected int  curtainDiameter;

    /*физические харрактеристики*/
    protected double deviceWeight; // масса, кг
    protected String sizes; // размеры

    /*дата изготовления, ремонта (предыдущего ремонта), обслуживания (предыдущего обслуживания)
     * и последующие*/
    protected LocalDate dateOfmanufacture; // дата изготовления
    protected LocalDate testDate; // дата испытания
    protected LocalDate previousTestDate; // дата последнего испытания
    protected LocalDate nextTestDate; // дата следующего испытания

    public String getDeviceName() {
        return deviceName;
    }

    public int getId() {
        return id;
    }

    public int getDeviceNumber() {
        return deviceNumber;
    }

    public String allInformationAboutTheDevice() {
        return  "Номер: ".concat(Integer.toString(deviceNumber))
                .concat("\nИнвентарный номер: ").concat(inventoryNumber)
                .concat("\nНазвание: ").concat(deviceName)
                .concat("\nЗавод изготовитель: ").concat(sprkManufacturerText)
                .concat("\n" + deviceTU)
                .concat("\nДата выпуска: ").concat(String.valueOf(dateOfmanufacture))
                .concat("\nРабочее давление: ").concat(workingPressure)
                .concat("\nРасход воды/расствора: ").concat(waterConsumption)
                .concat("\nУгол защиты: ").concat(curtainAngle)
                .concat("\nДиаметр факела защитной завесы: ").concat(String.valueOf(curtainDiameter))
                .concat("\nДальность водяной струи: ").concat(String.valueOf(waterJetrange))
                .concat("\nДальность водяной, расспыленной струи: ").concat(String.valueOf(waterSprayJetRange))
                .concat("\nДальность пенной струи: ").concat(String.valueOf(foamJetRange))
                .concat("\nКратность пены: ").concat(String.valueOf(foamMultiplicity))
                .concat("\nВес: ").concat(String.valueOf(deviceWeight))
                .concat("\nРазмеры: ").concat(sizes);

    }

}
