package main.java.firebarrels;

public class Sprk8 extends Firebarrels {

    public Sprk8(int deviceNumber){
    this();
    this.deviceNumber = deviceNumber;
    }

    public Sprk8(){
        count++;
        deviceId += Firebarrels.count;
        deviceNumber = 0;
        deviceInventoryNumber = "1222";
        deviceName = SPRK_8_TEXT;
        deviceTU = SPRK_DEFAULT_TU_TEXT;
        deviceType = BARREL_DEVICE_TYPE_TEXT;
        deviceClass = "Б";
        deviceManufacturer = SPRK_MANUFACTURER_TEXT;

        deviceWorkingPressure = "0.7";
        deviceWaterConsumption = "2,4,6,8";
        waterJetrange = 40;
        waterSprayJetRange = 15;
        foamJetRange = 18;
        foamMultiplicity = 7.0;
        curtainAngle = SPRK_CURTAIN_ANGLE_TEXT;
        curtainDiameter = SPRK_CURTAIN_DIAMETER_TEXT;

        deviceWeight = 2.5;
        deviceSizes = "290*130*280";

        dateOfManufacture = getCurrentServiceDate();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public String getDeviceInformation() {
    return deviceName + " : Ствол пожарный, ручной, комбинированный," +
            "\n8 - максимальный расход воды/расствора л.с, " +
            "\nБ - тип присоединения, по рукавную головку ГР-50";
    }


}
