package main.java.Firebarrells;

import java.time.LocalDate;

public class Sprk22 extends FireBarrels{

    public Sprk22(int deviceNumber) {
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk22() {
        count++;
        id += FireBarrels.count;
        deviceNumber = 22;
        inventoryNumber = "12000";
        deviceName = "СПРК-22А-А";
        deviceTU = "ТУ 4854-032-00139181-2011"; // TODO: доделать через регулярку
        deviceType = 'Б';
        manufacturer = sprkManufacturerText;

        workingPressure = "0.7";
        waterConsumption = "3.0-22";
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

    //TODO дописать описание ствола - "А-"
    @Override
    public String getDeviceInformation() {
        return deviceName + " : Ствол пожарный, ручной, комбинированный," +
                "\n22 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-70" +
                "\nА - автоматическое изменение диаметра впрыска и" +
                "\nподдержание постоянного давления на впрыске ";
    }
}
