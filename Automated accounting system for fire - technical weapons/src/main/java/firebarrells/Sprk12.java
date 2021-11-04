package main.java.firebarrells;

import java.time.LocalDate;

public class Sprk12 extends Firebarrels {

    public Sprk12(int deviceNumber){
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk12(){
        count++;
        id += Firebarrels.count;
        deviceNumber = 0;
        inventoryNumber = "1522";
        deviceName = "СПРК-12А";
        deviceTU = SPRK_DEFAULT_TU_TEXT;
        deviceType = 'Б';
        manufacturer = SPRK_MANUFACTURER_TEXT;

        workingPressure = "0.7";
        waterConsumption = "2,4,6,8,10,12";
        waterJetrange = 50;
        waterSprayJetRange = 20;
        foamJetRange = 26;
        foamMultiplicity = 7.0;
        curtainAngle = SPRK_CURTAIN_ANGLE_TEXT;
        curtainDiameter = sprkCurtainDiameterText;

        deviceWeight = 3.5;
        sizes = "320*130*290";

        dateOfManufacture = LocalDate.now();
        testDate = LocalDate.now();
        lastTestDate = testDate;
    }

    @Override
    public String getDeviceInformation() {
        return deviceName + " : Ствол пожарный, ручной, комбинированный," +
                "\n12 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-80";
    }


}
