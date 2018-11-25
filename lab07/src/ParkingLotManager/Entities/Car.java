package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Car implements EntityInterface {

    protected String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    public String identify() {
        return "Car with plate number " + plate;
    }
    public int oplata() {
    	return 6;
    }
    public boolean canEnter() {
        return true;
    }
    public int czyzajmujemiejsce()
    {
    	return 1;
    }

}
