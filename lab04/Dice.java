package lab04;

import java.util.Random;

public class Dice {

	private int iloscscian;
	
	Dice()
	{
		
	}
	
	Dice(int iloscscian)
	{
		this.iloscscian=iloscscian;
	}
	
	int getiloscscian()
	{
		return this.iloscscian;
	}
	
	void setiloscscian(int iloscscian) {
		this.iloscscian = iloscscian;
	}
	
	
	int roll()
	{
		Random rand = new Random();
		int result = (rand.nextInt(getiloscscian())+1);
		
		System.out.println("Wyrzucono: "+result);
		
		return result;
	}
	
	
}
