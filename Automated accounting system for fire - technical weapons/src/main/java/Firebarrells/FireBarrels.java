package main.java.Firebarrells;

import main.java.Equipments;
import java.time.LocalDate;

/**Класс FireBarrels объединяет в себе все пожарные стволы
 * и их  параметры */
public abstract class FireBarrels implements Equipments {

    protected static int count;

    protected int id; /*идентификатор*/
    protected int deviceNumber; // номер
    protected String deviceName; // название
    protected String deviceTU; // пример
    protected char deviceType; // тип: пример Тип - А, Тип - В
    protected String manufacturer; // завод изготовитель

    /*Рабочие харрактеристики*/
    /**рабочее давление, мПа*/
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

    /*физические харрактеристики*/
    protected double deviceWeight; // масса, кг

    /*дата изготовления, ремонта (предыдущего ремонта), обслуживания (предыдущего обслуживания)
     * и последующие*/
    protected LocalDate dateOfmanufacture; // дата изготовления
    protected LocalDate testDate; // дата испытания
    protected LocalDate previousTestDate; // дата последнего испытания
    protected LocalDate nextTestDate; // дата следующего испытания

    @Override
    public String toString() {
        return "Номер ствола: "
                .concat(Integer.toString(deviceNumber))
                .concat("\nНазвание: ")
                .concat(deviceName)
                .concat("\nЗавод изготовитель: ")
                .concat(manufacturer)
                .concat("\nДата выпуска: ")
                .concat(String.valueOf(dateOfmanufacture))
                .concat("\nДата испытания: " + testDate)
                .concat("\nРабочее давление: " + workingPressure)
                .concat("\nРасход воды/расствора: " + waterConsumption)
                .concat("\nДальность водяной струи: " + waterJetrange)
                .concat("\nДальность водяной, расспыленной струи: " + waterSprayJetRange)
                .concat("\nДальность пенной струи: " + foamJetRange)
                .concat("\nКратность пены: " + foamMultiplicity)
                .concat("\nВес: " + deviceWeight);
    }

}
