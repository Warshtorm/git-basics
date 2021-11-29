package main.java.firehoses;

public class Hose150 extends Firehose {
    public Hose150() {
        count++;
        deviceId += Firehose.count;
        deviceNumber = 0;
        deviceInventoryNumber = "1222";
        deviceName = HOSE_150_TEXT;
        deviceTU = "none";
        deviceType = "напорный";
        deviceManufacturer = "none";

        waterSkipping = 100.0;
        deviceWaterConsumption = "10.8";
        volume = 350;
        resistanceOfOneHose = 0.00046;
        lossOfPressureInOneHose = 3.5;
        deviceWorkingPressure = "1,2";
        testPressure = 15;
        destructivePressure = 24;
        speedOfTheWaterMovementOfHose = "1 - 3";


        deviceWeight = 24;
        deviceLength = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public String getDeviceInformation() {
        return "Рукав напорный \"\"Стандарт\"\", \n150 мм - под рукавную головку ГР-150";
    }
}
