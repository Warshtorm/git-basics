package main.java.factory;

import main.java.Equipment;
import main.java.firebarrels.Firebarrels;
import java.util.ArrayList;
import java.util.List;

public class FirebarrelsConveyor implements Factory {

    private static FirebarrelsConveyor instance;
    private List<Firebarrels> fireBarrelsList;

    private FirebarrelsConveyor(){
        fireBarrelsList = new ArrayList<>();
    }

    public static FirebarrelsConveyor getInstance() {
        if (instance == null){
            instance = new FirebarrelsConveyor();
        }
        return instance;
    }

    public List<Firebarrels> getFireBarrelsList() {
        return new ArrayList<>(fireBarrelsList);
    }

    @Override
    public void create(Equipment device) {
        if (!device.equals(null)){
            fireBarrelsList.add((Firebarrels) device);
        }
    }
}
