package com.students;

import javax.persistence.*;

@Entity
public class Firebarrel extends Equipment {
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

    private int waterJetrange; //
    private int waterSprayJetRange;
    private int foamJetRange;
    private double foamMultiplicity;
    private String curtainAngle;
    private int curtainDiameter;

    public Firebarrel(){}

    public Firebarrel(String name){
        this();
        super.name = name;
    }

    public String getSPRK_DEFAULT_TU_TEXT() {
        return SPRK_DEFAULT_TU_TEXT;
    }

    public String getSPRK_CURTAIN_ANGLE_TEXT() {
        return SPRK_CURTAIN_ANGLE_TEXT;
    }

    public int getSPRK_CURTAIN_DIAMETER_TEXT() {
        return SPRK_CURTAIN_DIAMETER_TEXT;
    }

    public int getWaterJetrange() {
        return waterJetrange;
    }

    public void setWaterJetrange(int waterJetrange) {
        this.waterJetrange = waterJetrange;
    }

    public int getWaterSprayJetRange() {
        return waterSprayJetRange;
    }

    public void setWaterSprayJetRange(int waterSprayJetRange) {
        this.waterSprayJetRange = waterSprayJetRange;
    }

    public int getFoamJetRange() {
        return foamJetRange;
    }

    public void setFoamJetRange(int foamJetRange) {
        this.foamJetRange = foamJetRange;
    }

    public double getFoamMultiplicity() {
        return foamMultiplicity;
    }

    public void setFoamMultiplicity(double foamMultiplicity) {
        this.foamMultiplicity = foamMultiplicity;
    }

    public String getCurtainAngle() {
        return curtainAngle;
    }

    public void setCurtainAngle(String curtainAngle) {
        this.curtainAngle = curtainAngle;
    }

    public int getCurtainDiameter() {
        return curtainDiameter;
    }

    public void setCurtainDiameter(int curtainDiameter) {
        this.curtainDiameter = curtainDiameter;
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
}
