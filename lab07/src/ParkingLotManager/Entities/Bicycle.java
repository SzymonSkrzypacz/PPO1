package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Bicycle implements EntityInterface {

    public String identify() {
        return "Unknown bicycle";
    }
    
    public int oplata() {
    	return 0;
    }

    public boolean canEnter() {
        return true;
    }
    
    public int czyzajmujemiejsce()
    {
    	return 1;
    }

}
