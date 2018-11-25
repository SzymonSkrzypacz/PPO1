package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Pedestrian implements EntityInterface {

    private String name = "";

    public Pedestrian() {}

    public Pedestrian(String name) {
        this.name = name;
    }

    public String identify() {
        return !name.isEmpty() ? name : "Unknown pedestrian";
    }
    
    public int oplata() {
    	return 0;
    }

    public boolean canEnter() {
        return true;
    }

    public int czyzajmujemiejsce()
    {
    	return 0;
    }
    
}
