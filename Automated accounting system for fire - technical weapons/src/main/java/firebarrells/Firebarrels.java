package main.java.firebarrells;
import main.java.Equipments;
import java.time.LocalDate;

public abstract class Firebarrels extends Equipments {
    protected static int count; // счетчик, пока непонятно для чего
    public final int SERVICE_PERIOD_IN_MONTHS = 6;
    public final static String SPRK_8_TEXT = "СПРК-8Б";
    public final static String SPRK_12_TEXT = "СПРК-12А";
    public final static String SPRK_19_TEXT = "СПРК-19А-АД";
    public final static String SPRK_22_TEXT = "СПРК-22А-А";

    public final String SPRK_MANUFACTURER_TEXT = "Великолукский завод \"ТРАНСНЕФТЕМАШ\", Россия, " +
            "\n182100, Псковская область, город Великие Луки, улица Гоголя дом 2 ";
    public final String SPRK_DEFAULT_TU_TEXT = "ТУ 4854-032-00139181-2011";
    public final String SPRK_CURTAIN_ANGLE_TEXT = "0 - 120";
    protected final int SPRK_CURTAIN_DIAMETER_TEXT = 3;


    protected char firebarrelType;
    protected String workingPressure;
    protected String waterConsumption;
    protected int waterJetrange; //
    protected int waterSprayJetRange;
    protected int foamJetRange;
    protected double foamMultiplicity;
    protected String curtainAngle;
    protected int curtainDiameter;

    public String allInformationAboutTheDevice() {
        return "Номер: ".concat(Integer.toString(deviceNumber))
                .concat("\nИнвентарный номер: ").concat(inventoryNumber)
                .concat("\nНазвание: ").concat(deviceName)
                .concat("\nЗавод изготовитель: ").concat(SPRK_MANUFACTURER_TEXT)
                .concat("\n" + deviceTU)
                .concat("\nДата выпуска: ").concat(String.valueOf(dateOfManufacture))
                .concat("\nРабочее давление, мПа: ").concat(workingPressure)
                .concat("\nРасход воды/расствора, литра(ов): ").concat(waterConsumption)
                .concat("\nУгол защиты, градуса(ов): ").concat(curtainAngle)
                .concat("\nДиаметр факела защитной завесы, метра(ов) : ").concat(String.valueOf(curtainDiameter))
                .concat("\nДальность водяной струи, метра(ов): ").concat(String.valueOf(waterJetrange))
                .concat("\nДальность водяной, расспыленной струи, метра(ов): ").concat(String.valueOf(waterSprayJetRange))
                .concat("\nДальность пенной струи, метра(ов): ").concat(String.valueOf(foamJetRange))
                .concat("\nКратность пены: ").concat(String.valueOf(foamMultiplicity))
                .concat("\nВес, кг : ").concat(String.valueOf(deviceWeight))
                .concat("\nРазмеры: ").concat(deviceSizes);

    }

    @Override
    public String toString(){
        return "ID: ".concat(String.valueOf(id))
                .concat(" - ").concat(deviceName)
                .concat(" №: ").concat(String.valueOf(deviceNumber));
    }

    public void setNextServiceDate(LocalDate nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }

    public void setCurrentServiceDate(LocalDate currentServiceDate) {
        this.currentServiceDate = currentServiceDate;
    }

    public void setDeviceNumber(int deviceNumber){
        this.deviceNumber = deviceNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    //TODO сделать ввод ТУ через регулярное выражение
    public void setDeviceTU(String deviceTU) {
        if (!deviceTU.equals(null)) {
            this.deviceTU = deviceTU;
        }
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setPreviousServiceDate(LocalDate previousServiceDate) {
        this.previousServiceDate = previousServiceDate;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public static int getCount(){
        return count;
    }

    public int getId() {
        return id;
    }

    public int getDeviceNumber() {
        return deviceNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getDeviceTU() {
        return deviceTU;
    }

    public char getFirebarrelType() {
        return firebarrelType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getWorkingPressure() {
        return workingPressure;
    }

    public String getWaterConsumption() {
        return waterConsumption;
    }

    public int getWaterJetrange() {
        return waterJetrange;
    }

    public int getWaterSprayJetRange() {
        return waterSprayJetRange;
    }

    public int getFoamJetRange() {
        return foamJetRange;
    }

    public double getFoamMultiplicity() {
        return foamMultiplicity;
    }

    public String getCurtainAngle() {
        return curtainAngle;
    }

    public int getCurtainDiameter() {
        return curtainDiameter;
    }

    public double getDeviceWeight() {
        return deviceWeight;
    }

    public String getDeviceSizes() {
        return deviceSizes;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getPreviousServiceDate() {
        return previousServiceDate.format(dateFormatter);
    }

    public String getCurrentServiceDate() {
        if (currentServiceDate.equals(nextServiceDate)){
            previousServiceDate = currentServiceDate;
            currentServiceDate = nextServiceDate;
        }
        return currentServiceDate.format(dateFormatter);
    }

    public String getNextServiceDate() {
        nextServiceDate = currentServiceDate.plusMonths(SERVICE_PERIOD_IN_MONTHS);
        return nextServiceDate.format(dateFormatter);
    }


}
