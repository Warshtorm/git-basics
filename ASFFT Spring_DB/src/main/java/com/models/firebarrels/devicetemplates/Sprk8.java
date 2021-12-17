package com.models.firebarrels.devicetemplates;

import com.models.firebarrels.Firebarrel;
import javax.persistence.Entity;


@Entity
public class Sprk8 extends Firebarrel {

    public Sprk8(){
        count++;
        number = 0;
        inventoryNumber = "1222";
        name = SPRK_8_TEXT;
        tu = SPRK_DEFAULT_TU_TEXT;
        type = BARREL_DEVICE_TYPE_TEXT;
        clas = "Б";
        manufacturer = SPRK_MANUFACTURER_TEXT;

        workingPressure = "0.7";
        waterConsumption = "2,4,6,8";
        waterJetrange = 40;
        waterSprayJetRange = 15;
        foamJetRange = 18;
        foamMultiplicity = 7.0;
        curtainAngle = SPRK_CURTAIN_ANGLE_TEXT;
        curtainDiameter = SPRK_CURTAIN_DIAMETER_TEXT;

        weight = 2.5;
        sizes = "290*130*280";

        dateOfManufacture = getCurrentServiceDate();
        currentServiceDate = getCurrentServiceDate();
        previousServiceDate = getPreviousServiceDate();

    }

    @Override
    public void getDeviceInformation() {
        System.out.println(name + " : Ствол пожарный, ручной, комбинированный," +
                "\n8 - максимальный расход воды/расствора л.с, " +
                "\nБ - тип присоединения, по рукавную головку ГР-50");
    }
}
