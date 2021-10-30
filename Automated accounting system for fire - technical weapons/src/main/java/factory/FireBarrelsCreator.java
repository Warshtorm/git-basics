package main.java.factory;

import main.java.Equipments;
import main.java.firebarrells.FireBarrels;
import java.util.ArrayList;
import java.util.List;

public class FireBarrelsCreator implements IEquipmentFactory {

    private static FireBarrelsCreator instance;
    private List<FireBarrels> fireBarrelsList = new ArrayList<>();
    /** список содержащий пожарные стволы */
    public List<FireBarrels> getFireBarrelsList() {
        return new ArrayList<>(fireBarrelsList);
    }

    private FireBarrelsCreator(){

    }

    public static FireBarrelsCreator getInstance() {
        if (instance == null){
            instance = new FireBarrelsCreator();
        }
        return instance;
    }


    @Override
    public void createDevice(Equipments device) {
        if (!device.equals(null)){
            fireBarrelsList.add((FireBarrels) device);
        }
    }
}
