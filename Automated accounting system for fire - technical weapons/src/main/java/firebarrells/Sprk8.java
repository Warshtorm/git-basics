package main.java.firebarrells;

import java.time.LocalDate;

public class Sprk8 extends Firebarrels {

    public Sprk8(int deviceNumber){
    this();
    this.deviceNumber = deviceNumber;
    }

    public Sprk8(){
        count++;
        id += Firebarrels.count;
        deviceNumber = 0;
        inventoryNumber = "1222";
        deviceName = "СПРК-8Б";
        deviceTU = SPRK_DEFAULT_TU_TEXT;
        deviceType = 'Б';
        manufacturer = SPRK_MANUFACTURER_TEXT;
        workingPressure = "0.7";
        waterConsumption = "2,4,6,8";
        waterJetrange = 40;
        waterSprayJetRange = 15;
        foamJetRange = 18;
        foamMultiplicity = 7.0;
        curtainAngle = SPRK_CURTAIN_ANGLE_TEXT;
        curtainDiameter = sprkCurtainDiameterText;

        deviceWeight = 2.5;
        sizes = "290*130*280";

        dateOfManufacture = LocalDate.now();
        testDate = LocalDate.now();
        nextTestDate = testDate;
        lastTestDate = testDate;
    }

    @Override
    public String getDeviceInformation() {
    return deviceName + " : Ствол пожарный, ручной, комбинированный," +
            "\n8 - максимальный расход воды/расствора л.с, " +
            "\nБ - тип присоединения, по рукавную головку ГР-50";
    }



}
