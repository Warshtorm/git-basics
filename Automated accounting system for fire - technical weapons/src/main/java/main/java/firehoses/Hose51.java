package main.java.firehoses;

public class Hose51 extends Firehose {

    public Hose51() {
        count++;
        deviceId += Firehose.count;
        deviceNumber = 0;
        deviceInventoryNumber = "1222";
        deviceName = HOSE_51_TEXT;
        deviceTU = "none";
        deviceType = "напорный";
        deviceManufacturer = "none";

        waterSkipping = 11.0;
        deviceWaterConsumption = "2.04";
        volume = 40;
        resistanceOfOneHose = 0.13;
        lossOfPressureInOneHose = 13.5;
        deviceWorkingPressure = "1.6";
        testPressure = 20;
        destructivePressure = 35;
        speedOfTheWaterMovementOfHose = "1 - 3";


        deviceWeight = 9;
        deviceLength = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public String getDeviceInformation() {
        return "Рукав напорный \"\"Стандарт\"\", \n51 мм - под рукавную головку ГР-50" +
                "\n Используются пожарной техникой, мотопомпами, и главное назначение - " +
                "\n подача воды пенообразователей под давлением на расстояние.";
    }


}
