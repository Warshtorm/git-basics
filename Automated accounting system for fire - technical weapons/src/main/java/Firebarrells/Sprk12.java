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
        deviceName = "СПРК-12А";
        deviceTU = "TU 888 888888 88"; // TODO: доделать через регулярку
        deviceType = 'Б';
        manufacturer = "ТрансНефть";

        workingPressure = "0.7";
        waterConsumption = "2,4,6,8,10,12";
        waterJetrange = 50;
        waterSprayJetRange = 20;
        foamJetRange = 26;
        foamMultiplicity = 7.0;

        deviceWeight = 3.5;

        // TODO: доделать установку и обработку даты
        dateOfmanufacture = LocalDate.now();
        testDate = LocalDate.now();
    }

    @Override
    public String getDisplayInfo() {
        return deviceName + " : Ствол пожарный, ручной, комбинированный," +
                "\n12 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-70";
    }
}
