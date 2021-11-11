package main.java.firehoses;


// TODO доработать поля и методы
public class Hose51 extends Firehoses{

    public Hose51(){
        equipmentsCount++;
        deviceId += Firehoses.equipmentsCount;
        deviceNumber = 0;
        deviceInventoryNumber = "1222";
        deviceName = PRESSURE_HOSE_51_TEXT;
        deviceTU = "None";
        deviceType = "напорный";
        deviceManufacturer = "None";

        waterSkipping = 11;
        deviceWaterConsumption = "2.04";
        volume = 40;
        resistanceOfOneHose = 0.13;
        lossOfPressureInOneHose = 13.5;
        deviceWorkingPressure = "1";
        testPressure = 20;
        destructivePressure = 35;
        speedOfTheWaterMovementOfHose = "1 - 3";


        deviceWeight = 10   ;
        deviceLength = 20;

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public String getDeviceInformation() {
        return "Рукав напорный \"\"Стандарт\"\", \n51 мм - под рукавную головку ГР-50";
    }




}
