package com.example.models;

import com.example.equipments.Equip;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public abstract class Equipment implements Equip {
    protected static Long count; // счетчик, пока непонятно для чего

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected int number;
    protected String inventoryNumber;
    protected String name;
    protected String tu;
    protected String manufacturer;
    protected String type;
    protected String clas;

     protected String workingPressure; //mPa
     protected String waterConsumption;

     protected double weight;
     protected String sizes;
     protected int length;

    protected LocalDate dateOfManufacture;
     protected LocalDate previousServiceDate;
    protected LocalDate currentServiceDate;
    protected LocalDate nextServiceDate;



    public LocalDate getDateOfManufacture() {
        if (dateOfManufacture == null){
            dateOfManufacture = LocalDate.now();
        }
        return dateOfManufacture;
    }

    public LocalDate getCurrentServiceDate() {
        if (currentServiceDate == null) {
            currentServiceDate = LocalDate.now();
        }
        if (currentServiceDate.equals(nextServiceDate)) {
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
