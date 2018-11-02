package lab05;

public class Komiks extends Book{

	private String drawingAuthor;
	
	public Komiks(String title, String author, int pages, String drawingAuthor)
	{
		super(title,author,pages);
		this.drawingAuthor = drawingAuthor;
	}
	
	public String getDrawingAuthor(){
		return drawingAuthor;
	}
	public String getType()
	{
		return "komiks";
	}
}
