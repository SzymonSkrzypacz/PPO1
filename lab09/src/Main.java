import Zoo.Animals.Chimpanzee;
import Zoo.Animals.Dolphin;
import Zoo.Animals.Elephant;
import Zoo.Animals.Giraffe;
import Zoo.Animals.Lion;
import Zoo.Animals.Penguin;
import Zoo.Animals.Porcupine;
import Zoo.Animals.Tiger;

import java.time.LocalTime;

import Food.Food;
import Zoo.Log;
import Zoo.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Legnica");

        zoo.addAnimal(new Lion("Simba"))
            .addAnimal(new Lion("Mufasa"))
            .addAnimal(new Elephant("Dumbo"))
            .addAnimal(new Tiger("Diego"))
            .addAnimal(new Dolphin("Mealstrom"))
            .addAnimal(new Giraffe("Wuj Grzyb"))
            .addAnimal(new Elephant("Maniek"))
            .addAnimal(new Chimpanzee("Buck"))
            .addAnimal(new Penguin("Major"))
            .addAnimal(new Porcupine("Sid"));

        
        LocalTime localTime1 = LocalTime.of(8,0,0);
        for (int i=0; i<12; i++)
        {
        	switch (i) {
        		case 0:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Water());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        		}
        		
        		case 1:
        		{
        			Log.info();
            			Log.info("Time: "+ localTime1);
            			zoo.feedAnimals(Food.Milk());
            			localTime1 = localTime1.plusMinutes(30);
            			break;
        			
        		}
        		
        		case 2:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Meat());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        			
        		case 3:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Fish());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		
        		case 4:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Shellfish());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        			
        		case 5:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Squid());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		case 6:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Fruits());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		case 7:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Leaves());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		case 8:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Grass());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		case 9:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Flowers());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		case 10:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Stalks());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		case 11:
        		{
        			Log.info();
        			Log.info("Time: "+ localTime1);
        			zoo.feedAnimals(Food.Seeds());
        			localTime1 = localTime1.plusMinutes(30);
        			break;
        			
        		}
        		
        		default: {break;} 
        		
        	}
        }
        
    }
}
