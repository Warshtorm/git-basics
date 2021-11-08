package main.java;

import java.time.LocalDate;

public abstract class Equipments implements Equipment {
    public final int SERVICE_PERIOD_IN_MONTHS = 6;

    protected int id;
    protected int deviceNumber;
    protected String inventoryNumber;
    protected String deviceName;
    protected String deviceTU;
    protected String manufacturer;

    protected double deviceWeight;
    protected String deviceSizes;

    protected LocalDate tempDate;
    protected LocalDate dateOfManufacture;
    protected LocalDate previousServiceDate;
    protected LocalDate currentServiceDate;
    protected LocalDate nextServiceDate;




}
