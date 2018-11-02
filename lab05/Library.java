package lab05;

import java.util.Vector;
import java.util.Scanner;

public class Library {

	
		private Vector <Novel> novels = new Vector<Novel>();
		
		public Library addNovel(Novel novel) {
			this.novels.addElement(novel);
			return this;
		}
		
		public Vector<Novel> getNovels() {
			return novels;
		}
	
		
		public void wypiszNovels()
		{
			for(int i = 0; i < novels.size(); i++) {
				Novel novel = getNovels().elementAt(i);
				System.out.println(novel.getType() + " || tytu�:  " + novel.getTitle()+" || autor: "+novel.getAuthor()+" || liczba stron: "+novel.getPages()+" || liczba rozdzia��w: "+novel.getNumberOfchapters());
			}
		}
		
		
			
		
		private Vector <Komiks> komiksy = new Vector<Komiks>();
		
		public Library addKomiks(Komiks komiks) {
			this.komiksy.addElement(komiks);
			return this;
		}
		
		public Vector<Komiks> getKomiksy() {
			return komiksy;
		}
		
		public void wypiszKomiksy()
		{
			for(int i = 0; i < komiksy.size(); i++) {
				Komiks komiks = getKomiksy().elementAt(i);
				System.out.println(komiks.getType() + " || tytu�: " + komiks.getTitle()+" || autor: "+komiks.getAuthor()+" || liczba stron: "+komiks.getPages()+" || autor rysunk�w: "+komiks.getDrawingAuthor());
			}
		}

		
		
		
		
		private Vector <Podrecznik> podreczniki = new Vector<Podrecznik>();
		
		public Library addPodrecznik(Podrecznik podrecznik) {
			this.podreczniki.addElement(podrecznik);
			return this;
		}
		
		public Vector<Podrecznik> getPodreczniki() {
			return podreczniki;
		}
		
		public void wypiszPodreczniki()
		{
			
			for(int i = 0; i < podreczniki.size(); i++) {
				Podrecznik podrecznik = getPodreczniki().elementAt(i);
				System.out.println(podrecznik.getType() + " || tytu�: " + podrecznik.getTitle()+" || autor: "+podrecznik.getAuthor()+" || liczba stron: "+podrecznik.getPages()+" || funkcja: "+podrecznik.getFunction());
			}
		}
			
		
		public void wypiszWszystkieKsiazki() {
			
			wypiszNovels();
			wypiszKomiksy();
			wypiszPodreczniki();	
		}	
		
		
void dodajKsiazke(int choose)
		
		{
			Scanner skan = new Scanner(System.in);
		
			String title;
			String author;
			int pages;
			String drawingAuthor;
			int numberOfchapters;
			String function;
		
			System.out.println("Podaj tytu�: ");
			title = skan.nextLine();
			System.out.println("Podaj autora: ");
			author = skan.nextLine();
			System.out.println("Podaj liczb� stron: ");
			pages = skan.nextInt();
			skan.nextLine();
			
			if(choose==1)
			{
				System.out.println("Podaj liczb� rozdzia��w: ");
				numberOfchapters = skan.nextInt();
				skan.nextLine();
				addNovel(new Novel(title,author,pages,numberOfchapters));
			}
			else if(choose==2)
			{
				System.out.println("Podaj autora rysunk�w: ");
				drawingAuthor = skan.nextLine();
				addKomiks(new Komiks(title,author,pages,drawingAuthor));
			}
			else if(choose==3)
			{
				System.out.println("Podaj funkcj� podr�cznika: ");
				function = skan.nextLine();
				addPodrecznik(new Podrecznik(title,author,pages,function));
			}
			skan.close();
			
		}

void menu() {

	System.out.println("1 - dodaj Powie��;");
	System.out.println("2 - dodaj Komiks;");
	System.out.println("3 - dodaj Podr�cznik;");
	System.out.println("4 - wy�wietl tylko powie�ci;");
	System.out.println("5 - wy�wietl tylko komiksy;");
	System.out.println("6 - wy�wietl tylko podr�czniki;");
	System.out.println("7 - wy�wietl ca�� kolekcj� biblioteki;");
	System.out.println("8 - zako�cz program;");

}

		
}
