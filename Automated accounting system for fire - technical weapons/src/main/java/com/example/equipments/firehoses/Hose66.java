package com.example.equipments.firehoses;

public class Hose66 extends Firehose {
    public Hose66() {
        count++;
        id += Firehose.count;
        number = 0;
        inventoryNumber = "1222";
        name = HOSE_66_TEXT;
        tu = "none";
        type = "напорный";
        manufacturer = "none";

        waterSkipping = 17.0;
        waterConsumption = "3.42";
        volume = 70;
        resistanceOfOneHose = 0.035;
        lossOfPressureInOneHose = 9.9;
        workingPressure = "1,6";
        testPressure = 20;
        destructivePressure = 2.0;
        speedOfTheWaterMovementOfHose = "1 - 3";


        weight = 11;
        length = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public void getDeviceInformation() {
        System.out.println("Рукав напорный \"\"Стандарт\"\", \n66 мм - предназначены для передвижной " +
                "\nпожарной техники с целью подачи воды и водных растворов пенопреобразователей" +
                "\n на расстояние под давлением 1,6 мПа");
    }
}
