package main.java.firebarrells;
import main.java.Equipments;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Firebarrels extends Equipments {

    public final int PERIOD_IN_MONTHS = 6;

    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public final String SPRK_MANUFACTURER_TEXT = "Великолукский завод \"ТРАНСНЕФТЕМАШ\", Россия, " +
            "\n182100, Псковская область, город Великие Луки, улица Гоголя дом 2 ";
    public final String SPRK_DEFAULT_TU_TEXT = "ТУ 4854-032-00139181-2011";
    public final String SPRK_CURTAIN_ANGLE_TEXT = "0 - 120";
    protected int sprkCurtainDiameterText = 3;

    protected static int count; // счетчик, пока непонятно для чего


    protected String deviceTU;
    protected char deviceType;
    protected String manufacturer;

    protected String workingPressure;
    protected String waterConsumption;
    protected int waterJetrange; //
    protected int waterSprayJetRange;
    protected int foamJetRange;
    protected double foamMultiplicity;
    protected String curtainAngle;
    protected int curtainDiameter;

    protected double deviceWeight;
    protected String sizes;

    protected LocalDate dateOfManufacture;
    protected LocalDate testDate;
    protected LocalDate lastTestDate;
    protected LocalDate nextTestDate;


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
                .concat("\nРазмеры: ").concat(sizes);

    }

    @Override
    public String toString(){
        return "ID: ".concat(String.valueOf(id))
                .concat(" - ").concat(deviceName)
                .concat(" №: ").concat(String.valueOf(deviceNumber));
    }

    public void setNextTestDate(LocalDate nextTestDate) {
        this.nextTestDate = nextTestDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public void setDeviceNumber(int deviceNumber){
        this.deviceNumber = deviceNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    //TODO сделать ввод ТУ через регулярное выражение
    public void setDeviceTU(String deviceTU) {
        this.deviceTU = deviceTU;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setLastTestDate(LocalDate lastTestDate) {
        this.lastTestDate = lastTestDate;
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

    public String getTestDate() {
        return testDate.format(dateFormatter);
    }

    public String getNextTestDate() {
        nextTestDate = testDate.plusMonths(PERIOD_IN_MONTHS);
        return nextTestDate.format(dateFormatter);
    }

    public int getSprkCurtainDiameterText() {
        return sprkCurtainDiameterText;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getDeviceTU() {
        return deviceTU;
    }

    public char getDeviceType() {
        return deviceType;
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

    public String getSizes() {
        return sizes;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public LocalDate getLastTestDate() {
        return lastTestDate;
    }
}
