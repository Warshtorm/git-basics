package main.java.firebarrels;

public class Sprk22 extends Firebarrels {

    public Sprk22(int deviceNumber) {
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk22() {
        equipmentsCount++;
        deviceId += Firebarrels.equipmentsCount;
        deviceNumber = 0;
        deviceInventoryNumber = "12000";
        deviceName = SPRK_22_TEXT;
        deviceTU = SPRK_DEFAULT_TU_TEXT;
        deviceType = "ручной";
        deviceClass = "Б";
        deviceManufacturer = SPRK_MANUFACTURER_TEXT;

        deviceWorkingPressure = "0.7";
        deviceWaterConsumption = "3.0-22";
        waterJetrange = 50;
        waterSprayJetRange = 20;
        foamJetRange = 26;
        foamMultiplicity = 7.0;
        curtainAngle = SPRK_CURTAIN_ANGLE_TEXT;
        curtainDiameter = SPRK_CURTAIN_DIAMETER_TEXT;

        deviceWeight = 3.5;
        deviceSizes = "320*130*290";

        dateOfManufacture = getCurrentServiceDate();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
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
