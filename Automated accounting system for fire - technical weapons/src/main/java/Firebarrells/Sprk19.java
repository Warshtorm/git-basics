package main.java.Firebarrells;

import java.time.LocalDate;

public class Sprk19 extends FireBarrels {

    public Sprk19(int deviceNumber) {
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk19() {
        count++;
        id += FireBarrels.count;
        deviceNumber = 19;
        inventoryNumber = "41552";
        deviceName = "СПРК-19А-АД";
        deviceTU = "ТУ 4854-032-00139181-2011"; // TODO: доделать через регулярку
        deviceType = 'Б';
        manufacturer = sprkManufacturerText;

        workingPressure = "0.7/0.4";
        waterConsumption = "4.5-19/4.5-14";
        waterJetrange = 50;
        waterSprayJetRange = 20;
        foamJetRange = 26;
        foamMultiplicity = 7.0;
        curtainAngle = sprkCurtainAngleText;
        curtainDiameter = sprkCurtainDiameterText;

        deviceWeight = 3.5;
        sizes = "320*130*290";

        // TODO: доделать установку и обработку даты
        dateOfmanufacture = LocalDate.now();
        testDate = LocalDate.now();
    }

    //TODO дописать описание ствола - "АД"
    @Override
    public String getDeviceInformation() {
        return deviceName + " : Ствол пожарный, ручной, комбинированный," +
                "\n19 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-70" +
                "\nА - автоматическое изменение диаметра впрыска и " +
                "\nподдержание постоянного давления на впрыске " +
                "\nД - двойной диапазон рабочего давления";
    }
}
