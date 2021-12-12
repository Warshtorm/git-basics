package com.equipments.firebarrels;

import com.equipments.Equipment;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Firebarrel extends Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public final static String SPRK_8_TEXT = "СПРК-8Б";
    public final static String SPRK_12_TEXT = "СПРК-12А";
    public final static String SPRK_19_TEXT = "СПРК-19А-АД";
    public final static String SPRK_22_TEXT = "СПРК-22А-А";
    public final static String BARREL_DEVICE_TYPE_TEXT = "ручной пожарный ствол";
    public final static String SPRK_MANUFACTURER_TEXT = "Великолукский завод \"ТРАНСНЕФТЕМАШ\", Россия, " +
            "\n182100, Псковская область, город Великие Луки, улица Гоголя дом 2 ";
    public final String SPRK_DEFAULT_TU_TEXT = "ТУ 4854-032-00139181-2011";
    public final String SPRK_CURTAIN_ANGLE_TEXT = "0 - 120";
    protected final int SPRK_CURTAIN_DIAMETER_TEXT = 3;

    protected int waterJetrange; //
    protected int waterSprayJetRange;
    protected int foamJetRange;
    protected double foamMultiplicity;
    protected String curtainAngle;
    protected int curtainDiameter;

    public Firebarrel(){}

    public Firebarrel(String name){
        this();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Firebarrel{" +
                "SPRK_DEFAULT_TU_TEXT='" + SPRK_DEFAULT_TU_TEXT + '\'' +
                ", SPRK_CURTAIN_ANGLE_TEXT='" + SPRK_CURTAIN_ANGLE_TEXT + '\'' +
                ", SPRK_CURTAIN_DIAMETER_TEXT=" + SPRK_CURTAIN_DIAMETER_TEXT +
                ", waterJetrange=" + waterJetrange +
                ", waterSprayJetRange=" + waterSprayJetRange +
                ", foamJetRange=" + foamJetRange +
                ", foamMultiplicity=" + foamMultiplicity +
                ", curtainAngle='" + curtainAngle + '\'' +
                ", curtainDiameter=" + curtainDiameter +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void allInformationAboutTheDevice() {
        System.out.println(NUMBER_TEXT + ": ".concat(Integer.toString(number))
                .concat("\n" + INVENTORY_NUMBER_TEXT + ": ").concat(inventoryNumber)
                .concat("\n" + DEVICE_NAME_TEXT + ": ").concat(name)
                .concat("\n" + MANUFACTURER_TEXT + ": ").concat(manufacturer)
                .concat("\n" + CLASS_DEVICE_TEXT + ": ").concat(clas)
                .concat("\n" + TYPE_DEVICE_TEXT + ": ").concat(type)
                .concat("\n" + tu)
                .concat("\n" + DATE_OF_MANUFACTURE_TEXT + ": ").concat(String.valueOf(getDateOfManufacture()))
                .concat("\n" + WORKING_PRESSURE_TEXT + ": ").concat(workingPressure)
                .concat("\n" + WATER_CONSUMPTION_TEXT + ": ").concat(waterConsumption)
                .concat("\n" + CURTAIN_ANGLE_TEXT + ": ").concat(curtainAngle)
                .concat("\n" + CURTAIN_DIAMETR_TEXT + ": ").concat(String.valueOf(curtainDiameter))
                .concat("\n" + WATER_JETRANGE_TEXT + ": ").concat(String.valueOf(waterJetrange))
                .concat("\n" + WATER_SPRAY_JET_RANGE_TEXT + ": ").concat(String.valueOf(waterSprayJetRange))
                .concat("\n" + FOAM_JET_RANGE_TEXT + ": ").concat(String.valueOf(foamJetRange))
                .concat("\n" + FOAM_MULTIPLICITY_TEXT + ": ").concat(String.valueOf(foamMultiplicity))
                .concat("\n" + DEVICE_WEIGHT_TEXT + ": ").concat(String.valueOf(weight))
                .concat("\n" + DEVICE_SIZE_TEXT + ": ").concat(sizes));
    }

    @Override
    public void getDeviceInformation() {

    }
}
