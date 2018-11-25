package ParkingLotManager.Entities;

public class Uprzywilejowany_pojazd extends Car{
	
	public Uprzywilejowany_pojazd(String plate) {
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
	        return "Pojazd uprzywilejowany with plate number " + plate;
	    }
}
