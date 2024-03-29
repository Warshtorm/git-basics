package com.models.firehoses;

import com.models.Equipment;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Setter
@Getter
@Entity
public  class Firehose extends Equipment {

    public final static String HOSE_51_TEXT = "Рукав напорный ДУ:51";
    public final static String HOSE_66_TEXT = "Рукав напорный ДУ:66";
    public final static String HOSE_77_TEXT = "Рукав напорный ДУ:77";
    public final static String HOSE_89_TEXT = "Рукав напорный ДУ:89";
    public final static String HOSE_150_TEXT = "Рукав напорный ДУ:150";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected double waterSkipping;
    protected int volume;
    protected double resistanceOfOneHose;
    protected double lossOfPressureInOneHose;
    protected int testPressure;
    protected double destructivePressure; // mPa
    protected String speedOfTheWaterMovementOfHose;

    public Firehose(){

    }

    public Firehose(String name, int number){
        this();
        this.number = number;
        this.name = name;
    }




    public void allInformationAboutTheDevice() {
        System.out.println(NUMBER_TEXT + ": ".concat(Integer.toString(number))
                .concat("\n" + INVENTORY_NUMBER_TEXT + ": ").concat(inventoryNumber)
                .concat("\n" + DEVICE_NAME_TEXT + ": ").concat(name)
                .concat("\n" + MANUFACTURER_TEXT + ": ").concat(NONE_MANUFACTURER_TEXT)
                .concat("\n" + TYPE_DEVICE_TEXT + ": ").concat(type)
                .concat("\n" + tu)
                .concat("\n" + DATE_OF_MANUFACTURE_TEXT + ": ").concat(String.valueOf(dateOfManufacture))
                .concat("\n" + WORKING_PRESSURE_TEXT + ": ").concat(workingPressure)
                .concat("\n" + WATER_CONSUMPTION_TEXT + ": ").concat(waterConsumption)
                .concat("\n" + DEVICE_WEIGHT_TEXT + ": ").concat(String.valueOf(weight))
                .concat("\n" + DEVICE_LENGHT_TEXT + ": ").concat(String.valueOf(length)));
    }

    @Override
    public void getDeviceInformation() {

    }

    @Override
    public String toString(){
        return "Firehoses{" + "ID = " + id + ", number = " + number + ", Name = " + name + '}';
    }



}

