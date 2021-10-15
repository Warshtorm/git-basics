package main.java.Firebarrells;

import main.java.Equipments;

import java.time.LocalDate;

public abstract class FireBarrels implements Equipments {

    protected int id; // идентификатор
    protected int deviceNumber; // номер
    protected String deviceName; // название
    protected String deviceTU; // пример
    protected char deviceType; // тип: пример Тип - А, Тип - В
    protected String manufacturer; // завод изготовитель

    /*Рабочие харрактеристики*/
    protected String workingPressure; // рабочее давление, мПа
    protected String waterConsumption; // расход воды / расствора: 2,4,6,8 л.с
    protected int waterJetrange; // дальность водяной струи, M
    protected int waterSprayJetRange; // дальность водяной, расспыленной струи, M
    protected int foamJetRange; // дальность пенной струи, M
    protected double foamMultiplicity; // кратность пены

    /*физические харрактеристики*/
    protected double deviceWeight; // масса, кг

    /*дата изготовления, ремонта (предыдущего ремонта), обслуживания (предыдущего обслуживания)
     * и последующие*/
    protected LocalDate dateOfmanufacture; // дата изготовления
    protected LocalDate testDate; // дата тех. обслуживания, испытания

    @Override
    public String toString(){
        return "Номер ствола: "
                .concat(Integer.toString(deviceNumber)) + "\nНазвание: "
                .concat(deviceName) + "\nЗавод изготовитель: "
                .concat(manufacturer) + "\nДата выпуска: "
                .concat(String.valueOf(dateOfmanufacture));

    }

}
