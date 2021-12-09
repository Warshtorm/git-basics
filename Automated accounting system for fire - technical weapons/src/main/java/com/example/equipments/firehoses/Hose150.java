package com.example.equipments.firehoses;

public class Hose150 extends Firehose {
    public Hose150() {
        count++;
        id += Firehose.count;
        number = 0;
        inventoryNumber = "1222";
        name = HOSE_150_TEXT;
        tu = "none";
        type = "напорный";
        manufacturer = "none";

        waterSkipping = 100.0;
        waterConsumption = "10.8";
        volume = 350;
        resistanceOfOneHose = 0.00046;
        lossOfPressureInOneHose = 3.5;
        workingPressure = "1,2";
        testPressure = 15;
        destructivePressure = 24;
        speedOfTheWaterMovementOfHose = "1 - 3";


        weight = 24;
        length = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public void getDeviceInformation() {
        System.out.println("Рукав напорный \"\"Стандарт\"\", \n150 мм - под рукавную головку ГР-150");
    }
}
