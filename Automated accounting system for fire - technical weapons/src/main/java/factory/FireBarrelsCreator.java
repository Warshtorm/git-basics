package main.java.factory;

import main.java.Equipments;

import java.util.ArrayList;
import java.util.List;

public class FireBarrelsCreator implements EquipmentFactory {

    private static FireBarrelsCreator instance;
    private List<Equipments> fireBarrelsList = new ArrayList<>();

    private FireBarrelsCreator(){

    }

    /** список содержащий пожарные стволы */
    public List<Equipments> getFireBarrelsList() {
        return new ArrayList<>(fireBarrelsList);
    }

    public static FireBarrelsCreator getInstance() {
        if (instance == null){
            instance = new FireBarrelsCreator();
        }
        return instance;
    }


    @Override
    public List<Equipments> createDevice(Equipments device) {
        if (!device.equals(null)){
            fireBarrelsList.add(device);
        }
        return fireBarrelsList;
    }
}
