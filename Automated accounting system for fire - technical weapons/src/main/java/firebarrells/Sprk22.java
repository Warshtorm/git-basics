package main.java.firebarrells;

import java.time.LocalDate;

public class Sprk22 extends Firebarrels {

    public Sprk22(int deviceNumber) {
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk22() {
        count++;
        id += Firebarrels.count;
        deviceNumber = 0;
        inventoryNumber = "12000";
        deviceName = "СПРК-22А-А";
        deviceTU = SPRK_DEFAULT_TU_TEXT;
        deviceType = 'Б';
        manufacturer = SPRK_MANUFACTURER_TEXT;

        workingPressure = "0.7";
        waterConsumption = "3.0-22";
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
                "\n22 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-70" +
                "\nА - автоматическое изменение диаметра впрыска и" +
                "\n\tподдержание постоянного давления на впрыске ";
    }


}
