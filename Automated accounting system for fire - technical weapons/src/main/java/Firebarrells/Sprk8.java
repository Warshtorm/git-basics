package main.java.Firebarrells;

import java.time.LocalDate;

public class Sprk8 extends FireBarrels{

    public Sprk8(int deviceNumber){
    this();
    this.deviceNumber = deviceNumber;
    }

    public Sprk8(){
        count++;
        id += FireBarrels.count;
        deviceNumber = 8;
        deviceName = "СПРК-8Б";
        deviceTU = "TU 888 888888 88"; // TODO: доделать через регулярку
        deviceType = 'Б';
        manufacturer = "ТрансНефть";

        workingPressure = "0.7";
        waterConsumption = "2,4,6,8";
        waterJetrange = 40;
        waterSprayJetRange = 15;
        foamJetRange = 18;
        foamMultiplicity = 7.0;

        deviceWeight = 2.5;

        // TODO: доделать установку и обработку даты
        dateOfmanufacture = LocalDate.now();
        testDate = LocalDate.now();
    }

    @Override
    public String getDisplayInfo() {
    return deviceName + " : Ствол пожарный, ручной, комбинированный," +
            "\n8 - максимальный расход воды/расствора л.с, " +
            "\nБ - тип присоединения, по рукавную головку ГР-50";
    }
}
