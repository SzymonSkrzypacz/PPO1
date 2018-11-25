package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Czolg implements EntityInterface {
	 public String identify() {
	        return "Tank";
	    }

	 public int oplata() {
	    	return 0;
	    }
	 
	    public boolean canEnter() {
	        return false;
	    }
	    
	    public int czyzajmujemiejsce()
	    {
	    	return 0;
	    }
}
