package ParkingLotManager.Entities;

public class Kurier extends Car{
	public Kurier(String plate) {
        super(plate);
    }
	public int oplata() {
    	return 0;
    }
	
	public int czyzajmujemiejsce()
    {
    	return 0;
    }
	  public String identify() {
	        return "Kurier with plate number " + plate;
	    }
}
