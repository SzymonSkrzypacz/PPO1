package lab05;

public class Podrecznik extends Book {

	private String function;
	
	public Podrecznik (String title, String author, int pages, String function)
	{
		super(title,author,pages);
		this.function = function;
	}
	
	public String getFunction(){
		return function;
	}
	
	public String getType()  {
		return "podrecznik";
	}
}
