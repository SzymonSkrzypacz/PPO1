package lab04;

public class Pawn {

	private int position;
	private String name;
	
	
	Pawn() {}
	
	Pawn (String name)
	{
		this.name=name;
		this.position=0;
		
		
	}
	
	int getPosition()
	{
		return this.position;
	}
	
	void setPosition(int position)
	{
		this.position=position;
	}
	
	void addPosition(int ruch)
	{
		this.position+=ruch;
	}
	
	void CofajPosition(int ruch)
	{
		this.position-=ruch;
	}
	
	String getName()
	{
		return name;
	}
	
	
	
	
	
}
