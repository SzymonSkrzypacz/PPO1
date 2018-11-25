package ParkingLotManager;

import ParkingLotManager.Entities.Car;
import ParkingLotManager.Interfaces.EntityInterface;
import ParkingLotManager.Entities.Uprzywilejowany_pojazd;
import ParkingLotManager.Entities.Kurier;
import ParkingLotManager.Entities.Bicycle;
import java.util.ArrayList;
import java.util.Scanner;
final public class ParkingLot {

    private ArrayList<EntityInterface> entitiesOnProperty = new ArrayList<>();
    Scanner skan = new Scanner(System.in);
    
    
    private int carsOnProperty = 0;
    private int roweryOnProperty = 0;
    private int kasa=0;
    private int wielkoscParkinguAut = skan.nextInt();
    private int wielkoscParkinguRowerow = skan.nextInt();
    
    public boolean checkIfCanEnter(EntityInterface entity) {
       boolean czywjedzie = entity.canEnter();
       
   
       
    	 if(entity instanceof Car && carsOnProperty < wielkoscParkinguAut) {
             carsOnProperty+=entity.czyzajmujemiejsce();
             czywjedzie=true;
           }
    	 
    	 else if (entity instanceof Car && carsOnProperty >= wielkoscParkinguAut && !(entity instanceof Kurier) && !(entity instanceof Uprzywilejowany_pojazd))
    	 {
    		 czywjedzie=false;
    	 }
 
    	 
    	 if (entity instanceof Bicycle && roweryOnProperty<wielkoscParkinguRowerow)
    	 {
    		 roweryOnProperty+=entity.czyzajmujemiejsce();
    		 czywjedzie=true;
    	 }
    	 
    	 else if (entity instanceof Bicycle && roweryOnProperty>=wielkoscParkinguRowerow)
    	 {
    		 czywjedzie=false;
    	 }
    	
    	 
    	return czywjedzie;
    }

    public void letIn(EntityInterface entity) {
        
 
        kasa+=entity.oplata();
        entitiesOnProperty.add(entity);
        Log.info(entity.identify() + " let in.");
    }

    public int countCars() {
        return carsOnProperty;
    }
    public int getKasa()
    {
    	return kasa;
    }

}
