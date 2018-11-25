package ParkingLotManager.Entities;

public class TeacherCar extends Car {

    public TeacherCar(String plate) {
        super(plate);
    }

    public int oplata() {
    	return 0;
    }
    public int czyzajmujemiejsce()
    {
    	return 1;
    }
    
    public String identify() {
        return "Teacher car with plate number " + plate;
    }
}
