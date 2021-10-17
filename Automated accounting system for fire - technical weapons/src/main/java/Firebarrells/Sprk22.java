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
        deviceName = "СПРК-22А-А";
        deviceTU = "TU 888 888888 88"; // TODO: доделать через регулярку
        deviceType = 'Б';
        manufacturer = "ТрансНефть";

        workingPressure = "0.7";
        waterConsumption = "3.0-22";
        waterJetrange = 50;
        waterSprayJetRange = 20;
        foamJetRange = 26;
        foamMultiplicity = 7.0;

        deviceWeight = 3.5;

        // TODO: доделать установку и обработку даты
        dateOfmanufacture = LocalDate.now();
        testDate = LocalDate.now();
    }

    //TODO дописать описание ствола - "А-"
    @Override
    public String getDisplayInfo() {
        return deviceName + " : Ствол пожарный, ручной, комбинированный," +
                "\n22 - максимальный расход воды/расствора л.с, " +
                "\nА - тип присоединения, по рукавную головку ГР-70" +
                "\nА - ";
    }
}
