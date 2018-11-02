package lab05;

public class Book {
	protected String title;
	protected String author;
	protected int pages;
	
		public Book(String title, String author, int pages) {
			this.title = title;
			this.author = author;
			this.pages = pages;
		}
		
		public String getTitle() {
			return title;
		}
		
		
		public String getAuthor() {
			return author;
		}
		
		public int getPages() {
			return pages;
		}
		
		public String getType() {return "";};
};