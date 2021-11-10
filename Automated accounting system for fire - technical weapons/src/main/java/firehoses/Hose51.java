package main.java.firehoses;


// TODO доработать поля и методы
public class Hose51 extends Firehoses{

    public Hose51(){
        equipmentsCount++;
        id += Firehoses.equipmentsCount;
        deviceNumber = 0;
        inventoryNumber = "1222";
        deviceName = PRESSURE_HOSE_51_TEXT;
        deviceTU = "None";
        classDevice = "напорный";
        manufacturer = "None";


        deviceWeight = 0.0;
        deviceSizes = "None";

        dateOfManufacture = getDateOfManufacture();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public String getDeviceInformation() {
        return "Рукав напорный, ДУ 51";
    }
}
