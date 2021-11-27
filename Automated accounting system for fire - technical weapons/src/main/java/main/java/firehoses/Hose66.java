package main.java.firehoses;

public class Hose66 extends Firehoses{
    public Hose66(){
        count++;
        deviceId += Firehoses.count;
        deviceNumber = 0;
        deviceInventoryNumber = "1222";
        deviceName = HOSE_66_TEXT;
        deviceTU = "none";
        deviceType = "напорный";
        deviceManufacturer = "none";

        waterSkipping = 17.0;
        deviceWaterConsumption = "3.42";
        volume = 70;
        resistanceOfOneHose = 0.035;
        lossOfPressureInOneHose = 9.9;
        deviceWorkingPressure = "16";
        testPressure = 20;
        destructivePressure = 35;
        speedOfTheWaterMovementOfHose = "1 - 3";


        deviceWeight = 11;
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
