package main.java.equipments.firehoses;

public class Hose51 extends Firehose {

    public Hose51() {
        count++;
        id += Firehose.count;
        number = 0;
        inventoryNumber = "1222";
        name = HOSE_51_TEXT;
        tu = "none";
        type = "напорный";
        manufacturer = "none";

        waterSkipping = 11.0;
        waterConsumption = "2.04";
        volume = 40;
        resistanceOfOneHose = 0.13;
        lossOfPressureInOneHose = 13.5;
        workingPressure = "1.6";
        testPressure = 20;
        destructivePressure = 35;
        speedOfTheWaterMovementOfHose = "1 - 3";


        weight = 9;
        length = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public void getDeviceInformation() {
        System.out.println("Рукав напорный \"\"Стандарт\"\", \n51 мм - под рукавную головку ГР-50" +
                "\n Используются пожарной техникой, мотопомпами, и главное назначение - " +
                "\n подача воды пенообразователей под давлением на расстояние.");
    }


}
