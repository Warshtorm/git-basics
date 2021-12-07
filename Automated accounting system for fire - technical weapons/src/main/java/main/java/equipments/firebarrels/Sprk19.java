package main.java.equipments.firebarrels;

public class Sprk19 extends Firebarrel {

    public Sprk19(int deviceNumber) {
        this();
        this.number = deviceNumber;
    }

    public Sprk19() {
        count++;
        id += Firebarrel.count;
        number = 0;
        inventoryNumber = "41552";
        name = SPRK_19_TEXT;
        tu = SPRK_DEFAULT_TU_TEXT;
        type = BARREL_DEVICE_TYPE_TEXT;
        clas = "Б";
        manufacturer = SPRK_MANUFACTURER_TEXT;

        workingPressure = "0.7/0.4";
        waterConsumption = "4.5-19/4.5-14";
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
                "\n19 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-70" +
                "\nА - автоматическое изменение диаметра впрыска и " +
                "\n\tподдержание постоянного давления на впрыске " +
                "\nД - двойной диапазон рабочего давления");
    }


}
