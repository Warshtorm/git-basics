package main.java.firebarrels;

public class Sprk19 extends Firebarrel {

    public Sprk19(int deviceNumber) {
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk19() {
        count++;
        deviceId += Firebarrel.count;
        deviceNumber = 0;
        deviceInventoryNumber = "41552";
        deviceName = SPRK_19_TEXT;
        deviceTU = SPRK_DEFAULT_TU_TEXT;
        deviceType = BARREL_DEVICE_TYPE_TEXT;
        deviceClass = "Б";
        deviceManufacturer = SPRK_MANUFACTURER_TEXT;

        deviceWorkingPressure = "0.7/0.4";
        deviceWaterConsumption = "4.5-19/4.5-14";
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
                "\n19 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-70" +
                "\nА - автоматическое изменение диаметра впрыска и " +
                "\n\tподдержание постоянного давления на впрыске " +
                "\nД - двойной диапазон рабочего давления";
    }


}
