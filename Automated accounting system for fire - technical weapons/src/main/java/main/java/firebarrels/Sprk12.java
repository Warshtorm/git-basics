package main.java.firebarrels;

public class Sprk12 extends Firebarrel {

    public Sprk12(int deviceNumber){
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk12(){
        count++;
        deviceId = Firebarrel.count;
        deviceNumber = 0;
        deviceInventoryNumber = "1522";
        deviceName = SPRK_12_TEXT;
        deviceTU = SPRK_DEFAULT_TU_TEXT;
        deviceType = BARREL_DEVICE_TYPE_TEXT;
        deviceClass = "Б";
        deviceManufacturer = SPRK_MANUFACTURER_TEXT;

        deviceWorkingPressure = "0.7";
        deviceWaterConsumption = "2,4,6,8,10,12";
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
                "\n12 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-80";
    }


}
