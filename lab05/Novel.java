package lab05;

public class Novel extends Book {

	private int numberOfchapters;
	
	public Novel(String title, String author, int pages, int numberOfchapters) 
	{
		super(title,author,pages);
		this.numberOfchapters = numberOfchapters;
	}
	
	public int getNumberOfchapters() {
		return numberOfchapters;
	}
	
	public String getType()  {
		return "powiesc";
	}
}