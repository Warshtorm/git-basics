package main.java.Firebarrells;

import java.time.LocalDate;

public class Sprk12 extends FireBarrels{

    public Sprk12(int deviceNumber){
        this();
        this.deviceNumber = deviceNumber;
    }

    public Sprk12(){
        count++;
        id += FireBarrels.count;
        deviceNumber = 12;
        inventoryNumber = "1522";
        deviceName = "СПРК-12А";
        deviceTU = "ТУ 4854-032-00139181-2011"; // TODO: доделать через регулярку
        deviceType = 'Б';
        manufacturer = sprkManufacturerText;

        workingPressure = "0.7";
        waterConsumption = "2,4,6,8,10,12";
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

    @Override
    public String getDeviceInformation() {
        return deviceName + " : Ствол пожарный, ручной, комбинированный," +
                "\n12 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-80";
    }
}
