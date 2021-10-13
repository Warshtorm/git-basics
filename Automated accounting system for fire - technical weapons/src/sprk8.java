import java.time.LocalDate;

public class sprk8 extends FireBarrels{

    public sprk8(LocalDate dateOfmanufacture, int deviceNumber){
        this();
        this.dateOfmanufacture = dateOfmanufacture;
        this.deviceNumber = deviceNumber;

    }

    public sprk8(){
        id = 111;
        deviceNumber = 1002;
        deviceName = "СПРК-8Б";
        deviceTU = "TU 123 22 33333 00";
        deviceType = 'B';
        manufacturer = "ООО ТрансНефть";
        workingPressure = "0,7";
        waterConsumption = "2,4,6,8";
        waterJetrange = 40;
        waterSprayJetRange = 15;
        foamJetRange = 18;
        foamMultiplicity = 0.7;
        deviceWeight = 2.5;
        dateOfmanufacture = LocalDate.now();
        testDate = LocalDate.now();
    }


    @Override
    public void getDisplayInfo() {
        System.out.println("Ствол пожарный ручной комбинированный - " +
                "\n8 - максимальный расход воды (расствора), " +
                "\nБ - тип присоединяемой головки (ГР - 50)");
    }
}
