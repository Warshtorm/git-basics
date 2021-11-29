package main.java.firehoses;

public class Hose77 extends Firehose {
    public Hose77() {
        count++;
        deviceId += Firehose.count;
        deviceNumber = 0;
        deviceInventoryNumber = "1222";
        deviceName = HOSE_77_TEXT;
        deviceTU = "none";
        deviceType = "напорный";
        deviceManufacturer = "none";

        waterSkipping = 23.5;
        deviceWaterConsumption = "2.04";
        volume = 90;
        resistanceOfOneHose = 0.015;
        lossOfPressureInOneHose = 8.2;
        deviceWorkingPressure = "1.6";
        testPressure = 20;
        destructivePressure = 35;
        speedOfTheWaterMovementOfHose = "1 - 3";


        deviceWeight = 13;
        deviceLength = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public String getDeviceInformation() {
        return "Рукав напорный \"\"Стандарт\"\", \n77 мм - под рукавную головку ГР-80";
    }
}
