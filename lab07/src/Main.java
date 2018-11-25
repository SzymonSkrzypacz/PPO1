import ParkingLotManager.Interfaces.EntityInterface;
import ParkingLotManager.Log;
import ParkingLotManager.ParkingLot;
import ParkingLotManager.QueueGenerator;

import java.util.ArrayList;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
    	
    	final int cykle=4;
    	
    	Log.info("Podaj iloœæ miejsc parkingowych dla aut i rowerów: ");
        ParkingLot parking = new ParkingLot();
        ArrayList<EntityInterface> queue = QueueGenerator.generate();
       
        
        
        Log.info("There's " + parking.countCars() + " cars in the parking lot");
        Log.info();
        LocalTime czas = LocalTime.of(7,30,0);
        
        for (int i=0; i<cykle; i++) {
        for (EntityInterface entity : queue) {
            if(parking.checkIfCanEnter(entity)) {
            	Log.info("Czas wejœcia/wjazdu: "+ czas);
                parking.letIn(entity);
                czas=czas.plusSeconds(27);
            }
        }
        czas=czas.plusMinutes(90);
        Log.info();
        queue = QueueGenerator.generate();
        
        }

        Log.info();
        Log.info("There's " + parking.countCars() + " cars in the parking lot");
        Log.info("Suma zarobionych pieniêdzy za wjazdy aut: "+ parking.getKasa()+" PLN");
        
    }
}
