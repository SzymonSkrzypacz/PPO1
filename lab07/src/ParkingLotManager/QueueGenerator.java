package ParkingLotManager;

import ParkingLotManager.Entities.Bicycle;
import ParkingLotManager.Entities.Car;
import ParkingLotManager.Entities.Pedestrian;
import ParkingLotManager.Entities.TeacherCar;
import ParkingLotManager.Interfaces.EntityInterface;
import ParkingLotManager.Entities.Czolg;
import ParkingLotManager.Entities.Uprzywilejowany_pojazd;
import ParkingLotManager.Entities.Kurier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QueueGenerator {

  
    
    public static ArrayList<EntityInterface> generate() {
        ArrayList<EntityInterface> queue = new ArrayList<>();

        final int ANONYMOUS_PEDESTRIANS_COUNT = losuj(5,55);
         final int PEDESTRIANS_COUNT = losuj(2,6);
         final int CARS_COUNT = losuj(5,45);
        final int TEACHER_CARS_COUNT = losuj(2,18);
        final int BICYCLES_COUNT =losuj(5,12);
         final int TANK_COUNT =losuj(0,2);
        final int UPRZYWILEJOWANY_COUNT = losuj(0,3);
         final int KURIER_COUNT = losuj(0,4);
        
        Log.info();
     	Log.info("liczba przechodniów anonimowych: "+ ANONYMOUS_PEDESTRIANS_COUNT);
     	Log.info("liczba przechodniów, które zna parkingowy: "+PEDESTRIANS_COUNT);
     	Log.info("Liczba aut: "+CARS_COUNT);
     	Log.info("Liczba aut nauczycieli: "+TEACHER_CARS_COUNT);
     	Log.info("Liczba rowerów: "+BICYCLES_COUNT);
     	Log.info("Liczba czo³gów: "+TANK_COUNT);
     	Log.info("Liczba pojazdów uprzywilejowanych: "+UPRZYWILEJOWANY_COUNT);
     	Log.info("Liczba kurierów: "+KURIER_COUNT);
     	Log.info();
        
        for (int i = 0; i < ANONYMOUS_PEDESTRIANS_COUNT; i++) {
            queue.add(new Pedestrian());
        }

        for (int i = 0; i < PEDESTRIANS_COUNT; i++) {
            queue.add(new Pedestrian(getRandomName()));
        }

        for (int i = 0; i < CARS_COUNT; i++) {
            queue.add(new Car(getRandomPlateNumber()));
        }

        for (int i = 0; i < TEACHER_CARS_COUNT; i++) {
            queue.add(new TeacherCar(getRandomPlateNumber()));
        }

        for (int i = 0; i < BICYCLES_COUNT; i++) {
            queue.add(new Bicycle());
        }

        for (int i = 0; i < TANK_COUNT; i++) {
            queue.add(new Czolg());
        }
        
        for (int i=0; i < UPRZYWILEJOWANY_COUNT; i++)
        {
        	queue.add(new Uprzywilejowany_pojazd(getRandomPlateNumber()));
        }
        
        for (int i=0; i < KURIER_COUNT; i++)
        {
        	queue.add(new Kurier(getRandomPlateNumber()));
        }
        Collections.shuffle(queue);

      
        
        return queue;
    }

    private static String getRandomPlateNumber() {
        Random generator = new Random();
        return "DLX " + (generator.nextInt(89999) + 10000);
    }

    private static String getRandomName() {
        String[] names = {"John", "Jack", "James", "George", "Joe", "Jim"};
        return names[(int) (Math.random() * names.length)];
    }
    
    private static int losuj(int a, int b)
    {
    	Random generator = new Random();
    	return generator.nextInt(b)+a;
    }
   
    
}
