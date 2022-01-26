package com.equipments.firehoses;

public class Hose77 extends Firehose {
    public Hose77() {
        count++;
        id += Firehose.count;
        number = 0;
        inventoryNumber = "1222";
        name = HOSE_77_TEXT;
        tu = "none";
        type = "напорный";
        manufacturer = "none";

        waterSkipping = 23.5;
        waterConsumption = "2.04";
        volume = 90;
        resistanceOfOneHose = 0.015;
        lossOfPressureInOneHose = 8.2;
        workingPressure = "1.6";
        testPressure = 20;
        destructivePressure = 35;
        speedOfTheWaterMovementOfHose = "1 - 3";


        weight = 13;
        length = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public void getDeviceInformation() {
        System.out.println("Рукав напорный \"\"Стандарт\"\", \n77 мм - под рукавную головку ГР-80");
    }
}
