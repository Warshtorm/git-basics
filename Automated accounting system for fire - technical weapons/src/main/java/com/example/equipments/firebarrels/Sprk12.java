package com.example.equipments.firebarrels;

public class Sprk12 extends Firebarrel {

    public Sprk12(int deviceNumber){
        this();
        this.number = deviceNumber;
    }

    public Sprk12(){
        count++;
        id = Firebarrel.count;
        number = 0;
        inventoryNumber = "1522";
        name = SPRK_12_TEXT;
        tu = SPRK_DEFAULT_TU_TEXT;
        type = BARREL_DEVICE_TYPE_TEXT;
        clas = "Б";
        manufacturer = SPRK_MANUFACTURER_TEXT;

        workingPressure = "0.7";
        waterConsumption = "2,4,6,8,10,12";
        waterJetrange = 50;
        waterSprayJetRange = 20;
        foamJetRange = 26;
        foamMultiplicity = 7.0;
        curtainAngle = SPRK_CURTAIN_ANGLE_TEXT;
        curtainDiameter = SPRK_CURTAIN_DIAMETER_TEXT;

        weight = 3.5;
        sizes = "320*130*290";

        dateOfManufacture = getCurrentServiceDate();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();
    }

    @Override
    public void getDeviceInformation() {
        System.out.println(name + " : Ствол пожарный, ручной, комбинированный," +
                "\n12 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-80");
    }


}
